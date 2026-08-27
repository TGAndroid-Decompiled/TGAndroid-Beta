package e4;

import d5.g0;
import d5.y;
import d5.z;
import h7.d0;
import h7.p8;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p8.l0;
import p8.w;
import p8.x;

public final class i extends p8 {

    public static final a9.m f5207b = new a9.m(26);

    public final g f5208a;

    public i(g gVar) {
        this.f5208a = gVar;
    }

    public static a d(z zVar, int i10, int i11) {
        int iQ;
        String strConcat;
        int iR = zVar.r();
        Charset charsetN = n(iR);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        zVar.c(0, i12, bArr);
        if (i11 == 2) {
            strConcat = "image/" + d0.b(new String(bArr, 0, 3, o8.d.f19362b));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iQ = 2;
        } else {
            iQ = q(0, bArr);
            String strB = d0.b(new String(bArr, 0, iQ, o8.d.f19362b));
            strConcat = strB.indexOf(47) == -1 ? "image/".concat(strB) : strB;
        }
        int i13 = bArr[iQ + 1] & 255;
        int i14 = iQ + 2;
        int iP = p(i14, iR, bArr);
        String str = new String(bArr, i14, iP - i14, charsetN);
        int iM = m(iR) + iP;
        return new a(i13, strConcat, str, i12 <= iM ? g0.f4799f : Arrays.copyOfRange(bArr, iM, i12));
    }

    public static c e(z zVar, int i10, int i11, boolean z10, int i12, g gVar) throws Throwable {
        int i13 = zVar.f4859b;
        int iQ = q(i13, zVar.f4858a);
        String str = new String(zVar.f4858a, i13, iQ - i13, o8.d.f19362b);
        zVar.C(iQ + 1);
        int iE = zVar.e();
        int iE2 = zVar.e();
        long jS = zVar.s();
        if (jS == 4294967295L) {
            jS = -1;
        }
        long jS2 = zVar.s();
        long j10 = jS2 == 4294967295L ? -1L : jS2;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (zVar.f4859b < i14) {
            j jVarH = h(i11, zVar, z10, i12, gVar);
            if (jVarH != null) {
                arrayList.add(jVarH);
            }
        }
        return new c(str, iE, iE2, jS, j10, (j[]) arrayList.toArray(new j[0]));
    }

    public static d f(z zVar, int i10, int i11, boolean z10, int i12, g gVar) throws Throwable {
        int i13 = zVar.f4859b;
        int iQ = q(i13, zVar.f4858a);
        String str = new String(zVar.f4858a, i13, iQ - i13, o8.d.f19362b);
        zVar.C(iQ + 1);
        int iR = zVar.r();
        boolean z11 = (iR & 2) != 0;
        boolean z12 = (iR & 1) != 0;
        int iR2 = zVar.r();
        String[] strArr = new String[iR2];
        for (int i14 = 0; i14 < iR2; i14++) {
            int i15 = zVar.f4859b;
            int iQ2 = q(i15, zVar.f4858a);
            strArr[i14] = new String(zVar.f4858a, i15, iQ2 - i15, o8.d.f19362b);
            zVar.C(iQ2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (zVar.f4859b < i16) {
            j jVarH = h(i11, zVar, z10, i12, gVar);
            if (jVarH != null) {
                arrayList.add(jVarH);
            }
        }
        return new d(str, z11, z12, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e g(int i10, z zVar) {
        if (i10 < 4) {
            return null;
        }
        int iR = zVar.r();
        Charset charsetN = n(iR);
        byte[] bArr = new byte[3];
        zVar.c(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        zVar.c(0, i11, bArr2);
        int iP = p(0, iR, bArr2);
        String str2 = new String(bArr2, 0, iP, charsetN);
        int iM = m(iR) + iP;
        return new e(str, str2, k(bArr2, iM, p(iM, iR, bArr2), charsetN));
    }

    public static j h(int i10, z zVar, boolean z10, int i11, g gVar) throws Throwable {
        int iU;
        ?? r10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r11;
        int i12;
        int i13;
        ?? r12;
        int i14;
        z zVar2;
        ?? r13;
        int i15 = i10;
        int iR = zVar.r();
        int iR2 = zVar.r();
        int iR3 = zVar.r();
        int iR4 = i15 >= 3 ? zVar.r() : 0;
        if (i15 == 4) {
            iU = zVar.u();
            if (!z10) {
                iU = (((iU >> 24) & 255) << 21) | (iU & 255) | (((iU >> 8) & 255) << 7) | (((iU >> 16) & 255) << 14);
            }
        } else {
            iU = i15 == 3 ? zVar.u() : zVar.t();
        }
        int iR5 = iU;
        int iW = i15 >= 3 ? zVar.w() : 0;
        j bVar = null;
        if (iR == 0 && iR2 == 0 && iR3 == 0 && iR4 == 0 && iR5 == 0 && iW == 0) {
            zVar.C(zVar.f4860c);
            return null;
        }
        int i16 = zVar.f4859b + iR5;
        if (i16 > zVar.f4860c) {
            d5.a.K("Id3Decoder", "Frame size exceeds remaining tag data");
            zVar.C(zVar.f4860c);
            return null;
        }
        if (gVar != null) {
            r10 = iR2;
            if (!gVar.c(i15, iR, iR2, iR3, iR4)) {
                i15 = i15;
                zVar.C(i16);
                return null;
            }
        } else {
            r10 = iR2;
        }
        i15 = i15;
        if (i15 == 3) {
            z11 = (iW & 128) != 0;
            z14 = (iW & 64) != 0;
            z15 = false;
            z13 = (iW & 32) != 0;
            z12 = z11;
        } else if (i15 == 4) {
            boolean z16 = (iW & 64) != 0;
            boolean z17 = (iW & 8) != 0;
            z14 = (iW & 4) != 0;
            z15 = (iW & 2) != 0;
            z12 = (iW & 1) != 0;
            boolean z18 = z17;
            z13 = z16;
            z11 = z18;
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
        }
        if (z11 || z14) {
            d5.a.K("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            zVar.C(i16);
            return null;
        }
        if (z13) {
            iR5--;
            zVar.D(1);
        }
        if (z12) {
            iR5 -= 4;
            zVar.D(4);
        }
        if (z15) {
            iR5 = r(iR5, zVar);
        }
        try {
            try {
                if (iR == 84 && r10 == 88 && iR3 == 88 && (i15 == 2 || iR4 == 88)) {
                    if (iR5 >= 1) {
                        int iR6 = zVar.r();
                        int i17 = iR5 - 1;
                        byte[] bArr = new byte[i17];
                        zVar.c(0, i17, bArr);
                        int iP = p(0, iR6, bArr);
                        bVar = new n("TXXX", new String(bArr, 0, iP, n(iR6)), l(iR6, m(iR6) + iP, bArr));
                    }
                } else if (iR == 84) {
                    String strO = o(i15, iR, r10, iR3, iR4);
                    if (iR5 >= 1) {
                        int iR7 = zVar.r();
                        int i18 = iR5 - 1;
                        byte[] bArr2 = new byte[i18];
                        zVar.c(0, i18, bArr2);
                        bVar = new n(strO, null, l(iR7, 0, bArr2));
                    }
                } else if (iR == 87 && r10 == 88 && iR3 == 88 && (i15 == 2 || iR4 == 88)) {
                    if (iR5 >= 1) {
                        int iR8 = zVar.r();
                        int i19 = iR5 - 1;
                        byte[] bArr3 = new byte[i19];
                        zVar.c(0, i19, bArr3);
                        int iP2 = p(0, iR8, bArr3);
                        String str = new String(bArr3, 0, iP2, n(iR8));
                        int iM = m(iR8) + iP2;
                        bVar = new o("WXXX", str, k(bArr3, iM, q(iM, bArr3), o8.d.f19362b));
                    }
                } else if (iR == 87) {
                    String strO2 = o(i15, iR, r10, iR3, iR4);
                    byte[] bArr4 = new byte[iR5];
                    zVar.c(0, iR5, bArr4);
                    bVar = new o(strO2, null, new String(bArr4, 0, q(0, bArr4), o8.d.f19362b));
                } else if (iR == 80 && r10 == 82 && iR3 == 73 && iR4 == 86) {
                    byte[] bArr5 = new byte[iR5];
                    zVar.c(0, iR5, bArr5);
                    int iQ = q(0, bArr5);
                    String str2 = new String(bArr5, 0, iQ, o8.d.f19362b);
                    int i20 = iQ + 1;
                    bVar = new m(str2, iR5 <= i20 ? g0.f4799f : Arrays.copyOfRange(bArr5, i20, iR5));
                } else {
                    if (iR != 71 || r10 != 69 || iR3 != 79 || (iR4 != 66 && i15 != 2)) {
                        if (i15 == 2) {
                            if (iR == 80 && r10 == 73 && iR3 == 67) {
                                bVar = d(zVar, iR5, i15);
                            } else if (iR != 67 && r10 == 79 && iR3 == 77 && (iR4 == 77 || i15 == 2)) {
                                bVar = g(iR5, zVar);
                            } else if (iR != 67 && r10 == 72 && iR3 == 65 && iR4 == 80) {
                                int i21 = iR5;
                                i12 = iR3;
                                i13 = i21;
                                r13 = r10;
                                i14 = iR4;
                                try {
                                    bVar = e(zVar, i13, i15, z10, i11, gVar);
                                    i15 = i10;
                                    r10 = zVar;
                                } catch (Throwable th) {
                                    th = th;
                                    r11 = zVar;
                                    r11.C(i16);
                                    throw th;
                                }
                            } else {
                                int i22 = iR5;
                                i12 = iR3;
                                i13 = i22;
                                r12 = r10;
                                i14 = iR4;
                                if (iR != 67 && r12 == 84 && i12 == 79 && i14 == 67) {
                                    i15 = i10;
                                    z zVar3 = zVar;
                                    bVar = f(zVar3, i13, i15, z10, i11, gVar);
                                    r10 = zVar3;
                                    r13 = r12;
                                } else {
                                    i15 = i10;
                                    zVar2 = zVar;
                                    if (iR != 77 && r12 == 76 && i12 == 76 && i14 == 84) {
                                        bVar = j(i13, zVar2);
                                    } else {
                                        String strO3 = o(i15, iR, r12 == true ? 1 : 0, i12, i14);
                                        byte[] bArr6 = new byte[i13];
                                        zVar2.c(0, i13, bArr6);
                                        bVar = new b(strO3, bArr6);
                                        r10 = zVar2;
                                        r13 = r12;
                                    }
                                }
                            }
                        } else if (iR == 65 && r10 == 80 && iR3 == 73 && iR4 == 67) {
                            bVar = d(zVar, iR5, i15);
                        } else {
                            if (iR != 67) {
                            }
                            if (iR != 67) {
                                int i23 = iR5;
                                i12 = iR3;
                                i13 = i23;
                                r12 = r10;
                                i14 = iR4;
                                if (iR != 67) {
                                    i15 = i10;
                                    zVar2 = zVar;
                                    if (iR != 77) {
                                        String strO4 = o(i15, iR, r12 == true ? 1 : 0, i12, i14);
                                        byte[] bArr7 = new byte[i13];
                                        zVar2.c(0, i13, bArr7);
                                        bVar = new b(strO4, bArr7);
                                        r10 = zVar2;
                                        r13 = r12;
                                    } else {
                                        String strO5 = o(i15, iR, r12 == true ? 1 : 0, i12, i14);
                                        byte[] bArr8 = new byte[i13];
                                        zVar2.c(0, i13, bArr8);
                                        bVar = new b(strO5, bArr8);
                                        r10 = zVar2;
                                        r13 = r12;
                                    }
                                } else {
                                    i15 = i10;
                                    zVar2 = zVar;
                                    if (iR != 77) {
                                        String strO6 = o(i15, iR, r12 == true ? 1 : 0, i12, i14);
                                        byte[] bArr9 = new byte[i13];
                                        zVar2.c(0, i13, bArr9);
                                        bVar = new b(strO6, bArr9);
                                        r10 = zVar2;
                                        r13 = r12;
                                    } else {
                                        String strO7 = o(i15, iR, r12 == true ? 1 : 0, i12, i14);
                                        byte[] bArr10 = new byte[i13];
                                        zVar2.c(0, i13, bArr10);
                                        bVar = new b(strO7, bArr10);
                                        r10 = zVar2;
                                        r13 = r12;
                                    }
                                }
                            } else {
                                int i24 = iR5;
                                i12 = iR3;
                                i13 = i24;
                                r12 = r10;
                                i14 = iR4;
                                if (iR != 67) {
                                    i15 = i10;
                                    zVar2 = zVar;
                                    if (iR != 77) {
                                        String strO8 = o(i15, iR, r12 == true ? 1 : 0, i12, i14);
                                        byte[] bArr11 = new byte[i13];
                                        zVar2.c(0, i13, bArr11);
                                        bVar = new b(strO8, bArr11);
                                        r10 = zVar2;
                                        r13 = r12;
                                    } else {
                                        String strO9 = o(i15, iR, r12 == true ? 1 : 0, i12, i14);
                                        byte[] bArr12 = new byte[i13];
                                        zVar2.c(0, i13, bArr12);
                                        bVar = new b(strO9, bArr12);
                                        r10 = zVar2;
                                        r13 = r12;
                                    }
                                } else {
                                    i15 = i10;
                                    zVar2 = zVar;
                                    if (iR != 77) {
                                        String strO10 = o(i15, iR, r12 == true ? 1 : 0, i12, i14);
                                        byte[] bArr13 = new byte[i13];
                                        zVar2.c(0, i13, bArr13);
                                        bVar = new b(strO10, bArr13);
                                        r10 = zVar2;
                                        r13 = r12;
                                    } else {
                                        String strO11 = o(i15, iR, r12 == true ? 1 : 0, i12, i14);
                                        byte[] bArr14 = new byte[i13];
                                        zVar2.c(0, i13, bArr14);
                                        bVar = new b(strO11, bArr14);
                                        r10 = zVar2;
                                        r13 = r12;
                                    }
                                }
                            }
                        }
                        if (bVar == null) {
                            r10 = zVar2;
                            r13 = r12;
                            d5.a.K("Id3Decoder", "Failed to decode frame: id=" + o(i15, iR, r13, i12, i14) + ", frameSize=" + i13);
                        }
                        r10 = zVar2;
                        r13 = r12;
                        r10.C(i16);
                        return bVar;
                    }
                    bVar = i(iR5, zVar);
                }
                int i25 = iR5;
                i12 = iR3;
                i13 = i25;
                r13 = r10;
                i14 = iR4;
                r10 = zVar;
                if (bVar == null) {
                    r10 = zVar2;
                    r13 = r12;
                    d5.a.K("Id3Decoder", "Failed to decode frame: id=" + o(i15, iR, r13, i12, i14) + ", frameSize=" + i13);
                }
                r10 = zVar2;
                r13 = r12;
                r10.C(i16);
                return bVar;
            } catch (Throwable th2) {
                th = th2;
                r11 = zVar;
            }
        } catch (Throwable th3) {
            th = th3;
            r11 = r10;
        }
    }

    public static f i(int i10, z zVar) {
        int iR = zVar.r();
        Charset charsetN = n(iR);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        zVar.c(0, i11, bArr);
        int iQ = q(0, bArr);
        String str = new String(bArr, 0, iQ, o8.d.f19362b);
        int i12 = iQ + 1;
        int iP = p(i12, iR, bArr);
        String strK = k(bArr, i12, iP, charsetN);
        int iM = m(iR) + iP;
        int iP2 = p(iM, iR, bArr);
        String strK2 = k(bArr, iM, iP2, charsetN);
        int iM2 = m(iR) + iP2;
        return new f(str, i11 <= iM2 ? g0.f4799f : Arrays.copyOfRange(bArr, iM2, i11), strK, strK2);
    }

    public static l j(int i10, z zVar) {
        int iW = zVar.w();
        int iT = zVar.t();
        int iT2 = zVar.t();
        int iR = zVar.r();
        int iR2 = zVar.r();
        y yVar = new y();
        yVar.o(zVar);
        int i11 = ((i10 - 10) * 8) / (iR + iR2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = yVar.i(iR);
            int i14 = yVar.i(iR2);
            iArr[i12] = i13;
            iArr2[i12] = i14;
        }
        return new l(iW, iT, iT2, iArr, iArr2);
    }

    public static String k(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    public static l0 l(int i10, int i11, byte[] bArr) {
        if (i11 >= bArr.length) {
            return p8.z.y("");
        }
        x xVar = p8.z.f45604b;
        p8.l.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int iP = p(i11, i10, bArr);
        int i12 = 0;
        while (i11 < iP) {
            String str = new String(bArr, i11, iP - i11, n(i10));
            int i13 = i12 + 1;
            if (objArrCopyOf.length < i13) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, w.d(objArrCopyOf.length, i13));
            }
            objArrCopyOf[i12] = str;
            int iM = iP + m(i10);
            i12 = i13;
            i11 = iM;
            iP = p(iM, i10, bArr);
        }
        l0 l0VarS = p8.z.s(i12, objArrCopyOf);
        return l0VarS.isEmpty() ? p8.z.y("") : l0VarS;
    }

    public static int m(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static Charset n(int i10) {
        if (i10 == 1) {
            return o8.d.f19365f;
        }
        if (i10 != 2) {
            return i10 != 3 ? o8.d.f19362b : o8.d.f19363c;
        }
        return o8.d.d;
    }

    public static String o(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int p(int i10, int i11, byte[] bArr) {
        int iQ = q(i10, bArr);
        if (i11 == 0 || i11 == 3) {
            return iQ;
        }
        while (iQ < bArr.length - 1) {
            if ((iQ - i10) % 2 == 0 && bArr[iQ + 1] == 0) {
                return iQ;
            }
            iQ = q(iQ + 1, bArr);
        }
        return bArr.length;
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

    public static int r(int i10, z zVar) {
        byte[] bArr = zVar.f4858a;
        int i11 = zVar.f4859b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11 + i10) {
                return i10;
            }
            if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                i10--;
            }
            i12 = i13;
        }
    }

    public static boolean s(z zVar, int i10, int i11, boolean z10) {
        int iT;
        long jT;
        int iW;
        int i12;
        int i13 = zVar.f4859b;
        while (true) {
            try {
                boolean z11 = true;
                if (zVar.a() < i11) {
                    zVar.C(i13);
                    return true;
                }
                if (i10 >= 3) {
                    iT = zVar.e();
                    jT = zVar.s();
                    iW = zVar.w();
                } else {
                    iT = zVar.t();
                    jT = zVar.t();
                    iW = 0;
                }
                if (iT == 0 && jT == 0 && iW == 0) {
                    zVar.C(i13);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & jT) != 0) {
                        zVar.C(i13);
                        return false;
                    }
                    jT = (((jT >> 24) & 255) << 21) | (jT & 255) | (((jT >> 8) & 255) << 7) | (((jT >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i12 = (iW & 64) != 0 ? 1 : 0;
                    if ((iW & 1) == 0) {
                        z11 = false;
                    }
                } else {
                    if (i10 == 3) {
                        i12 = (iW & 32) != 0 ? 1 : 0;
                        if ((iW & 128) == 0) {
                        }
                    } else {
                        i12 = 0;
                    }
                    z11 = false;
                }
                if (z11) {
                    i12 += 4;
                }
                if (jT < i12) {
                    zVar.C(i13);
                    return false;
                }
                if (zVar.a() < jT) {
                    zVar.C(i13);
                    return false;
                }
                zVar.D((int) jT);
            } catch (Throwable th) {
                zVar.C(i13);
                throw th;
            }
        }
    }

    @Override
    public final z3.c b(z3.e eVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    public final z3.c c(int i10, byte[] bArr) throws Throwable {
        boolean z10;
        h hVar;
        int i11;
        int i12;
        int iR;
        j jVarH;
        ArrayList arrayList = new ArrayList();
        z zVar = new z(bArr, i10);
        boolean z11 = false;
        if (zVar.a() < 10) {
            d5.a.K("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iT = zVar.t();
            if (iT == 4801587) {
                int iR2 = zVar.r();
                zVar.D(1);
                int iR3 = zVar.r();
                int iQ = zVar.q();
                if (iR2 != 2) {
                    if (iR2 == 3) {
                        if ((iR3 & 64) != 0) {
                            int iE = zVar.e();
                            zVar.D(iE);
                            iQ -= iE + 4;
                        }
                    } else if (iR2 == 4) {
                        if ((iR3 & 64) != 0) {
                            int iQ2 = zVar.q();
                            zVar.D(iQ2 - 4);
                            iQ -= iQ2;
                        }
                        if ((iR3 & 16) != 0) {
                            iQ -= 10;
                        }
                    } else {
                        com.google.android.recaptcha.internal.a.s(iR2, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    if (iR2 < 4) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    hVar = new h(iR2, z10, iQ);
                } else if ((iR3 & 64) != 0) {
                    d5.a.K("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iR2 < 4 || (iR3 & 128) == 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    hVar = new h(iR2, z10, iQ);
                }
                if (hVar == null) {
                    return null;
                }
                i11 = hVar.f5204a;
                int i13 = zVar.f4859b;
                i12 = i11 == 2 ? 6 : 10;
                iR = hVar.f5205b;
                if (hVar.f5206c) {
                    iR = r(iR, zVar);
                }
                zVar.B(i13 + iR);
                if (!s(zVar, i11, i12, false)) {
                    if (i11 == 4 || !s(zVar, 4, i12, true)) {
                        com.google.android.recaptcha.internal.a.s(i11, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z11 = true;
                }
                while (zVar.a() >= i12) {
                    jVarH = h(i11, zVar, z11, i12, this.f5208a);
                    if (jVarH != null) {
                        arrayList.add(jVarH);
                    }
                }
                return new z3.c(arrayList);
            }
            d5.a.K("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iT))));
        }
        hVar = null;
        if (hVar == null) {
            return null;
        }
        i11 = hVar.f5204a;
        int i14 = zVar.f4859b;
        if (i11 == 2) {
        }
        iR = hVar.f5205b;
        if (hVar.f5206c) {
            iR = r(iR, zVar);
        }
        zVar.B(i14 + iR);
        if (!s(zVar, i11, i12, false)) {
            if (i11 == 4) {
            }
            com.google.android.recaptcha.internal.a.s(i11, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
            return null;
        }
        while (zVar.a() >= i12) {
            jVarH = h(i11, zVar, z11, i12, this.f5208a);
            if (jVarH != null) {
                arrayList.add(jVarH);
            }
        }
        return new z3.c(arrayList);
    }
}
