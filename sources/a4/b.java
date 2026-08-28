package a4;

import d5.x;
import d5.y;
import g7.y8;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import n8.d;
import z3.c;
import z3.e;
public final class b extends y8 {
    public final int f48a;

    public static b4.a c(y yVar) {
        String m10 = yVar.m();
        m10.getClass();
        String m11 = yVar.m();
        m11.getClass();
        return new b4.a(m10, m11, yVar.l(), yVar.l(), Arrays.copyOfRange(yVar.f4410a, yVar.f4411b, yVar.f4412c));
    }

    @Override
    public final c b(e eVar, ByteBuffer byteBuffer) {
        switch (this.f48a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                x xVar = new x(byteBuffer.array(), byteBuffer.limit());
                int i9 = 12;
                xVar.s(12);
                int f10 = (xVar.f() + xVar.i(12)) - 4;
                xVar.s(44);
                xVar.t(xVar.i(12));
                xVar.s(16);
                ArrayList arrayList = new ArrayList();
                while (xVar.f() < f10) {
                    xVar.s(48);
                    int i10 = xVar.i(8);
                    xVar.s(4);
                    int f11 = xVar.f() + xVar.i(i9);
                    String str = null;
                    String str2 = null;
                    while (xVar.f() < f11) {
                        int i11 = xVar.i(8);
                        int i12 = xVar.i(8);
                        int f12 = xVar.f() + i12;
                        if (i11 == 2) {
                            int i13 = xVar.i(16);
                            xVar.s(8);
                            if (i13 == 3) {
                                while (xVar.f() < f12) {
                                    int i14 = xVar.i(8);
                                    Charset charset = d.f18511a;
                                    byte[] bArr = new byte[i14];
                                    xVar.k(i14, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i15 = xVar.i(8);
                                    for (int i16 = 0; i16 < i15; i16++) {
                                        xVar.t(xVar.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i11 == 21) {
                            Charset charset2 = d.f18511a;
                            byte[] bArr2 = new byte[i12];
                            xVar.k(i12, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        xVar.p(f12 * 8);
                    }
                    xVar.p(f11 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(i10, str.concat(str2)));
                    }
                    i9 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new c(arrayList);
            default:
                return new c(c(new y(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
