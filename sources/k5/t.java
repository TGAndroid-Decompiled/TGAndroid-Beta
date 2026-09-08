package k5;

import android.util.SparseArray;
public final class t {
    public static final SparseArray f14824a;
    public static final t[] f14825b;
    t EF0;

    static {
        Enum r02 = new Enum("UNKNOWN_MOBILE_SUBTYPE", 0);
        Enum r12 = new Enum("GPRS", 1);
        Enum r32 = new Enum("EDGE", 2);
        Enum r52 = new Enum("UMTS", 3);
        Enum r72 = new Enum("CDMA", 4);
        Enum r92 = new Enum("EVDO_0", 5);
        Enum r11 = new Enum("EVDO_A", 6);
        Enum r13 = new Enum("RTT", 7);
        Enum r15 = new Enum("HSDPA", 8);
        Enum r14 = new Enum("HSUPA", 9);
        Enum r122 = new Enum("HSPA", 10);
        Enum r10 = new Enum("IDEN", 11);
        Enum r82 = new Enum("EVDO_B", 12);
        Enum r62 = new Enum("LTE", 13);
        Enum r42 = new Enum("EHRPD", 14);
        Enum r22 = new Enum("HSPAP", 15);
        Enum r63 = new Enum("GSM", 16);
        Enum r43 = new Enum("TD_SCDMA", 17);
        Enum r23 = new Enum("IWLAN", 18);
        Enum r64 = new Enum("LTE_CA", 19);
        f14825b = new t[]{r02, r12, r32, r52, r72, r92, r11, r13, r15, r14, r122, r10, r82, r62, r42, r22, r63, r43, r23, r64, new Enum("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f14824a = sparseArray;
        sparseArray.put(0, r02);
        sparseArray.put(1, r12);
        sparseArray.put(2, r32);
        sparseArray.put(3, r52);
        sparseArray.put(4, r72);
        sparseArray.put(5, r92);
        sparseArray.put(6, r11);
        sparseArray.put(7, r13);
        sparseArray.put(8, r15);
        sparseArray.put(9, r14);
        sparseArray.put(10, r122);
        sparseArray.put(11, r10);
        sparseArray.put(12, r82);
        sparseArray.put(13, r62);
        sparseArray.put(14, r42);
        sparseArray.put(15, r22);
        sparseArray.put(16, r63);
        sparseArray.put(17, r43);
        sparseArray.put(18, r23);
        sparseArray.put(19, r64);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f14825b.clone();
    }
}
