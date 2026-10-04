package ai;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.u80;
import org.telegram.ui.f10;
import org.telegram.ui.h60;
import org.telegram.ui.jk;
import org.telegram.ui.l50;
import org.telegram.ui.nh1;
import org.telegram.ui.yn;
public final class k implements t9, nh1, m4.z0, e2.h, org.telegram.ui.ActionBar.a2, yf.m, MessagesController.ErrorDelegate, vh.k {
    public final int f1202a;
    public final boolean f1203b;
    public final Object f1204c;

    public k(int i10, Object obj, boolean z10) {
        this.f1202a = i10;
        this.f1204c = obj;
        this.f1203b = z10;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        switch (this.f1202a) {
            case 1:
                hg.a0 a0Var = (hg.a0) this.f1204c;
                ArrayList arrayList2 = a0Var.f11109k;
                ArrayList arrayList3 = a0Var.f11108j;
                int i11 = 0;
                if (this.f1203b) {
                    a0Var.f11105f = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i11 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i11));
                        i11++;
                    }
                } else {
                    a0Var.f11106g = i10;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i11 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i11));
                        i11++;
                    }
                }
                a0Var.f11104e.run();
                return;
            default:
                f10 f10Var = (f10) this.f1204c;
                LongSparseIntArray longSparseIntArray = f10Var.H;
                f10Var.f36144y = i10;
                if (this.f1203b) {
                    f10Var.o0(f10Var.F, arrayList, true);
                    f10Var.F = arrayList;
                    for (int i12 = 0; i12 < f10Var.F.size(); i12++) {
                        f10Var.G.remove(f10Var.F.get(i12));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        long keyAt = longSparseIntArray.keyAt(i13);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !f10Var.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i14)).longValue());
                    }
                } else {
                    f10Var.o0(f10Var.G, arrayList, false);
                    f10Var.G = arrayList;
                    for (int i15 = 0; i15 < f10Var.G.size(); i15++) {
                        Long l4 = (Long) f10Var.G.get(i15);
                        f10Var.F.remove(l4);
                        longSparseIntArray.delete(l4.longValue());
                    }
                }
                f10Var.j0();
                f10Var.i0(false);
                f10Var.w0();
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        ((m4.e1) obj).K0((b2.e) this.f1204c, this.f1203b);
    }

    @Override
    public void b(vh.g gVar, float f7, float f10) {
        vh.n nVar = (vh.n) this.f1204c;
        if (!nVar.d && this.f1203b) {
            gVar.f48397q = new vh.m(nVar, 0);
            float sqrt = (float) Math.sqrt(Math.pow(nVar.getHeight(), 2.0d) + Math.pow(nVar.getWidth(), 2.0d));
            ArrayList arrayList = nVar.f48433b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((vh.g) obj).j(f7, f10, sqrt, false);
            }
        }
    }

    @Override
    public void e(long j3) {
        org.telegram.ui.Components.o6 o6Var = ((org.telegram.ui.Cells.u1) this.f1204c).f23438w4;
        if (o6Var != null) {
            o6Var.q(LocaleController.formatPollEndTime((int) j3, this.f1203b), true, true);
        }
    }

    @Override
    public void f(boolean z10) {
        b0 b0Var = (b0) this.f1204c;
        if (!this.f1203b && z10) {
            boolean z11 = true;
            if (b0Var.f595b != 1) {
                z11 = false;
            }
            l9 l9Var = b0Var.f617s;
            if (z11) {
                if (!l9Var.f1312z) {
                    return;
                }
            } else if (!l9Var.f1303p) {
                return;
            }
            l9Var.Q(z11);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        switch (this.f1202a) {
            case 5:
                org.telegram.ui.a7.S((org.telegram.ui.a7) this.f1204c, this.f1203b);
                return;
            case 6:
            default:
                h60 h60Var = ((l50) this.f1204c).f38164b;
                h60Var.f36874a1.toggleRecord(null, 0);
                UndoView k12 = h60Var.k1();
                if (this.f1203b) {
                    i11 = 101;
                } else {
                    i11 = 40;
                }
                k12.j(i11, 0L, null);
                return;
            case 7:
                yn ynVar = (yn) this.f1204c;
                jk jkVar = ynVar.W;
                if (jkVar != null) {
                    if (this.f1203b) {
                        ynVar.finishFragment();
                        return;
                    } else {
                        jkVar.A();
                        return;
                    }
                }
                return;
            case 8:
                Activity activity = (Activity) this.f1204c;
                if (activity != null && Build.VERSION.SDK_INT >= 23) {
                    if (this.f1203b && sf.c.a(activity) == -2) {
                        try {
                            activity.startActivity(new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", Uri.parse("package:" + activity.getPackageName())));
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                    try {
                        activity.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + activity.getPackageName())));
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        int l02;
        long J0;
        int l03;
        long J02;
        switch (this.f1202a) {
            case 2:
                e9.a1 z10 = e9.i0.z((b2.k0) this.f1204c);
                boolean z11 = this.f1203b;
                if (z11) {
                    l02 = -1;
                } else {
                    l02 = a0Var.f16053t.l0();
                }
                if (z11) {
                    J0 = -9223372036854775807L;
                } else {
                    J0 = a0Var.f16053t.J0();
                }
                return a0Var.q(rVar, z10, l02, J0);
            default:
                List list = (List) this.f1204c;
                boolean z12 = this.f1203b;
                if (z12) {
                    l03 = -1;
                } else {
                    l03 = a0Var.f16053t.l0();
                }
                if (z12) {
                    J02 = -9223372036854775807L;
                } else {
                    J02 = a0Var.f16053t.J0();
                }
                return a0Var.q(rVar, list, l03, J02);
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        u80 u80Var = (u80) this.f1204c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            u80Var.setOnDismissListener(new p80(0, u80Var, this.f1203b));
        }
        u80Var.dismiss();
        return false;
    }
}
