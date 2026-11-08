package n5;

import android.util.SparseArray;
public final class j0 {
    public static final j0 f20446a;
    public static final j0[] f20447b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f20446a = r02;
        Enum r12 = new Enum("UNMETERED_ONLY", 1);
        Enum r32 = new Enum("UNMETERED_OR_DAILY", 2);
        Enum r52 = new Enum("FAST_IF_RADIO_AWAKE", 3);
        Enum r72 = new Enum("NEVER", 4);
        Enum r92 = new Enum("UNRECOGNIZED", 5);
        f20447b = new j0[]{r02, r12, r32, r52, r72, r92};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r02);
        sparseArray.put(1, r12);
        sparseArray.put(2, r32);
        sparseArray.put(3, r52);
        sparseArray.put(4, r72);
        sparseArray.put(-1, r92);
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f20447b.clone();
    }
}
