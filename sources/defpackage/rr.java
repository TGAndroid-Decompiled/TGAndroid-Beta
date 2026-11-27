package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
public final class rr extends yye {
    public final byte a;

    public rr(byte b) {
        this.a = b;
    }

    public static f54 c(ey7 ey7Var) {
        String v = ey7Var.v();
        v.getClass();
        String v2 = ey7Var.v();
        v2.getClass();
        return new f54(v, v2, ey7Var.u(), ey7Var.u(), Arrays.copyOfRange(ey7Var.a, ey7Var.b, ey7Var.c));
    }

    @Override
    public final uf7 b(wf7 wf7Var, ByteBuffer byteBuffer) {
        switch (this.a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                zd1 zd1Var = new zd1(byteBuffer.limit(), byteBuffer.array());
                zd1Var.n(12);
                int d = (zd1Var.d() + zd1Var.f(12)) - 4;
                zd1Var.n(44);
                zd1Var.o(zd1Var.f(12));
                zd1Var.n(16);
                ArrayList arrayList = new ArrayList();
                while (zd1Var.d() < d) {
                    zd1Var.n(48);
                    int f = zd1Var.f(8);
                    zd1Var.n(4);
                    int d2 = zd1Var.d() + zd1Var.f(12);
                    String str = null;
                    String str2 = null;
                    while (zd1Var.d() < d2) {
                        int f2 = zd1Var.f(8);
                        int f3 = zd1Var.f(8);
                        int d3 = zd1Var.d() + f3;
                        if (f2 == 2) {
                            int f4 = zd1Var.f(16);
                            zd1Var.n(8);
                            if (f4 == 3) {
                                while (zd1Var.d() < d3) {
                                    int f5 = zd1Var.f(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[f5];
                                    zd1Var.i(f5, bArr);
                                    String str3 = new String(bArr, charset);
                                    int f6 = zd1Var.f(8);
                                    for (int i = 0; i < f6; i++) {
                                        zd1Var.o(zd1Var.f(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (f2 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[f3];
                            zd1Var.i(f3, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        zd1Var.l(d3 << 3);
                    }
                    zd1Var.l(d2 << 3);
                    if (str != null && str2 != null) {
                        arrayList.add(new qr(f, str.concat(str2)));
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new uf7(arrayList);
            default:
                return new uf7(c(new ey7(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}
