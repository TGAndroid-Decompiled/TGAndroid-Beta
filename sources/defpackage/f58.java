package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
public final class f58 extends ewc {
    public static final byte[] e = {0, 0, -1, -1};
    public int c;
    public de d;

    public static byte[] a(byte[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f58.a(byte[]):byte[]");
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
                throw new dwc(42, b10.h("Failed to compress the message: ", e2.getMessage()), e2);
            }
        }
        return bArr;
    }

    public final byte[] c(byte[] bArr) {
        de deVar = new de(bArr.length + 4, (byte) 3);
        deVar.m0(bArr);
        deVar.m0(e);
        de deVar2 = this.d;
        if (deVar2 == null) {
            deVar2 = new de(0, (byte) 3);
            this.d = deVar2;
        }
        int i = deVar2.b;
        try {
            ne3.a(deVar, deVar2);
            de deVar3 = this.d;
            byte[] r0 = deVar3.r0(i, deVar3.b);
            de deVar4 = this.d;
            if (((ByteBuffer) deVar4.c).capacity() > 0) {
                int i2 = deVar4.b;
                byte[] r02 = deVar4.r0(i2, i2);
                ByteBuffer wrap = ByteBuffer.wrap(r02);
                deVar4.c = wrap;
                wrap.position(r02.length);
                deVar4.b = r02.length;
            }
            return r0;
        } catch (Exception e2) {
            throw new dwc(43, b10.h("Failed to decompress the message: ", e2.getMessage()), e2);
        }
    }
}
