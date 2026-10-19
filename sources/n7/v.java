package n7;

import java.io.Serializable;
public final class v extends w implements Serializable {
    public static final v f17319b = new v(0);
    public static final v f17320c = new v(1);
    public final int f17321a;

    public v(int i10) {
        this.f17321a = i10;
    }

    @Override
    public final w a() {
        switch (this.f17321a) {
            case 0:
                return f17320c;
            default:
                return f17319b;
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f17321a) {
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
        switch (this.f17321a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
