package defpackage;

import java.util.Comparator;
public final class cde implements Comparator {
    public static final cde a;
    public static final cde[] b;

    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        b = new cde[]{r0};
    }

    public static cde[] values() {
        return (cde[]) b.clone();
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < min; i++) {
            int i2 = (bArr[i] & 255) - (bArr2[i] & 255);
            if (i2 != 0) {
                return i2;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
