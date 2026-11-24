package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
public final class qr extends fue {
    public final byte a;

    public qr(byte b) {
        this.a = b;
    }

    public static j44 c(xu7 xu7Var) {
        String v = xu7Var.v();
        v.getClass();
        String v2 = xu7Var.v();
        v2.getClass();
        return new j44(v, v2, xu7Var.u(), xu7Var.u(), Arrays.copyOfRange(xu7Var.a, xu7Var.b, xu7Var.c));
    }

    @Override
    public final ld7 b(nd7 nd7Var, ByteBuffer byteBuffer) {
        switch (this.a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                qd1 qd1Var = new qd1(byteBuffer.limit(), byteBuffer.array());
                qd1Var.n(12);
                int d = (qd1Var.d() + qd1Var.f(12)) - 4;
                qd1Var.n(44);
                qd1Var.o(qd1Var.f(12));
                qd1Var.n(16);
                ArrayList arrayList = new ArrayList();
                while (qd1Var.d() < d) {
                    qd1Var.n(48);
                    int f = qd1Var.f(8);
                    qd1Var.n(4);
                    int d2 = qd1Var.d() + qd1Var.f(12);
                    String str = null;
                    String str2 = null;
                    while (qd1Var.d() < d2) {
                        int f2 = qd1Var.f(8);
                        int f3 = qd1Var.f(8);
                        int d3 = qd1Var.d() + f3;
                        if (f2 == 2) {
                            int f4 = qd1Var.f(16);
                            qd1Var.n(8);
                            if (f4 == 3) {
                                while (qd1Var.d() < d3) {
                                    int f5 = qd1Var.f(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[f5];
                                    qd1Var.i(f5, bArr);
                                    String str3 = new String(bArr, charset);
                                    int f6 = qd1Var.f(8);
                                    for (int i = 0; i < f6; i++) {
                                        qd1Var.o(qd1Var.f(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (f2 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[f3];
                            qd1Var.i(f3, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        qd1Var.l(d3 << 3);
                    }
                    qd1Var.l(d2 << 3);
                    if (str != null && str2 != null) {
                        arrayList.add(new pr(f, str.concat(str2)));
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new ld7(arrayList);
            default:
                return new ld7(c(new xu7(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}
