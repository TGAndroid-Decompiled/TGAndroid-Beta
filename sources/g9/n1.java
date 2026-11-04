package g9;

import java.io.Serializable;
public final class n1 extends q1 implements Serializable {
    public static final n1 f12107b = new n1(0);
    public static final n1 f12108c = new n1(1);
    public final int f12109a;

    public n1(int i3) {
        this.f12109a = i3;
    }

    @Override
    public final q1 a() {
        switch (this.f12109a) {
            case 0:
                return f12108c;
            default:
                return f12107b;
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f12109a) {
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
        switch (this.f12109a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
