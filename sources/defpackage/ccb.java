package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.WindowManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class ccb implements k68 {
    public final v5b a;
    public final ArrayList b;
    public final Context c;
    public final lcb d;

    public ccb(lcb lcbVar, v5b v5bVar, ArrayList arrayList, Context context) {
        this.d = lcbVar;
        this.a = v5bVar;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i, long j) {
        lcb lcbVar = this.d;
        if (lcbVar.K == i && lcbVar.J == j) {
            return;
        }
        lcbVar.J = j;
        lcbVar.K = i;
    }

    public final void b(boolean z) {
        int i;
        lcb lcbVar = this.d;
        e eVar = lcbVar.f;
        if (lcbVar.b) {
            if (!lcbVar.c) {
                if (z) {
                    hl.U2(eVar.getParentActivity(), eVar.getClassGuid());
                    return;
                } else {
                    hl.V2(eVar.getParentActivity(), eVar.getClassGuid());
                    return;
                }
            }
            return;
        }
        WindowManager.LayoutParams layoutParams = lcbVar.r;
        if (z) {
            i = 48;
        } else {
            i = 16;
        }
        layoutParams.softInputMode = i;
        try {
            lcbVar.n.updateViewLayout(lcbVar.s, layoutParams);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j, d30 d30Var) {
        String uri2;
        String uri3;
        long j2;
        kcb kcbVar;
        lcb lcbVar = this.d;
        ArrayList arrayList = lcbVar.M0;
        if (!lcbVar.H0 && lcbVar.V >= 0.9f) {
            Uri uri4 = lcbVar.F0;
            if (uri4 == null) {
                uri2 = null;
            } else {
                uri2 = uri4.toString();
            }
            if (uri == null) {
                uri3 = null;
            } else {
                uri3 = uri.toString();
            }
            boolean equals = TextUtils.equals(uri2, uri3);
            boolean z = true;
            if (equals && (kcbVar = lcbVar.A0) != null) {
                if (equals) {
                    lcbVar.G0 = d30Var;
                    d30Var.c = kcbVar;
                    d30Var.b = null;
                    kcbVar.setSpeed(lcb.B1);
                    d30 d30Var2 = lcbVar.G0;
                    d30Var2.a = lcbVar.A0.firstFrameRendered;
                    d30Var2.e = lcbVar.z0;
                    d30Var2.f = lcbVar.C0;
                    d30Var2.d = lcbVar.D0;
                    cc4.b("StoryViewer requestPlayer: same url");
                }
            } else {
                lcbVar.F0 = uri;
                x96 x96Var = lcbVar.E0;
                if (x96Var != null) {
                    x96Var.e(0L, null);
                }
                w96 w96Var = lcbVar.B0;
                if (w96Var != null) {
                    if (w96Var.n) {
                        w96Var.d();
                    } else {
                        w96Var.h();
                    }
                    lcbVar.B0 = null;
                }
                kcb kcbVar2 = lcbVar.A0;
                if (kcbVar2 != null) {
                    kcbVar2.release(null);
                    lcbVar.A0 = null;
                }
                d30 d30Var3 = lcbVar.G0;
                if (d30Var3 != null) {
                    d30Var3.c = null;
                    d30Var3.b = null;
                    d30Var3.a = false;
                    d30Var3.e = null;
                    d30Var3.f = null;
                    d30Var3.d = null;
                    d30Var3.m();
                    lcbVar.G0 = null;
                }
                if (uri != null) {
                    lcbVar.G0 = d30Var;
                    int i = 0;
                    while (true) {
                        if (i >= arrayList.size()) {
                            break;
                        } else if (((kcb) arrayList.get(i)).uri.equals(uri)) {
                            lcbVar.A0 = (kcb) arrayList.remove(i);
                            break;
                        } else {
                            i++;
                        }
                    }
                    kcb kcbVar3 = lcbVar.A0;
                    if (kcbVar3 == null) {
                        kcbVar3 = new kcb(lcbVar, lcbVar.D0, lcbVar.C0);
                        lcbVar.A0 = kcbVar3;
                        kcbVar3.document = document;
                    }
                    kcbVar3.uri = uri;
                    kcbVar3.setSpeed(lcb.B1);
                    d30 d30Var4 = lcbVar.G0;
                    kcb kcbVar4 = lcbVar.A0;
                    d30Var4.c = kcbVar4;
                    d30Var4.a = false;
                    d30Var4.e = lcbVar.z0;
                    d30Var4.f = lcbVar.C0;
                    d30Var4.d = lcbVar.D0;
                    d30Var4.b = null;
                    TLRPC.Document document2 = kcbVar4.document;
                    if (document2 != null) {
                        hd4.J.put(Long.valueOf(document2.id), 3);
                    } else {
                        ConcurrentHashMap concurrentHashMap = hd4.I;
                    }
                    xb4.G(lcbVar.h).h(3, lcbVar.A0.document, null, null, null, null);
                    if (j == 0) {
                        long j3 = lcbVar.t1;
                        if (j3 != 0) {
                            lcbVar.G0.a = true;
                            j2 = j3;
                            cc4.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                            ((kcb) lcbVar.G0.c).start(false, lcbVar.A(), uri, j2, lcb.D1, lcb.B1);
                            lcbVar.G0.m();
                        }
                    }
                    j2 = j;
                    cc4.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                    ((kcb) lcbVar.G0.c).start(false, lcbVar.A(), uri, j2, lcb.D1, lcb.B1);
                    lcbVar.G0.m();
                } else {
                    cc4.b("StoryViewer requestPlayer: url is null (1)");
                }
            }
            if (uri == null) {
                z = false;
            }
            i(false, z);
            lcbVar.t1 = 0L;
            lcbVar.U();
            return;
        }
        x96 x96Var2 = lcbVar.E0;
        if (x96Var2 != null) {
            x96Var2.e(0L, null);
        }
        w96 w96Var2 = lcbVar.B0;
        if (w96Var2 != null) {
            if (w96Var2.n) {
                w96Var2.d();
            } else {
                w96Var2.h();
            }
            lcbVar.B0 = null;
        }
        cc4.b("StoryViewer requestPlayer ignored, because closed: " + lcbVar.H0 + ", " + lcbVar.V);
        d30Var.a = false;
        d30Var.c = null;
        d30Var.b = null;
    }

    public final void d(float f) {
        lcb lcbVar = this.d;
        if (lcbVar.s0 != f) {
            lcbVar.s0 = f;
            lcbVar.w.invalidate();
        }
    }

    public final void e() {
        this.d.m1 = false;
    }

    public final void f(boolean z) {
        kcb kcbVar;
        lcb lcbVar = this.d;
        if (!lcbVar.f1 && z && lcbVar.l0) {
            lcbVar.l0 = false;
            d30 d30Var = lcbVar.G0;
            if (d30Var != null && (kcbVar = (kcb) d30Var.c) != null) {
                kcbVar.setSeeking(false);
            }
            o68 w = lcbVar.w();
            if (w != null) {
                w.invalidate();
            }
        }
        lcbVar.f1 = z;
        lcbVar.U();
    }

    public final void g(boolean z) {
        lcb lcbVar = this.d;
        lcbVar.X0 = z;
        lcbVar.U();
    }

    public final void h(Dialog dialog) {
        this.d.u(dialog);
    }

    public final void i(boolean z, boolean z2) {
        int i;
        int i2;
        lcb lcbVar = this.d;
        x96 x96Var = lcbVar.E0;
        int i3 = 8;
        if (x96Var != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            x96Var.setVisibility(i2);
        }
        SurfaceView surfaceView = lcbVar.D0;
        if (surfaceView != null) {
            if (z) {
                i = 8;
            } else if (z2) {
                i = 0;
            } else {
                i = 4;
            }
            surfaceView.setVisibility(i);
        }
        dcb dcbVar = lcbVar.C0;
        if (dcbVar != null) {
            if (!z) {
                i3 = 0;
            }
            dcbVar.setVisibility(i3);
        }
    }

    public final void j() {
        int indexOf;
        lcb lcbVar = this.d;
        v5b v5bVar = this.a;
        if (v5bVar != null) {
            if (lcbVar.o0.y0 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(lcbVar.o0.y0);
            if (lcbVar.o0.getCurrentPeerView() == null) {
                indexOf = -1;
            } else {
                indexOf = arrayList.indexOf(lcbVar.o0.getCurrentPeerView().getCurrentDay());
            }
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
                if (!lcbVar.o0.E(true)) {
                    lcbVar.o(false);
                    return;
                }
                lcbVar.o0.H0 = new pwa(this, v5bVar, arrayList, (byte) 17);
                return;
            }
            lcbVar.o(false);
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.b);
        int indexOf2 = arrayList2.indexOf(Long.valueOf(lcbVar.o0.getCurrentPeerView().getCurrentPeer()));
        if (indexOf2 >= 0) {
            arrayList2.remove(indexOf2);
            if (!lcbVar.o0.E(true)) {
                lcbVar.o(false);
                return;
            }
            lcbVar.o0.H0 = new a39(this, arrayList2, indexOf2, (byte) 21);
            return;
        }
        lcbVar.o(false);
    }
}
