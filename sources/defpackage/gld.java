package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
public abstract class gld {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length >= 0) {
                if ((0 - 0) + length <= Integer.MAX_VALUE) {
                    return;
                }
                throw xmd.a();
            }
            throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } catch (xmd e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static xkd a(Object obj, Object obj2) {
        xkd xkdVar = (xkd) ((ibd) obj);
        vkd vkdVar = (vkd) xkdVar.a(5);
        vkdVar.a(xkdVar);
        ibd ibdVar = (ibd) obj2;
        if (vkdVar.a.getClass().isInstance(ibdVar)) {
            vkdVar.a((xkd) ibdVar);
            return vkdVar.c();
        }
        u36.j("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
