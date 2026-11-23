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
public final class w8 implements s3 {
    public final h6 f12706a;
    public final ArrayList f12707b;
    public final Context f12708c;
    public final f9 d;

    public w8(f9 f9Var, h6 h6Var, ArrayList arrayList, Context context) {
        this.d = f9Var;
        this.f12706a = h6Var;
        this.f12707b = arrayList;
        this.f12708c = context;
    }

    public final void a(int i7, long j3) {
        f9 f9Var = this.d;
        if (f9Var.K == i7 && f9Var.J == j3) {
            return;
        }
        f9Var.J = j3;
        f9Var.K = i7;
    }

    public final void b(boolean z10) {
        int i7;
        f9 f9Var = this.d;
        org.telegram.ui.ActionBar.g2 g2Var = f9Var.f11961f;
        if (f9Var.f11950b) {
            if (!f9Var.f11953c) {
                if (z10) {
                    org.telegram.messenger.g0.Y2(g2Var.getParentActivity(), g2Var.getClassGuid());
                    return;
                } else {
                    org.telegram.messenger.g0.Z2(g2Var.getParentActivity(), g2Var.getClassGuid());
                    return;
                }
            }
            return;
        }
        WindowManager.LayoutParams layoutParams = f9Var.f11984r;
        if (z10) {
            i7 = 48;
        } else {
            i7 = 16;
        }
        layoutParams.softInputMode = i7;
        try {
            f9Var.f11976n.updateViewLayout(f9Var.f11987s, layoutParams);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j3, y3 y3Var) {
        String uri2;
        String uri3;
        long j10;
        e9 e9Var;
        f9 f9Var = this.d;
        ArrayList arrayList = f9Var.M0;
        if (!f9Var.H0 && f9Var.V >= 0.9f) {
            Uri uri4 = f9Var.F0;
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
            if (equals && (e9Var = f9Var.A0) != null) {
                if (equals) {
                    f9Var.G0 = y3Var;
                    y3Var.f12767c = e9Var;
                    y3Var.f12766b = null;
                    e9Var.setSpeed(f9.B1);
                    y3 y3Var2 = f9Var.G0;
                    y3Var2.f12765a = f9Var.A0.firstFrameRendered;
                    y3Var2.f12768e = f9Var.f12003z0;
                    y3Var2.f12769f = f9Var.C0;
                    y3Var2.d = f9Var.D0;
                    org.telegram.messenger.a8.b("StoryViewer requestPlayer: same url");
                }
            } else {
                f9Var.F0 = uri;
                hi.q3 q3Var = f9Var.E0;
                if (q3Var != null) {
                    q3Var.b(0L, null);
                }
                c1 c1Var = f9Var.B0;
                if (c1Var != null) {
                    if (c1Var.f11790n) {
                        c1Var.s(null);
                    } else {
                        c1Var.e();
                    }
                    f9Var.B0 = null;
                }
                e9 e9Var2 = f9Var.A0;
                if (e9Var2 != null) {
                    e9Var2.release(null);
                    f9Var.A0 = null;
                }
                y3 y3Var3 = f9Var.G0;
                if (y3Var3 != null) {
                    y3Var3.f12767c = null;
                    y3Var3.f12766b = null;
                    y3Var3.f12765a = false;
                    y3Var3.f12768e = null;
                    y3Var3.f12769f = null;
                    y3Var3.d = null;
                    y3Var3.b();
                    f9Var.G0 = null;
                }
                if (uri != null) {
                    f9Var.G0 = y3Var;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        } else if (((e9) arrayList.get(i7)).uri.equals(uri)) {
                            f9Var.A0 = (e9) arrayList.remove(i7);
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (f9Var.A0 == null) {
                        e9 e9Var3 = new e9(f9Var, f9Var.D0, f9Var.C0);
                        f9Var.A0 = e9Var3;
                        e9Var3.document = document;
                    }
                    e9 e9Var4 = f9Var.A0;
                    e9Var4.uri = uri;
                    e9Var4.setSpeed(f9.B1);
                    y3 y3Var4 = f9Var.G0;
                    e9 e9Var5 = f9Var.A0;
                    y3Var4.f12767c = e9Var5;
                    y3Var4.f12765a = false;
                    y3Var4.f12768e = f9Var.f12003z0;
                    y3Var4.f12769f = f9Var.C0;
                    y3Var4.d = f9Var.D0;
                    y3Var4.f12766b = null;
                    TLRPC.Document document2 = e9Var5.document;
                    if (document2 != null) {
                        org.telegram.messenger.s8.J.put(Long.valueOf(document2.f28404id), 3);
                    } else {
                        ConcurrentHashMap concurrentHashMap = org.telegram.messenger.s8.I;
                    }
                    org.telegram.messenger.w7.G(f9Var.h).h(3, f9Var.A0.document, null, null, null, null);
                    if (j3 == 0) {
                        long j11 = f9Var.f11991t1;
                        if (j11 != 0) {
                            f9Var.G0.f12765a = true;
                            j10 = j11;
                            org.telegram.messenger.a8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                            ((e9) f9Var.G0.f12767c).start(false, f9Var.C(), uri, j10, f9.D1, f9.B1);
                            f9Var.G0.b();
                        }
                    }
                    j10 = j3;
                    org.telegram.messenger.a8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                    ((e9) f9Var.G0.f12767c).start(false, f9Var.C(), uri, j10, f9.D1, f9.B1);
                    f9Var.G0.b();
                } else {
                    org.telegram.messenger.a8.b("StoryViewer requestPlayer: url is null (1)");
                }
            }
            if (uri == null) {
                z10 = false;
            }
            i(false, z10);
            f9Var.f11991t1 = 0L;
            f9Var.V();
            return;
        }
        hi.q3 q3Var2 = f9Var.E0;
        if (q3Var2 != null) {
            q3Var2.b(0L, null);
        }
        c1 c1Var2 = f9Var.B0;
        if (c1Var2 != null) {
            if (c1Var2.f11790n) {
                c1Var2.s(null);
            } else {
                c1Var2.e();
            }
            f9Var.B0 = null;
        }
        org.telegram.messenger.a8.b("StoryViewer requestPlayer ignored, because closed: " + f9Var.H0 + ", " + f9Var.V);
        y3Var.f12765a = false;
        y3Var.f12767c = null;
        y3Var.f12766b = null;
    }

    public final void d(float f10) {
        f9 f9Var = this.d;
        if (f9Var.f11988s0 != f10) {
            f9Var.f11988s0 = f10;
            f9Var.f11996w.invalidate();
        }
    }

    public final void e() {
        this.d.f11975m1 = false;
    }

    public final void f(boolean z10) {
        e9 e9Var;
        f9 f9Var = this.d;
        if (!f9Var.f11963f1 && z10 && f9Var.f11974l0) {
            f9Var.f11974l0 = false;
            y3 y3Var = f9Var.G0;
            if (y3Var != null && (e9Var = (e9) y3Var.f12767c) != null) {
                e9Var.setSeeking(false);
            }
            z3 z11 = f9Var.z();
            if (z11 != null) {
                z11.invalidate();
            }
        }
        f9Var.f11963f1 = z10;
        f9Var.V();
    }

    public final void g(boolean z10) {
        f9 f9Var = this.d;
        f9Var.X0 = z10;
        f9Var.V();
    }

    public final void h(Dialog dialog) {
        this.d.t(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        int i7;
        int i10;
        f9 f9Var = this.d;
        hi.q3 q3Var = f9Var.E0;
        int i11 = 8;
        if (q3Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            q3Var.setVisibility(i10);
        }
        SurfaceView surfaceView = f9Var.D0;
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
        x8 x8Var = f9Var.C0;
        if (x8Var != null) {
            if (!z10) {
                i11 = 0;
            }
            x8Var.setVisibility(i11);
        }
    }

    public final void j() {
        int indexOf;
        f9 f9Var = this.d;
        h6 h6Var = this.f12706a;
        if (h6Var != null) {
            if (f9Var.f11978o0.f12301y0 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(f9Var.f11978o0.f12301y0);
            if (f9Var.f11978o0.getCurrentPeerView() == null) {
                indexOf = -1;
            } else {
                indexOf = arrayList.indexOf(f9Var.f11978o0.getCurrentPeerView().getCurrentDay());
            }
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
                if (!f9Var.f11978o0.E(true)) {
                    f9Var.u(false);
                    return;
                }
                f9Var.f11978o0.H0 = new di.a8(this, h6Var, arrayList, 8);
                return;
            }
            f9Var.u(false);
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f12707b);
        int indexOf2 = arrayList2.indexOf(Long.valueOf(f9Var.f11978o0.getCurrentPeerView().getCurrentPeer()));
        if (indexOf2 >= 0) {
            arrayList2.remove(indexOf2);
            if (!f9Var.f11978o0.E(true)) {
                f9Var.u(false);
                return;
            }
            f9Var.f11978o0.H0 = new ai.d1(this, arrayList2, indexOf2, 11);
            return;
        }
        f9Var.u(false);
    }
}
