package lc;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
public final class o extends x {
    public static final byte[] e = {0, 0, -1, -1};
    public int f11761c;
    public c5.x d;

    public static byte[] a(byte[] r13) {
        throw new UnsupportedOperationException("Method not decompiled: lc.o.a(byte[]):byte[]");
    }

    public final byte[] b(byte[] bArr) {
        int i10 = this.f11761c;
        if (i10 == 32768 || bArr.length < i10) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Deflater deflater = new Deflater(-1, true);
                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                deflaterOutputStream.write(bArr, 0, bArr.length);
                deflaterOutputStream.close();
                deflater.end();
                return a(byteArrayOutputStream.toByteArray());
            } catch (Exception e7) {
                throw new w(42, sc.e.h("Failed to compress the message: ", e7.getMessage()), e7);
            }
        }
        return bArr;
    }

    public final byte[] c(byte[] bArr) {
        c5.x xVar = new c5.x(bArr.length + 4, 7);
        xVar.o(bArr);
        xVar.o(e);
        if (this.d == null) {
            this.d = new c5.x(0, 7);
        }
        c5.x xVar2 = this.d;
        int i10 = xVar2.f3827b;
        try {
            c.a(xVar, xVar2);
            c5.x xVar3 = this.d;
            byte[] s10 = xVar3.s(i10, xVar3.f3827b);
            c5.x xVar4 = this.d;
            if (((ByteBuffer) xVar4.f3828c).capacity() > 0) {
                int i11 = xVar4.f3827b;
                byte[] s11 = xVar4.s(i11, i11);
                ByteBuffer wrap = ByteBuffer.wrap(s11);
                xVar4.f3828c = wrap;
                wrap.position(s11.length);
                xVar4.f3827b = s11.length;
            }
            return s10;
        } catch (Exception e7) {
            throw new w(43, sc.e.h("Failed to decompress the message: ", e7.getMessage()), e7);
        }
    }
}
