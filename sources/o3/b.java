package o3;

import b8.te;
import c4.f;
import d2.s0;
import g2.y;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
public final class b extends te {
    public final int f20574a;

    public static p3.a c(y yVar) {
        String v = yVar.v();
        v.getClass();
        String v10 = yVar.v();
        v10.getClass();
        return new p3.a(v, v10, yVar.u(), yVar.u(), Arrays.copyOfRange(yVar.f11923a, yVar.f11924b, yVar.f11925c));
    }

    @Override
    public final s0 b(n3.a aVar, ByteBuffer byteBuffer) {
        switch (this.f20574a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                f fVar = new f(byteBuffer.array(), byteBuffer.limit());
                int i3 = 12;
                fVar.L(12);
                int d = (fVar.d() + fVar.j(12)) - 4;
                fVar.L(44);
                fVar.M(fVar.j(12));
                fVar.L(16);
                ArrayList arrayList = new ArrayList();
                while (fVar.d() < d) {
                    fVar.L(48);
                    int j10 = fVar.j(8);
                    fVar.L(4);
                    int d10 = fVar.d() + fVar.j(i3);
                    String str = null;
                    String str2 = null;
                    while (fVar.d() < d10) {
                        int j11 = fVar.j(8);
                        int j12 = fVar.j(8);
                        int d11 = fVar.d() + j12;
                        if (j11 == 2) {
                            int j13 = fVar.j(16);
                            fVar.L(8);
                            if (j13 == 3) {
                                while (fVar.d() < d11) {
                                    int j14 = fVar.j(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[j14];
                                    fVar.o(j14, bArr);
                                    String str3 = new String(bArr, charset);
                                    int j15 = fVar.j(8);
                                    for (int i10 = 0; i10 < j15; i10++) {
                                        fVar.M(fVar.j(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (j11 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[j12];
                            fVar.o(j12, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        fVar.J(d11 * 8);
                    }
                    fVar.J(d10 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(j10, str.concat(str2)));
                    }
                    i3 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new s0(arrayList);
            default:
                return new s0(c(new y(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
