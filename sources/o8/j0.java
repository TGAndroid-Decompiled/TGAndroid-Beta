package o8;

import java.io.Serializable;
public final class j0 extends k0 implements Serializable {
    public static final j0 f19050b = new j0(0);
    public static final j0 f19051c = new j0(1);
    public final int f19052a;

    public j0(int i9) {
        this.f19052a = i9;
    }

    @Override
    public final k0 a() {
        switch (this.f19052a) {
            case 0:
                return f19051c;
            default:
                return f19050b;
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f19052a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f19052a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
