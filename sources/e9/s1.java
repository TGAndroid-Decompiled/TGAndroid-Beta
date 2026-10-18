package e9;

import java.io.Serializable;
public final class s1 extends v1 implements Serializable {
    public static final s1 f8498b = new s1(0);
    public static final s1 f8499c = new s1(1);
    public final int f8500a;

    public s1(int i10) {
        this.f8500a = i10;
    }

    @Override
    public final v1 a() {
        switch (this.f8500a) {
            case 0:
                return f8499c;
            default:
                return f8498b;
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f8500a) {
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
        switch (this.f8500a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
