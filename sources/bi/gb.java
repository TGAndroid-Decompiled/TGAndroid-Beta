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
public final class gb implements h5 {
    public final l8 f3039a;
    public final ArrayList f3040b;
    public final Context f3041c;
    public final pb d;

    public gb(pb pbVar, l8 l8Var, ArrayList arrayList, Context context) {
        this.d = pbVar;
        this.f3039a = l8Var;
        this.f3040b = arrayList;
        this.f3041c = context;
    }

    public final void a(int i10, long j3) {
        pb pbVar = this.d;
        if (pbVar.J == i10 && pbVar.I == j3) {
            return;
        }
        pbVar.I = j3;
        pbVar.J = i10;
    }

    public final void b(boolean z10) {
        int i10;
        pb pbVar = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = pbVar.f3545f;
        if (pbVar.f3534b) {
            if (!pbVar.f3537c) {
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
        WindowManager.LayoutParams layoutParams = pbVar.f3569r;
        if (z10) {
            i10 = 48;
        } else {
            i10 = 16;
        }
        layoutParams.softInputMode = i10;
        try {
            pbVar.f3560n.updateViewLayout(pbVar.f3572s, layoutParams);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j3, n5 n5Var) {
        String uri2;
        String uri3;
        long j10;
        ob obVar;
        pb pbVar = this.d;
        ArrayList arrayList = pbVar.M0;
        if (!pbVar.H0 && pbVar.U >= 0.9f) {
            Uri uri4 = pbVar.F0;
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
            if (equals && (obVar = pbVar.f3588z0) != null) {
                if (equals) {
                    pbVar.G0 = n5Var;
                    n5Var.f3366c = obVar;
                    n5Var.f3365b = null;
                    obVar.setSpeed(pb.B1);
                    n5 n5Var2 = pbVar.G0;
                    n5Var2.f3364a = pbVar.f3588z0.firstFrameRendered;
                    n5Var2.f3367e = pbVar.f3587y0;
                    n5Var2.f3368f = pbVar.B0;
                    n5Var2.d = pbVar.C0;
                    FileLog.d("StoryViewer requestPlayer: same url");
                }
            } else {
                pbVar.F0 = uri;
                di.l4 l4Var = pbVar.D0;
                if (l4Var != null) {
                    l4Var.d(0L, null);
                }
                t1 t1Var = pbVar.A0;
                if (t1Var != null) {
                    if (t1Var.f3720n) {
                        t1Var.s(null);
                    } else {
                        t1Var.e();
                    }
                    pbVar.A0 = null;
                }
                ob obVar2 = pbVar.f3588z0;
                if (obVar2 != null) {
                    obVar2.release(null);
                    pbVar.f3588z0 = null;
                }
                n5 n5Var3 = pbVar.G0;
                if (n5Var3 != null) {
                    n5Var3.f3366c = null;
                    n5Var3.f3365b = null;
                    n5Var3.f3364a = false;
                    n5Var3.f3367e = null;
                    n5Var3.f3368f = null;
                    n5Var3.d = null;
                    n5Var3.b();
                    pbVar.G0 = null;
                }
                if (uri != null) {
                    pbVar.G0 = n5Var;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        } else if (((ob) arrayList.get(i10)).uri.equals(uri)) {
                            pbVar.f3588z0 = (ob) arrayList.remove(i10);
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (pbVar.f3588z0 == null) {
                        ob obVar3 = new ob(pbVar, pbVar.C0, pbVar.B0);
                        pbVar.f3588z0 = obVar3;
                        obVar3.document = document;
                    }
                    ob obVar4 = pbVar.f3588z0;
                    obVar4.uri = uri;
                    obVar4.setSpeed(pb.B1);
                    n5 n5Var4 = pbVar.G0;
                    ob obVar5 = pbVar.f3588z0;
                    n5Var4.f3366c = obVar5;
                    n5Var4.f3364a = false;
                    n5Var4.f3367e = pbVar.f3587y0;
                    n5Var4.f3368f = pbVar.B0;
                    n5Var4.d = pbVar.C0;
                    n5Var4.f3365b = null;
                    FileStreamLoadOperation.setPriorityForDocument(obVar5.document, 3);
                    FileLoader.getInstance(pbVar.h).changePriority(3, pbVar.f3588z0.document, null, null, null, null, null);
                    if (j3 == 0) {
                        long j11 = pbVar.f3576t1;
                        if (j11 != 0) {
                            pbVar.G0.f3364a = true;
                            j10 = j11;
                            FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                            ((ob) pbVar.G0.f3366c).start(false, pbVar.w(), uri, j10, pb.D1, pb.B1);
                            pbVar.G0.b();
                        }
                    }
                    j10 = j3;
                    FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                    ((ob) pbVar.G0.f3366c).start(false, pbVar.w(), uri, j10, pb.D1, pb.B1);
                    pbVar.G0.b();
                } else {
                    FileLog.d("StoryViewer requestPlayer: url is null (1)");
                }
            }
            if (uri == null) {
                z10 = false;
            }
            i(false, z10);
            pbVar.f3576t1 = 0L;
            pbVar.P();
            return;
        }
        di.l4 l4Var2 = pbVar.D0;
        if (l4Var2 != null) {
            l4Var2.d(0L, null);
        }
        t1 t1Var2 = pbVar.A0;
        if (t1Var2 != null) {
            if (t1Var2.f3720n) {
                t1Var2.s(null);
            } else {
                t1Var2.e();
            }
            pbVar.A0 = null;
        }
        FileLog.d("StoryViewer requestPlayer ignored, because closed: " + pbVar.H0 + ", " + pbVar.U);
        n5Var.f3364a = false;
        n5Var.f3366c = null;
        n5Var.f3365b = null;
    }

    public final void d(float f7) {
        pb pbVar = this.d;
        if (pbVar.f3570r0 != f7) {
            pbVar.f3570r0 = f7;
            pbVar.v.invalidate();
        }
    }

    public final void e() {
        this.d.f3559m1 = false;
    }

    public final void f(boolean z10) {
        ob obVar;
        pb pbVar = this.d;
        if (!pbVar.f3547f1 && z10 && pbVar.f3556k0) {
            pbVar.f3556k0 = false;
            n5 n5Var = pbVar.G0;
            if (n5Var != null && (obVar = (ob) n5Var.f3366c) != null) {
                obVar.setSeeking(false);
            }
            o5 t10 = pbVar.t();
            if (t10 != null) {
                t10.invalidate();
            }
        }
        pbVar.f3547f1 = z10;
        pbVar.P();
    }

    public final void g(boolean z10) {
        pb pbVar = this.d;
        pbVar.X0 = z10;
        pbVar.P();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        int i10;
        int i11;
        pb pbVar = this.d;
        di.l4 l4Var = pbVar.D0;
        int i12 = 8;
        if (l4Var != null) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            l4Var.setVisibility(i11);
        }
        SurfaceView surfaceView = pbVar.C0;
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
        hb hbVar = pbVar.B0;
        if (hbVar != null) {
            if (!z10) {
                i12 = 0;
            }
            hbVar.setVisibility(i12);
        }
    }

    public final void j() {
        int indexOf;
        pb pbVar = this.d;
        l8 l8Var = this.f3039a;
        if (l8Var != null) {
            if (pbVar.f3561n0.f3829x0 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(pbVar.f3561n0.f3829x0);
            if (pbVar.f3561n0.getCurrentPeerView() == null) {
                indexOf = -1;
            } else {
                indexOf = arrayList.indexOf(pbVar.f3561n0.getCurrentPeerView().getCurrentDay());
            }
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
                if (!pbVar.f3561n0.E(true)) {
                    pbVar.q(false);
                    return;
                }
                pbVar.f3561n0.G0 = new a3.j0(this, l8Var, arrayList, 10);
                return;
            }
            pbVar.q(false);
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f3040b);
        int indexOf2 = arrayList2.indexOf(Long.valueOf(pbVar.f3561n0.getCurrentPeerView().getCurrentPeer()));
        if (indexOf2 >= 0) {
            arrayList2.remove(indexOf2);
            if (!pbVar.f3561n0.E(true)) {
                pbVar.q(false);
                return;
            }
            pbVar.f3561n0.G0 = new ah.p(this, arrayList2, indexOf2, 3);
            return;
        }
        pbVar.q(false);
    }
}
