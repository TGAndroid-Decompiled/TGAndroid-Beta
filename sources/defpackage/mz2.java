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
public final class mz2 implements Comparator {
    public final byte a;

    public mz2(byte b) {
        this.a = b;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        long[] jArr;
        long[] jArr2;
        long j;
        long j2;
        long j3;
        yq7 yq7Var;
        yq7 a;
        int i;
        int i2;
        int i3;
        int i4 = -1;
        switch (this.a) {
            case 0:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 1:
                String name = ((File) obj).getName();
                byte b = nz2.f;
                return name.substring(0, b).compareTo(((File) obj2).getName().substring(0, b));
            case 2:
                tp3 tp3Var = (tp3) obj;
                tp3 tp3Var2 = (tp3) obj2;
                int x = up3.x(8);
                int i5 = 0;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    int[] iArr = tp3Var.a;
                    jArr = tp3Var.b;
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
                    int[] iArr2 = tp3Var2.a;
                    jArr2 = tp3Var2.b;
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
                long j5 = j + j2 + (tp3Var.e ? 1L : 0L);
                if (z3) {
                    j3 = jArr2[1];
                } else {
                    j3 = 0;
                }
                if (z4) {
                    j4 = jArr2[x];
                }
                int i9 = (j5 > (j3 + j4 + (tp3Var2.e ? 1L : 0L)) ? 1 : (j5 == (j3 + j4 + (tp3Var2.e ? 1L : 0L)) ? 0 : -1));
                if (i9 > 0) {
                    return 1;
                }
                if (i9 >= 0) {
                    return 0;
                }
                return -1;
            case 3:
                return Long.compare(((d83) obj2).c, ((d83) obj).c);
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
                return Integer.compare(((kc3) ((List) obj).get(0)).f, ((kc3) ((List) obj2).get(0)).f);
            case 6:
                List list = (List) obj;
                List list2 = (List) obj2;
                return uo2.f(rc3.c((rc3) Collections.max(list, new mz2((byte) 9)), (rc3) Collections.max(list2, new mz2((byte) 9)))).a(list.size(), list2.size()).b((rc3) Collections.max(list, new mz2((byte) 10)), (rc3) Collections.max(list2, new mz2((byte) 10)), new mz2((byte) 10)).e();
            case 7:
                return ((jc3) Collections.max((List) obj)).compareTo((jc3) Collections.max((List) obj2));
            case 8:
                return ((oc3) ((List) obj).get(0)).compareTo((oc3) ((List) obj2).get(0));
            case 9:
                return rc3.c((rc3) obj, (rc3) obj2);
            case 10:
                rc3 rc3Var = (rc3) obj;
                rc3 rc3Var2 = (rc3) obj2;
                boolean z5 = rc3Var.e;
                int i10 = rc3Var.s;
                if (z5 && rc3Var.n) {
                    a = sc3.l;
                    yq7Var = a;
                } else {
                    yq7 yq7Var2 = sc3.l;
                    yq7Var = yq7Var2;
                    a = yq7Var2.a();
                }
                boolean z6 = rc3Var.f.F;
                wo2 wo2Var = wo2.a;
                if (z6) {
                    wo2Var = wo2Var.b(Integer.valueOf(i10), Integer.valueOf(rc3Var2.s), yq7Var.a());
                }
                wo2 b2 = wo2Var.c(rc3Var.P, rc3Var2.P).b(Integer.valueOf(rc3Var.w), Integer.valueOf(rc3Var2.w), a);
                if (rc3Var.L && rc3Var.N) {
                    b2 = b2.a(rc3Var.O, rc3Var2.O);
                }
                return b2.c(rc3Var.M, rc3Var2.M).b(Integer.valueOf(i10), Integer.valueOf(rc3Var2.s), a).e();
            case 11:
                i = ((uf3) obj2).b;
                i2 = ((uf3) obj).b;
                break;
            case 12:
                int i11 = (y6c.h(((Integer) obj).intValue()).Z > y6c.h(((Integer) obj2).intValue()).Z ? 1 : (y6c.h(((Integer) obj).intValue()).Z == y6c.h(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i11 > 0) {
                    return 1;
                }
                if (i11 < 0) {
                    return -1;
                }
                return 0;
            case 13:
                int i12 = ((al3) obj).b;
                int i13 = ((al3) obj2).b;
                if (i12 < i13) {
                    return 1;
                }
                if (i12 > i13) {
                    return -1;
                }
                return 0;
            case 14:
                Integer num3 = 0;
                HashMap hashMap = vu3.h;
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
                h19 h19Var = (h19) obj2;
                String str = ((h19) obj).f;
                if (str != null && str.equals("❤")) {
                    i3 = -1;
                } else {
                    i3 = 0;
                }
                String str2 = h19Var.f;
                return i3 - ((str2 == null || !str2.equals("❤")) ? 0 : 0);
            case 16:
                int i14 = (((j94) obj).a > ((j94) obj2).a ? 1 : (((j94) obj).a == ((j94) obj2).a ? 0 : -1));
                if (i14 > 0) {
                    return 1;
                }
                if (i14 < 0) {
                    return -1;
                }
                return 0;
            case 17:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 18:
                List list3 = gk4.r;
                return (list3.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list3.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            case 19:
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
            case 20:
                return Integer.compare(((x05) obj2).b, ((x05) obj).b);
            case 21:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 22:
                return ((ve5) obj).a.compareTo(((ve5) obj2).a);
            case 23:
                int i16 = ((nu2) obj).l;
                int i17 = ((nu2) obj2).l;
                if (i16 > i17) {
                    return -1;
                }
                if (i16 < i17) {
                    return 1;
                }
                return 0;
            case 24:
            case 26:
                i = ((j76) obj2).c;
                i2 = ((j76) obj).c;
                break;
            case 25:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 27:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 28:
                int i18 = (y6c.h(((Integer) obj).intValue()).Z > y6c.h(((Integer) obj2).intValue()).Z ? 1 : (y6c.h(((Integer) obj).intValue()).Z == y6c.h(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i18 > 0) {
                    return 1;
                }
                if (i18 < 0) {
                    return -1;
                }
                return 0;
            default:
                fg5 fg5Var = (fg5) obj;
                fg5 fg5Var2 = (fg5) obj2;
                int compare = Integer.compare(fg5Var.b, fg5Var2.b);
                if (compare == 0) {
                    return Integer.compare(fg5Var2.d, fg5Var.d);
                }
                return compare;
        }
        return i - i2;
    }

    public mz2(k76 k76Var, byte b) {
        this.a = b;
    }
}
