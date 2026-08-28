package e4;

import d5.f0;
import d5.x;
import d5.y;
import g7.b0;
import g7.y8;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import o8.l0;
import o8.w;
import o8.z;
public final class i extends y8 {
    public static final a9.b f4848b = new a9.b(20);
    public final g f4849a;

    public i(g gVar) {
        this.f4849a = gVar;
    }

    public static a d(y yVar, int i9, int i10) {
        int q10;
        String str;
        byte[] copyOfRange;
        int r10 = yVar.r();
        Charset n10 = n(r10);
        int i11 = i9 - 1;
        byte[] bArr = new byte[i11];
        yVar.c(0, i11, bArr);
        if (i10 == 2) {
            str = "image/" + b0.b(new String(bArr, 0, 3, n8.d.f18512b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            q10 = 2;
        } else {
            q10 = q(0, bArr);
            String b10 = b0.b(new String(bArr, 0, q10, n8.d.f18512b));
            if (b10.indexOf(47) == -1) {
                str = "image/".concat(b10);
            } else {
                str = b10;
            }
        }
        int i12 = bArr[q10 + 1] & 255;
        int i13 = q10 + 2;
        int p6 = p(i13, r10, bArr);
        String str2 = new String(bArr, i13, p6 - i13, n10);
        int m10 = m(r10) + p6;
        if (i11 <= m10) {
            copyOfRange = f0.f4353f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, m10, i11);
        }
        return new a(i12, str, str2, copyOfRange);
    }

    public static c e(y yVar, int i9, int i10, boolean z10, int i11, g gVar) {
        long j10;
        int i12 = yVar.f4411b;
        int q10 = q(i12, yVar.f4410a);
        String str = new String(yVar.f4410a, i12, q10 - i12, n8.d.f18512b);
        yVar.C(q10 + 1);
        int e10 = yVar.e();
        int e11 = yVar.e();
        long s10 = yVar.s();
        if (s10 == 4294967295L) {
            s10 = -1;
        }
        long s11 = yVar.s();
        if (s11 == 4294967295L) {
            j10 = -1;
        } else {
            j10 = s11;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = i12 + i9;
        while (yVar.f4411b < i13) {
            j h = h(i10, yVar, z10, i11, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new c(str, e10, e11, s10, j10, (j[]) arrayList.toArray(new j[0]));
    }

    public static d f(y yVar, int i9, int i10, boolean z10, int i11, g gVar) {
        boolean z11;
        boolean z12;
        int i12 = yVar.f4411b;
        int q10 = q(i12, yVar.f4410a);
        String str = new String(yVar.f4410a, i12, q10 - i12, n8.d.f18512b);
        yVar.C(q10 + 1);
        int r10 = yVar.r();
        if ((r10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((r10 & 1) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        int r11 = yVar.r();
        String[] strArr = new String[r11];
        for (int i13 = 0; i13 < r11; i13++) {
            int i14 = yVar.f4411b;
            int q11 = q(i14, yVar.f4410a);
            strArr[i13] = new String(yVar.f4410a, i14, q11 - i14, n8.d.f18512b);
            yVar.C(q11 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = i12 + i9;
        while (yVar.f4411b < i15) {
            j h = h(i10, yVar, z10, i11, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new d(str, z11, z12, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e g(int i9, y yVar) {
        if (i9 < 4) {
            return null;
        }
        int r10 = yVar.r();
        Charset n10 = n(r10);
        byte[] bArr = new byte[3];
        yVar.c(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i10 = i9 - 4;
        byte[] bArr2 = new byte[i10];
        yVar.c(0, i10, bArr2);
        int p6 = p(0, r10, bArr2);
        String str2 = new String(bArr2, 0, p6, n10);
        int m10 = m(r10) + p6;
        return new e(str, str2, k(bArr2, m10, p(m10, r10, bArr2), n10));
    }

    public static e4.j h(int r20, d5.y r21, boolean r22, int r23, e4.g r24) {
        throw new UnsupportedOperationException("Method not decompiled: e4.i.h(int, d5.y, boolean, int, e4.g):e4.j");
    }

    public static f i(int i9, y yVar) {
        byte[] copyOfRange;
        int r10 = yVar.r();
        Charset n10 = n(r10);
        int i10 = i9 - 1;
        byte[] bArr = new byte[i10];
        yVar.c(0, i10, bArr);
        int q10 = q(0, bArr);
        String str = new String(bArr, 0, q10, n8.d.f18512b);
        int i11 = q10 + 1;
        int p6 = p(i11, r10, bArr);
        String k10 = k(bArr, i11, p6, n10);
        int m10 = m(r10) + p6;
        int p9 = p(m10, r10, bArr);
        String k11 = k(bArr, m10, p9, n10);
        int m11 = m(r10) + p9;
        if (i10 <= m11) {
            copyOfRange = f0.f4353f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, m11, i10);
        }
        return new f(str, copyOfRange, k10, k11);
    }

    public static l j(int i9, y yVar) {
        int w8 = yVar.w();
        int t10 = yVar.t();
        int t11 = yVar.t();
        int r10 = yVar.r();
        int r11 = yVar.r();
        x xVar = new x();
        xVar.o(yVar);
        int i10 = ((i9 - 10) * 8) / (r10 + r11);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = xVar.i(r10);
            int i13 = xVar.i(r11);
            iArr[i11] = i12;
            iArr2[i11] = i13;
        }
        return new l(w8, t10, t11, iArr, iArr2);
    }

    public static String k(byte[] bArr, int i9, int i10, Charset charset) {
        if (i10 > i9 && i10 <= bArr.length) {
            return new String(bArr, i9, i10 - i9, charset);
        }
        return "";
    }

    public static l0 l(int i9, int i10, byte[] bArr) {
        if (i10 >= bArr.length) {
            return z.y("");
        }
        o8.x xVar = z.f19105b;
        o8.l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int p6 = p(i10, i9, bArr);
        int i11 = 0;
        while (i10 < p6) {
            String str = new String(bArr, i10, p6 - i10, n(i9));
            int i12 = i11 + 1;
            if (objArr.length < i12) {
                objArr = Arrays.copyOf(objArr, w.d(objArr.length, i12));
            }
            objArr[i11] = str;
            int m10 = p6 + m(i9);
            i11 = i12;
            i10 = m10;
            p6 = p(m10, i9, bArr);
        }
        l0 s10 = z.s(i11, objArr);
        if (s10.isEmpty()) {
            return z.y("");
        }
        return s10;
    }

    public static int m(int i9) {
        if (i9 != 0 && i9 != 3) {
            return 2;
        }
        return 1;
    }

    public static Charset n(int i9) {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    return n8.d.f18512b;
                }
                return n8.d.f18513c;
            }
            return n8.d.d;
        }
        return n8.d.f18515f;
    }

    public static String o(int i9, int i10, int i11, int i12, int i13) {
        if (i9 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static int p(int i9, int i10, byte[] bArr) {
        int q10 = q(i9, bArr);
        if (i10 != 0 && i10 != 3) {
            while (q10 < bArr.length - 1) {
                if ((q10 - i9) % 2 == 0 && bArr[q10 + 1] == 0) {
                    return q10;
                }
                q10 = q(q10 + 1, bArr);
            }
            return bArr.length;
        }
        return q10;
    }

    public static int q(int i9, byte[] bArr) {
        while (i9 < bArr.length) {
            if (bArr[i9] == 0) {
                return i9;
            }
            i9++;
        }
        return bArr.length;
    }

    public static int r(int i9, y yVar) {
        byte[] bArr = yVar.f4410a;
        int i10 = yVar.f4411b;
        int i11 = i10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 < i10 + i9) {
                if ((bArr[i11] & 255) == 255 && bArr[i12] == 0) {
                    System.arraycopy(bArr, i11 + 2, bArr, i12, (i9 - (i11 - i10)) - 2);
                    i9--;
                }
                i11 = i12;
            } else {
                return i9;
            }
        }
    }

    public static boolean s(d5.y r18, int r19, int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: e4.i.s(d5.y, int, int, boolean):boolean");
    }

    @Override
    public final z3.c b(z3.e eVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    public final z3.c c(int r13, byte[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: e4.i.c(int, byte[]):z3.c");
    }
}
