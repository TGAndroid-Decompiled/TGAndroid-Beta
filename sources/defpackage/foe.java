package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
public abstract class foe {
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
                throw fpe.a();
            }
            throw fpe.b();
        } catch (fpe e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static nne b(Object obj, Object obj2) {
        nne nneVar = (nne) ((qde) obj);
        jne jneVar = (jne) nneVar.d(5);
        jneVar.a(nneVar);
        qde qdeVar = (qde) obj2;
        if (jneVar.a.getClass().isInstance(qdeVar)) {
            jneVar.a((nne) qdeVar);
            return jneVar.e();
        }
        w26.j("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }
}
