package ei;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.WindowManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class i9 implements c4 {
    public final r6 f10427a;
    public final ArrayList f10428b;
    public final Context f10429c;
    public final r9 d;

    public i9(r9 r9Var, r6 r6Var, ArrayList arrayList, Context context) {
        this.d = r9Var;
        this.f10427a = r6Var;
        this.f10428b = arrayList;
        this.f10429c = context;
    }

    public final void a(int i3, long j10) {
        r9 r9Var = this.d;
        if (r9Var.K == i3 && r9Var.J == j10) {
            return;
        }
        r9Var.J = j10;
        r9Var.K = i3;
    }

    public final void b(boolean z10) {
        int i3;
        r9 r9Var = this.d;
        org.telegram.ui.ActionBar.d2 d2Var = r9Var.f10922f;
        if (r9Var.f10911b) {
            if (!r9Var.f10914c) {
                if (z10) {
                    org.telegram.messenger.g0.Z2(d2Var.getParentActivity(), d2Var.getClassGuid());
                    return;
                } else {
                    org.telegram.messenger.g0.a3(d2Var.getParentActivity(), d2Var.getClassGuid());
                    return;
                }
            }
            return;
        }
        WindowManager.LayoutParams layoutParams = r9Var.f10945r;
        if (z10) {
            i3 = 48;
        } else {
            i3 = 16;
        }
        layoutParams.softInputMode = i3;
        try {
            r9Var.f10936n.updateViewLayout(r9Var.f10948s, layoutParams);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j10, i4 i4Var) {
        String uri2;
        String uri3;
        long j11;
        q9 q9Var;
        r9 r9Var = this.d;
        ArrayList arrayList = r9Var.N0;
        if (!r9Var.I0 && r9Var.V >= 0.9f) {
            Uri uri4 = r9Var.G0;
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
            if (equals && (q9Var = r9Var.A0) != null) {
                if (equals) {
                    r9Var.H0 = i4Var;
                    i4Var.f10404c = q9Var;
                    i4Var.f10403b = null;
                    q9Var.setSpeed(r9.C1);
                    i4 i4Var2 = r9Var.H0;
                    i4Var2.f10402a = r9Var.A0.firstFrameRendered;
                    i4Var2.f10405e = r9Var.f10965z0;
                    i4Var2.f10406f = r9Var.C0;
                    i4Var2.d = r9Var.D0;
                    org.telegram.messenger.a8.b("StoryViewer requestPlayer: same url");
                }
            } else {
                r9Var.G0 = uri;
                gi.r3 r3Var = r9Var.E0;
                if (r3Var != null) {
                    r3Var.d(0L, null);
                }
                g1 g1Var = r9Var.B0;
                if (g1Var != null) {
                    if (g1Var.f10301n) {
                        g1Var.s(null);
                    } else {
                        g1Var.e();
                    }
                    r9Var.B0 = null;
                }
                q9 q9Var2 = r9Var.A0;
                if (q9Var2 != null) {
                    q9Var2.release(null);
                    r9Var.A0 = null;
                }
                i4 i4Var3 = r9Var.H0;
                if (i4Var3 != null) {
                    i4Var3.f10404c = null;
                    i4Var3.f10403b = null;
                    i4Var3.f10402a = false;
                    i4Var3.f10405e = null;
                    i4Var3.f10406f = null;
                    i4Var3.d = null;
                    i4Var3.b();
                    r9Var.H0 = null;
                }
                if (uri != null) {
                    r9Var.H0 = i4Var;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            break;
                        } else if (((q9) arrayList.get(i3)).uri.equals(uri)) {
                            r9Var.A0 = (q9) arrayList.remove(i3);
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (r9Var.A0 == null) {
                        q9 q9Var3 = new q9(r9Var, r9Var.D0, r9Var.C0);
                        r9Var.A0 = q9Var3;
                        q9Var3.document = document;
                    }
                    q9 q9Var4 = r9Var.A0;
                    q9Var4.uri = uri;
                    q9Var4.setSpeed(r9.C1);
                    i4 i4Var4 = r9Var.H0;
                    q9 q9Var5 = r9Var.A0;
                    i4Var4.f10404c = q9Var5;
                    i4Var4.f10402a = false;
                    i4Var4.f10405e = r9Var.f10965z0;
                    i4Var4.f10406f = r9Var.C0;
                    i4Var4.d = r9Var.D0;
                    i4Var4.f10403b = null;
                    TLRPC.Document document2 = q9Var5.document;
                    if (document2 != null) {
                        org.telegram.messenger.s8.J.put(Long.valueOf(document2.f27007id), 3);
                    } else {
                        ConcurrentHashMap concurrentHashMap = org.telegram.messenger.s8.I;
                    }
                    org.telegram.messenger.w7.G(r9Var.h).h(3, r9Var.A0.document, null, null, null, null);
                    if (j10 == 0) {
                        long j12 = r9Var.f10954u1;
                        if (j12 != 0) {
                            r9Var.H0.f10402a = true;
                            j11 = j12;
                            org.telegram.messenger.a8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                            ((q9) r9Var.H0.f10404c).start(false, r9Var.K(), uri, j11, r9.E1, r9.C1);
                            r9Var.H0.b();
                        }
                    }
                    j11 = j10;
                    org.telegram.messenger.a8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                    ((q9) r9Var.H0.f10404c).start(false, r9Var.K(), uri, j11, r9.E1, r9.C1);
                    r9Var.H0.b();
                } else {
                    org.telegram.messenger.a8.b("StoryViewer requestPlayer: url is null (1)");
                }
            }
            if (uri == null) {
                z10 = false;
            }
            i(false, z10);
            r9Var.f10954u1 = 0L;
            r9Var.d0();
            return;
        }
        gi.r3 r3Var2 = r9Var.E0;
        if (r3Var2 != null) {
            r3Var2.d(0L, null);
        }
        g1 g1Var2 = r9Var.B0;
        if (g1Var2 != null) {
            if (g1Var2.f10301n) {
                g1Var2.s(null);
            } else {
                g1Var2.e();
            }
            r9Var.B0 = null;
        }
        org.telegram.messenger.a8.b("StoryViewer requestPlayer ignored, because closed: " + r9Var.I0 + ", " + r9Var.V);
        i4Var.f10402a = false;
        i4Var.f10404c = null;
        i4Var.f10403b = null;
    }

    public final void d(float f10) {
        r9 r9Var = this.d;
        if (r9Var.f10949s0 != f10) {
            r9Var.f10949s0 = f10;
            r9Var.f10957w.invalidate();
        }
    }

    public final void e() {
        this.d.f10938n1 = false;
    }

    public final void f(boolean z10) {
        q9 q9Var;
        r9 r9Var = this.d;
        if (!r9Var.f10926g1 && z10 && r9Var.f10934l0) {
            r9Var.f10934l0 = false;
            i4 i4Var = r9Var.H0;
            if (i4Var != null && (q9Var = (q9) i4Var.f10404c) != null) {
                q9Var.setSeeking(false);
            }
            j4 H = r9Var.H();
            if (H != null) {
                H.invalidate();
            }
        }
        r9Var.f10926g1 = z10;
        r9Var.d0();
    }

    public final void g(boolean z10) {
        r9 r9Var = this.d;
        r9Var.Y0 = z10;
        r9Var.d0();
    }

    public final void h(Dialog dialog) {
        this.d.t(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        int i3;
        int i10;
        r9 r9Var = this.d;
        gi.r3 r3Var = r9Var.E0;
        int i11 = 8;
        if (r3Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            r3Var.setVisibility(i10);
        }
        SurfaceView surfaceView = r9Var.D0;
        if (surfaceView != null) {
            if (z10) {
                i3 = 8;
            } else if (z11) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            surfaceView.setVisibility(i3);
        }
        j9 j9Var = r9Var.C0;
        if (j9Var != null) {
            if (!z10) {
                i11 = 0;
            }
            j9Var.setVisibility(i11);
        }
    }

    public final void j() {
        int indexOf;
        r9 r9Var = this.d;
        r6 r6Var = this.f10427a;
        if (r6Var != null) {
            if (r9Var.f10939o0.f11211y0 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(r9Var.f10939o0.f11211y0);
            if (r9Var.f10939o0.getCurrentPeerView() == null) {
                indexOf = -1;
            } else {
                indexOf = arrayList.indexOf(r9Var.f10939o0.getCurrentPeerView().getCurrentDay());
            }
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
                if (!r9Var.f10939o0.E(true)) {
                    r9Var.D(false);
                    return;
                }
                r9Var.f10939o0.H0 = new h9(this, r6Var, arrayList, 0);
                return;
            }
            r9Var.D(false);
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f10428b);
        int indexOf2 = arrayList2.indexOf(Long.valueOf(r9Var.f10939o0.getCurrentPeerView().getCurrentPeer()));
        if (indexOf2 >= 0) {
            arrayList2.remove(indexOf2);
            if (!r9Var.f10939o0.E(true)) {
                r9Var.D(false);
                return;
            }
            r9Var.f10939o0.H0 = new ai.e3(this, arrayList2, indexOf2, 9);
            return;
        }
        r9Var.D(false);
    }
}
