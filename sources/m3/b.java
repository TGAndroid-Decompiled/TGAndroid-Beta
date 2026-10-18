package m3;

import a4.g;
import b2.t0;
import e2.x;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import w7.m;
public final class b extends m {
    public final int f16472a;

    public static n3.a c(x xVar) {
        String v = xVar.v();
        v.getClass();
        String v10 = xVar.v();
        v10.getClass();
        return new n3.a(v, v10, xVar.u(), xVar.u(), Arrays.copyOfRange(xVar.f8292a, xVar.f8293b, xVar.f8294c));
    }

    @Override
    public final t0 b(l3.a aVar, ByteBuffer byteBuffer) {
        switch (this.f16472a) {
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
                    int g10 = gVar.g(8);
                    gVar.o(4);
                    int d10 = gVar.d() + gVar.g(i10);
                    String str = null;
                    String str2 = null;
                    while (gVar.d() < d10) {
                        int g11 = gVar.g(8);
                        int g12 = gVar.g(8);
                        int d11 = gVar.d() + g12;
                        if (g11 == 2) {
                            int g13 = gVar.g(16);
                            gVar.o(8);
                            if (g13 == 3) {
                                while (gVar.d() < d11) {
                                    int g14 = gVar.g(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[g14];
                                    gVar.j(g14, bArr);
                                    String str3 = new String(bArr, charset);
                                    int g15 = gVar.g(8);
                                    for (int i11 = 0; i11 < g15; i11++) {
                                        gVar.p(gVar.g(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (g11 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[g12];
                            gVar.j(g12, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        gVar.m(d11 * 8);
                    }
                    gVar.m(d10 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(g10, str.concat(str2)));
                    }
                    i10 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new t0(arrayList);
            default:
                return new t0(c(new x(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
