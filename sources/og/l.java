package og;

import java.util.Arrays;
import java.util.List;
public abstract class l extends m {
    public static final List f14414b = Arrays.asList(new Object(), new Object(), new Object(), new Object(), new Object());

    public static l p(int i10) {
        List list = f14414b;
        if (i10 >= 0 && i10 <= list.size()) {
            return (l) list.get(i10);
        }
        StringBuilder sb2 = new StringBuilder("Shape type must be in range from 0 to ");
        sb2.append(list.size() - 1);
        sb2.append(", but got ");
        sb2.append(i10);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    @Override
    public final float a() {
        return 1.0f;
    }

    @Override
    public final String i(int i10) {
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return "brush";
        }
        return "shape";
    }

    public abstract int m();

    public abstract String n();

    public abstract int o();
}
