package n7;

import java.io.Serializable;
public final class w extends x implements Serializable {
    public static final w f15940b = new w(0);
    public static final w f15941c = new w(1);
    public final int f15942a;

    public w(int i10) {
        this.f15942a = i10;
    }

    @Override
    public final x a() {
        switch (this.f15942a) {
            case 0:
                return f15941c;
            default:
                return f15940b;
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f15942a) {
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
        switch (this.f15942a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
