package lc;

import e2.j0;
public abstract class d {
    public static final int[] f11743a = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    public static final byte[] f11744b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static String a(byte[] bArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (bArr == 0) {
            return null;
        }
        int length = (((((bArr.length * 8) + 5) / 6) + 3) / 4) * 4;
        StringBuilder sb2 = new StringBuilder(length);
        int i15 = 0;
        while (true) {
            int i16 = i15 / 8;
            if (bArr.length <= i16) {
                i12 = -1;
            } else {
                if (bArr.length - 1 == i16) {
                    i10 = 0;
                } else {
                    i10 = bArr[i16 + 1];
                }
                int i17 = (i15 % 24) / 6;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            if (i17 != 3) {
                                i12 = 0;
                            } else {
                                i11 = bArr[i16];
                            }
                        } else {
                            i13 = (bArr[i16] << 2) & 60;
                            i14 = (i10 >> 6) & 3;
                        }
                    } else {
                        i13 = (bArr[i16] << 4) & 48;
                        i14 = (i10 >> 4) & 15;
                    }
                    i12 = i13 | i14;
                } else {
                    i11 = bArr[i16] >> 2;
                }
                i12 = i11 & 63;
            }
            if (i12 < 0) {
                break;
            }
            sb2.append((char) f11744b[i12]);
            i15 += 6;
        }
        for (int length2 = sb2.length(); length2 < length; length2++) {
            sb2.append('=');
        }
        return sb2.toString();
    }

    public static boolean b(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt != '\t' && charAt != ' ' && charAt != '\"' && charAt != ',' && charAt != '/' && charAt != '{' && charAt != '}' && charAt != '(' && charAt != ')') {
                switch (charAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        break;
                    default:
                        switch (charAt) {
                            case '[':
                            case '\\':
                            case ']':
                                break;
                            default:
                        }
                }
            }
            return false;
        }
        return true;
    }

    public static void c(c5.x xVar, int[] iArr, int[] iArr2, j0 j0Var) {
        int i10;
        int p5;
        int p9;
        int i11 = 0;
        while (i11 < iArr2.length) {
            int m10 = j0Var.m(xVar, iArr);
            if (m10 >= 0 && m10 <= 15) {
                iArr2[i11] = m10;
            } else {
                switch (m10) {
                    case 16:
                        i10 = iArr2[i11 - 1];
                        p5 = xVar.p(iArr, 2) + 3;
                        break;
                    case 17:
                        p9 = xVar.p(iArr, 3) + 3;
                        p5 = p9;
                        i10 = 0;
                        break;
                    case 18:
                        p9 = xVar.p(iArr, 7) + 11;
                        p5 = p9;
                        i10 = 0;
                        break;
                    default:
                        throw new Exception(String.format("[%s] Bad code length '%d' at the bit index '%d'.", d.class.getSimpleName(), Integer.valueOf(m10), iArr));
                }
                for (int i12 = 0; i12 < p5; i12++) {
                    iArr2[i11 + i12] = i10;
                }
                i11 += p5 - 1;
            }
            i11++;
        }
    }

    public static int d(c5.x xVar, int[] iArr, j0 j0Var) {
        int i10;
        int m10 = j0Var.m(xVar, iArr);
        int i11 = 2;
        int i12 = 5;
        switch (m10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return m10 + 1;
            case 4:
                i11 = 1;
                break;
            case 5:
                i11 = 1;
                i12 = 7;
                break;
            case 6:
                i12 = 9;
                break;
            case 7:
                i12 = 13;
                break;
            case 8:
                i12 = 17;
                i11 = 3;
                break;
            case 9:
                i12 = 25;
                i11 = 3;
                break;
            case 10:
                i12 = 33;
                i11 = 4;
                break;
            case 11:
                i12 = 49;
                i11 = 4;
                break;
            case 12:
                i10 = 65;
                i11 = 5;
                i12 = i10;
                break;
            case 13:
                i10 = 97;
                i11 = 5;
                i12 = i10;
                break;
            case 14:
                i12 = 129;
                i11 = 6;
                break;
            case 15:
                i12 = 193;
                i11 = 6;
                break;
            case 16:
                i12 = 257;
                i11 = 7;
                break;
            case 17:
                i12 = 385;
                i11 = 7;
                break;
            case 18:
                i12 = 513;
                i11 = 8;
                break;
            case 19:
                i12 = 769;
                i11 = 8;
                break;
            case 20:
                i12 = 1025;
                i11 = 9;
                break;
            case 21:
                i12 = 1537;
                i11 = 9;
                break;
            case 22:
                i12 = 2049;
                i11 = 10;
                break;
            case 23:
                i12 = 3073;
                i11 = 10;
                break;
            case 24:
                i12 = 4097;
                i11 = 11;
                break;
            case 25:
                i12 = 6145;
                i11 = 11;
                break;
            case 26:
                i12 = 8193;
                i11 = 12;
                break;
            case 27:
                i12 = 12289;
                i11 = 12;
                break;
            case 28:
                i12 = 16385;
                i11 = 13;
                break;
            case 29:
                i12 = 24577;
                i11 = 13;
                break;
            default:
                throw new Exception(String.format("[%s] Bad distance code '%d' at the bit index '%d'.", d.class.getSimpleName(), Integer.valueOf(m10), Integer.valueOf(iArr[0])));
        }
        return xVar.p(iArr, i11) + i12;
    }

    public static void e(c5.x xVar, int[] iArr, j0[] j0VarArr) {
        int p5 = xVar.p(iArr, 5) + 257;
        int p9 = xVar.p(iArr, 5) + 1;
        int p10 = xVar.p(iArr, 4) + 4;
        int[] iArr2 = new int[19];
        for (int i10 = 0; i10 < p10; i10++) {
            iArr2[f11743a[i10]] = (byte) xVar.p(iArr, 3);
        }
        j0 j0Var = new j0(iArr2);
        int[] iArr3 = new int[p5];
        c(xVar, iArr, iArr3, j0Var);
        j0 j0Var2 = new j0(iArr3);
        int[] iArr4 = new int[p9];
        c(xVar, iArr, iArr4, j0Var);
        j0 j0Var3 = new j0(iArr4);
        j0VarArr[0] = j0Var2;
        j0VarArr[1] = j0Var3;
    }

    public static int f(c5.x xVar, int[] iArr, int i10) {
        int i11;
        int i12 = 1;
        switch (i10) {
            case 257:
            case 258:
            case 259:
            case 260:
            case 261:
            case 262:
            case 263:
            case 264:
                return i10 - 254;
            case 265:
                i11 = 11;
                break;
            case 266:
                i11 = 13;
                break;
            case 267:
                i11 = 15;
                break;
            case 268:
                i11 = 17;
                break;
            case 269:
                i11 = 19;
                i12 = 2;
                break;
            case 270:
                i11 = 23;
                i12 = 2;
                break;
            case 271:
                i11 = 27;
                i12 = 2;
                break;
            case 272:
                i11 = 31;
                i12 = 2;
                break;
            case 273:
                i11 = 35;
                i12 = 3;
                break;
            case 274:
                i11 = 43;
                i12 = 3;
                break;
            case 275:
                i11 = 51;
                i12 = 3;
                break;
            case 276:
                i11 = 59;
                i12 = 3;
                break;
            case 277:
                i11 = 67;
                i12 = 4;
                break;
            case 278:
                i11 = 83;
                i12 = 4;
                break;
            case 279:
                i11 = 99;
                i12 = 4;
                break;
            case 280:
                i11 = 115;
                i12 = 4;
                break;
            case 281:
                i11 = 131;
                i12 = 5;
                break;
            case 282:
                i11 = 163;
                i12 = 5;
                break;
            case 283:
                i11 = 195;
                i12 = 5;
                break;
            case 284:
                i11 = 227;
                i12 = 5;
                break;
            case 285:
                return 258;
            default:
                throw new Exception(String.format("[%s] Bad literal/length code '%d' at the bit index '%d'.", d.class.getSimpleName(), Integer.valueOf(i10), Integer.valueOf(iArr[0])));
        }
        return xVar.p(iArr, i12) + i11;
    }
}
