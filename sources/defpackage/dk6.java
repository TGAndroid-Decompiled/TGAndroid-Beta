package defpackage;
public final class dk6 {
    public final in3 a;

    public dk6(h0d h0dVar, j0d j0dVar, xi8 xi8Var) {
        this.a = new in3(h0dVar, j0dVar, xi8Var, (byte) 15);
    }

    public static int a(in3 in3Var, Object obj, Object obj2) {
        int i;
        int size;
        int h;
        int size2;
        int h2;
        h0d h0dVar = (h0d) in3Var.b;
        int i2 = xa4.c;
        int i3 = 1;
        int g = pl2.g(1);
        i0d i0dVar = l0d.d;
        if (h0dVar == i0dVar) {
            g <<= 1;
        }
        switch (h0dVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                i = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                i = 4;
                break;
            case 2:
                i = pl2.i(((Long) obj).longValue());
                break;
            case 3:
                i = pl2.i(((Long) obj).longValue());
                break;
            case 4:
                i = pl2.i(((Integer) obj).intValue());
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
                if (obj instanceof m61) {
                    size = ((m61) obj).size();
                    h = pl2.h(size);
                    i = size + h;
                    break;
                } else {
                    i = pl2.f((String) obj);
                    break;
                }
            case 9:
                i = ((gu4) ((o3) obj)).a(null);
                break;
            case 10:
                size = ((gu4) ((o3) obj)).a(null);
                h = pl2.h(size);
                i = size + h;
                break;
            case 11:
                if (obj instanceof m61) {
                    size = ((m61) obj).size();
                    h = pl2.h(size);
                } else {
                    size = ((byte[]) obj).length;
                    h = pl2.h(size);
                }
                i = size + h;
                break;
            case 12:
                i = pl2.h(((Integer) obj).intValue());
                break;
            case 13:
                i = pl2.i(((Integer) obj).intValue());
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
                i = pl2.h((intValue << 1) ^ (intValue >> 31));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                i = pl2.i((longValue << 1) ^ (longValue >> 63));
                break;
            default:
                zo4.k("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        int i4 = i + g;
        j0d j0dVar = (j0d) in3Var.c;
        int g2 = pl2.g(2);
        if (j0dVar == i0dVar) {
            g2 <<= 1;
        }
        switch (j0dVar.ordinal()) {
            case 0:
                ((Double) obj2).getClass();
                i3 = 8;
                break;
            case 1:
                ((Float) obj2).getClass();
                i3 = 4;
                break;
            case 2:
                i3 = pl2.i(((Long) obj2).longValue());
                break;
            case 3:
                i3 = pl2.i(((Long) obj2).longValue());
                break;
            case 4:
                i3 = pl2.i(((Integer) obj2).intValue());
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
                if (obj2 instanceof m61) {
                    size2 = ((m61) obj2).size();
                    h2 = pl2.h(size2);
                    i3 = h2 + size2;
                    break;
                } else {
                    i3 = pl2.f((String) obj2);
                    break;
                }
            case 9:
                i3 = ((gu4) ((o3) obj2)).a(null);
                break;
            case 10:
                size2 = ((gu4) ((o3) obj2)).a(null);
                h2 = pl2.h(size2);
                i3 = h2 + size2;
                break;
            case 11:
                if (obj2 instanceof m61) {
                    size2 = ((m61) obj2).size();
                    h2 = pl2.h(size2);
                } else {
                    size2 = ((byte[]) obj2).length;
                    h2 = pl2.h(size2);
                }
                i3 = h2 + size2;
                break;
            case 12:
                i3 = pl2.h(((Integer) obj2).intValue());
                break;
            case 13:
                i3 = pl2.i(((Integer) obj2).intValue());
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
                i3 = pl2.h((intValue2 << 1) ^ (intValue2 >> 31));
                break;
            case 17:
                long longValue2 = ((Long) obj2).longValue();
                i3 = pl2.i((longValue2 << 1) ^ (longValue2 >> 63));
                break;
            default:
                zo4.k("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return i3 + g2 + i4;
    }
}
