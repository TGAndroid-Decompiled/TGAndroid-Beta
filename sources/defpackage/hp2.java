package defpackage;

import android.util.SparseArray;
public final class hp2 {
    public static final hp2 a;
    public static final hp2[] b;
    hp2 EF0;

    static {
        Enum r0 = new Enum("NOT_SET", 0);
        ?? r1 = new Enum("EVENT_OVERRIDE", 1);
        a = r1;
        b = new hp2[]{r0, r1};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r0);
        sparseArray.put(5, r1);
    }

    public static hp2 valueOf(String str) {
        return (hp2) Enum.valueOf(hp2.class, str);
    }

    public static hp2[] values() {
        return (hp2[]) b.clone();
    }
}
