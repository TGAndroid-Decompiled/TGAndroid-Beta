package bi;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.messenger.xs;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.x60;
import org.telegram.ui.bn;
public final class o4 implements w10 {
    public final int f3899a = 0;
    public final int f3900b;
    public final long f3901c;
    public final long d;
    public final Object f3902e;
    public final Object f3903f;
    public final Object f3904g;

    public o4(TL_stars.TL_starGiftUnique tL_starGiftUnique, String str, di.f2 f2Var, int i7, long j3, long j10) {
        this.f3902e = tL_starGiftUnique;
        this.f3903f = str;
        this.f3904g = f2Var;
        this.f3900b = i7;
        this.f3901c = j3;
        this.d = j10;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        int i7 = this.f3899a;
        Object obj2 = this.f3904g;
        Object obj3 = this.f3903f;
        int i10 = this.f3900b;
        Object obj4 = this.f3902e;
        switch (i7) {
            case 0:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj4;
                String str = (String) obj3;
                di.f2 f2Var = (di.f2) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    a5.s(tL_starGiftUnique, gd.a0(null, null, 2131749619, str));
                    return;
                }
                f2Var.run();
                di.y8 y10 = di.y8.y(i10, false);
                String str2 = tL_starGiftUnique.slug;
                LongSparseArray longSparseArray = y10.L;
                LongSparseArray longSparseArray2 = y10.K;
                if (!TextUtils.isEmpty(str2)) {
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                        if (((di.p8) longSparseArray.valueAt(i11)).j(str2)) {
                            arrayList.add(Long.valueOf(longSparseArray.keyAt(i11)));
                        }
                    }
                    for (int i12 = 0; i12 < longSparseArray2.size(); i12++) {
                        di.n8 n8Var = (di.n8) longSparseArray2.valueAt(i12);
                        di.p8 p8Var = n8Var.f9372g;
                        if (p8Var != null && p8Var.j(str2)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        for (di.p8 p8Var2 : n8Var.h.values()) {
                            if (!z10 && !p8Var2.j(str2)) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                        }
                        if (z10 && !arrayList.contains(Long.valueOf(longSparseArray2.keyAt(i12)))) {
                            arrayList.add(Long.valueOf(longSparseArray2.keyAt(i12)));
                        }
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        y10.O(((Long) arrayList.get(i13)).longValue());
                    }
                }
                long j3 = this.f3901c;
                if (j3 != 0) {
                    di.y8.y(i10, false).O(j3);
                    a5.s(tL_starGiftUnique, gd.a0(null, null, 2131749661, str, org.telegram.messenger.n5.s(i10, j3)));
                    return;
                }
                di.y8.y(i10, false).O(this.d);
                org.telegram.ui.Wallet.v0 D = org.telegram.ui.Wallet.v0.D(i10);
                String str3 = tL_starGiftUnique.gift_address;
                org.telegram.ui.Wallet.h hVar = D.B;
                org.telegram.messenger.g0.r(hVar);
                D.f45276y = str3;
                D.f45277z = null;
                D.A = 0;
                D.B().e();
                D.H().g();
                D.K();
                int i14 = D.A;
                long[] jArr = org.telegram.ui.Wallet.v0.S;
                if (i14 < 7) {
                    D.A = i14 + 1;
                    org.telegram.messenger.g0.h3(hVar, jArr[i14]);
                }
                a5.s(tL_starGiftUnique, gd.a0(null, null, 2131749662, str));
                return;
            default:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj3;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                Integer num = (Integer) obj;
                ((x60) obj4).v();
                int intValue = num.intValue();
                long j10 = this.f3901c;
                long j11 = this.d;
                if (intValue == 0) {
                    if (mp.u1(i10).u2(j10, j11, null)) {
                        xs.t(i10).G(j10, j11, false);
                    }
                    if (kc.a(g2Var)) {
                        kc.z(g2Var, 4, num.intValue(), i6Var).j();
                        return;
                    }
                    return;
                }
                xs.t(i10).H(j10, num.intValue(), j11);
                if (kc.a(g2Var)) {
                    kc.z(g2Var, 5, num.intValue(), i6Var).j();
                    return;
                }
                return;
        }
    }

    public o4(x60 x60Var, int i7, long j3, long j10, bn bnVar, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f3902e = x60Var;
        this.f3900b = i7;
        this.f3901c = j3;
        this.d = j10;
        this.f3903f = bnVar;
        this.f3904g = i6Var;
    }
}
