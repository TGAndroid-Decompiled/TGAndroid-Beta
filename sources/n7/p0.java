package n7;

import java.util.Comparator;
public final class p0 implements Comparator {
    public static final p0 f17304a;
    public static final p0[] f17305b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f17304a = r02;
        f17305b = new p0[]{r02};
    }

    public static p0[] values() {
        return (p0[]) f17305b.clone();
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
