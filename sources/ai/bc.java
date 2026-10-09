package ai;

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
public final class bc implements y5 {
    public final e9 f731a;
    public final ArrayList f732b;
    public final Context f733c;
    public final kc d;

    public bc(kc kcVar, e9 e9Var, ArrayList arrayList, Context context) {
        this.d = kcVar;
        this.f731a = e9Var;
        this.f732b = arrayList;
        this.f733c = context;
    }

    public final void a(int i10, long j3) {
        kc kcVar = this.d;
        if (kcVar.J == i10 && kcVar.I == j3) {
            return;
        }
        kcVar.I = j3;
        kcVar.J = i10;
    }

    public final void b(boolean z10) {
        int i10;
        kc kcVar = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = kcVar.f1267f;
        if (kcVar.f1256b) {
            if (!kcVar.f1259c) {
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
        WindowManager.LayoutParams layoutParams = kcVar.f1291r;
        if (z10) {
            i10 = 48;
        } else {
            i10 = 16;
        }
        layoutParams.softInputMode = i10;
        try {
            kcVar.f1282n.updateViewLayout(kcVar.f1294s, layoutParams);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j3, e6 e6Var) {
        String uri2;
        String uri3;
        long j10;
        jc jcVar;
        kc kcVar = this.d;
        ArrayList arrayList = kcVar.M0;
        if (!kcVar.H0 && kcVar.U >= 0.9f) {
            Uri uri4 = kcVar.F0;
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
            if (equals && (jcVar = kcVar.f1310z0) != null) {
                if (equals) {
                    kcVar.G0 = e6Var;
                    e6Var.f884c = jcVar;
                    e6Var.f883b = null;
                    jcVar.setSpeed(kc.B1);
                    e6 e6Var2 = kcVar.G0;
                    e6Var2.f882a = kcVar.f1310z0.firstFrameRendered;
                    e6Var2.f885e = kcVar.f1309y0;
                    e6Var2.f886f = kcVar.B0;
                    e6Var2.d = kcVar.C0;
                    FileLog.d("StoryViewer requestPlayer: same url");
                }
            } else {
                kcVar.F0 = uri;
                ci.j4 j4Var = kcVar.D0;
                if (j4Var != null) {
                    j4Var.d(0L, null);
                }
                d2 d2Var = kcVar.A0;
                if (d2Var != null) {
                    if (d2Var.f811n) {
                        d2Var.s(null);
                    } else {
                        d2Var.e();
                    }
                    kcVar.A0 = null;
                }
                jc jcVar2 = kcVar.f1310z0;
                if (jcVar2 != null) {
                    jcVar2.release(null);
                    kcVar.f1310z0 = null;
                }
                e6 e6Var3 = kcVar.G0;
                if (e6Var3 != null) {
                    e6Var3.f884c = null;
                    e6Var3.f883b = null;
                    e6Var3.f882a = false;
                    e6Var3.f885e = null;
                    e6Var3.f886f = null;
                    e6Var3.d = null;
                    e6Var3.b();
                    kcVar.G0 = null;
                }
                if (uri != null) {
                    kcVar.G0 = e6Var;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        } else if (((jc) arrayList.get(i10)).uri.equals(uri)) {
                            kcVar.f1310z0 = (jc) arrayList.remove(i10);
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (kcVar.f1310z0 == null) {
                        jc jcVar3 = new jc(kcVar, kcVar.C0, kcVar.B0);
                        kcVar.f1310z0 = jcVar3;
                        jcVar3.document = document;
                    }
                    jc jcVar4 = kcVar.f1310z0;
                    jcVar4.uri = uri;
                    jcVar4.setSpeed(kc.B1);
                    e6 e6Var4 = kcVar.G0;
                    jc jcVar5 = kcVar.f1310z0;
                    e6Var4.f884c = jcVar5;
                    e6Var4.f882a = false;
                    e6Var4.f885e = kcVar.f1309y0;
                    e6Var4.f886f = kcVar.B0;
                    e6Var4.d = kcVar.C0;
                    e6Var4.f883b = null;
                    FileStreamLoadOperation.setPriorityForDocument(jcVar5.document, 3);
                    FileLoader.getInstance(kcVar.h).changePriority(3, kcVar.f1310z0.document, null, null, null, null, null);
                    if (j3 == 0) {
                        long j11 = kcVar.f1298t1;
                        if (j11 != 0) {
                            kcVar.G0.f882a = true;
                            j10 = j11;
                            FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                            ((jc) kcVar.G0.f884c).start(false, kcVar.w(), uri, j10, kc.D1, kc.B1);
                            kcVar.G0.b();
                        }
                    }
                    j10 = j3;
                    FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                    ((jc) kcVar.G0.f884c).start(false, kcVar.w(), uri, j10, kc.D1, kc.B1);
                    kcVar.G0.b();
                } else {
                    FileLog.d("StoryViewer requestPlayer: url is null (1)");
                }
            }
            if (uri == null) {
                z10 = false;
            }
            i(false, z10);
            kcVar.f1298t1 = 0L;
            kcVar.P();
            return;
        }
        ci.j4 j4Var2 = kcVar.D0;
        if (j4Var2 != null) {
            j4Var2.d(0L, null);
        }
        d2 d2Var2 = kcVar.A0;
        if (d2Var2 != null) {
            if (d2Var2.f811n) {
                d2Var2.s(null);
            } else {
                d2Var2.e();
            }
            kcVar.A0 = null;
        }
        FileLog.d("StoryViewer requestPlayer ignored, because closed: " + kcVar.H0 + ", " + kcVar.U);
        e6Var.f882a = false;
        e6Var.f884c = null;
        e6Var.f883b = null;
    }

    public final void d(float f7) {
        kc kcVar = this.d;
        if (kcVar.f1292r0 != f7) {
            kcVar.f1292r0 = f7;
            kcVar.v.invalidate();
        }
    }

    public final void e() {
        this.d.f1281m1 = false;
    }

    public final void f(boolean z10) {
        jc jcVar;
        kc kcVar = this.d;
        if (!kcVar.f1269f1 && z10 && kcVar.f1278k0) {
            kcVar.f1278k0 = false;
            e6 e6Var = kcVar.G0;
            if (e6Var != null && (jcVar = (jc) e6Var.f884c) != null) {
                jcVar.setSeeking(false);
            }
            f6 t10 = kcVar.t();
            if (t10 != null) {
                t10.invalidate();
            }
        }
        kcVar.f1269f1 = z10;
        kcVar.P();
    }

    public final void g(boolean z10) {
        kc kcVar = this.d;
        kcVar.X0 = z10;
        kcVar.P();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        int i10;
        int i11;
        kc kcVar = this.d;
        ci.j4 j4Var = kcVar.D0;
        int i12 = 8;
        if (j4Var != null) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            j4Var.setVisibility(i11);
        }
        SurfaceView surfaceView = kcVar.C0;
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
        cc ccVar = kcVar.B0;
        if (ccVar != null) {
            if (!z10) {
                i12 = 0;
            }
            ccVar.setVisibility(i12);
        }
    }

    public final void j() {
        int indexOf;
        kc kcVar = this.d;
        e9 e9Var = this.f731a;
        if (e9Var != null) {
            if (kcVar.f1283n0.f1542x0 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(kcVar.f1283n0.f1542x0);
            if (kcVar.f1283n0.getCurrentPeerView() == null) {
                indexOf = -1;
            } else {
                indexOf = arrayList.indexOf(kcVar.f1283n0.getCurrentPeerView().getCurrentDay());
            }
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
                if (!kcVar.f1283n0.E(true)) {
                    kcVar.q(false);
                    return;
                }
                kcVar.f1283n0.G0 = new a3.k0(this, e9Var, arrayList, 7);
                return;
            }
            kcVar.q(false);
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f732b);
        int indexOf2 = arrayList2.indexOf(Long.valueOf(kcVar.f1283n0.getCurrentPeerView().getCurrentPeer()));
        if (indexOf2 >= 0) {
            arrayList2.remove(indexOf2);
            if (!kcVar.f1283n0.E(true)) {
                kcVar.q(false);
                return;
            }
            kcVar.f1283n0.G0 = new s1(this, arrayList2, indexOf2, 2);
            return;
        }
        kcVar.q(false);
    }
}
