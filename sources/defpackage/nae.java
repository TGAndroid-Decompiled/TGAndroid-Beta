package defpackage;

import java.util.Comparator;
public final class nae implements Comparator {
    public static final nae a;
    public static final nae[] b;

    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        b = new nae[]{r0};
    }

    public static nae[] values() {
        return (nae[]) b.clone();
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
