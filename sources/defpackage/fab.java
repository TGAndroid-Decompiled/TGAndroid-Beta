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
import org.telegram.ui.ActionBar.d;
public final class fab implements w48 {
    public final z3b a;
    public final ArrayList b;
    public final Context c;
    public final oab d;

    public fab(oab oabVar, z3b z3bVar, ArrayList arrayList, Context context) {
        this.d = oabVar;
        this.a = z3bVar;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i, long j) {
        oab oabVar = this.d;
        if (oabVar.K == i && oabVar.J == j) {
            return;
        }
        oabVar.J = j;
        oabVar.K = i;
    }

    public final void b(boolean z) {
        int i;
        oab oabVar = this.d;
        d dVar = oabVar.f;
        if (oabVar.b) {
            if (!oabVar.c) {
                if (z) {
                    gm.U2(dVar.getParentActivity(), dVar.getClassGuid());
                    return;
                } else {
                    gm.V2(dVar.getParentActivity(), dVar.getClassGuid());
                    return;
                }
            }
            return;
        }
        WindowManager.LayoutParams layoutParams = oabVar.r;
        if (z) {
            i = 48;
        } else {
            i = 16;
        }
        layoutParams.softInputMode = i;
        try {
            oabVar.n.updateViewLayout(oabVar.s, layoutParams);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j, c40 c40Var) {
        String uri2;
        String uri3;
        long j2;
        nab nabVar;
        oab oabVar = this.d;
        ArrayList arrayList = oabVar.M0;
        if (!oabVar.H0 && oabVar.V >= 0.9f) {
            Uri uri4 = oabVar.F0;
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
            if (equals && (nabVar = oabVar.A0) != null) {
                if (equals) {
                    oabVar.G0 = c40Var;
                    c40Var.c = nabVar;
                    c40Var.b = null;
                    nabVar.setSpeed(oab.B1);
                    c40 c40Var2 = oabVar.G0;
                    c40Var2.a = oabVar.A0.firstFrameRendered;
                    c40Var2.e = oabVar.z0;
                    c40Var2.f = oabVar.C0;
                    c40Var2.d = oabVar.D0;
                    fc4.b("StoryViewer requestPlayer: same url");
                }
            } else {
                oabVar.F0 = uri;
                t96 t96Var = oabVar.E0;
                if (t96Var != null) {
                    t96Var.e(0L, null);
                }
                s96 s96Var = oabVar.B0;
                if (s96Var != null) {
                    if (s96Var.n) {
                        s96Var.d();
                    } else {
                        s96Var.h();
                    }
                    oabVar.B0 = null;
                }
                nab nabVar2 = oabVar.A0;
                if (nabVar2 != null) {
                    nabVar2.release(null);
                    oabVar.A0 = null;
                }
                c40 c40Var3 = oabVar.G0;
                if (c40Var3 != null) {
                    c40Var3.c = null;
                    c40Var3.b = null;
                    c40Var3.a = false;
                    c40Var3.e = null;
                    c40Var3.f = null;
                    c40Var3.d = null;
                    c40Var3.m();
                    oabVar.G0 = null;
                }
                if (uri != null) {
                    oabVar.G0 = c40Var;
                    int i = 0;
                    while (true) {
                        if (i >= arrayList.size()) {
                            break;
                        } else if (((nab) arrayList.get(i)).uri.equals(uri)) {
                            oabVar.A0 = (nab) arrayList.remove(i);
                            break;
                        } else {
                            i++;
                        }
                    }
                    nab nabVar3 = oabVar.A0;
                    if (nabVar3 == null) {
                        nabVar3 = new nab(oabVar, oabVar.D0, oabVar.C0);
                        oabVar.A0 = nabVar3;
                        nabVar3.document = document;
                    }
                    nabVar3.uri = uri;
                    nabVar3.setSpeed(oab.B1);
                    c40 c40Var4 = oabVar.G0;
                    nab nabVar4 = oabVar.A0;
                    c40Var4.c = nabVar4;
                    c40Var4.a = false;
                    c40Var4.e = oabVar.z0;
                    c40Var4.f = oabVar.C0;
                    c40Var4.d = oabVar.D0;
                    c40Var4.b = null;
                    TLRPC.Document document2 = nabVar4.document;
                    if (document2 != null) {
                        kd4.J.put(Long.valueOf(document2.id), 3);
                    } else {
                        ConcurrentHashMap concurrentHashMap = kd4.I;
                    }
                    bc4.G(oabVar.h).h(3, oabVar.A0.document, null, null, null, null);
                    if (j == 0) {
                        long j3 = oabVar.t1;
                        if (j3 != 0) {
                            oabVar.G0.a = true;
                            j2 = j3;
                            fc4.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                            ((nab) oabVar.G0.c).start(false, oabVar.A(), uri, j2, oab.D1, oab.B1);
                            oabVar.G0.m();
                        }
                    }
                    j2 = j;
                    fc4.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                    ((nab) oabVar.G0.c).start(false, oabVar.A(), uri, j2, oab.D1, oab.B1);
                    oabVar.G0.m();
                } else {
                    fc4.b("StoryViewer requestPlayer: url is null (1)");
                }
            }
            if (uri == null) {
                z = false;
            }
            i(false, z);
            oabVar.t1 = 0L;
            oabVar.U();
            return;
        }
        t96 t96Var2 = oabVar.E0;
        if (t96Var2 != null) {
            t96Var2.e(0L, null);
        }
        s96 s96Var2 = oabVar.B0;
        if (s96Var2 != null) {
            if (s96Var2.n) {
                s96Var2.d();
            } else {
                s96Var2.h();
            }
            oabVar.B0 = null;
        }
        fc4.b("StoryViewer requestPlayer ignored, because closed: " + oabVar.H0 + ", " + oabVar.V);
        c40Var.a = false;
        c40Var.c = null;
        c40Var.b = null;
    }

    public final void d(float f) {
        oab oabVar = this.d;
        if (oabVar.s0 != f) {
            oabVar.s0 = f;
            oabVar.w.invalidate();
        }
    }

    public final void e() {
        this.d.m1 = false;
    }

    public final void f(boolean z) {
        nab nabVar;
        oab oabVar = this.d;
        if (!oabVar.f1 && z && oabVar.l0) {
            oabVar.l0 = false;
            c40 c40Var = oabVar.G0;
            if (c40Var != null && (nabVar = (nab) c40Var.c) != null) {
                nabVar.setSeeking(false);
            }
            a58 w = oabVar.w();
            if (w != null) {
                w.invalidate();
            }
        }
        oabVar.f1 = z;
        oabVar.U();
    }

    public final void g(boolean z) {
        oab oabVar = this.d;
        oabVar.X0 = z;
        oabVar.U();
    }

    public final void h(Dialog dialog) {
        this.d.t(dialog);
    }

    public final void i(boolean z, boolean z2) {
        int i;
        int i2;
        oab oabVar = this.d;
        t96 t96Var = oabVar.E0;
        int i3 = 8;
        if (t96Var != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            t96Var.setVisibility(i2);
        }
        SurfaceView surfaceView = oabVar.D0;
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
        gab gabVar = oabVar.C0;
        if (gabVar != null) {
            if (!z) {
                i3 = 0;
            }
            gabVar.setVisibility(i3);
        }
    }

    public final void j() {
        int indexOf;
        oab oabVar = this.d;
        z3b z3bVar = this.a;
        if (z3bVar != null) {
            if (oabVar.o0.y0 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(oabVar.o0.y0);
            if (oabVar.o0.getCurrentPeerView() == null) {
                indexOf = -1;
            } else {
                indexOf = arrayList.indexOf(oabVar.o0.getCurrentPeerView().getCurrentDay());
            }
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
                if (!oabVar.o0.E(true)) {
                    oabVar.o(false);
                    return;
                }
                oabVar.o0.H0 = new j2b(this, z3bVar, arrayList);
                return;
            }
            oabVar.o(false);
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.b);
        int indexOf2 = arrayList2.indexOf(Long.valueOf(oabVar.o0.getCurrentPeerView().getCurrentPeer()));
        if (indexOf2 >= 0) {
            arrayList2.remove(indexOf2);
            if (!oabVar.o0.E(true)) {
                oabVar.o(false);
                return;
            }
            oabVar.o0.H0 = new v99(this, arrayList2, indexOf2, (byte) 20);
            return;
        }
        oabVar.o(false);
    }
}
