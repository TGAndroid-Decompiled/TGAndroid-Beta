package defpackage;

import android.util.SparseArray;
public final class py8 {
    public static final py8 a;
    public static final py8[] b;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        Enum r1 = new Enum("UNMETERED_ONLY", 1);
        Enum r3 = new Enum("UNMETERED_OR_DAILY", 2);
        Enum r5 = new Enum("FAST_IF_RADIO_AWAKE", 3);
        Enum r7 = new Enum("NEVER", 4);
        Enum r9 = new Enum("UNRECOGNIZED", 5);
        b = new py8[]{r0, r1, r3, r5, r7, r9};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r0);
        sparseArray.put(1, r1);
        sparseArray.put(2, r3);
        sparseArray.put(3, r5);
        sparseArray.put(4, r7);
        sparseArray.put(-1, r9);
    }

    public static py8 valueOf(String str) {
        return (py8) Enum.valueOf(py8.class, str);
    }

    public static py8[] values() {
        return (py8[]) b.clone();
    }
}
