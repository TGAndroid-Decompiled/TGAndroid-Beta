package m5;

import android.util.SparseArray;
public final class z {
    public static final z f19173a;
    public static final z[] f19174b;
    z EF0;

    static {
        Enum r02 = new Enum("NOT_SET", 0);
        ?? r12 = new Enum("EVENT_OVERRIDE", 1);
        f19173a = r12;
        f19174b = new z[]{r02, r12};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r02);
        sparseArray.put(5, r12);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f19174b.clone();
    }
}
