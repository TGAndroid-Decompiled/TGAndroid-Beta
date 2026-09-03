package f4;

import e4.c;
import e4.e;
import h5.v;
import h5.w;
import j7.c7;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import r8.d;
public final class b extends c7 {
    public final int f5884a;

    public static g4.a c(w wVar) {
        String p10 = wVar.p();
        p10.getClass();
        String p11 = wVar.p();
        p11.getClass();
        return new g4.a(p10, p11, wVar.o(), wVar.o(), Arrays.copyOfRange(wVar.f6987a, wVar.f6988b, wVar.f6989c));
    }

    @Override
    public final c b(e eVar, ByteBuffer byteBuffer) {
        switch (this.f5884a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                v vVar = new v(byteBuffer.array(), byteBuffer.limit());
                int i10 = 12;
                vVar.s(12);
                int f10 = (vVar.f() + vVar.i(12)) - 4;
                vVar.s(44);
                vVar.t(vVar.i(12));
                vVar.s(16);
                ArrayList arrayList = new ArrayList();
                while (vVar.f() < f10) {
                    vVar.s(48);
                    int i11 = vVar.i(8);
                    vVar.s(4);
                    int f11 = vVar.f() + vVar.i(i10);
                    String str = null;
                    String str2 = null;
                    while (vVar.f() < f11) {
                        int i12 = vVar.i(8);
                        int i13 = vVar.i(8);
                        int f12 = vVar.f() + i13;
                        if (i12 == 2) {
                            int i14 = vVar.i(16);
                            vVar.s(8);
                            if (i14 == 3) {
                                while (vVar.f() < f12) {
                                    int i15 = vVar.i(8);
                                    Charset charset = d.f43411a;
                                    byte[] bArr = new byte[i15];
                                    vVar.k(i15, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i16 = vVar.i(8);
                                    for (int i17 = 0; i17 < i16; i17++) {
                                        vVar.t(vVar.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i12 == 21) {
                            Charset charset2 = d.f43411a;
                            byte[] bArr2 = new byte[i13];
                            vVar.k(i13, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        vVar.p(f12 * 8);
                    }
                    vVar.p(f11 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(i11, str.concat(str2)));
                    }
                    i10 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new c(arrayList);
            default:
                return new c(c(new w(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
