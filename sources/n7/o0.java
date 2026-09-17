package n7;

import java.util.Comparator;
public final class o0 implements Comparator {
    public static final o0 f16697a;
    public static final o0[] f16698b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f16697a = r02;
        f16698b = new o0[]{r02};
    }

    public static o0[] values() {
        return (o0[]) f16698b.clone();
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
