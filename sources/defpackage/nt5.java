package defpackage;
public abstract class nt5 extends yh0 {
    static {
        be6.a(nt5.class);
    }

    public static byte[] d(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i = 0; i < Math.min(4, str.length()); i++) {
                bArr[i] = (byte) str.charAt(i);
            }
        }
        return bArr;
    }
}
