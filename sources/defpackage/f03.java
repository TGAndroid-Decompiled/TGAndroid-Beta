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
public final class f03 implements Comparator {
    public final byte a;

    public f03(byte b) {
        this.a = b;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        long[] jArr;
        long[] jArr2;
        long j;
        long j2;
        long j3;
        eu7 eu7Var;
        eu7 a;
        int i;
        int i2;
        int i3;
        int i4 = -1;
        switch (this.a) {
            case 0:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 1:
                String name = ((File) obj).getName();
                byte b = g03.f;
                return name.substring(0, b).compareTo(((File) obj2).getName().substring(0, b));
            case 2:
                kq3 kq3Var = (kq3) obj;
                kq3 kq3Var2 = (kq3) obj2;
                int x = lq3.x(8);
                int i5 = 0;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    int[] iArr = kq3Var.a;
                    jArr = kq3Var.b;
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
                    int[] iArr2 = kq3Var2.a;
                    jArr2 = kq3Var2.b;
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
                long j5 = j + j2 + (kq3Var.e ? 1L : 0L);
                if (z3) {
                    j3 = jArr2[1];
                } else {
                    j3 = 0;
                }
                if (z4) {
                    j4 = jArr2[x];
                }
                int i9 = (j5 > (j3 + j4 + (kq3Var2.e ? 1L : 0L)) ? 1 : (j5 == (j3 + j4 + (kq3Var2.e ? 1L : 0L)) ? 0 : -1));
                if (i9 > 0) {
                    return 1;
                }
                if (i9 >= 0) {
                    return 0;
                }
                return -1;
            case 3:
                return Long.compare(((w83) obj2).c, ((w83) obj).c);
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
                return Integer.compare(((dd3) ((List) obj).get(0)).f, ((dd3) ((List) obj2).get(0)).f);
            case 6:
                List list = (List) obj;
                List list2 = (List) obj2;
                return np2.f(kd3.c((kd3) Collections.max(list, new f03((byte) 9)), (kd3) Collections.max(list2, new f03((byte) 9)))).a(list.size(), list2.size()).b((kd3) Collections.max(list, new f03((byte) 10)), (kd3) Collections.max(list2, new f03((byte) 10)), new f03((byte) 10)).e();
            case 7:
                return ((cd3) Collections.max((List) obj)).compareTo((cd3) Collections.max((List) obj2));
            case 8:
                return ((hd3) ((List) obj).get(0)).compareTo((hd3) ((List) obj2).get(0));
            case 9:
                return kd3.c((kd3) obj, (kd3) obj2);
            case 10:
                kd3 kd3Var = (kd3) obj;
                kd3 kd3Var2 = (kd3) obj2;
                boolean z5 = kd3Var.e;
                int i10 = kd3Var.s;
                if (z5 && kd3Var.n) {
                    a = ld3.l;
                    eu7Var = a;
                } else {
                    eu7 eu7Var2 = ld3.l;
                    eu7Var = eu7Var2;
                    a = eu7Var2.a();
                }
                boolean z6 = kd3Var.f.F;
                pp2 pp2Var = pp2.a;
                if (z6) {
                    pp2Var = pp2Var.b(Integer.valueOf(i10), Integer.valueOf(kd3Var2.s), eu7Var.a());
                }
                pp2 b2 = pp2Var.c(kd3Var.P, kd3Var2.P).b(Integer.valueOf(kd3Var.w), Integer.valueOf(kd3Var2.w), a);
                if (kd3Var.L && kd3Var.N) {
                    b2 = b2.a(kd3Var.O, kd3Var2.O);
                }
                return b2.c(kd3Var.M, kd3Var2.M).b(Integer.valueOf(i10), Integer.valueOf(kd3Var2.s), a).e();
            case 11:
                i = ((og3) obj2).b;
                i2 = ((og3) obj).b;
                break;
            case 12:
                int i11 = (yac.h(((Integer) obj).intValue()).Z > yac.h(((Integer) obj2).intValue()).Z ? 1 : (yac.h(((Integer) obj).intValue()).Z == yac.h(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i11 > 0) {
                    return 1;
                }
                if (i11 < 0) {
                    return -1;
                }
                return 0;
            case 13:
                int i12 = ((sl3) obj).b;
                int i13 = ((sl3) obj2).b;
                if (i12 < i13) {
                    return 1;
                }
                if (i12 > i13) {
                    return -1;
                }
                return 0;
            case 14:
                Integer num3 = 0;
                HashMap hashMap = pv3.h;
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
                w49 w49Var = (w49) obj2;
                String str = ((w49) obj).f;
                if (str != null && str.equals("❤")) {
                    i3 = -1;
                } else {
                    i3 = 0;
                }
                String str2 = w49Var.f;
                return i3 - ((str2 == null || !str2.equals("❤")) ? 0 : 0);
            case 16:
                return Float.compare(((float[]) obj)[0], ((float[]) obj2)[0]);
            case 17:
                int i14 = (((fb4) obj).a > ((fb4) obj2).a ? 1 : (((fb4) obj).a == ((fb4) obj2).a ? 0 : -1));
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
                List list3 = lm4.r;
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
                return Integer.compare(((b35) obj2).b, ((b35) obj).b);
            case 22:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 23:
                return ((xg5) obj).a.compareTo(((xg5) obj2).a);
            case 24:
                int i16 = ((iv2) obj).l;
                int i17 = ((iv2) obj2).l;
                if (i16 > i17) {
                    return -1;
                }
                if (i16 < i17) {
                    return 1;
                }
                return 0;
            case 25:
            case 27:
                i = ((n96) obj2).c;
                i2 = ((n96) obj).c;
                break;
            case 26:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 28:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            default:
                int i18 = (yac.h(((Integer) obj).intValue()).Z > yac.h(((Integer) obj2).intValue()).Z ? 1 : (yac.h(((Integer) obj).intValue()).Z == yac.h(((Integer) obj2).intValue()).Z ? 0 : -1));
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

    public f03(o96 o96Var, byte b) {
        this.a = b;
    }
}
