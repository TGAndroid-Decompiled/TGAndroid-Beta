package defpackage;

import android.util.SparseArray;
public final class sq2 {
    public static final sq2 a;
    public static final sq2[] b;
    sq2 EF0;

    static {
        Enum r0 = new Enum("NOT_SET", 0);
        ?? r1 = new Enum("EVENT_OVERRIDE", 1);
        a = r1;
        b = new sq2[]{r0, r1};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r0);
        sparseArray.put(5, r1);
    }

    public static sq2 valueOf(String str) {
        return (sq2) Enum.valueOf(sq2.class, str);
    }

    public static sq2[] values() {
        return (sq2[]) b.clone();
    }
}
