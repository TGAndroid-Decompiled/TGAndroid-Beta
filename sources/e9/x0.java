package e9;

import java.io.Serializable;
public final class x0 extends y0 implements Serializable {
    public static final x0 f8822b = new x0(0);
    public static final x0 f8823c = new x0(1);
    public final int f8824a;

    public x0(int i10) {
        this.f8824a = i10;
    }

    @Override
    public final y0 a() {
        switch (this.f8824a) {
            case 0:
                return f8823c;
            default:
                return f8822b;
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f8824a) {
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
        switch (this.f8824a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
