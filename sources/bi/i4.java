package bi;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.messenger.xs;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.y60;
import org.telegram.ui.bn;
public final class i4 implements x10 {
    public final int f3724a = 0;
    public final int f3725b;
    public final long f3726c;
    public final long d;
    public final Object f3727e;
    public final Object f3728f;
    public final Object f3729g;

    public i4(TL_stars.TL_starGiftUnique tL_starGiftUnique, String str, c1.c cVar, int i7, long j3, long j10) {
        this.f3727e = tL_starGiftUnique;
        this.f3728f = str;
        this.f3729g = cVar;
        this.f3725b = i7;
        this.f3726c = j3;
        this.d = j10;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        int i7 = this.f3724a;
        Object obj2 = this.f3729g;
        Object obj3 = this.f3728f;
        int i10 = this.f3725b;
        Object obj4 = this.f3727e;
        switch (i7) {
            case 0:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj4;
                String str = (String) obj3;
                c1.c cVar = (c1.c) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    v4.s(tL_starGiftUnique, gd.a0(null, null, 2131749620, str));
                    return;
                }
                cVar.run();
                di.x8 y10 = di.x8.y(i10, false);
                String str2 = tL_starGiftUnique.slug;
                LongSparseArray longSparseArray = y10.L;
                LongSparseArray longSparseArray2 = y10.K;
                if (!TextUtils.isEmpty(str2)) {
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                        if (((di.o8) longSparseArray.valueAt(i11)).j(str2)) {
                            arrayList.add(Long.valueOf(longSparseArray.keyAt(i11)));
                        }
                    }
                    for (int i12 = 0; i12 < longSparseArray2.size(); i12++) {
                        di.m8 m8Var = (di.m8) longSparseArray2.valueAt(i12);
                        di.o8 o8Var = m8Var.f9327g;
                        if (o8Var != null && o8Var.j(str2)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        for (di.o8 o8Var2 : m8Var.h.values()) {
                            if (!z10 && !o8Var2.j(str2)) {
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
                long j3 = this.f3726c;
                if (j3 != 0) {
                    di.x8.y(i10, false).O(j3);
                    v4.s(tL_starGiftUnique, gd.a0(null, null, 2131749662, str, org.telegram.messenger.n5.s(i10, j3)));
                    return;
                }
                di.x8.y(i10, false).O(this.d);
                org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(i10);
                String str3 = tL_starGiftUnique.gift_address;
                org.telegram.ui.Wallet.h hVar = D.B;
                org.telegram.messenger.g0.r(hVar);
                D.f45104y = str3;
                D.f45105z = null;
                D.A = 0;
                D.B().e();
                D.H().g();
                D.K();
                int i14 = D.A;
                long[] jArr = org.telegram.ui.Wallet.u0.S;
                if (i14 < 7) {
                    D.A = i14 + 1;
                    org.telegram.messenger.g0.h3(hVar, jArr[i14]);
                }
                v4.s(tL_starGiftUnique, gd.a0(null, null, 2131749663, str));
                return;
            default:
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj3;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                Integer num = (Integer) obj;
                ((y60) obj4).v();
                int intValue = num.intValue();
                long j10 = this.f3726c;
                long j11 = this.d;
                if (intValue == 0) {
                    if (mp.u1(i10).u2(j10, j11, null)) {
                        xs.t(i10).G(j10, j11, false);
                    }
                    if (lc.a(h2Var)) {
                        lc.z(h2Var, 4, num.intValue(), i6Var).j();
                        return;
                    }
                    return;
                }
                xs.t(i10).H(j10, num.intValue(), j11);
                if (lc.a(h2Var)) {
                    lc.z(h2Var, 5, num.intValue(), i6Var).j();
                    return;
                }
                return;
        }
    }

    public i4(y60 y60Var, int i7, long j3, long j10, bn bnVar, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f3727e = y60Var;
        this.f3725b = i7;
        this.f3726c = j3;
        this.d = j10;
        this.f3728f = bnVar;
        this.f3729g = i6Var;
    }
}
