package b7;

import java.util.Comparator;
public final class s0 implements Comparator {
    public static final s0 f1739a;
    public static final s0[] f1740b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f1739a = r02;
        f1740b = new s0[]{r02};
    }

    public static s0[] values() {
        return (s0[]) f1740b.clone();
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i10 = 0; i10 < min; i10++) {
            int i11 = (bArr[i10] & 255) - (bArr2[i10] & 255);
            if (i11 != 0) {
                return i11;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
