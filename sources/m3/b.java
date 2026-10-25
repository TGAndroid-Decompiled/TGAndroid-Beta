package m3;

import a4.g;
import a8.wd;
import b2.u0;
import e2.x;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
public final class b extends wd {
    public final int f17993a;

    public static n3.a c(x xVar) {
        String v = xVar.v();
        v.getClass();
        String v10 = xVar.v();
        v10.getClass();
        return new n3.a(v, v10, xVar.u(), xVar.u(), Arrays.copyOfRange(xVar.f9732a, xVar.f9733b, xVar.f9734c));
    }

    @Override
    public final u0 b(l3.a aVar, ByteBuffer byteBuffer) {
        switch (this.f17993a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                g gVar = new g(byteBuffer.array(), byteBuffer.limit());
                int i10 = 12;
                gVar.o(12);
                int d = (gVar.d() + gVar.g(12)) - 4;
                gVar.o(44);
                gVar.p(gVar.g(12));
                gVar.o(16);
                ArrayList arrayList = new ArrayList();
                while (gVar.d() < d) {
                    gVar.o(48);
                    int g7 = gVar.g(8);
                    gVar.o(4);
                    int d10 = gVar.d() + gVar.g(i10);
                    String str = null;
                    String str2 = null;
                    while (gVar.d() < d10) {
                        int g10 = gVar.g(8);
                        int g11 = gVar.g(8);
                        int d11 = gVar.d() + g11;
                        if (g10 == 2) {
                            int g12 = gVar.g(16);
                            gVar.o(8);
                            if (g12 == 3) {
                                while (gVar.d() < d11) {
                                    int g13 = gVar.g(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[g13];
                                    gVar.j(g13, bArr);
                                    String str3 = new String(bArr, charset);
                                    int g14 = gVar.g(8);
                                    for (int i11 = 0; i11 < g14; i11++) {
                                        gVar.p(gVar.g(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (g10 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[g11];
                            gVar.j(g11, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        gVar.m(d11 * 8);
                    }
                    gVar.m(d10 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(g7, str.concat(str2)));
                    }
                    i10 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new u0(arrayList);
            default:
                return new u0(c(new x(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
