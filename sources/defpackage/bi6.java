package defpackage;
public final class bi6 {
    public final xl3 a;

    public bi6(gyc gycVar, iyc iycVar, vg8 vg8Var) {
        this.a = new xl3(gycVar, iycVar, vg8Var, (byte) 15);
    }

    public static int a(xl3 xl3Var, Object obj, Object obj2) {
        int i;
        int size;
        int h;
        int size2;
        int h2;
        gyc gycVar = (gyc) xl3Var.b;
        int i2 = x84.c;
        int i3 = 1;
        int g = ck2.g(1);
        hyc hycVar = kyc.d;
        if (gycVar == hycVar) {
            g <<= 1;
        }
        switch (gycVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                i = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                i = 4;
                break;
            case 2:
                i = ck2.i(((Long) obj).longValue());
                break;
            case 3:
                i = ck2.i(((Long) obj).longValue());
                break;
            case 4:
                i = ck2.i(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).getClass();
                i = 8;
                break;
            case 6:
                ((Integer) obj).getClass();
                i = 4;
                break;
            case 7:
                ((Boolean) obj).getClass();
                i = 1;
                break;
            case 8:
                if (obj instanceof f51) {
                    size = ((f51) obj).size();
                    h = ck2.h(size);
                    i = size + h;
                    break;
                } else {
                    i = ck2.f((String) obj);
                    break;
                }
            case 9:
                i = ((fs4) ((o3) obj)).a(null);
                break;
            case 10:
                size = ((fs4) ((o3) obj)).a(null);
                h = ck2.h(size);
                i = size + h;
                break;
            case 11:
                if (obj instanceof f51) {
                    size = ((f51) obj).size();
                    h = ck2.h(size);
                } else {
                    size = ((byte[]) obj).length;
                    h = ck2.h(size);
                }
                i = size + h;
                break;
            case 12:
                i = ck2.h(((Integer) obj).intValue());
                break;
            case 13:
                i = ck2.i(((Integer) obj).intValue());
                break;
            case 14:
                ((Integer) obj).getClass();
                i = 4;
                break;
            case 15:
                ((Long) obj).getClass();
                i = 8;
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i = ck2.h((intValue << 1) ^ (intValue >> 31));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                i = ck2.i((longValue << 1) ^ (longValue >> 63));
                break;
            default:
                wn4.j("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        int i4 = i + g;
        iyc iycVar = (iyc) xl3Var.c;
        int g2 = ck2.g(2);
        if (iycVar == hycVar) {
            g2 <<= 1;
        }
        switch (iycVar.ordinal()) {
            case 0:
                ((Double) obj2).getClass();
                i3 = 8;
                break;
            case 1:
                ((Float) obj2).getClass();
                i3 = 4;
                break;
            case 2:
                i3 = ck2.i(((Long) obj2).longValue());
                break;
            case 3:
                i3 = ck2.i(((Long) obj2).longValue());
                break;
            case 4:
                i3 = ck2.i(((Integer) obj2).intValue());
                break;
            case 5:
                ((Long) obj2).getClass();
                i3 = 8;
                break;
            case 6:
                ((Integer) obj2).getClass();
                i3 = 4;
                break;
            case 7:
                ((Boolean) obj2).getClass();
                break;
            case 8:
                if (obj2 instanceof f51) {
                    size2 = ((f51) obj2).size();
                    h2 = ck2.h(size2);
                    i3 = h2 + size2;
                    break;
                } else {
                    i3 = ck2.f((String) obj2);
                    break;
                }
            case 9:
                i3 = ((fs4) ((o3) obj2)).a(null);
                break;
            case 10:
                size2 = ((fs4) ((o3) obj2)).a(null);
                h2 = ck2.h(size2);
                i3 = h2 + size2;
                break;
            case 11:
                if (obj2 instanceof f51) {
                    size2 = ((f51) obj2).size();
                    h2 = ck2.h(size2);
                } else {
                    size2 = ((byte[]) obj2).length;
                    h2 = ck2.h(size2);
                }
                i3 = h2 + size2;
                break;
            case 12:
                i3 = ck2.h(((Integer) obj2).intValue());
                break;
            case 13:
                i3 = ck2.i(((Integer) obj2).intValue());
                break;
            case 14:
                ((Integer) obj2).getClass();
                i3 = 4;
                break;
            case 15:
                ((Long) obj2).getClass();
                i3 = 8;
                break;
            case 16:
                int intValue2 = ((Integer) obj2).intValue();
                i3 = ck2.h((intValue2 << 1) ^ (intValue2 >> 31));
                break;
            case 17:
                long longValue2 = ((Long) obj2).longValue();
                i3 = ck2.i((longValue2 << 1) ^ (longValue2 >> 63));
                break;
            default:
                wn4.j("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return i3 + g2 + i4;
    }
}
