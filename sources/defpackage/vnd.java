package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
public abstract class vnd {
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
                throw mpd.a();
            }
            throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } catch (mpd e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static mnd a(Object obj, Object obj2) {
        mnd mndVar = (mnd) ((zdd) obj);
        knd kndVar = (knd) mndVar.a(5);
        kndVar.a(mndVar);
        zdd zddVar = (zdd) obj2;
        if (kndVar.a.getClass().isInstance(zddVar)) {
            kndVar.a((mnd) zddVar);
            return kndVar.c();
        }
        lq5.j("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
