package defpackage;

import java.util.Comparator;
public final class m8e implements Comparator {
    public static final m8e a;
    public static final m8e[] b;

    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        b = new m8e[]{r0};
    }

    public static m8e[] values() {
        return (m8e[]) b.clone();
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
