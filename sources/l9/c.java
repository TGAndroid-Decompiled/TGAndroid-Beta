package l9;

import java.util.Arrays;
public abstract class c {
    public static final byte[] f18206a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i7 = 0; i7 < 10; i7++) {
            bArr[i7 + 48] = (byte) i7;
        }
        for (int i10 = 0; i10 < 26; i10++) {
            byte b10 = (byte) (i10 + 10);
            bArr[i10 + 65] = b10;
            bArr[i10 + 97] = b10;
        }
        f18206a = bArr;
    }
}
