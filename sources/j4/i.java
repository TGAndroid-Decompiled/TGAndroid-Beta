package j4;

import h5.d0;
import h5.v;
import h5.w;
import j3.q0;
import j7.d7;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import k7.a7;
import s8.i0;
import s8.t;
public final class i extends d7 {
    public static final q0 f9527b = new q0(16);
    public final g f9528a;

    public i(g gVar) {
        this.f9528a = gVar;
    }

    public static a d(w wVar, int i10, int i11) {
        int q10;
        String str;
        byte[] copyOfRange;
        int u10 = wVar.u();
        Charset n10 = n(u10);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        wVar.e(0, i12, bArr);
        if (i11 == 2) {
            str = "image/" + a7.b(new String(bArr, 0, 3, r8.d.f46768b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            q10 = 2;
        } else {
            q10 = q(0, bArr);
            String b10 = a7.b(new String(bArr, 0, q10, r8.d.f46768b));
            if (b10.indexOf(47) == -1) {
                str = "image/".concat(b10);
            } else {
                str = b10;
            }
        }
        int i13 = bArr[q10 + 1] & 255;
        int i14 = q10 + 2;
        int p10 = p(i14, u10, bArr);
        String str2 = new String(bArr, i14, p10 - i14, n10);
        int m9 = m(u10) + p10;
        if (i12 <= m9) {
            copyOfRange = d0.f7241f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, m9, i12);
        }
        return new a(i13, str, str2, copyOfRange);
    }

    public static c e(w wVar, int i10, int i11, boolean z4, int i12, g gVar) {
        long j10;
        int i13 = wVar.f7309b;
        int q10 = q(i13, wVar.f7308a);
        String str = new String(wVar.f7308a, i13, q10 - i13, r8.d.f46768b);
        wVar.F(q10 + 1);
        int g10 = wVar.g();
        int g11 = wVar.g();
        long v = wVar.v();
        if (v == 4294967295L) {
            v = -1;
        }
        long v10 = wVar.v();
        if (v10 == 4294967295L) {
            j10 = -1;
        } else {
            j10 = v10;
        }
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (wVar.f7309b < i14) {
            j h = h(i11, wVar, z4, i12, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new c(str, g10, g11, v, j10, (j[]) arrayList.toArray(new j[0]));
    }

    public static d f(w wVar, int i10, int i11, boolean z4, int i12, g gVar) {
        boolean z10;
        boolean z11;
        int i13 = wVar.f7309b;
        int q10 = q(i13, wVar.f7308a);
        String str = new String(wVar.f7308a, i13, q10 - i13, r8.d.f46768b);
        wVar.F(q10 + 1);
        int u10 = wVar.u();
        if ((u10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((u10 & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int u11 = wVar.u();
        String[] strArr = new String[u11];
        for (int i14 = 0; i14 < u11; i14++) {
            int i15 = wVar.f7309b;
            int q11 = q(i15, wVar.f7308a);
            strArr[i14] = new String(wVar.f7308a, i15, q11 - i15, r8.d.f46768b);
            wVar.F(q11 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (wVar.f7309b < i16) {
            j h = h(i11, wVar, z4, i12, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new d(str, z10, z11, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e g(int i10, w wVar) {
        if (i10 < 4) {
            return null;
        }
        int u10 = wVar.u();
        Charset n10 = n(u10);
        byte[] bArr = new byte[3];
        wVar.e(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        wVar.e(0, i11, bArr2);
        int p10 = p(0, u10, bArr2);
        String str2 = new String(bArr2, 0, p10, n10);
        int m9 = m(u10) + p10;
        return new e(str, str2, k(bArr2, m9, p(m9, u10, bArr2), n10));
    }

    public static j4.j h(int r20, h5.w r21, boolean r22, int r23, j4.g r24) {
        throw new UnsupportedOperationException("Method not decompiled: j4.i.h(int, h5.w, boolean, int, j4.g):j4.j");
    }

    public static f i(int i10, w wVar) {
        byte[] copyOfRange;
        int u10 = wVar.u();
        Charset n10 = n(u10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        wVar.e(0, i11, bArr);
        int q10 = q(0, bArr);
        String str = new String(bArr, 0, q10, r8.d.f46768b);
        int i12 = q10 + 1;
        int p10 = p(i12, u10, bArr);
        String k10 = k(bArr, i12, p10, n10);
        int m9 = m(u10) + p10;
        int p11 = p(m9, u10, bArr);
        String k11 = k(bArr, m9, p11, n10);
        int m10 = m(u10) + p11;
        if (i11 <= m10) {
            copyOfRange = d0.f7241f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, m10, i11);
        }
        return new f(str, copyOfRange, k10, k11);
    }

    public static l j(int i10, w wVar) {
        int z4 = wVar.z();
        int w10 = wVar.w();
        int w11 = wVar.w();
        int u10 = wVar.u();
        int u11 = wVar.u();
        v vVar = new v();
        vVar.o(wVar);
        int i11 = ((i10 - 10) * 8) / (u10 + u11);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = vVar.i(u10);
            int i14 = vVar.i(u11);
            iArr[i12] = i13;
            iArr2[i12] = i14;
        }
        return new l(z4, w10, w11, iArr, iArr2);
    }

    public static String k(byte[] bArr, int i10, int i11, Charset charset) {
        if (i11 > i10 && i11 <= bArr.length) {
            return new String(bArr, i10, i11 - i10, charset);
        }
        return "";
    }

    public static i0 l(int i10, int i11, byte[] bArr) {
        Object[] objArr;
        if (i11 >= bArr.length) {
            return s8.v.x("");
        }
        t tVar = s8.v.f47174b;
        s8.l.c(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        int p10 = p(i11, i10, bArr);
        int i12 = 0;
        boolean z4 = false;
        while (i11 < p10) {
            String str = new String(bArr, i11, p10 - i11, n(i10));
            int i13 = i12 + 1;
            if (objArr2.length < i13) {
                objArr = Arrays.copyOf(objArr2, com.google.android.gms.common.api.internal.w.g(objArr2.length, i13));
            } else if (z4) {
                objArr = (Object[]) objArr2.clone();
            } else {
                objArr2[i12] = str;
                int m9 = p10 + m(i10);
                i12++;
                i11 = m9;
                p10 = p(m9, i10, bArr);
            }
            objArr2 = objArr;
            z4 = false;
            objArr2[i12] = str;
            int m92 = p10 + m(i10);
            i12++;
            i11 = m92;
            p10 = p(m92, i10, bArr);
        }
        i0 s6 = s8.v.s(i12, objArr2);
        if (s6.isEmpty()) {
            return s8.v.x("");
        }
        return s6;
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
                    return r8.d.f46768b;
                }
                return r8.d.f46769c;
            }
            return r8.d.d;
        }
        return r8.d.f46771f;
    }

    public static String o(int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int p(int i10, int i11, byte[] bArr) {
        int q10 = q(i10, bArr);
        if (i11 != 0 && i11 != 3) {
            while (q10 < bArr.length - 1) {
                if ((q10 - i10) % 2 == 0 && bArr[q10 + 1] == 0) {
                    return q10;
                }
                q10 = q(q10 + 1, bArr);
            }
            return bArr.length;
        }
        return q10;
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
        byte[] bArr = wVar.f7308a;
        int i11 = wVar.f7309b;
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

    public static boolean s(h5.w r18, int r19, int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: j4.i.s(h5.w, int, int, boolean):boolean");
    }

    @Override
    public final e4.c b(e4.e eVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    public final e4.c c(int r13, byte[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: j4.i.c(int, byte[]):e4.c");
    }
}
