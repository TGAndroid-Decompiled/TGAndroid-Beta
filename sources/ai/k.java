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
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.t80;
import org.telegram.ui.e10;
import org.telegram.ui.g60;
import org.telegram.ui.j50;
import org.telegram.ui.lh1;
import org.telegram.ui.lk;
import org.telegram.ui.xn;
public final class k implements t9, lh1, m4.z0, e2.h, org.telegram.ui.ActionBar.b2, yf.m, MessagesController.ErrorDelegate, vh.k {
    public final int f1117a;
    public final boolean f1118b;
    public final Object f1119c;

    public k(int i10, Object obj, boolean z10) {
        this.f1117a = i10;
        this.f1119c = obj;
        this.f1118b = z10;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        switch (this.f1117a) {
            case 1:
                hg.a0 a0Var = (hg.a0) this.f1119c;
                ArrayList arrayList2 = a0Var.f10204k;
                ArrayList arrayList3 = a0Var.f10203j;
                int i11 = 0;
                if (this.f1118b) {
                    a0Var.f10200f = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i11 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i11));
                        i11++;
                    }
                } else {
                    a0Var.f10201g = i10;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i11 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i11));
                        i11++;
                    }
                }
                a0Var.e.run();
                return;
            default:
                e10 e10Var = (e10) this.f1119c;
                LongSparseIntArray longSparseIntArray = e10Var.H;
                e10Var.f33097y = i10;
                if (this.f1118b) {
                    e10Var.o0(e10Var.F, arrayList, true);
                    e10Var.F = arrayList;
                    for (int i12 = 0; i12 < e10Var.F.size(); i12++) {
                        e10Var.G.remove(e10Var.F.get(i12));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        long keyAt = longSparseIntArray.keyAt(i13);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !e10Var.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i14)).longValue());
                    }
                } else {
                    e10Var.o0(e10Var.G, arrayList, false);
                    e10Var.G = arrayList;
                    for (int i15 = 0; i15 < e10Var.G.size(); i15++) {
                        Long l4 = (Long) e10Var.G.get(i15);
                        e10Var.F.remove(l4);
                        longSparseIntArray.delete(l4.longValue());
                    }
                }
                e10Var.j0();
                e10Var.i0(false);
                e10Var.w0();
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        ((m4.e1) obj).K0((b2.e) this.f1119c, this.f1118b);
    }

    @Override
    public void b(boolean z10) {
        b0 b0Var = (b0) this.f1119c;
        if (!this.f1118b && z10) {
            boolean z11 = true;
            if (b0Var.f549b != 1) {
                z11 = false;
            }
            l9 l9Var = b0Var.f570s;
            if (z11) {
                if (!l9Var.f1215z) {
                    return;
                }
            } else if (!l9Var.f1206p) {
                return;
            }
            l9Var.Q(z11);
        }
    }

    @Override
    public void e(long j3) {
        org.telegram.ui.Components.o6 o6Var = ((org.telegram.ui.Cells.u1) this.f1119c).f21578w4;
        if (o6Var != null) {
            o6Var.q(LocaleController.formatPollEndTime((int) j3, this.f1118b), true, true);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        switch (this.f1117a) {
            case 5:
                org.telegram.ui.b7.Y((org.telegram.ui.b7) this.f1119c, this.f1118b);
                return;
            case 6:
            default:
                g60 g60Var = ((j50) this.f1119c).f34637b;
                g60Var.f33726a1.toggleRecord(null, 0);
                UndoView k12 = g60Var.k1();
                if (this.f1118b) {
                    i11 = 101;
                } else {
                    i11 = 40;
                }
                k12.j(i11, 0L, null);
                return;
            case 7:
                xn xnVar = (xn) this.f1119c;
                lk lkVar = xnVar.Y;
                if (lkVar != null) {
                    if (this.f1118b) {
                        xnVar.finishFragment();
                        return;
                    } else {
                        lkVar.A();
                        return;
                    }
                }
                return;
            case 8:
                Activity activity = (Activity) this.f1119c;
                if (activity != null && Build.VERSION.SDK_INT >= 23) {
                    if (this.f1118b && sf.c.a(activity) == -2) {
                        try {
                            activity.startActivity(new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", Uri.parse("package:" + activity.getPackageName())));
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    try {
                        activity.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + activity.getPackageName())));
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
        switch (this.f1117a) {
            case 2:
                e9.a1 z10 = e9.i0.z((b2.k0) this.f1119c);
                boolean z11 = this.f1118b;
                if (z11) {
                    l02 = -1;
                } else {
                    l02 = a0Var.f14734t.l0();
                }
                if (z11) {
                    J0 = -9223372036854775807L;
                } else {
                    J0 = a0Var.f14734t.J0();
                }
                return a0Var.q(rVar, z10, l02, J0);
            default:
                List list = (List) this.f1119c;
                boolean z12 = this.f1118b;
                if (z12) {
                    l03 = -1;
                } else {
                    l03 = a0Var.f14734t.l0();
                }
                if (z12) {
                    J02 = -9223372036854775807L;
                } else {
                    J02 = a0Var.f14734t.J0();
                }
                return a0Var.q(rVar, list, l03, J02);
        }
    }

    @Override
    public void l(vh.g gVar, float f7, float f10) {
        vh.n nVar = (vh.n) this.f1119c;
        if (!nVar.d && this.f1118b) {
            gVar.f44743q = new vh.m(nVar, 0);
            float sqrt = (float) Math.sqrt(Math.pow(nVar.getHeight(), 2.0d) + Math.pow(nVar.getWidth(), 2.0d));
            ArrayList arrayList = nVar.f44778b;
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
    public boolean run(TLRPC.TL_error tL_error) {
        t80 t80Var = (t80) this.f1119c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            t80Var.setOnDismissListener(new o80(0, t80Var, this.f1118b));
        }
        t80Var.dismiss();
        return false;
    }
}
