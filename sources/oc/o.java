package oc;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
public final class o extends w {
    public static final byte[] f20986e = {0, 0, -1, -1};
    public int f20987c;
    public e5.u d;

    public static byte[] a(byte[] r13) {
        throw new UnsupportedOperationException("Method not decompiled: oc.o.a(byte[]):byte[]");
    }

    public final byte[] b(byte[] bArr) {
        int i3 = this.f20987c;
        if (i3 == 32768 || bArr.length < i3) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Deflater deflater = new Deflater(-1, true);
                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                deflaterOutputStream.write(bArr, 0, bArr.length);
                deflaterOutputStream.close();
                deflater.end();
                return a(byteArrayOutputStream.toByteArray());
            } catch (Exception e10) {
                throw new v(42, t4.c.f("Failed to compress the message: ", e10.getMessage()), e10);
            }
        }
        return bArr;
    }

    public final byte[] c(byte[] bArr) {
        e5.u uVar = new e5.u(bArr.length + 4, 9);
        uVar.n(bArr);
        uVar.n(f20986e);
        if (this.d == null) {
            this.d = new e5.u(0, 9);
        }
        e5.u uVar2 = this.d;
        int i3 = uVar2.f9633b;
        try {
            c.a(uVar, uVar2);
            e5.u uVar3 = this.d;
            byte[] r5 = uVar3.r(i3, uVar3.f9633b);
            e5.u uVar4 = this.d;
            if (((ByteBuffer) uVar4.f9634c).capacity() > 0) {
                int i10 = uVar4.f9633b;
                byte[] r9 = uVar4.r(i10, i10);
                ByteBuffer wrap = ByteBuffer.wrap(r9);
                uVar4.f9634c = wrap;
                wrap.position(r9.length);
                uVar4.f9633b = r9.length;
            }
            return r5;
        } catch (Exception e10) {
            throw new v(43, t4.c.f("Failed to decompress the message: ", e10.getMessage()), e10);
        }
    }
}
