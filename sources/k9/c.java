package k9;

import java.util.Arrays;
public abstract class c {
    public static final byte[] f16911a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i3 = 0; i3 < 10; i3++) {
            bArr[i3 + 48] = (byte) i3;
        }
        for (int i10 = 0; i10 < 26; i10++) {
            byte b10 = (byte) (i10 + 10);
            bArr[i10 + 65] = b10;
            bArr[i10 + 97] = b10;
        }
        f16911a = bArr;
    }
}
