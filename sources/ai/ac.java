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
public final class ac implements x5 {
    public final d9 f539a;
    public final ArrayList f540b;
    public final Context f541c;
    public final jc d;

    public ac(jc jcVar, d9 d9Var, ArrayList arrayList, Context context) {
        this.d = jcVar;
        this.f539a = d9Var;
        this.f540b = arrayList;
        this.f541c = context;
    }

    public final void a(int i10, long j3) {
        jc jcVar = this.d;
        if (jcVar.J == i10 && jcVar.I == j3) {
            return;
        }
        jcVar.I = j3;
        jcVar.J = i10;
    }

    public final void b(boolean z10) {
        int i10;
        jc jcVar = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = jcVar.f1071f;
        if (jcVar.f1061b) {
            if (!jcVar.f1064c) {
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
        WindowManager.LayoutParams layoutParams = jcVar.f1095r;
        if (z10) {
            i10 = 48;
        } else {
            i10 = 16;
        }
        layoutParams.softInputMode = i10;
        try {
            jcVar.f1086n.updateViewLayout(jcVar.f1098s, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j3, d6 d6Var) {
        String uri2;
        String uri3;
        long j10;
        ic icVar;
        jc jcVar = this.d;
        ArrayList arrayList = jcVar.M0;
        if (!jcVar.H0 && jcVar.U >= 0.9f) {
            Uri uri4 = jcVar.F0;
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
            if (equals && (icVar = jcVar.f1114z0) != null) {
                if (equals) {
                    jcVar.G0 = d6Var;
                    d6Var.f713c = icVar;
                    d6Var.f712b = null;
                    icVar.setSpeed(jc.B1);
                    d6 d6Var2 = jcVar.G0;
                    d6Var2.f711a = jcVar.f1114z0.firstFrameRendered;
                    d6Var2.e = jcVar.f1113y0;
                    d6Var2.f714f = jcVar.B0;
                    d6Var2.d = jcVar.C0;
                    FileLog.d("StoryViewer requestPlayer: same url");
                }
            } else {
                jcVar.F0 = uri;
                ci.k4 k4Var = jcVar.D0;
                if (k4Var != null) {
                    k4Var.d(0L, null);
                }
                d2 d2Var = jcVar.A0;
                if (d2Var != null) {
                    if (d2Var.f698n) {
                        d2Var.s(null);
                    } else {
                        d2Var.e();
                    }
                    jcVar.A0 = null;
                }
                ic icVar2 = jcVar.f1114z0;
                if (icVar2 != null) {
                    icVar2.release(null);
                    jcVar.f1114z0 = null;
                }
                d6 d6Var3 = jcVar.G0;
                if (d6Var3 != null) {
                    d6Var3.f713c = null;
                    d6Var3.f712b = null;
                    d6Var3.f711a = false;
                    d6Var3.e = null;
                    d6Var3.f714f = null;
                    d6Var3.d = null;
                    d6Var3.b();
                    jcVar.G0 = null;
                }
                if (uri != null) {
                    jcVar.G0 = d6Var;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        } else if (((ic) arrayList.get(i10)).uri.equals(uri)) {
                            jcVar.f1114z0 = (ic) arrayList.remove(i10);
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (jcVar.f1114z0 == null) {
                        ic icVar3 = new ic(jcVar, jcVar.C0, jcVar.B0);
                        jcVar.f1114z0 = icVar3;
                        icVar3.document = document;
                    }
                    ic icVar4 = jcVar.f1114z0;
                    icVar4.uri = uri;
                    icVar4.setSpeed(jc.B1);
                    d6 d6Var4 = jcVar.G0;
                    ic icVar5 = jcVar.f1114z0;
                    d6Var4.f713c = icVar5;
                    d6Var4.f711a = false;
                    d6Var4.e = jcVar.f1113y0;
                    d6Var4.f714f = jcVar.B0;
                    d6Var4.d = jcVar.C0;
                    d6Var4.f712b = null;
                    FileStreamLoadOperation.setPriorityForDocument(icVar5.document, 3);
                    FileLoader.getInstance(jcVar.h).changePriority(3, jcVar.f1114z0.document, null, null, null, null, null);
                    if (j3 == 0) {
                        long j11 = jcVar.f1102t1;
                        if (j11 != 0) {
                            jcVar.G0.f711a = true;
                            j10 = j11;
                            FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                            ((ic) jcVar.G0.f713c).start(false, jcVar.w(), uri, j10, jc.D1, jc.B1);
                            jcVar.G0.b();
                        }
                    }
                    j10 = j3;
                    FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                    ((ic) jcVar.G0.f713c).start(false, jcVar.w(), uri, j10, jc.D1, jc.B1);
                    jcVar.G0.b();
                } else {
                    FileLog.d("StoryViewer requestPlayer: url is null (1)");
                }
            }
            if (uri == null) {
                z10 = false;
            }
            i(false, z10);
            jcVar.f1102t1 = 0L;
            jcVar.P();
            return;
        }
        ci.k4 k4Var2 = jcVar.D0;
        if (k4Var2 != null) {
            k4Var2.d(0L, null);
        }
        d2 d2Var2 = jcVar.A0;
        if (d2Var2 != null) {
            if (d2Var2.f698n) {
                d2Var2.s(null);
            } else {
                d2Var2.e();
            }
            jcVar.A0 = null;
        }
        FileLog.d("StoryViewer requestPlayer ignored, because closed: " + jcVar.H0 + ", " + jcVar.U);
        d6Var.f711a = false;
        d6Var.f713c = null;
        d6Var.f712b = null;
    }

    public final void d(float f7) {
        jc jcVar = this.d;
        if (jcVar.f1096r0 != f7) {
            jcVar.f1096r0 = f7;
            jcVar.v.invalidate();
        }
    }

    public final void e() {
        this.d.f1085m1 = false;
    }

    public final void f(boolean z10) {
        ic icVar;
        jc jcVar = this.d;
        if (!jcVar.f1073f1 && z10 && jcVar.f1082k0) {
            jcVar.f1082k0 = false;
            d6 d6Var = jcVar.G0;
            if (d6Var != null && (icVar = (ic) d6Var.f713c) != null) {
                icVar.setSeeking(false);
            }
            e6 t10 = jcVar.t();
            if (t10 != null) {
                t10.invalidate();
            }
        }
        jcVar.f1073f1 = z10;
        jcVar.P();
    }

    public final void g(boolean z10) {
        jc jcVar = this.d;
        jcVar.X0 = z10;
        jcVar.P();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        int i10;
        int i11;
        jc jcVar = this.d;
        ci.k4 k4Var = jcVar.D0;
        int i12 = 8;
        if (k4Var != null) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            k4Var.setVisibility(i11);
        }
        SurfaceView surfaceView = jcVar.C0;
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
        bc bcVar = jcVar.B0;
        if (bcVar != null) {
            if (!z10) {
                i12 = 0;
            }
            bcVar.setVisibility(i12);
        }
    }

    public final void j() {
        int indexOf;
        jc jcVar = this.d;
        d9 d9Var = this.f539a;
        if (d9Var != null) {
            if (jcVar.f1087n0.f1309x0 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(jcVar.f1087n0.f1309x0);
            if (jcVar.f1087n0.getCurrentPeerView() == null) {
                indexOf = -1;
            } else {
                indexOf = arrayList.indexOf(jcVar.f1087n0.getCurrentPeerView().getCurrentDay());
            }
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
                if (!jcVar.f1087n0.E(true)) {
                    jcVar.q(false);
                    return;
                }
                jcVar.f1087n0.G0 = new a3.k0(this, d9Var, arrayList, 7);
                return;
            }
            jcVar.q(false);
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f540b);
        int indexOf2 = arrayList2.indexOf(Long.valueOf(jcVar.f1087n0.getCurrentPeerView().getCurrentPeer()));
        if (indexOf2 >= 0) {
            arrayList2.remove(indexOf2);
            if (!jcVar.f1087n0.E(true)) {
                jcVar.q(false);
                return;
            }
            jcVar.f1087n0.G0 = new s1(this, arrayList2, indexOf2, 2);
            return;
        }
        jcVar.q(false);
    }
}
