package n7;

import java.io.Serializable;
public final class v extends w implements Serializable {
    public static final v f16558b = new v(0);
    public static final v f16559c = new v(1);
    public final int f16560a;

    public v(int i10) {
        this.f16560a = i10;
    }

    @Override
    public final w a() {
        switch (this.f16560a) {
            case 0:
                return f16559c;
            default:
                return f16558b;
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f16560a) {
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
        switch (this.f16560a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
