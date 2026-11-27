package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
public final class t68 extends tyc {
    public static final byte[] e = {0, 0, -1, -1};
    public int c;
    public ed d;

    public static byte[] a(byte[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t68.a(byte[]):byte[]");
    }

    public final byte[] b(byte[] bArr) {
        int i = this.c;
        if (i == 32768 || bArr.length < i) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Deflater deflater = new Deflater(-1, true);
                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                deflaterOutputStream.write(bArr, 0, bArr.length);
                deflaterOutputStream.close();
                deflater.end();
                return a(byteArrayOutputStream.toByteArray());
            } catch (Exception e2) {
                throw new syc(42, c00.i("Failed to compress the message: ", e2.getMessage()), e2);
            }
        }
        return bArr;
    }

    public final byte[] c(byte[] bArr) {
        ed edVar = new ed(bArr.length + 4, (byte) 3);
        edVar.n0(bArr);
        edVar.n0(e);
        ed edVar2 = this.d;
        if (edVar2 == null) {
            edVar2 = new ed(0, (byte) 3);
            this.d = edVar2;
        }
        int i = edVar2.b;
        try {
            td3.a(edVar, edVar2);
            ed edVar3 = this.d;
            byte[] t0 = edVar3.t0(i, edVar3.b);
            ed edVar4 = this.d;
            if (((ByteBuffer) edVar4.c).capacity() > 0) {
                int i2 = edVar4.b;
                byte[] t02 = edVar4.t0(i2, i2);
                ByteBuffer wrap = ByteBuffer.wrap(t02);
                edVar4.c = wrap;
                wrap.position(t02.length);
                edVar4.b = t02.length;
            }
            return t0;
        } catch (Exception e2) {
            throw new syc(43, c00.i("Failed to decompress the message: ", e2.getMessage()), e2);
        }
    }
}
