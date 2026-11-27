package defpackage;

import android.util.SparseArray;
public final class aq2 {
    public static final aq2 a;
    public static final aq2[] b;
    aq2 EF0;

    static {
        Enum r0 = new Enum("NOT_SET", 0);
        ?? r1 = new Enum("EVENT_OVERRIDE", 1);
        a = r1;
        b = new aq2[]{r0, r1};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r0);
        sparseArray.put(5, r1);
    }

    public static aq2 valueOf(String str) {
        return (aq2) Enum.valueOf(aq2.class, str);
    }

    public static aq2[] values() {
        return (aq2[]) b.clone();
    }
}
