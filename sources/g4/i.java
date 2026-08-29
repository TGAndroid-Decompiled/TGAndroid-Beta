package g4;

import f5.d0;
import f5.v;
import f5.w;
import h7.h5;
import i7.n6;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import q8.l0;
import q8.x;
import q8.z;
public final class i extends h5 {
    public static final eg.c f7004b = new eg.c(12);
    public final g f7005a;

    public i(g gVar) {
        this.f7005a = gVar;
    }

    public static a d(w wVar, int i10, int i11) {
        int q6;
        String str;
        byte[] copyOfRange;
        int r6 = wVar.r();
        Charset n10 = n(r6);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        wVar.c(0, i12, bArr);
        if (i11 == 2) {
            str = "image/" + n6.b(new String(bArr, 0, 3, p8.d.f45657b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            q6 = 2;
        } else {
            q6 = q(0, bArr);
            String b10 = n6.b(new String(bArr, 0, q6, p8.d.f45657b));
            if (b10.indexOf(47) == -1) {
                str = "image/".concat(b10);
            } else {
                str = b10;
            }
        }
        int i13 = bArr[q6 + 1] & 255;
        int i14 = q6 + 2;
        int p10 = p(i14, r6, bArr);
        String str2 = new String(bArr, i14, p10 - i14, n10);
        int m10 = m(r6) + p10;
        if (i12 <= m10) {
            copyOfRange = d0.f6583f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, m10, i12);
        }
        return new a(i13, str, str2, copyOfRange);
    }

    public static c e(w wVar, int i10, int i11, boolean z10, int i12, g gVar) {
        long j10;
        int i13 = wVar.f6641b;
        int q6 = q(i13, wVar.f6640a);
        String str = new String(wVar.f6640a, i13, q6 - i13, p8.d.f45657b);
        wVar.C(q6 + 1);
        int e10 = wVar.e();
        int e11 = wVar.e();
        long s10 = wVar.s();
        if (s10 == 4294967295L) {
            s10 = -1;
        }
        long s11 = wVar.s();
        if (s11 == 4294967295L) {
            j10 = -1;
        } else {
            j10 = s11;
        }
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (wVar.f6641b < i14) {
            j h = h(i11, wVar, z10, i12, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new c(str, e10, e11, s10, j10, (j[]) arrayList.toArray(new j[0]));
    }

    public static d f(w wVar, int i10, int i11, boolean z10, int i12, g gVar) {
        boolean z11;
        boolean z12;
        int i13 = wVar.f6641b;
        int q6 = q(i13, wVar.f6640a);
        String str = new String(wVar.f6640a, i13, q6 - i13, p8.d.f45657b);
        wVar.C(q6 + 1);
        int r6 = wVar.r();
        if ((r6 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((r6 & 1) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        int r9 = wVar.r();
        String[] strArr = new String[r9];
        for (int i14 = 0; i14 < r9; i14++) {
            int i15 = wVar.f6641b;
            int q9 = q(i15, wVar.f6640a);
            strArr[i14] = new String(wVar.f6640a, i15, q9 - i15, p8.d.f45657b);
            wVar.C(q9 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (wVar.f6641b < i16) {
            j h = h(i11, wVar, z10, i12, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new d(str, z11, z12, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e g(int i10, w wVar) {
        if (i10 < 4) {
            return null;
        }
        int r6 = wVar.r();
        Charset n10 = n(r6);
        byte[] bArr = new byte[3];
        wVar.c(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        wVar.c(0, i11, bArr2);
        int p10 = p(0, r6, bArr2);
        String str2 = new String(bArr2, 0, p10, n10);
        int m10 = m(r6) + p10;
        return new e(str, str2, k(bArr2, m10, p(m10, r6, bArr2), n10));
    }

    public static g4.j h(int r20, f5.w r21, boolean r22, int r23, g4.g r24) {
        throw new UnsupportedOperationException("Method not decompiled: g4.i.h(int, f5.w, boolean, int, g4.g):g4.j");
    }

    public static f i(int i10, w wVar) {
        byte[] copyOfRange;
        int r6 = wVar.r();
        Charset n10 = n(r6);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        wVar.c(0, i11, bArr);
        int q6 = q(0, bArr);
        String str = new String(bArr, 0, q6, p8.d.f45657b);
        int i12 = q6 + 1;
        int p10 = p(i12, r6, bArr);
        String k9 = k(bArr, i12, p10, n10);
        int m10 = m(r6) + p10;
        int p11 = p(m10, r6, bArr);
        String k10 = k(bArr, m10, p11, n10);
        int m11 = m(r6) + p11;
        if (i11 <= m11) {
            copyOfRange = d0.f6583f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, m11, i11);
        }
        return new f(str, copyOfRange, k9, k10);
    }

    public static l j(int i10, w wVar) {
        int w10 = wVar.w();
        int t10 = wVar.t();
        int t11 = wVar.t();
        int r6 = wVar.r();
        int r9 = wVar.r();
        v vVar = new v();
        vVar.o(wVar);
        int i11 = ((i10 - 10) * 8) / (r6 + r9);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = vVar.i(r6);
            int i14 = vVar.i(r9);
            iArr[i12] = i13;
            iArr2[i12] = i14;
        }
        return new l(w10, t10, t11, iArr, iArr2);
    }

    public static String k(byte[] bArr, int i10, int i11, Charset charset) {
        if (i11 > i10 && i11 <= bArr.length) {
            return new String(bArr, i10, i11 - i10, charset);
        }
        return "";
    }

    public static l0 l(int i10, int i11, byte[] bArr) {
        if (i11 >= bArr.length) {
            return z.y("");
        }
        x xVar = z.f46511b;
        q8.l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int p10 = p(i11, i10, bArr);
        int i12 = 0;
        while (i11 < p10) {
            String str = new String(bArr, i11, p10 - i11, n(i10));
            int i13 = i12 + 1;
            if (objArr.length < i13) {
                objArr = Arrays.copyOf(objArr, q8.w.d(objArr.length, i13));
            }
            objArr[i12] = str;
            int m10 = p10 + m(i10);
            i12 = i13;
            i11 = m10;
            p10 = p(m10, i10, bArr);
        }
        l0 s10 = z.s(i12, objArr);
        if (s10.isEmpty()) {
            return z.y("");
        }
        return s10;
    }

    public static int m(int i10) {
        if (i10 != 0 && i10 != 3) {
            return 2;
        }
        return 1;
    }

    public static Charset n(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return p8.d.f45657b;
                }
                return p8.d.f45658c;
            }
            return p8.d.d;
        }
        return p8.d.f45660f;
    }

    public static String o(int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int p(int i10, int i11, byte[] bArr) {
        int q6 = q(i10, bArr);
        if (i11 != 0 && i11 != 3) {
            while (q6 < bArr.length - 1) {
                if ((q6 - i10) % 2 == 0 && bArr[q6 + 1] == 0) {
                    return q6;
                }
                q6 = q(q6 + 1, bArr);
            }
            return bArr.length;
        }
        return q6;
    }

    public static int q(int i10, byte[] bArr) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static int r(int i10, w wVar) {
        byte[] bArr = wVar.f6640a;
        int i11 = wVar.f6641b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 < i11 + i10) {
                if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                    System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                    i10--;
                }
                i12 = i13;
            } else {
                return i10;
            }
        }
    }

    public static boolean s(f5.w r18, int r19, int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: g4.i.s(f5.w, int, int, boolean):boolean");
    }

    @Override
    public final b4.c b(b4.e eVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    public final b4.c c(int r13, byte[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: g4.i.c(int, byte[]):b4.c");
    }
}
