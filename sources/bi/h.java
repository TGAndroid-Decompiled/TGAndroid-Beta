package bi;

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
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.g80;
import org.telegram.ui.co;
import org.telegram.ui.f10;
import org.telegram.ui.j60;
import org.telegram.ui.m50;
import org.telegram.ui.mk;
import org.telegram.ui.vh1;
public final class h implements c9, vh1, m4.e1, org.telegram.ui.ActionBar.a2, yf.m, MessagesController.ErrorDelegate, wh.l {
    public final int f3042a;
    public final boolean f3043b;
    public final Object f3044c;

    public h(int i10, Object obj, boolean z10) {
        this.f3042a = i10;
        this.f3044c = obj;
        this.f3043b = z10;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        switch (this.f3042a) {
            case 1:
                ig.a0 a0Var = (ig.a0) this.f3044c;
                ArrayList arrayList2 = a0Var.f11986k;
                ArrayList arrayList3 = a0Var.f11985j;
                int i11 = 0;
                if (this.f3043b) {
                    a0Var.f11982f = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i11 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i11));
                        i11++;
                    }
                } else {
                    a0Var.f11983g = i10;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i11 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i11));
                        i11++;
                    }
                }
                a0Var.f11981e.run();
                return;
            default:
                f10 f10Var = (f10) this.f3044c;
                LongSparseIntArray longSparseIntArray = f10Var.H;
                f10Var.f36232y = i10;
                if (this.f3043b) {
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
    public void c(long j3) {
        org.telegram.ui.Components.p6 p6Var = ((org.telegram.ui.Cells.t1) this.f3044c).f23173w4;
        if (p6Var != null) {
            p6Var.q(LocaleController.formatPollEndTime((int) j3, this.f3043b), true, true);
        }
    }

    @Override
    public void e(boolean z10) {
        v vVar = (v) this.f3044c;
        if (!this.f3043b && z10) {
            boolean z11 = true;
            if (vVar.f3848b != 1) {
                z11 = false;
            }
            u8 u8Var = vVar.f3870s;
            if (z11) {
                if (!u8Var.f3827z) {
                    return;
                }
            } else if (!u8Var.f3818p) {
                return;
            }
            u8Var.Q(z11);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        switch (this.f3042a) {
            case 4:
                org.telegram.ui.z6.V((org.telegram.ui.z6) this.f3044c, this.f3043b);
                return;
            case 5:
            default:
                j60 j60Var = ((m50) this.f3044c).f38574b;
                j60Var.f37513a1.toggleRecord(null, 0);
                UndoView k12 = j60Var.k1();
                if (this.f3043b) {
                    i11 = 101;
                } else {
                    i11 = 40;
                }
                k12.j(i11, 0L, null);
                return;
            case 6:
                co coVar = (co) this.f3044c;
                mk mkVar = coVar.Y;
                if (mkVar != null) {
                    if (this.f3043b) {
                        coVar.finishFragment();
                        return;
                    } else {
                        mkVar.B();
                        return;
                    }
                }
                return;
            case 7:
                Activity activity = (Activity) this.f3044c;
                if (activity != null && Build.VERSION.SDK_INT >= 23) {
                    if (this.f3043b && tf.c.a(activity) == -2) {
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
        switch (this.f3042a) {
            case 2:
                e9.a1 z10 = e9.i0.z((b2.k0) this.f3044c);
                boolean z11 = this.f3043b;
                if (z11) {
                    l02 = -1;
                } else {
                    l02 = a0Var.f15843t.l0();
                }
                if (z11) {
                    J0 = -9223372036854775807L;
                } else {
                    J0 = a0Var.f15843t.J0();
                }
                return a0Var.q(rVar, z10, l02, J0);
            default:
                List list = (List) this.f3044c;
                boolean z12 = this.f3043b;
                if (z12) {
                    l03 = -1;
                } else {
                    l03 = a0Var.f15843t.l0();
                }
                if (z12) {
                    J02 = -9223372036854775807L;
                } else {
                    J02 = a0Var.f15843t.J0();
                }
                return a0Var.q(rVar, list, l03, J02);
        }
    }

    @Override
    public void o(wh.h hVar, float f7, float f10) {
        wh.p pVar = (wh.p) this.f3044c;
        if (!pVar.d && this.f3043b) {
            hVar.f48627q = new wh.o(pVar, 0);
            float sqrt = (float) Math.sqrt(Math.pow(pVar.getHeight(), 2.0d) + Math.pow(pVar.getWidth(), 2.0d));
            ArrayList arrayList = pVar.f48666b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((wh.h) obj).j(f7, f10, sqrt, false);
            }
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        g80 g80Var = (g80) this.f3044c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            g80Var.setOnDismissListener(new b80(0, g80Var, this.f3043b));
        }
        g80Var.dismiss();
        return false;
    }
}
