package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
public abstract class iqe {
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
                if (length <= Integer.MAX_VALUE) {
                    return;
                }
                throw ire.a();
            }
            throw ire.b();
        } catch (ire e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static qpe b(Object obj, Object obj2) {
        qpe qpeVar = (qpe) ((rfe) obj);
        mpe mpeVar = (mpe) qpeVar.d(5);
        mpeVar.a(qpeVar);
        rfe rfeVar = (rfe) obj2;
        if (mpeVar.a.getClass().isInstance(rfeVar)) {
            mpeVar.a((qpe) rfeVar);
            return mpeVar.e();
        }
        u36.j("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }
}
