package defpackage;
public final class fk6 {
    public final pm3 a;

    public fk6(w2d w2dVar, y2d y2dVar, jk8 jk8Var) {
        this.a = new pm3(w2dVar, y2dVar, jk8Var, (byte) 15);
    }

    public static int a(pm3 pm3Var, Object obj, Object obj2) {
        int i;
        int size;
        int h;
        int size2;
        int h2;
        w2d w2dVar = (w2d) pm3Var.b;
        int i2 = ta4.c;
        int i3 = 1;
        int g = xk2.g(1);
        x2d x2dVar = a3d.d;
        if (w2dVar == x2dVar) {
            g <<= 1;
        }
        switch (w2dVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                i = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                i = 4;
                break;
            case 2:
                i = xk2.i(((Long) obj).longValue());
                break;
            case 3:
                i = xk2.i(((Long) obj).longValue());
                break;
            case 4:
                i = xk2.i(((Integer) obj).intValue());
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
                if (obj instanceof n51) {
                    size = ((n51) obj).size();
                    h = xk2.h(size);
                    i = size + h;
                    break;
                } else {
                    i = xk2.f((String) obj);
                    break;
                }
            case 9:
                i = ((ju4) ((p3) obj)).a(null);
                break;
            case 10:
                size = ((ju4) ((p3) obj)).a(null);
                h = xk2.h(size);
                i = size + h;
                break;
            case 11:
                if (obj instanceof n51) {
                    size = ((n51) obj).size();
                    h = xk2.h(size);
                } else {
                    size = ((byte[]) obj).length;
                    h = xk2.h(size);
                }
                i = size + h;
                break;
            case 12:
                i = xk2.h(((Integer) obj).intValue());
                break;
            case 13:
                i = xk2.i(((Integer) obj).intValue());
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
                i = xk2.h((intValue << 1) ^ (intValue >> 31));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                i = xk2.i((longValue << 1) ^ (longValue >> 63));
                break;
            default:
                xi4.l("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        int i4 = i + g;
        y2d y2dVar = (y2d) pm3Var.c;
        int g2 = xk2.g(2);
        if (y2dVar == x2dVar) {
            g2 <<= 1;
        }
        switch (y2dVar.ordinal()) {
            case 0:
                ((Double) obj2).getClass();
                i3 = 8;
                break;
            case 1:
                ((Float) obj2).getClass();
                i3 = 4;
                break;
            case 2:
                i3 = xk2.i(((Long) obj2).longValue());
                break;
            case 3:
                i3 = xk2.i(((Long) obj2).longValue());
                break;
            case 4:
                i3 = xk2.i(((Integer) obj2).intValue());
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
                if (obj2 instanceof n51) {
                    size2 = ((n51) obj2).size();
                    h2 = xk2.h(size2);
                    i3 = h2 + size2;
                    break;
                } else {
                    i3 = xk2.f((String) obj2);
                    break;
                }
            case 9:
                i3 = ((ju4) ((p3) obj2)).a(null);
                break;
            case 10:
                size2 = ((ju4) ((p3) obj2)).a(null);
                h2 = xk2.h(size2);
                i3 = h2 + size2;
                break;
            case 11:
                if (obj2 instanceof n51) {
                    size2 = ((n51) obj2).size();
                    h2 = xk2.h(size2);
                } else {
                    size2 = ((byte[]) obj2).length;
                    h2 = xk2.h(size2);
                }
                i3 = h2 + size2;
                break;
            case 12:
                i3 = xk2.h(((Integer) obj2).intValue());
                break;
            case 13:
                i3 = xk2.i(((Integer) obj2).intValue());
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
                i3 = xk2.h((intValue2 << 1) ^ (intValue2 >> 31));
                break;
            case 17:
                long longValue2 = ((Long) obj2).longValue();
                i3 = xk2.i((longValue2 << 1) ^ (longValue2 >> 63));
                break;
            default:
                xi4.l("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return i3 + g2 + i4;
    }
}
