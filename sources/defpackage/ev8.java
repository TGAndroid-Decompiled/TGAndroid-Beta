package defpackage;

import android.util.SparseArray;
public final class ev8 {
    public static final ev8 a;
    public static final ev8[] b;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        Enum r1 = new Enum("UNMETERED_ONLY", 1);
        Enum r3 = new Enum("UNMETERED_OR_DAILY", 2);
        Enum r5 = new Enum("FAST_IF_RADIO_AWAKE", 3);
        Enum r7 = new Enum("NEVER", 4);
        Enum r9 = new Enum("UNRECOGNIZED", 5);
        b = new ev8[]{r0, r1, r3, r5, r7, r9};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r0);
        sparseArray.put(1, r1);
        sparseArray.put(2, r3);
        sparseArray.put(3, r5);
        sparseArray.put(4, r7);
        sparseArray.put(-1, r9);
    }

    public static ev8 valueOf(String str) {
        return (ev8) Enum.valueOf(ev8.class, str);
    }

    public static ev8[] values() {
        return (ev8[]) b.clone();
    }
}
