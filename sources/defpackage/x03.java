package defpackage;

import android.util.Pair;
import android.view.MenuItem;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
public final class x03 implements Comparator {
    public final byte a;

    public x03(byte b) {
        this.a = b;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        long[] jArr;
        long[] jArr2;
        long j;
        long j2;
        long j3;
        at7 at7Var;
        at7 a;
        int i;
        int i2;
        int i3;
        int i4 = -1;
        switch (this.a) {
            case 0:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 1:
                String name = ((File) obj).getName();
                byte b = y03.f;
                return name.substring(0, b).compareTo(((File) obj2).getName().substring(0, b));
            case 2:
                dr3 dr3Var = (dr3) obj;
                dr3 dr3Var2 = (dr3) obj2;
                int x = er3.x(8);
                int i5 = 0;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    int[] iArr = dr3Var.a;
                    jArr = dr3Var.b;
                    if (i5 < iArr.length) {
                        int i6 = iArr[i5];
                        z = z;
                        if ((i6 & 4) != 0) {
                            z = true;
                        }
                        z2 = z2;
                        if ((i6 & 8) != 0) {
                            z2 = true;
                        }
                        if (!z || !z2) {
                            i5++;
                            z = z;
                            z2 = z2;
                        }
                    }
                }
                int i7 = 0;
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    int[] iArr2 = dr3Var2.a;
                    jArr2 = dr3Var2.b;
                    if (i7 < iArr2.length) {
                        int i8 = iArr2[i7];
                        z3 = z3;
                        if ((i8 & 4) != 0) {
                            z3 = true;
                        }
                        z4 = z4;
                        if ((i8 & 8) != 0) {
                            z4 = true;
                        }
                        if (!z3 || !z4) {
                            i7++;
                            z3 = z3;
                            z4 = z4;
                        }
                    }
                }
                long j4 = 0;
                if (z) {
                    j = jArr[1];
                } else {
                    j = 0;
                }
                if (z2) {
                    j2 = jArr[x];
                } else {
                    j2 = 0;
                }
                long j5 = j + j2 + (dr3Var.e ? 1L : 0L);
                if (z3) {
                    j3 = jArr2[1];
                } else {
                    j3 = 0;
                }
                if (z4) {
                    j4 = jArr2[x];
                }
                int i9 = (j5 > (j3 + j4 + (dr3Var2.e ? 1L : 0L)) ? 1 : (j5 == (j3 + j4 + (dr3Var2.e ? 1L : 0L)) ? 0 : -1));
                if (i9 > 0) {
                    return 1;
                }
                if (i9 >= 0) {
                    return 0;
                }
                return -1;
            case 3:
                return Long.compare(((p93) obj2).c, ((p93) obj).c);
            case 4:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    if (num2.intValue() != -1) {
                        return -1;
                    }
                    return 0;
                } else if (num2.intValue() == -1) {
                    return 1;
                } else {
                    return num.intValue() - num2.intValue();
                }
            case 5:
                return Integer.compare(((xd3) ((List) obj).get(0)).f, ((xd3) ((List) obj2).get(0)).f);
            case 6:
                List list = (List) obj;
                List list2 = (List) obj2;
                return fq2.f(ee3.c((ee3) Collections.max(list, new x03((byte) 9)), (ee3) Collections.max(list2, new x03((byte) 9)))).a(list.size(), list2.size()).b((ee3) Collections.max(list, new x03((byte) 10)), (ee3) Collections.max(list2, new x03((byte) 10)), new x03((byte) 10)).e();
            case 7:
                return ((wd3) Collections.max((List) obj)).compareTo((wd3) Collections.max((List) obj2));
            case 8:
                return ((be3) ((List) obj).get(0)).compareTo((be3) ((List) obj2).get(0));
            case 9:
                return ee3.c((ee3) obj, (ee3) obj2);
            case 10:
                ee3 ee3Var = (ee3) obj;
                ee3 ee3Var2 = (ee3) obj2;
                boolean z5 = ee3Var.e;
                int i10 = ee3Var.s;
                if (z5 && ee3Var.n) {
                    a = fe3.l;
                    at7Var = a;
                } else {
                    at7 at7Var2 = fe3.l;
                    at7Var = at7Var2;
                    a = at7Var2.a();
                }
                boolean z6 = ee3Var.f.F;
                hq2 hq2Var = hq2.a;
                if (z6) {
                    hq2Var = hq2Var.b(Integer.valueOf(i10), Integer.valueOf(ee3Var2.s), at7Var.a());
                }
                hq2 b2 = hq2Var.c(ee3Var.P, ee3Var2.P).b(Integer.valueOf(ee3Var.w), Integer.valueOf(ee3Var2.w), a);
                if (ee3Var.L && ee3Var.N) {
                    b2 = b2.a(ee3Var.O, ee3Var2.O);
                }
                return b2.c(ee3Var.M, ee3Var2.M).b(Integer.valueOf(i10), Integer.valueOf(ee3Var2.s), a).e();
            case 11:
                i = ((hh3) obj2).b;
                i2 = ((hh3) obj).b;
                break;
            case 12:
                int i11 = (z8c.h(((Integer) obj).intValue()).Z > z8c.h(((Integer) obj2).intValue()).Z ? 1 : (z8c.h(((Integer) obj).intValue()).Z == z8c.h(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i11 > 0) {
                    return 1;
                }
                if (i11 < 0) {
                    return -1;
                }
                return 0;
            case 13:
                int i12 = ((lm3) obj).b;
                int i13 = ((lm3) obj2).b;
                if (i12 < i13) {
                    return 1;
                }
                if (i12 > i13) {
                    return -1;
                }
                return 0;
            case 14:
                Integer num3 = 0;
                HashMap hashMap = gw3.h;
                Integer num4 = (Integer) hashMap.get((String) obj);
                Integer num5 = (Integer) hashMap.get((String) obj2);
                if (num4 == null) {
                    num4 = num3;
                }
                if (num5 != null) {
                    num3 = num5;
                }
                if (num4.intValue() > num3.intValue()) {
                    return -1;
                }
                if (num4.intValue() < num3.intValue()) {
                    return 1;
                }
                return 0;
            case 15:
                k39 k39Var = (k39) obj2;
                String str = ((k39) obj).f;
                if (str != null && str.equals("❤")) {
                    i3 = -1;
                } else {
                    i3 = 0;
                }
                String str2 = k39Var.f;
                return i3 - ((str2 == null || !str2.equals("❤")) ? 0 : 0);
            case 16:
                return Float.compare(((float[]) obj)[0], ((float[]) obj2)[0]);
            case 17:
                int i14 = (((jb4) obj).a > ((jb4) obj2).a ? 1 : (((jb4) obj).a == ((jb4) obj2).a ? 0 : -1));
                if (i14 > 0) {
                    return 1;
                }
                if (i14 < 0) {
                    return -1;
                }
                return 0;
            case 18:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 19:
                List list3 = hm4.r;
                return (list3.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list3.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            case 20:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i15 = 0; i15 < bArr.length; i15++) {
                    byte b3 = bArr[i15];
                    byte b4 = bArr2[i15];
                    if (b3 != b4) {
                        return b3 - b4;
                    }
                }
                return 0;
            case 21:
                return Integer.compare(((x25) obj2).b, ((x25) obj).b);
            case 22:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 23:
                return ((ug5) obj).a.compareTo(((ug5) obj2).a);
            case 24:
                int i16 = ((yv2) obj).l;
                int i17 = ((yv2) obj2).l;
                if (i16 > i17) {
                    return -1;
                }
                if (i16 < i17) {
                    return 1;
                }
                return 0;
            case 25:
            case 27:
                i = ((j96) obj2).c;
                i2 = ((j96) obj).c;
                break;
            case 26:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 28:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            default:
                int i18 = (z8c.h(((Integer) obj).intValue()).Z > z8c.h(((Integer) obj2).intValue()).Z ? 1 : (z8c.h(((Integer) obj).intValue()).Z == z8c.h(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i18 > 0) {
                    return 1;
                }
                if (i18 < 0) {
                    return -1;
                }
                return 0;
        }
        return i - i2;
    }

    public x03(k96 k96Var, byte b) {
        this.a = b;
    }
}
