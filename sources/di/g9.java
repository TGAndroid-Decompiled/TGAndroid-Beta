package di;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.WindowManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class g9 implements b4 {
    public final q6 f9062a;
    public final ArrayList f9063b;
    public final Context f9064c;
    public final p9 d;

    public g9(p9 p9Var, q6 q6Var, ArrayList arrayList, Context context) {
        this.d = p9Var;
        this.f9062a = q6Var;
        this.f9063b = arrayList;
        this.f9064c = context;
    }

    public final void a(int i7, long j3) {
        p9 p9Var = this.d;
        if (p9Var.J == i7 && p9Var.I == j3) {
            return;
        }
        p9Var.I = j3;
        p9Var.J = i7;
    }

    public final void b(boolean z9) {
        int i7;
        p9 p9Var = this.d;
        org.telegram.ui.ActionBar.f2 f2Var = p9Var.f9543f;
        if (p9Var.f9532b) {
            if (!p9Var.f9535c) {
                if (z9) {
                    org.telegram.messenger.g0.Z2(f2Var.getParentActivity(), f2Var.getClassGuid());
                    return;
                } else {
                    org.telegram.messenger.g0.a3(f2Var.getParentActivity(), f2Var.getClassGuid());
                    return;
                }
            }
            return;
        }
        WindowManager.LayoutParams layoutParams = p9Var.f9566r;
        if (z9) {
            i7 = 48;
        } else {
            i7 = 16;
        }
        layoutParams.softInputMode = i7;
        try {
            p9Var.f9558n.updateViewLayout(p9Var.f9569s, layoutParams);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j3, h4 h4Var) {
        String uri2;
        String uri3;
        long j10;
        o9 o9Var;
        p9 p9Var = this.d;
        ArrayList arrayList = p9Var.L0;
        if (!p9Var.G0 && p9Var.U >= 0.9f) {
            Uri uri4 = p9Var.E0;
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
            boolean z9 = true;
            if (equals && (o9Var = p9Var.f9584z0) != null) {
                if (equals) {
                    p9Var.F0 = h4Var;
                    h4Var.f9076c = o9Var;
                    h4Var.f9075b = null;
                    o9Var.setSpeed(p9.A1);
                    h4 h4Var2 = p9Var.F0;
                    h4Var2.f9074a = p9Var.f9584z0.firstFrameRendered;
                    h4Var2.f9077e = p9Var.f9583y0;
                    h4Var2.f9078f = p9Var.B0;
                    h4Var2.d = p9Var.C0;
                    org.telegram.messenger.a8.b("StoryViewer requestPlayer: same url");
                }
            } else {
                p9Var.E0 = uri;
                fi.s3 s3Var = p9Var.D0;
                if (s3Var != null) {
                    s3Var.b(0L, null);
                }
                g1 g1Var = p9Var.A0;
                if (g1Var != null) {
                    if (g1Var.f9027n) {
                        g1Var.s(null);
                    } else {
                        g1Var.e();
                    }
                    p9Var.A0 = null;
                }
                o9 o9Var2 = p9Var.f9584z0;
                if (o9Var2 != null) {
                    o9Var2.release(null);
                    p9Var.f9584z0 = null;
                }
                h4 h4Var3 = p9Var.F0;
                if (h4Var3 != null) {
                    h4Var3.f9076c = null;
                    h4Var3.f9075b = null;
                    h4Var3.f9074a = false;
                    h4Var3.f9077e = null;
                    h4Var3.f9078f = null;
                    h4Var3.d = null;
                    h4Var3.b();
                    p9Var.F0 = null;
                }
                if (uri != null) {
                    p9Var.F0 = h4Var;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        } else if (((o9) arrayList.get(i7)).uri.equals(uri)) {
                            p9Var.f9584z0 = (o9) arrayList.remove(i7);
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (p9Var.f9584z0 == null) {
                        o9 o9Var3 = new o9(p9Var, p9Var.C0, p9Var.B0);
                        p9Var.f9584z0 = o9Var3;
                        o9Var3.document = document;
                    }
                    o9 o9Var4 = p9Var.f9584z0;
                    o9Var4.uri = uri;
                    o9Var4.setSpeed(p9.A1);
                    h4 h4Var4 = p9Var.F0;
                    o9 o9Var5 = p9Var.f9584z0;
                    h4Var4.f9076c = o9Var5;
                    h4Var4.f9074a = false;
                    h4Var4.f9077e = p9Var.f9583y0;
                    h4Var4.f9078f = p9Var.B0;
                    h4Var4.d = p9Var.C0;
                    h4Var4.f9075b = null;
                    TLRPC.Document document2 = o9Var5.document;
                    if (document2 != null) {
                        org.telegram.messenger.s8.I.put(Long.valueOf(document2.f26959id), 3);
                    } else {
                        ConcurrentHashMap concurrentHashMap = org.telegram.messenger.s8.H;
                    }
                    org.telegram.messenger.w7.G(p9Var.h).h(3, p9Var.f9584z0.document, null, null, null, null);
                    if (j3 == 0) {
                        long j11 = p9Var.f9571s1;
                        if (j11 != 0) {
                            p9Var.F0.f9074a = true;
                            j10 = j11;
                            org.telegram.messenger.a8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                            ((o9) p9Var.F0.f9076c).start(false, p9Var.C(), uri, j10, p9.C1, p9.A1);
                            p9Var.F0.b();
                        }
                    }
                    j10 = j3;
                    org.telegram.messenger.a8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                    ((o9) p9Var.F0.f9076c).start(false, p9Var.C(), uri, j10, p9.C1, p9.A1);
                    p9Var.F0.b();
                } else {
                    org.telegram.messenger.a8.b("StoryViewer requestPlayer: url is null (1)");
                }
            }
            if (uri == null) {
                z9 = false;
            }
            i(false, z9);
            p9Var.f9571s1 = 0L;
            p9Var.V();
            return;
        }
        fi.s3 s3Var2 = p9Var.D0;
        if (s3Var2 != null) {
            s3Var2.b(0L, null);
        }
        g1 g1Var2 = p9Var.A0;
        if (g1Var2 != null) {
            if (g1Var2.f9027n) {
                g1Var2.s(null);
            } else {
                g1Var2.e();
            }
            p9Var.A0 = null;
        }
        org.telegram.messenger.a8.b("StoryViewer requestPlayer ignored, because closed: " + p9Var.G0 + ", " + p9Var.U);
        h4Var.f9074a = false;
        h4Var.f9076c = null;
        h4Var.f9075b = null;
    }

    public final void d(float f10) {
        p9 p9Var = this.d;
        if (p9Var.f9567r0 != f10) {
            p9Var.f9567r0 = f10;
            p9Var.f9578w.invalidate();
        }
    }

    public final void e() {
        this.d.l1 = false;
    }

    public final void f(boolean z9) {
        o9 o9Var;
        p9 p9Var = this.d;
        if (!p9Var.f9542e1 && z9 && p9Var.f9554k0) {
            p9Var.f9554k0 = false;
            h4 h4Var = p9Var.F0;
            if (h4Var != null && (o9Var = (o9) h4Var.f9076c) != null) {
                o9Var.setSeeking(false);
            }
            i4 z10 = p9Var.z();
            if (z10 != null) {
                z10.invalidate();
            }
        }
        p9Var.f9542e1 = z9;
        p9Var.V();
    }

    public final void g(boolean z9) {
        p9 p9Var = this.d;
        p9Var.W0 = z9;
        p9Var.V();
    }

    public final void h(Dialog dialog) {
        this.d.t(dialog);
    }

    public final void i(boolean z9, boolean z10) {
        int i7;
        int i10;
        p9 p9Var = this.d;
        fi.s3 s3Var = p9Var.D0;
        int i11 = 8;
        if (s3Var != null) {
            if (z9) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            s3Var.setVisibility(i10);
        }
        SurfaceView surfaceView = p9Var.C0;
        if (surfaceView != null) {
            if (z9) {
                i7 = 8;
            } else if (z10) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            surfaceView.setVisibility(i7);
        }
        h9 h9Var = p9Var.B0;
        if (h9Var != null) {
            if (!z9) {
                i11 = 0;
            }
            h9Var.setVisibility(i11);
        }
    }

    public final void j() {
        int indexOf;
        p9 p9Var = this.d;
        q6 q6Var = this.f9062a;
        if (q6Var != null) {
            if (p9Var.f9559n0.f9940x0 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(p9Var.f9559n0.f9940x0);
            if (p9Var.f9559n0.getCurrentPeerView() == null) {
                indexOf = -1;
            } else {
                indexOf = arrayList.indexOf(p9Var.f9559n0.getCurrentPeerView().getCurrentDay());
            }
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
                if (!p9Var.f9559n0.E(true)) {
                    p9Var.u(false);
                    return;
                }
                p9Var.f9559n0.G0 = new aa.s(this, q6Var, arrayList, 28);
                return;
            }
            p9Var.u(false);
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f9063b);
        int indexOf2 = arrayList2.indexOf(Long.valueOf(p9Var.f9559n0.getCurrentPeerView().getCurrentPeer()));
        if (indexOf2 >= 0) {
            arrayList2.remove(indexOf2);
            if (!p9Var.f9559n0.E(true)) {
                p9Var.u(false);
                return;
            }
            p9Var.f9559n0.G0 = new ai.e0(this, arrayList2, indexOf2, 8);
            return;
        }
        p9Var.u(false);
    }
}
