package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
public abstract class zce {
    public static final byte[] a;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        a = bArr;
        ByteBuffer.wrap(bArr);
    }
}
