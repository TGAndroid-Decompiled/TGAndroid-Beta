package ci;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileStreamLoadOperation;
import org.telegram.tgnet.TLRPC;
public final class q9 implements i4 {
    public final z6 f5808a;
    public final ArrayList f5809b;
    public final Context f5810c;
    public final z9 d;

    public q9(z9 z9Var, z6 z6Var, ArrayList arrayList, Context context) {
        this.d = z9Var;
        this.f5808a = z6Var;
        this.f5809b = arrayList;
        this.f5810c = context;
    }

    public final void a(int i10, long j10) {
        z9 z9Var = this.d;
        if (z9Var.J == i10 && z9Var.I == j10) {
            return;
        }
        z9Var.I = j10;
        z9Var.J = i10;
    }

    public final void b(boolean z10) {
        int i10;
        z9 z9Var = this.d;
        org.telegram.ui.ActionBar.o2 o2Var = z9Var.f6233f;
        if (z9Var.f6223b) {
            if (!z9Var.f6226c) {
                if (z10) {
                    AndroidUtilities.requestAdjustNothing(o2Var.getParentActivity(), o2Var.getClassGuid());
                    return;
                } else {
                    AndroidUtilities.requestAdjustResize(o2Var.getParentActivity(), o2Var.getClassGuid());
                    return;
                }
            }
            return;
        }
        WindowManager.LayoutParams layoutParams = z9Var.f6257r;
        if (z10) {
            i10 = 48;
        } else {
            i10 = 16;
        }
        layoutParams.softInputMode = i10;
        try {
            z9Var.f6248n.updateViewLayout(z9Var.f6260s, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j10, o4 o4Var) {
        String uri2;
        String uri3;
        long j11;
        y9 y9Var;
        z9 z9Var = this.d;
        ArrayList arrayList = z9Var.M0;
        if (!z9Var.H0 && z9Var.U >= 0.9f) {
            Uri uri4 = z9Var.F0;
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
            if (equals && (y9Var = z9Var.f6276z0) != null) {
                if (equals) {
                    z9Var.G0 = o4Var;
                    o4Var.f5633c = y9Var;
                    o4Var.f5632b = null;
                    y9Var.setSpeed(z9.B1);
                    o4 o4Var2 = z9Var.G0;
                    o4Var2.f5631a = z9Var.f6276z0.firstFrameRendered;
                    o4Var2.e = z9Var.f6275y0;
                    o4Var2.f5634f = z9Var.B0;
                    o4Var2.d = z9Var.C0;
                    FileLog.d("StoryViewer requestPlayer: same url");
                }
            } else {
                z9Var.F0 = uri;
                ei.d4 d4Var = z9Var.D0;
                if (d4Var != null) {
                    d4Var.d(0L, null);
                }
                h1 h1Var = z9Var.A0;
                if (h1Var != null) {
                    if (h1Var.f5383n) {
                        h1Var.s(null);
                    } else {
                        h1Var.e();
                    }
                    z9Var.A0 = null;
                }
                y9 y9Var2 = z9Var.f6276z0;
                if (y9Var2 != null) {
                    y9Var2.release(null);
                    z9Var.f6276z0 = null;
                }
                o4 o4Var3 = z9Var.G0;
                if (o4Var3 != null) {
                    o4Var3.f5633c = null;
                    o4Var3.f5632b = null;
                    o4Var3.f5631a = false;
                    o4Var3.e = null;
                    o4Var3.f5634f = null;
                    o4Var3.d = null;
                    o4Var3.b();
                    z9Var.G0 = null;
                }
                if (uri != null) {
                    z9Var.G0 = o4Var;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        } else if (((y9) arrayList.get(i10)).uri.equals(uri)) {
                            z9Var.f6276z0 = (y9) arrayList.remove(i10);
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (z9Var.f6276z0 == null) {
                        y9 y9Var3 = new y9(z9Var, z9Var.C0, z9Var.B0);
                        z9Var.f6276z0 = y9Var3;
                        y9Var3.document = document;
                    }
                    y9 y9Var4 = z9Var.f6276z0;
                    y9Var4.uri = uri;
                    y9Var4.setSpeed(z9.B1);
                    o4 o4Var4 = z9Var.G0;
                    y9 y9Var5 = z9Var.f6276z0;
                    o4Var4.f5633c = y9Var5;
                    o4Var4.f5631a = false;
                    o4Var4.e = z9Var.f6275y0;
                    o4Var4.f5634f = z9Var.B0;
                    o4Var4.d = z9Var.C0;
                    o4Var4.f5632b = null;
                    FileStreamLoadOperation.setPriorityForDocument(y9Var5.document, 3);
                    FileLoader.getInstance(z9Var.h).changePriority(3, z9Var.f6276z0.document, null, null, null, null, null);
                    if (j10 == 0) {
                        long j12 = z9Var.f6264t1;
                        if (j12 != 0) {
                            z9Var.G0.f5631a = true;
                            j11 = j12;
                            FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                            ((y9) z9Var.G0.f5633c).start(false, z9Var.w(), uri, j11, z9.D1, z9.B1);
                            z9Var.G0.b();
                        }
                    }
                    j11 = j10;
                    FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                    ((y9) z9Var.G0.f5633c).start(false, z9Var.w(), uri, j11, z9.D1, z9.B1);
                    z9Var.G0.b();
                } else {
                    FileLog.d("StoryViewer requestPlayer: url is null (1)");
                }
            }
            if (uri == null) {
                z10 = false;
            }
            i(false, z10);
            z9Var.f6264t1 = 0L;
            z9Var.P();
            return;
        }
        ei.d4 d4Var2 = z9Var.D0;
        if (d4Var2 != null) {
            d4Var2.d(0L, null);
        }
        h1 h1Var2 = z9Var.A0;
        if (h1Var2 != null) {
            if (h1Var2.f5383n) {
                h1Var2.s(null);
            } else {
                h1Var2.e();
            }
            z9Var.A0 = null;
        }
        FileLog.d("StoryViewer requestPlayer ignored, because closed: " + z9Var.H0 + ", " + z9Var.U);
        o4Var.f5631a = false;
        o4Var.f5633c = null;
        o4Var.f5632b = null;
    }

    public final void d(float f7) {
        z9 z9Var = this.d;
        if (z9Var.f6258r0 != f7) {
            z9Var.f6258r0 = f7;
            z9Var.v.invalidate();
        }
    }

    public final void e() {
        this.d.f6247m1 = false;
    }

    public final void f(boolean z10) {
        y9 y9Var;
        z9 z9Var = this.d;
        if (!z9Var.f6235f1 && z10 && z9Var.f6244k0) {
            z9Var.f6244k0 = false;
            o4 o4Var = z9Var.G0;
            if (o4Var != null && (y9Var = (y9) o4Var.f5633c) != null) {
                y9Var.setSeeking(false);
            }
            p4 t10 = z9Var.t();
            if (t10 != null) {
                t10.invalidate();
            }
        }
        z9Var.f6235f1 = z10;
        z9Var.P();
    }

    public final void g(boolean z10) {
        z9 z9Var = this.d;
        z9Var.X0 = z10;
        z9Var.P();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        int i10;
        int i11;
        z9 z9Var = this.d;
        ei.d4 d4Var = z9Var.D0;
        int i12 = 8;
        if (d4Var != null) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            d4Var.setVisibility(i11);
        }
        SurfaceView surfaceView = z9Var.C0;
        if (surfaceView != null) {
            if (z10) {
                i10 = 8;
            } else if (z11) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            surfaceView.setVisibility(i10);
        }
        r9 r9Var = z9Var.B0;
        if (r9Var != null) {
            if (!z10) {
                i12 = 0;
            }
            r9Var.setVisibility(i12);
        }
    }

    public final void j() {
        int indexOf;
        z9 z9Var = this.d;
        z6 z6Var = this.f5808a;
        if (z6Var != null) {
            if (z9Var.f6249n0.f5422x0 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(z9Var.f6249n0.f5422x0);
            if (z9Var.f6249n0.getCurrentPeerView() == null) {
                indexOf = -1;
            } else {
                indexOf = arrayList.indexOf(z9Var.f6249n0.getCurrentPeerView().getCurrentDay());
            }
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
                if (!z9Var.f6249n0.E(true)) {
                    z9Var.q(false);
                    return;
                }
                z9Var.f6249n0.G0 = new a3.l0(this, z6Var, arrayList, 25);
                return;
            }
            z9Var.q(false);
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f5809b);
        int indexOf2 = arrayList2.indexOf(Long.valueOf(z9Var.f6249n0.getCurrentPeerView().getCurrentPeer()));
        if (indexOf2 >= 0) {
            arrayList2.remove(indexOf2);
            if (!z9Var.f6249n0.E(true)) {
                z9Var.q(false);
                return;
            }
            z9Var.f6249n0.G0 = new ah.o(this, arrayList2, indexOf2, 7);
            return;
        }
        z9Var.q(false);
    }
}
