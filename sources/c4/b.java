package c4;

import b4.c;
import b4.e;
import f5.v;
import f5.w;
import h7.h5;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import p8.d;
public final class b extends h5 {
    public final int f2949a;

    public static d4.a c(w wVar) {
        String m10 = wVar.m();
        m10.getClass();
        String m11 = wVar.m();
        m11.getClass();
        return new d4.a(m10, m11, wVar.l(), wVar.l(), Arrays.copyOfRange(wVar.f6640a, wVar.f6641b, wVar.f6642c));
    }

    @Override
    public final c b(e eVar, ByteBuffer byteBuffer) {
        switch (this.f2949a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                v vVar = new v(byteBuffer.array(), byteBuffer.limit());
                int i10 = 12;
                vVar.s(12);
                int f9 = (vVar.f() + vVar.i(12)) - 4;
                vVar.s(44);
                vVar.t(vVar.i(12));
                vVar.s(16);
                ArrayList arrayList = new ArrayList();
                while (vVar.f() < f9) {
                    vVar.s(48);
                    int i11 = vVar.i(8);
                    vVar.s(4);
                    int f10 = vVar.f() + vVar.i(i10);
                    String str = null;
                    String str2 = null;
                    while (vVar.f() < f10) {
                        int i12 = vVar.i(8);
                        int i13 = vVar.i(8);
                        int f11 = vVar.f() + i13;
                        if (i12 == 2) {
                            int i14 = vVar.i(16);
                            vVar.s(8);
                            if (i14 == 3) {
                                while (vVar.f() < f11) {
                                    int i15 = vVar.i(8);
                                    Charset charset = d.f45656a;
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
                            Charset charset2 = d.f45656a;
                            byte[] bArr2 = new byte[i13];
                            vVar.k(i13, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        vVar.p(f11 * 8);
                    }
                    vVar.p(f10 * 8);
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
