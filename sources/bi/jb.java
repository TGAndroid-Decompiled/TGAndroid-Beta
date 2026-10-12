package bi;

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
public final class jb implements j5 {
    public final o8 f3218a;
    public final ArrayList f3219b;
    public final Context f3220c;
    public final sb d;

    public jb(sb sbVar, o8 o8Var, ArrayList arrayList, Context context) {
        this.d = sbVar;
        this.f3218a = o8Var;
        this.f3219b = arrayList;
        this.f3220c = context;
    }

    public final void a(int i10, long j10) {
        sb sbVar = this.d;
        if (sbVar.J == i10 && sbVar.I == j10) {
            return;
        }
        sbVar.I = j10;
        sbVar.J = i10;
    }

    public final void b(boolean z10) {
        int i10;
        sb sbVar = this.d;
        org.telegram.ui.ActionBar.m2 m2Var = sbVar.f3673f;
        if (sbVar.f3663b) {
            if (!sbVar.f3666c) {
                if (z10) {
                    AndroidUtilities.requestAdjustNothing(m2Var.getParentActivity(), m2Var.getClassGuid());
                    return;
                } else {
                    AndroidUtilities.requestAdjustResize(m2Var.getParentActivity(), m2Var.getClassGuid());
                    return;
                }
            }
            return;
        }
        WindowManager.LayoutParams layoutParams = sbVar.f3697r;
        if (z10) {
            i10 = 48;
        } else {
            i10 = 16;
        }
        layoutParams.softInputMode = i10;
        try {
            sbVar.f3688n.updateViewLayout(sbVar.f3700s, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j10, p5 p5Var) {
        String uri2;
        String uri3;
        long j11;
        rb rbVar;
        sb sbVar = this.d;
        ArrayList arrayList = sbVar.M0;
        if (!sbVar.H0 && sbVar.U >= 0.9f) {
            Uri uri4 = sbVar.F0;
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
            if (equals && (rbVar = sbVar.f3716z0) != null) {
                if (equals) {
                    sbVar.G0 = p5Var;
                    p5Var.f3466c = rbVar;
                    p5Var.f3465b = null;
                    rbVar.setSpeed(sb.B1);
                    p5 p5Var2 = sbVar.G0;
                    p5Var2.f3464a = sbVar.f3716z0.firstFrameRendered;
                    p5Var2.e = sbVar.f3715y0;
                    p5Var2.f3467f = sbVar.B0;
                    p5Var2.d = sbVar.C0;
                    FileLog.d("StoryViewer requestPlayer: same url");
                }
            } else {
                sbVar.F0 = uri;
                di.j4 j4Var = sbVar.D0;
                if (j4Var != null) {
                    j4Var.d(0L, null);
                }
                t1 t1Var = sbVar.A0;
                if (t1Var != null) {
                    if (t1Var.f3724n) {
                        t1Var.s(null);
                    } else {
                        t1Var.e();
                    }
                    sbVar.A0 = null;
                }
                rb rbVar2 = sbVar.f3716z0;
                if (rbVar2 != null) {
                    rbVar2.release(null);
                    sbVar.f3716z0 = null;
                }
                p5 p5Var3 = sbVar.G0;
                if (p5Var3 != null) {
                    p5Var3.f3466c = null;
                    p5Var3.f3465b = null;
                    p5Var3.f3464a = false;
                    p5Var3.e = null;
                    p5Var3.f3467f = null;
                    p5Var3.d = null;
                    p5Var3.b();
                    sbVar.G0 = null;
                }
                if (uri != null) {
                    sbVar.G0 = p5Var;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        } else if (((rb) arrayList.get(i10)).uri.equals(uri)) {
                            sbVar.f3716z0 = (rb) arrayList.remove(i10);
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (sbVar.f3716z0 == null) {
                        rb rbVar3 = new rb(sbVar, sbVar.C0, sbVar.B0);
                        sbVar.f3716z0 = rbVar3;
                        rbVar3.document = document;
                    }
                    rb rbVar4 = sbVar.f3716z0;
                    rbVar4.uri = uri;
                    rbVar4.setSpeed(sb.B1);
                    p5 p5Var4 = sbVar.G0;
                    rb rbVar5 = sbVar.f3716z0;
                    p5Var4.f3466c = rbVar5;
                    p5Var4.f3464a = false;
                    p5Var4.e = sbVar.f3715y0;
                    p5Var4.f3467f = sbVar.B0;
                    p5Var4.d = sbVar.C0;
                    p5Var4.f3465b = null;
                    FileStreamLoadOperation.setPriorityForDocument(rbVar5.document, 3);
                    FileLoader.getInstance(sbVar.h).changePriority(3, sbVar.f3716z0.document, null, null, null, null, null);
                    if (j10 == 0) {
                        long j12 = sbVar.f3704t1;
                        if (j12 != 0) {
                            sbVar.G0.f3464a = true;
                            j11 = j12;
                            FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                            ((rb) sbVar.G0.f3466c).start(false, sbVar.w(), uri, j11, sb.D1, sb.B1);
                            sbVar.G0.b();
                        }
                    }
                    j11 = j10;
                    FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                    ((rb) sbVar.G0.f3466c).start(false, sbVar.w(), uri, j11, sb.D1, sb.B1);
                    sbVar.G0.b();
                } else {
                    FileLog.d("StoryViewer requestPlayer: url is null (1)");
                }
            }
            if (uri == null) {
                z10 = false;
            }
            i(false, z10);
            sbVar.f3704t1 = 0L;
            sbVar.P();
            return;
        }
        di.j4 j4Var2 = sbVar.D0;
        if (j4Var2 != null) {
            j4Var2.d(0L, null);
        }
        t1 t1Var2 = sbVar.A0;
        if (t1Var2 != null) {
            if (t1Var2.f3724n) {
                t1Var2.s(null);
            } else {
                t1Var2.e();
            }
            sbVar.A0 = null;
        }
        FileLog.d("StoryViewer requestPlayer ignored, because closed: " + sbVar.H0 + ", " + sbVar.U);
        p5Var.f3464a = false;
        p5Var.f3466c = null;
        p5Var.f3465b = null;
    }

    public final void d(float f7) {
        sb sbVar = this.d;
        if (sbVar.f3698r0 != f7) {
            sbVar.f3698r0 = f7;
            sbVar.v.invalidate();
        }
    }

    public final void e() {
        this.d.f3687m1 = false;
    }

    public final void f(boolean z10) {
        rb rbVar;
        sb sbVar = this.d;
        if (!sbVar.f3675f1 && z10 && sbVar.f3684k0) {
            sbVar.f3684k0 = false;
            p5 p5Var = sbVar.G0;
            if (p5Var != null && (rbVar = (rb) p5Var.f3466c) != null) {
                rbVar.setSeeking(false);
            }
            q5 t10 = sbVar.t();
            if (t10 != null) {
                t10.invalidate();
            }
        }
        sbVar.f3675f1 = z10;
        sbVar.P();
    }

    public final void g(boolean z10) {
        sb sbVar = this.d;
        sbVar.X0 = z10;
        sbVar.P();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        int i10;
        int i11;
        sb sbVar = this.d;
        di.j4 j4Var = sbVar.D0;
        int i12 = 8;
        if (j4Var != null) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            j4Var.setVisibility(i11);
        }
        SurfaceView surfaceView = sbVar.C0;
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
        kb kbVar = sbVar.B0;
        if (kbVar != null) {
            if (!z10) {
                i12 = 0;
            }
            kbVar.setVisibility(i12);
        }
    }

    public final void j() {
        int indexOf;
        sb sbVar = this.d;
        o8 o8Var = this.f3218a;
        if (o8Var != null) {
            if (sbVar.f3689n0.f3985x0 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(sbVar.f3689n0.f3985x0);
            if (sbVar.f3689n0.getCurrentPeerView() == null) {
                indexOf = -1;
            } else {
                indexOf = arrayList.indexOf(sbVar.f3689n0.getCurrentPeerView().getCurrentDay());
            }
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
                if (!sbVar.f3689n0.E(true)) {
                    sbVar.q(false);
                    return;
                }
                sbVar.f3689n0.G0 = new a3.l0(this, o8Var, arrayList, 10);
                return;
            }
            sbVar.q(false);
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f3219b);
        int indexOf2 = arrayList2.indexOf(Long.valueOf(sbVar.f3689n0.getCurrentPeerView().getCurrentPeer()));
        if (indexOf2 >= 0) {
            arrayList2.remove(indexOf2);
            if (!sbVar.f3689n0.E(true)) {
                sbVar.q(false);
                return;
            }
            sbVar.f3689n0.G0 = new ah.o(this, arrayList2, indexOf2, 3);
            return;
        }
        sbVar.q(false);
    }
}
