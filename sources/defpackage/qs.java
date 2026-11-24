package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
public final class qs extends iwe {
    public final byte a;

    public qs(byte b) {
        this.a = b;
    }

    public static u54 c(yw7 yw7Var) {
        String v = yw7Var.v();
        v.getClass();
        String v2 = yw7Var.v();
        v2.getClass();
        return new u54(v, v2, yw7Var.u(), yw7Var.u(), Arrays.copyOfRange(yw7Var.a, yw7Var.b, yw7Var.c));
    }

    @Override
    public final nf7 b(pf7 pf7Var, ByteBuffer byteBuffer) {
        switch (this.a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                ye1 ye1Var = new ye1(byteBuffer.limit(), byteBuffer.array());
                ye1Var.n(12);
                int d = (ye1Var.d() + ye1Var.f(12)) - 4;
                ye1Var.n(44);
                ye1Var.o(ye1Var.f(12));
                ye1Var.n(16);
                ArrayList arrayList = new ArrayList();
                while (ye1Var.d() < d) {
                    ye1Var.n(48);
                    int f = ye1Var.f(8);
                    ye1Var.n(4);
                    int d2 = ye1Var.d() + ye1Var.f(12);
                    String str = null;
                    String str2 = null;
                    while (ye1Var.d() < d2) {
                        int f2 = ye1Var.f(8);
                        int f3 = ye1Var.f(8);
                        int d3 = ye1Var.d() + f3;
                        if (f2 == 2) {
                            int f4 = ye1Var.f(16);
                            ye1Var.n(8);
                            if (f4 == 3) {
                                while (ye1Var.d() < d3) {
                                    int f5 = ye1Var.f(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[f5];
                                    ye1Var.i(f5, bArr);
                                    String str3 = new String(bArr, charset);
                                    int f6 = ye1Var.f(8);
                                    for (int i = 0; i < f6; i++) {
                                        ye1Var.o(ye1Var.f(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (f2 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[f3];
                            ye1Var.i(f3, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        ye1Var.l(d3 << 3);
                    }
                    ye1Var.l(d2 << 3);
                    if (str != null && str2 != null) {
                        arrayList.add(new ps(f, str.concat(str2)));
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new nf7(arrayList);
            default:
                return new nf7(c(new yw7(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}
