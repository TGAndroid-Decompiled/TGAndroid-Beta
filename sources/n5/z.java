package n5;

import android.util.SparseArray;
public final class z {
    public static final z f21418a;
    public static final z[] f21419b;
    z EF0;

    static {
        Enum r02 = new Enum("NOT_SET", 0);
        ?? r12 = new Enum("EVENT_OVERRIDE", 1);
        f21418a = r12;
        f21419b = new z[]{r02, r12};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r02);
        sparseArray.put(5, r12);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f21419b.clone();
    }
}
