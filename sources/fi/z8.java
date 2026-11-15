package fi;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.WindowManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class z8 implements u3 {
    public final k6 f12605a;
    public final ArrayList f12606b;
    public final Context f12607c;
    public final i9 d;

    public z8(i9 i9Var, k6 k6Var, ArrayList arrayList, Context context) {
        this.d = i9Var;
        this.f12605a = k6Var;
        this.f12606b = arrayList;
        this.f12607c = context;
    }

    public final void a(int i7, long j3) {
        i9 i9Var = this.d;
        if (i9Var.K == i7 && i9Var.J == j3) {
            return;
        }
        i9Var.J = j3;
        i9Var.K = i7;
    }

    public final void b(boolean z10) {
        int i7;
        i9 i9Var = this.d;
        org.telegram.ui.ActionBar.e2 e2Var = i9Var.f11844f;
        if (i9Var.f11833b) {
            if (!i9Var.f11836c) {
                if (z10) {
                    org.telegram.messenger.g0.Z2(e2Var.getParentActivity(), e2Var.getClassGuid());
                    return;
                } else {
                    org.telegram.messenger.g0.a3(e2Var.getParentActivity(), e2Var.getClassGuid());
                    return;
                }
            }
            return;
        }
        WindowManager.LayoutParams layoutParams = i9Var.f11867r;
        if (z10) {
            i7 = 48;
        } else {
            i7 = 16;
        }
        layoutParams.softInputMode = i7;
        try {
            i9Var.f11859n.updateViewLayout(i9Var.f11870s, layoutParams);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j3, a4 a4Var) {
        String uri2;
        String uri3;
        long j10;
        h9 h9Var;
        i9 i9Var = this.d;
        ArrayList arrayList = i9Var.M0;
        if (!i9Var.H0 && i9Var.V >= 0.9f) {
            Uri uri4 = i9Var.F0;
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
            boolean z10 = true;
            if (equals && (h9Var = i9Var.A0) != null) {
                if (equals) {
                    i9Var.G0 = a4Var;
                    a4Var.f11407c = h9Var;
                    a4Var.f11406b = null;
                    h9Var.setSpeed(i9.B1);
                    a4 a4Var2 = i9Var.G0;
                    a4Var2.f11405a = i9Var.A0.firstFrameRendered;
                    a4Var2.f11408e = i9Var.f11886z0;
                    a4Var2.f11409f = i9Var.C0;
                    a4Var2.d = i9Var.D0;
                    org.telegram.messenger.a8.b("StoryViewer requestPlayer: same url");
                }
            } else {
                i9Var.F0 = uri;
                hi.r3 r3Var = i9Var.E0;
                if (r3Var != null) {
                    r3Var.b(0L, null);
                }
                e1 e1Var = i9Var.B0;
                if (e1Var != null) {
                    if (e1Var.f11658n) {
                        e1Var.s(null);
                    } else {
                        e1Var.e();
                    }
                    i9Var.B0 = null;
                }
                h9 h9Var2 = i9Var.A0;
                if (h9Var2 != null) {
                    h9Var2.release(null);
                    i9Var.A0 = null;
                }
                a4 a4Var3 = i9Var.G0;
                if (a4Var3 != null) {
                    a4Var3.f11407c = null;
                    a4Var3.f11406b = null;
                    a4Var3.f11405a = false;
                    a4Var3.f11408e = null;
                    a4Var3.f11409f = null;
                    a4Var3.d = null;
                    a4Var3.b();
                    i9Var.G0 = null;
                }
                if (uri != null) {
                    i9Var.G0 = a4Var;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        } else if (((h9) arrayList.get(i7)).uri.equals(uri)) {
                            i9Var.A0 = (h9) arrayList.remove(i7);
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (i9Var.A0 == null) {
                        h9 h9Var3 = new h9(i9Var, i9Var.D0, i9Var.C0);
                        i9Var.A0 = h9Var3;
                        h9Var3.document = document;
                    }
                    h9 h9Var4 = i9Var.A0;
                    h9Var4.uri = uri;
                    h9Var4.setSpeed(i9.B1);
                    a4 a4Var4 = i9Var.G0;
                    h9 h9Var5 = i9Var.A0;
                    a4Var4.f11407c = h9Var5;
                    a4Var4.f11405a = false;
                    a4Var4.f11408e = i9Var.f11886z0;
                    a4Var4.f11409f = i9Var.C0;
                    a4Var4.d = i9Var.D0;
                    a4Var4.f11406b = null;
                    TLRPC.Document document2 = h9Var5.document;
                    if (document2 != null) {
                        org.telegram.messenger.s8.J.put(Long.valueOf(document2.f28057id), 3);
                    } else {
                        ConcurrentHashMap concurrentHashMap = org.telegram.messenger.s8.I;
                    }
                    org.telegram.messenger.w7.G(i9Var.h).h(3, i9Var.A0.document, null, null, null, null);
                    if (j3 == 0) {
                        long j11 = i9Var.f11874t1;
                        if (j11 != 0) {
                            i9Var.G0.f11405a = true;
                            j10 = j11;
                            org.telegram.messenger.a8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                            ((h9) i9Var.G0.f11407c).start(false, i9Var.C(), uri, j10, i9.D1, i9.B1);
                            i9Var.G0.b();
                        }
                    }
                    j10 = j3;
                    org.telegram.messenger.a8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                    ((h9) i9Var.G0.f11407c).start(false, i9Var.C(), uri, j10, i9.D1, i9.B1);
                    i9Var.G0.b();
                } else {
                    org.telegram.messenger.a8.b("StoryViewer requestPlayer: url is null (1)");
                }
            }
            if (uri == null) {
                z10 = false;
            }
            i(false, z10);
            i9Var.f11874t1 = 0L;
            i9Var.V();
            return;
        }
        hi.r3 r3Var2 = i9Var.E0;
        if (r3Var2 != null) {
            r3Var2.b(0L, null);
        }
        e1 e1Var2 = i9Var.B0;
        if (e1Var2 != null) {
            if (e1Var2.f11658n) {
                e1Var2.s(null);
            } else {
                e1Var2.e();
            }
            i9Var.B0 = null;
        }
        org.telegram.messenger.a8.b("StoryViewer requestPlayer ignored, because closed: " + i9Var.H0 + ", " + i9Var.V);
        a4Var.f11405a = false;
        a4Var.f11407c = null;
        a4Var.f11406b = null;
    }

    public final void d(float f10) {
        i9 i9Var = this.d;
        if (i9Var.f11871s0 != f10) {
            i9Var.f11871s0 = f10;
            i9Var.f11879w.invalidate();
        }
    }

    public final void e() {
        this.d.f11858m1 = false;
    }

    public final void f(boolean z10) {
        h9 h9Var;
        i9 i9Var = this.d;
        if (!i9Var.f11846f1 && z10 && i9Var.f11857l0) {
            i9Var.f11857l0 = false;
            a4 a4Var = i9Var.G0;
            if (a4Var != null && (h9Var = (h9) a4Var.f11407c) != null) {
                h9Var.setSeeking(false);
            }
            b4 z11 = i9Var.z();
            if (z11 != null) {
                z11.invalidate();
            }
        }
        i9Var.f11846f1 = z10;
        i9Var.V();
    }

    public final void g(boolean z10) {
        i9 i9Var = this.d;
        i9Var.X0 = z10;
        i9Var.V();
    }

    public final void h(Dialog dialog) {
        this.d.t(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        int i7;
        int i10;
        i9 i9Var = this.d;
        hi.r3 r3Var = i9Var.E0;
        int i11 = 8;
        if (r3Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            r3Var.setVisibility(i10);
        }
        SurfaceView surfaceView = i9Var.D0;
        if (surfaceView != null) {
            if (z10) {
                i7 = 8;
            } else if (z11) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            surfaceView.setVisibility(i7);
        }
        a9 a9Var = i9Var.C0;
        if (a9Var != null) {
            if (!z10) {
                i11 = 0;
            }
            a9Var.setVisibility(i11);
        }
    }

    public final void j() {
        int indexOf;
        i9 i9Var = this.d;
        k6 k6Var = this.f12605a;
        if (k6Var != null) {
            if (i9Var.f11861o0.f12233y0 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(i9Var.f11861o0.f12233y0);
            if (i9Var.f11861o0.getCurrentPeerView() == null) {
                indexOf = -1;
            } else {
                indexOf = arrayList.indexOf(i9Var.f11861o0.getCurrentPeerView().getCurrentDay());
            }
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
                if (!i9Var.f11861o0.E(true)) {
                    i9Var.u(false);
                    return;
                }
                i9Var.f11861o0.H0 = new s5(this, k6Var, arrayList, 3);
                return;
            }
            i9Var.u(false);
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f12606b);
        int indexOf2 = arrayList2.indexOf(Long.valueOf(i9Var.f11861o0.getCurrentPeerView().getCurrentPeer()));
        if (indexOf2 >= 0) {
            arrayList2.remove(indexOf2);
            if (!i9Var.f11861o0.E(true)) {
                i9Var.u(false);
                return;
            }
            i9Var.f11861o0.H0 = new ai.z0(this, arrayList2, indexOf2, 11);
            return;
        }
        i9Var.u(false);
    }
}
