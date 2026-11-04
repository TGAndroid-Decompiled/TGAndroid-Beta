package g5;

import com.googlecode.mp4parser.e;
public abstract class c extends e {
    static {
        mc.c.a(c.class);
    }

    public static byte[] d(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i3 = 0; i3 < Math.min(4, str.length()); i3++) {
                bArr[i3] = (byte) str.charAt(i3);
            }
        }
        return bArr;
    }
}
