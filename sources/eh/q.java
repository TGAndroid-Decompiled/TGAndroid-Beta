package eh;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import jh.a7;
import jh.s6;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.t70;
import org.telegram.ui.ck;
import org.telegram.ui.mg1;
import org.telegram.ui.q00;
import org.telegram.ui.rn;
import org.telegram.ui.s50;
import org.telegram.ui.v40;
import org.telegram.ui.z6;
import qf.x;

public final class q implements o, a7, a2, gf.p, MessagesController.ErrorDelegate, mg1 {

    public final int f5558a;

    public final boolean f5559b;

    public final Object f5560c;

    public q(int i10, Object obj, boolean z10) {
        this.f5558a = i10;
        this.f5560c = obj;
        this.f5559b = z10;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        switch (this.f5558a) {
            case 7:
                q00 q00Var = (q00) this.f5560c;
                LongSparseIntArray longSparseIntArray = q00Var.D;
                q00Var.f41481y = i10;
                if (this.f5559b) {
                    q00Var.o0(q00Var.B, arrayList, true);
                    q00Var.B = arrayList;
                    for (int i11 = 0; i11 < q00Var.B.size(); i11++) {
                        q00Var.C.remove(q00Var.B.get(i11));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        long jKeyAt = longSparseIntArray.keyAt(i12);
                        Long lValueOf = Long.valueOf(jKeyAt);
                        if (!DialogObject.isEncryptedDialog(jKeyAt) && !q00Var.B.contains(lValueOf)) {
                            arrayList2.add(lValueOf);
                        }
                    }
                    int size2 = arrayList2.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        longSparseIntArray.delete(((Long) arrayList2.get(i13)).longValue());
                    }
                } else {
                    q00Var.o0(q00Var.C, arrayList, false);
                    q00Var.C = arrayList;
                    for (int i14 = 0; i14 < q00Var.C.size(); i14++) {
                        Long l10 = (Long) q00Var.C.get(i14);
                        q00Var.B.remove(l10);
                        longSparseIntArray.delete(l10.longValue());
                    }
                }
                q00Var.j0();
                q00Var.i0(false);
                q00Var.w0();
                break;
            default:
                x xVar = (x) this.f5560c;
                ArrayList arrayList3 = xVar.f46489k;
                ArrayList arrayList4 = xVar.f46488j;
                int i15 = 0;
                if (this.f5559b) {
                    xVar.f46485f = i10;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    while (i15 < arrayList4.size()) {
                        arrayList3.remove(arrayList4.get(i15));
                        i15++;
                    }
                } else {
                    xVar.f46486g = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i15 < arrayList3.size()) {
                        arrayList4.remove(arrayList3.get(i15));
                        i15++;
                    }
                }
                xVar.f46484e.run();
                break;
        }
    }

    @Override
    public void e(boolean z10) {
        jh.p pVar = (jh.p) this.f5560c;
        if (!this.f5559b && z10) {
            boolean z11 = pVar.f13773b == 1;
            s6 s6Var = pVar.f13795s;
            if (z11) {
                if (!s6Var.f13977z) {
                    return;
                }
            } else if (!s6Var.f13968p) {
                return;
            }
            s6Var.Q(z11);
        }
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f5558a) {
            case 2:
                z6.V((z6) this.f5560c, this.f5559b);
                break;
            case 3:
            default:
                s50 s50Var = ((v40) this.f5560c).f43351b;
                s50Var.W0.toggleRecord(null, 0);
                s50Var.k1().j(this.f5559b ? 101 : 40, 0L, null);
                break;
            case 4:
                rn rnVar = (rn) this.f5560c;
                ck ckVar = rnVar.U;
                if (ckVar != null) {
                    if (!this.f5559b) {
                        ckVar.C();
                    } else {
                        rnVar.finishFragment();
                    }
                }
                break;
            case 5:
                Activity activity = (Activity) this.f5560c;
                if (activity != null && Build.VERSION.SDK_INT >= 23) {
                    if (this.f5559b && bf.d.a(activity) == -2) {
                        try {
                            activity.startActivity(new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", Uri.parse("package:" + activity.getPackageName())));
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                    }
                    try {
                        activity.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + activity.getPackageName())));
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                    break;
                }
                break;
        }
    }

    @Override
    public void g(long j10) {
        i6 i6Var = ((s1) this.f5560c).f25513s4;
        if (i6Var != null) {
            i6Var.q(LocaleController.formatPollEndTime((int) j10, this.f5559b), true, true);
        }
    }

    @Override
    public void i(k kVar, float f10, float f11) {
        s sVar = (s) this.f5560c;
        if (sVar.d || !this.f5559b) {
            return;
        }
        kVar.f5525q = new r(sVar, 0);
        float fSqrt = (float) Math.sqrt(Math.pow(sVar.getHeight(), 2.0d) + Math.pow(sVar.getWidth(), 2.0d));
        ArrayList arrayList = sVar.f5564b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((k) obj).j(f10, f11, fSqrt, false);
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        t70 t70Var = (t70) this.f5560c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            t70Var.setOnDismissListener(new p70(0, t70Var, this.f5559b));
        }
        t70Var.dismiss();
        return false;
    }
}
