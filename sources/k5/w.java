package k5;

import android.util.SparseArray;
public final class w {
    public static final w f14802a;
    public static final w[] f14803b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f14802a = r02;
        Enum r12 = new Enum("UNMETERED_ONLY", 1);
        Enum r32 = new Enum("UNMETERED_OR_DAILY", 2);
        Enum r52 = new Enum("FAST_IF_RADIO_AWAKE", 3);
        Enum r72 = new Enum("NEVER", 4);
        Enum r92 = new Enum("UNRECOGNIZED", 5);
        f14803b = new w[]{r02, r12, r32, r52, r72, r92};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r02);
        sparseArray.put(1, r12);
        sparseArray.put(2, r32);
        sparseArray.put(3, r52);
        sparseArray.put(4, r72);
        sparseArray.put(-1, r92);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f14803b.clone();
    }
}
