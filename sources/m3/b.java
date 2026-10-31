package m3;

import a4.g;
import b2.u0;
import e2.x;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import w7.l;
public final class b extends l {
    public final int f12687a;

    public static n3.a c(x xVar) {
        String v = xVar.v();
        v.getClass();
        String v10 = xVar.v();
        v10.getClass();
        return new n3.a(v, v10, xVar.u(), xVar.u(), Arrays.copyOfRange(xVar.f6207a, xVar.f6208b, xVar.f6209c));
    }

    @Override
    public final u0 b(l3.a aVar, ByteBuffer byteBuffer) {
        switch (this.f12687a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                g gVar = new g(byteBuffer.array(), byteBuffer.limit());
                int i10 = 12;
                gVar.f0(12);
                int d = (gVar.d() + gVar.i(12)) - 4;
                gVar.f0(44);
                gVar.g0(gVar.i(12));
                gVar.f0(16);
                ArrayList arrayList = new ArrayList();
                while (gVar.d() < d) {
                    gVar.f0(48);
                    int i11 = gVar.i(8);
                    gVar.f0(4);
                    int d10 = gVar.d() + gVar.i(i10);
                    String str = null;
                    String str2 = null;
                    while (gVar.d() < d10) {
                        int i12 = gVar.i(8);
                        int i13 = gVar.i(8);
                        int d11 = gVar.d() + i13;
                        if (i12 == 2) {
                            int i14 = gVar.i(16);
                            gVar.f0(8);
                            if (i14 == 3) {
                                while (gVar.d() < d11) {
                                    int i15 = gVar.i(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[i15];
                                    gVar.o(i15, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i16 = gVar.i(8);
                                    for (int i17 = 0; i17 < i16; i17++) {
                                        gVar.g0(gVar.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i12 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[i13];
                            gVar.o(i13, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        gVar.d0(d11 * 8);
                    }
                    gVar.d0(d10 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(i11, str.concat(str2)));
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
