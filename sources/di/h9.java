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
public final class h9 implements c4 {
    public final r6 f9088a;
    public final ArrayList f9089b;
    public final Context f9090c;
    public final q9 d;

    public h9(q9 q9Var, r6 r6Var, ArrayList arrayList, Context context) {
        this.d = q9Var;
        this.f9088a = r6Var;
        this.f9089b = arrayList;
        this.f9090c = context;
    }

    public final void a(int i7, long j3) {
        q9 q9Var = this.d;
        if (q9Var.J == i7 && q9Var.I == j3) {
            return;
        }
        q9Var.I = j3;
        q9Var.J = i7;
    }

    public final void b(boolean z9) {
        int i7;
        q9 q9Var = this.d;
        org.telegram.ui.ActionBar.f2 f2Var = q9Var.f9608f;
        if (q9Var.f9597b) {
            if (!q9Var.f9600c) {
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
        WindowManager.LayoutParams layoutParams = q9Var.f9631r;
        if (z9) {
            i7 = 48;
        } else {
            i7 = 16;
        }
        layoutParams.softInputMode = i7;
        try {
            q9Var.f9623n.updateViewLayout(q9Var.f9634s, layoutParams);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j3, i4 i4Var) {
        String uri2;
        String uri3;
        long j10;
        p9 p9Var;
        q9 q9Var = this.d;
        ArrayList arrayList = q9Var.L0;
        if (!q9Var.G0 && q9Var.U >= 0.9f) {
            Uri uri4 = q9Var.E0;
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
            if (equals && (p9Var = q9Var.f9649z0) != null) {
                if (equals) {
                    q9Var.F0 = i4Var;
                    i4Var.f9106c = p9Var;
                    i4Var.f9105b = null;
                    p9Var.setSpeed(q9.A1);
                    i4 i4Var2 = q9Var.F0;
                    i4Var2.f9104a = q9Var.f9649z0.firstFrameRendered;
                    i4Var2.f9107e = q9Var.f9648y0;
                    i4Var2.f9108f = q9Var.B0;
                    i4Var2.d = q9Var.C0;
                    org.telegram.messenger.a8.b("StoryViewer requestPlayer: same url");
                }
            } else {
                q9Var.E0 = uri;
                fi.s3 s3Var = q9Var.D0;
                if (s3Var != null) {
                    s3Var.b(0L, null);
                }
                g1 g1Var = q9Var.A0;
                if (g1Var != null) {
                    if (g1Var.f9002n) {
                        g1Var.s(null);
                    } else {
                        g1Var.e();
                    }
                    q9Var.A0 = null;
                }
                p9 p9Var2 = q9Var.f9649z0;
                if (p9Var2 != null) {
                    p9Var2.release(null);
                    q9Var.f9649z0 = null;
                }
                i4 i4Var3 = q9Var.F0;
                if (i4Var3 != null) {
                    i4Var3.f9106c = null;
                    i4Var3.f9105b = null;
                    i4Var3.f9104a = false;
                    i4Var3.f9107e = null;
                    i4Var3.f9108f = null;
                    i4Var3.d = null;
                    i4Var3.b();
                    q9Var.F0 = null;
                }
                if (uri != null) {
                    q9Var.F0 = i4Var;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        } else if (((p9) arrayList.get(i7)).uri.equals(uri)) {
                            q9Var.f9649z0 = (p9) arrayList.remove(i7);
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (q9Var.f9649z0 == null) {
                        p9 p9Var3 = new p9(q9Var, q9Var.C0, q9Var.B0);
                        q9Var.f9649z0 = p9Var3;
                        p9Var3.document = document;
                    }
                    p9 p9Var4 = q9Var.f9649z0;
                    p9Var4.uri = uri;
                    p9Var4.setSpeed(q9.A1);
                    i4 i4Var4 = q9Var.F0;
                    p9 p9Var5 = q9Var.f9649z0;
                    i4Var4.f9106c = p9Var5;
                    i4Var4.f9104a = false;
                    i4Var4.f9107e = q9Var.f9648y0;
                    i4Var4.f9108f = q9Var.B0;
                    i4Var4.d = q9Var.C0;
                    i4Var4.f9105b = null;
                    TLRPC.Document document2 = p9Var5.document;
                    if (document2 != null) {
                        org.telegram.messenger.s8.I.put(Long.valueOf(document2.f26962id), 3);
                    } else {
                        ConcurrentHashMap concurrentHashMap = org.telegram.messenger.s8.H;
                    }
                    org.telegram.messenger.w7.G(q9Var.h).h(3, q9Var.f9649z0.document, null, null, null, null);
                    if (j3 == 0) {
                        long j11 = q9Var.f9636s1;
                        if (j11 != 0) {
                            q9Var.F0.f9104a = true;
                            j10 = j11;
                            org.telegram.messenger.a8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                            ((p9) q9Var.F0.f9106c).start(false, q9Var.C(), uri, j10, q9.C1, q9.A1);
                            q9Var.F0.b();
                        }
                    }
                    j10 = j3;
                    org.telegram.messenger.a8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                    ((p9) q9Var.F0.f9106c).start(false, q9Var.C(), uri, j10, q9.C1, q9.A1);
                    q9Var.F0.b();
                } else {
                    org.telegram.messenger.a8.b("StoryViewer requestPlayer: url is null (1)");
                }
            }
            if (uri == null) {
                z9 = false;
            }
            i(false, z9);
            q9Var.f9636s1 = 0L;
            q9Var.V();
            return;
        }
        fi.s3 s3Var2 = q9Var.D0;
        if (s3Var2 != null) {
            s3Var2.b(0L, null);
        }
        g1 g1Var2 = q9Var.A0;
        if (g1Var2 != null) {
            if (g1Var2.f9002n) {
                g1Var2.s(null);
            } else {
                g1Var2.e();
            }
            q9Var.A0 = null;
        }
        org.telegram.messenger.a8.b("StoryViewer requestPlayer ignored, because closed: " + q9Var.G0 + ", " + q9Var.U);
        i4Var.f9104a = false;
        i4Var.f9106c = null;
        i4Var.f9105b = null;
    }

    public final void d(float f10) {
        q9 q9Var = this.d;
        if (q9Var.f9632r0 != f10) {
            q9Var.f9632r0 = f10;
            q9Var.f9643w.invalidate();
        }
    }

    public final void e() {
        this.d.l1 = false;
    }

    public final void f(boolean z9) {
        p9 p9Var;
        q9 q9Var = this.d;
        if (!q9Var.f9607e1 && z9 && q9Var.f9619k0) {
            q9Var.f9619k0 = false;
            i4 i4Var = q9Var.F0;
            if (i4Var != null && (p9Var = (p9) i4Var.f9106c) != null) {
                p9Var.setSeeking(false);
            }
            j4 z10 = q9Var.z();
            if (z10 != null) {
                z10.invalidate();
            }
        }
        q9Var.f9607e1 = z9;
        q9Var.V();
    }

    public final void g(boolean z9) {
        q9 q9Var = this.d;
        q9Var.W0 = z9;
        q9Var.V();
    }

    public final void h(Dialog dialog) {
        this.d.t(dialog);
    }

    public final void i(boolean z9, boolean z10) {
        int i7;
        int i10;
        q9 q9Var = this.d;
        fi.s3 s3Var = q9Var.D0;
        int i11 = 8;
        if (s3Var != null) {
            if (z9) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            s3Var.setVisibility(i10);
        }
        SurfaceView surfaceView = q9Var.C0;
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
        i9 i9Var = q9Var.B0;
        if (i9Var != null) {
            if (!z9) {
                i11 = 0;
            }
            i9Var.setVisibility(i11);
        }
    }

    public final void j() {
        int indexOf;
        q9 q9Var = this.d;
        r6 r6Var = this.f9088a;
        if (r6Var != null) {
            if (q9Var.f9624n0.f9936x0 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(q9Var.f9624n0.f9936x0);
            if (q9Var.f9624n0.getCurrentPeerView() == null) {
                indexOf = -1;
            } else {
                indexOf = arrayList.indexOf(q9Var.f9624n0.getCurrentPeerView().getCurrentDay());
            }
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
                if (!q9Var.f9624n0.E(true)) {
                    q9Var.u(false);
                    return;
                }
                q9Var.f9624n0.G0 = new aa.s(this, r6Var, arrayList, 28);
                return;
            }
            q9Var.u(false);
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f9089b);
        int indexOf2 = arrayList2.indexOf(Long.valueOf(q9Var.f9624n0.getCurrentPeerView().getCurrentPeer()));
        if (indexOf2 >= 0) {
            arrayList2.remove(indexOf2);
            if (!q9Var.f9624n0.E(true)) {
                q9Var.u(false);
                return;
            }
            q9Var.f9624n0.G0 = new ai.e0(this, arrayList2, indexOf2, 8);
            return;
        }
        q9Var.u(false);
    }
}
