package defpackage;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.c;
public final class cd2 implements qac {
    public final byte a = 0;
    public final int b;
    public final long c;
    public final long d;
    public final Object e;
    public final Object f;
    public final Object g;

    public cd2(bu5 bu5Var, int i, long j, long j2, yv1 yv1Var, ylb ylbVar) {
        this.e = bu5Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.f = yv1Var;
        this.g = ylbVar;
    }

    @Override
    public final void a(Object obj) {
        boolean z;
        byte b = this.a;
        int i = this.b;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                yv1 yv1Var = (yv1) obj3;
                ylb ylbVar = (ylb) obj2;
                Integer num = (Integer) obj;
                ((bu5) obj4).u();
                int intValue = num.intValue();
                long j = this.c;
                long j2 = this.d;
                if (intValue == 0) {
                    if (oc7.r1(i).o2(j, j2, null)) {
                        lo7.n(i).G(j, j2, false);
                    }
                    if (c41.a(yv1Var)) {
                        c41.z(yv1Var, 4, num.intValue(), ylbVar).j();
                        return;
                    }
                    return;
                }
                lo7.n(i).H(j, num.intValue(), j2);
                if (c41.a(yv1Var)) {
                    c41.z(yv1Var, 5, num.intValue(), ylbVar).j();
                    return;
                }
                return;
            default:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj4;
                String str = (String) obj3;
                e6a e6aVar = (e6a) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    fs7.s(tL_starGiftUnique, jb6.a0(null, null, 2131749569, str));
                    return;
                }
                e6aVar.run();
                jva v = jva.v(i, false);
                String str2 = tL_starGiftUnique.slug;
                LongSparseArray longSparseArray = v.L;
                LongSparseArray longSparseArray2 = v.K;
                if (!TextUtils.isEmpty(str2)) {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                        if (((ava) longSparseArray.valueAt(i2)).j(str2)) {
                            arrayList.add(Long.valueOf(longSparseArray.keyAt(i2)));
                        }
                    }
                    for (int i3 = 0; i3 < longSparseArray2.size(); i3++) {
                        yua yuaVar = (yua) longSparseArray2.valueAt(i3);
                        ava avaVar = yuaVar.g;
                        if (avaVar != null && avaVar.j(str2)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        for (ava avaVar2 : yuaVar.h.values()) {
                            if (!z && !avaVar2.j(str2)) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                        if (z && !arrayList.contains(Long.valueOf(longSparseArray2.keyAt(i3)))) {
                            arrayList.add(Long.valueOf(longSparseArray2.keyAt(i3)));
                        }
                    }
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        v.M(((Long) arrayList.get(i4)).longValue());
                    }
                }
                long j3 = this.c;
                if (j3 != 0) {
                    jva.v(i, false).M(j3);
                    fs7.s(tL_starGiftUnique, jb6.a0(null, null, 2131749611, str, pg3.r(i, j3)));
                    return;
                }
                jva.v(i, false).M(this.d);
                c C = c.C(i);
                String str3 = tL_starGiftUnique.gift_address;
                w15 w15Var = C.B;
                gm.r(w15Var);
                C.y = str3;
                C.z = null;
                C.A = 0;
                C.A().d();
                C.G().g();
                C.J();
                int i5 = C.A;
                long[] jArr = c.S;
                if (i5 < 7) {
                    C.A = i5 + 1;
                    gm.d3(w15Var, jArr[i5]);
                }
                fs7.s(tL_starGiftUnique, jb6.a0(null, null, 2131749612, str));
                return;
        }
    }

    public cd2(TL_stars.TL_starGiftUnique tL_starGiftUnique, String str, e6a e6aVar, int i, long j, long j2) {
        this.e = tL_starGiftUnique;
        this.f = str;
        this.g = e6aVar;
        this.b = i;
        this.c = j;
        this.d = j2;
    }
}
