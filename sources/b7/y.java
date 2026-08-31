package b7;

import java.io.Serializable;
public final class y extends z implements Serializable {
    public static final y f1886b = new y(0);
    public static final y f1887c = new y(1);
    public final int f1888a;

    public y(int i10) {
        this.f1888a = i10;
    }

    @Override
    public final z a() {
        switch (this.f1888a) {
            case 0:
                return f1887c;
            default:
                return f1886b;
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f1888a) {
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
        switch (this.f1888a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
