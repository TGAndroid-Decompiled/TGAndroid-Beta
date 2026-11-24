package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
public final class d38 extends duc {
    public static final byte[] e = {0, 0, -1, -1};
    public int c;
    public dd d;

    public static byte[] a(byte[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d38.a(byte[]):byte[]");
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
                throw new cuc(42, b00.h("Failed to compress the message: ", e2.getMessage()), e2);
            }
        }
        return bArr;
    }

    public final byte[] c(byte[] bArr) {
        dd ddVar = new dd(bArr.length + 4, (byte) 3);
        ddVar.l0(bArr);
        ddVar.l0(e);
        dd ddVar2 = this.d;
        if (ddVar2 == null) {
            ddVar2 = new dd(0, (byte) 3);
            this.d = ddVar2;
        }
        int i = ddVar2.b;
        try {
            bd3.a(ddVar, ddVar2);
            dd ddVar3 = this.d;
            byte[] q0 = ddVar3.q0(i, ddVar3.b);
            dd ddVar4 = this.d;
            if (((ByteBuffer) ddVar4.c).capacity() > 0) {
                int i2 = ddVar4.b;
                byte[] q02 = ddVar4.q0(i2, i2);
                ByteBuffer wrap = ByteBuffer.wrap(q02);
                ddVar4.c = wrap;
                wrap.position(q02.length);
                ddVar4.b = q02.length;
            }
            return q0;
        } catch (Exception e2) {
            throw new cuc(43, b00.h("Failed to decompress the message: ", e2.getMessage()), e2);
        }
    }
}
