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
public final class r9 implements j4 {
    public final a7 f5941a;
    public final ArrayList f5942b;
    public final Context f5943c;
    public final aa d;

    public r9(aa aaVar, a7 a7Var, ArrayList arrayList, Context context) {
        this.d = aaVar;
        this.f5941a = a7Var;
        this.f5942b = arrayList;
        this.f5943c = context;
    }

    public final void a(int i10, long j10) {
        aa aaVar = this.d;
        if (aaVar.J == i10 && aaVar.I == j10) {
            return;
        }
        aaVar.I = j10;
        aaVar.J = i10;
    }

    public final void b(boolean z10) {
        int i10;
        aa aaVar = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = aaVar.f5190f;
        if (aaVar.f5180b) {
            if (!aaVar.f5183c) {
                if (z10) {
                    AndroidUtilities.requestAdjustNothing(n2Var.getParentActivity(), n2Var.getClassGuid());
                    return;
                } else {
                    AndroidUtilities.requestAdjustResize(n2Var.getParentActivity(), n2Var.getClassGuid());
                    return;
                }
            }
            return;
        }
        WindowManager.LayoutParams layoutParams = aaVar.f5214r;
        if (z10) {
            i10 = 48;
        } else {
            i10 = 16;
        }
        layoutParams.softInputMode = i10;
        try {
            aaVar.f5205n.updateViewLayout(aaVar.f5217s, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j10, p4 p4Var) {
        String uri2;
        String uri3;
        long j11;
        z9 z9Var;
        aa aaVar = this.d;
        ArrayList arrayList = aaVar.M0;
        if (!aaVar.H0 && aaVar.U >= 0.9f) {
            Uri uri4 = aaVar.F0;
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
            if (equals && (z9Var = aaVar.f5233z0) != null) {
                if (equals) {
                    aaVar.G0 = p4Var;
                    p4Var.f5730c = z9Var;
                    p4Var.f5729b = null;
                    z9Var.setSpeed(aa.B1);
                    p4 p4Var2 = aaVar.G0;
                    p4Var2.f5728a = aaVar.f5233z0.firstFrameRendered;
                    p4Var2.e = aaVar.f5232y0;
                    p4Var2.f5731f = aaVar.B0;
                    p4Var2.d = aaVar.C0;
                    FileLog.d("StoryViewer requestPlayer: same url");
                }
            } else {
                aaVar.F0 = uri;
                ei.d4 d4Var = aaVar.D0;
                if (d4Var != null) {
                    d4Var.d(0L, null);
                }
                h1 h1Var = aaVar.A0;
                if (h1Var != null) {
                    if (h1Var.f5447n) {
                        h1Var.s(null);
                    } else {
                        h1Var.e();
                    }
                    aaVar.A0 = null;
                }
                z9 z9Var2 = aaVar.f5233z0;
                if (z9Var2 != null) {
                    z9Var2.release(null);
                    aaVar.f5233z0 = null;
                }
                p4 p4Var3 = aaVar.G0;
                if (p4Var3 != null) {
                    p4Var3.f5730c = null;
                    p4Var3.f5729b = null;
                    p4Var3.f5728a = false;
                    p4Var3.e = null;
                    p4Var3.f5731f = null;
                    p4Var3.d = null;
                    p4Var3.b();
                    aaVar.G0 = null;
                }
                if (uri != null) {
                    aaVar.G0 = p4Var;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        } else if (((z9) arrayList.get(i10)).uri.equals(uri)) {
                            aaVar.f5233z0 = (z9) arrayList.remove(i10);
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (aaVar.f5233z0 == null) {
                        z9 z9Var3 = new z9(aaVar, aaVar.C0, aaVar.B0);
                        aaVar.f5233z0 = z9Var3;
                        z9Var3.document = document;
                    }
                    z9 z9Var4 = aaVar.f5233z0;
                    z9Var4.uri = uri;
                    z9Var4.setSpeed(aa.B1);
                    p4 p4Var4 = aaVar.G0;
                    z9 z9Var5 = aaVar.f5233z0;
                    p4Var4.f5730c = z9Var5;
                    p4Var4.f5728a = false;
                    p4Var4.e = aaVar.f5232y0;
                    p4Var4.f5731f = aaVar.B0;
                    p4Var4.d = aaVar.C0;
                    p4Var4.f5729b = null;
                    FileStreamLoadOperation.setPriorityForDocument(z9Var5.document, 3);
                    FileLoader.getInstance(aaVar.h).changePriority(3, aaVar.f5233z0.document, null, null, null, null, null);
                    if (j10 == 0) {
                        long j12 = aaVar.f5221t1;
                        if (j12 != 0) {
                            aaVar.G0.f5728a = true;
                            j11 = j12;
                            FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                            ((z9) aaVar.G0.f5730c).start(false, aaVar.w(), uri, j11, aa.D1, aa.B1);
                            aaVar.G0.b();
                        }
                    }
                    j11 = j10;
                    FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                    ((z9) aaVar.G0.f5730c).start(false, aaVar.w(), uri, j11, aa.D1, aa.B1);
                    aaVar.G0.b();
                } else {
                    FileLog.d("StoryViewer requestPlayer: url is null (1)");
                }
            }
            if (uri == null) {
                z10 = false;
            }
            i(false, z10);
            aaVar.f5221t1 = 0L;
            aaVar.P();
            return;
        }
        ei.d4 d4Var2 = aaVar.D0;
        if (d4Var2 != null) {
            d4Var2.d(0L, null);
        }
        h1 h1Var2 = aaVar.A0;
        if (h1Var2 != null) {
            if (h1Var2.f5447n) {
                h1Var2.s(null);
            } else {
                h1Var2.e();
            }
            aaVar.A0 = null;
        }
        FileLog.d("StoryViewer requestPlayer ignored, because closed: " + aaVar.H0 + ", " + aaVar.U);
        p4Var.f5728a = false;
        p4Var.f5730c = null;
        p4Var.f5729b = null;
    }

    public final void d(float f7) {
        aa aaVar = this.d;
        if (aaVar.f5215r0 != f7) {
            aaVar.f5215r0 = f7;
            aaVar.v.invalidate();
        }
    }

    public final void e() {
        this.d.f5204m1 = false;
    }

    public final void f(boolean z10) {
        z9 z9Var;
        aa aaVar = this.d;
        if (!aaVar.f5192f1 && z10 && aaVar.f5201k0) {
            aaVar.f5201k0 = false;
            p4 p4Var = aaVar.G0;
            if (p4Var != null && (z9Var = (z9) p4Var.f5730c) != null) {
                z9Var.setSeeking(false);
            }
            q4 t10 = aaVar.t();
            if (t10 != null) {
                t10.invalidate();
            }
        }
        aaVar.f5192f1 = z10;
        aaVar.P();
    }

    public final void g(boolean z10) {
        aa aaVar = this.d;
        aaVar.X0 = z10;
        aaVar.P();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        int i10;
        int i11;
        aa aaVar = this.d;
        ei.d4 d4Var = aaVar.D0;
        int i12 = 8;
        if (d4Var != null) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            d4Var.setVisibility(i11);
        }
        SurfaceView surfaceView = aaVar.C0;
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
        s9 s9Var = aaVar.B0;
        if (s9Var != null) {
            if (!z10) {
                i12 = 0;
            }
            s9Var.setVisibility(i12);
        }
    }

    public final void j() {
        int indexOf;
        aa aaVar = this.d;
        a7 a7Var = this.f5941a;
        if (a7Var != null) {
            if (aaVar.f5206n0.f5517x0 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(aaVar.f5206n0.f5517x0);
            if (aaVar.f5206n0.getCurrentPeerView() == null) {
                indexOf = -1;
            } else {
                indexOf = arrayList.indexOf(aaVar.f5206n0.getCurrentPeerView().getCurrentDay());
            }
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
                if (!aaVar.f5206n0.E(true)) {
                    aaVar.q(false);
                    return;
                }
                aaVar.f5206n0.G0 = new a3.l0(this, a7Var, arrayList, 25);
                return;
            }
            aaVar.q(false);
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f5942b);
        int indexOf2 = arrayList2.indexOf(Long.valueOf(aaVar.f5206n0.getCurrentPeerView().getCurrentPeer()));
        if (indexOf2 >= 0) {
            arrayList2.remove(indexOf2);
            if (!aaVar.f5206n0.E(true)) {
                aaVar.q(false);
                return;
            }
            aaVar.f5206n0.G0 = new ah.o(this, arrayList2, indexOf2, 7);
            return;
        }
        aaVar.q(false);
    }
}
