package m3;

import a4.h;
import b2.p0;
import e2.v;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import w7.l;
public final class b extends l {
    public final int f13286a;

    public static n3.a c(v vVar) {
        String s10 = vVar.s();
        s10.getClass();
        String s11 = vVar.s();
        s11.getClass();
        return new n3.a(s10, s11, vVar.r(), vVar.r(), Arrays.copyOfRange(vVar.f7234a, vVar.f7235b, vVar.f7236c));
    }

    @Override
    public final p0 b(l3.a aVar, ByteBuffer byteBuffer) {
        switch (this.f13286a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                h hVar = new h(byteBuffer.array(), byteBuffer.limit());
                int i10 = 12;
                hVar.t(12);
                int f7 = (hVar.f() + hVar.i(12)) - 4;
                hVar.t(44);
                hVar.u(hVar.i(12));
                hVar.t(16);
                ArrayList arrayList = new ArrayList();
                while (hVar.f() < f7) {
                    hVar.t(48);
                    int i11 = hVar.i(8);
                    hVar.t(4);
                    int f10 = hVar.f() + hVar.i(i10);
                    String str = null;
                    String str2 = null;
                    while (hVar.f() < f10) {
                        int i12 = hVar.i(8);
                        int i13 = hVar.i(8);
                        int f11 = hVar.f() + i13;
                        if (i12 == 2) {
                            int i14 = hVar.i(16);
                            hVar.t(8);
                            if (i14 == 3) {
                                while (hVar.f() < f11) {
                                    int i15 = hVar.i(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[i15];
                                    hVar.l(i15, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i16 = hVar.i(8);
                                    for (int i17 = 0; i17 < i16; i17++) {
                                        hVar.u(hVar.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i12 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[i13];
                            hVar.l(i13, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        hVar.q(f11 * 8);
                    }
                    hVar.q(f10 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(i11, str.concat(str2)));
                    }
                    i10 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new p0(arrayList);
            default:
                return new p0(c(new v(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
