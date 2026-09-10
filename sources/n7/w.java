package n7;

import java.io.Serializable;
public final class w extends x implements Serializable {
    public static final w f14004b = new w(0);
    public static final w f14005c = new w(1);
    public final int f14006a;

    public w(int i10) {
        this.f14006a = i10;
    }

    @Override
    public final x a() {
        switch (this.f14006a) {
            case 0:
                return f14005c;
            default:
                return f14004b;
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f14006a) {
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
        switch (this.f14006a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
