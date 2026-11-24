package defpackage;
public abstract class oe3 {
    public static final int[] a = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    public static final int[] b = {1, 2, 3, 6};
    public static final int[] c = {48000, 44100, 32000};
    public static final int[] d = {24000, 22050, 16000};
    public static final int[] e = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] f = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] g = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i, int i2) {
        int i3 = i2 / 2;
        if (i >= 0 && i < 3 && i2 >= 0 && i3 < 19) {
            int i4 = c[i];
            if (i4 == 44100) {
                return ((i2 % 2) + g[i3]) << 1;
            }
            int i5 = f[i3];
            if (i4 == 32000) {
                return i5 * 6;
            }
            return i5 << 2;
        }
        return -1;
    }

    public static void b(de deVar, int[] iArr, int[] iArr2, ir irVar) {
        int i;
        int n0;
        int n02;
        int i2 = 0;
        while (i2 < iArr2.length) {
            int m = irVar.m(deVar, iArr);
            if (m >= 0 && m <= 15) {
                iArr2[i2] = m;
            } else {
                switch (m) {
                    case 16:
                        i = iArr2[i2 - 1];
                        n0 = deVar.n0(iArr, 2) + 3;
                        break;
                    case 17:
                        n02 = deVar.n0(iArr, 3) + 3;
                        n0 = n02;
                        i = 0;
                        break;
                    case 18:
                        n02 = deVar.n0(iArr, 7) + 11;
                        n0 = n02;
                        i = 0;
                        break;
                    default:
                        throw new Exception(String.format("[%s] Bad code length '%d' at the bit index '%d'.", oe3.class.getSimpleName(), Integer.valueOf(m), iArr));
                }
                for (int i3 = 0; i3 < n0; i3++) {
                    iArr2[i2 + i3] = i;
                }
                i2 += n0 - 1;
            }
            i2++;
        }
    }

    public static int c(de deVar, int[] iArr, ir irVar) {
        int i;
        int m = irVar.m(deVar, iArr);
        int i2 = 2;
        int i3 = 5;
        switch (m) {
            case 0:
            case 1:
            case 2:
            case 3:
                return m + 1;
            case 4:
                i2 = 1;
                break;
            case 5:
                i2 = 1;
                i3 = 7;
                break;
            case 6:
                i3 = 9;
                break;
            case 7:
                i3 = 13;
                break;
            case 8:
                i3 = 17;
                i2 = 3;
                break;
            case 9:
                i3 = 25;
                i2 = 3;
                break;
            case 10:
                i3 = 33;
                i2 = 4;
                break;
            case 11:
                i3 = 49;
                i2 = 4;
                break;
            case 12:
                i = 65;
                i2 = 5;
                i3 = i;
                break;
            case 13:
                i = 97;
                i2 = 5;
                i3 = i;
                break;
            case 14:
                i3 = 129;
                i2 = 6;
                break;
            case 15:
                i3 = 193;
                i2 = 6;
                break;
            case 16:
                i3 = 257;
                i2 = 7;
                break;
            case 17:
                i3 = 385;
                i2 = 7;
                break;
            case 18:
                i3 = 513;
                i2 = 8;
                break;
            case 19:
                i3 = 769;
                i2 = 8;
                break;
            case 20:
                i3 = 1025;
                i2 = 9;
                break;
            case 21:
                i3 = 1537;
                i2 = 9;
                break;
            case 22:
                i3 = 2049;
                i2 = 10;
                break;
            case 23:
                i3 = 3073;
                i2 = 10;
                break;
            case 24:
                i3 = 4097;
                i2 = 11;
                break;
            case 25:
                i3 = 6145;
                i2 = 11;
                break;
            case 26:
                i3 = 8193;
                i2 = 12;
                break;
            case 27:
                i3 = 12289;
                i2 = 12;
                break;
            case 28:
                i3 = 16385;
                i2 = 13;
                break;
            case 29:
                i3 = 24577;
                i2 = 13;
                break;
            default:
                throw new Exception(String.format("[%s] Bad distance code '%d' at the bit index '%d'.", oe3.class.getSimpleName(), Integer.valueOf(m), Integer.valueOf(iArr[0])));
        }
        return deVar.n0(iArr, i2) + i3;
    }

    public static void d(de deVar, int[] iArr, ir[] irVarArr) {
        int n0 = deVar.n0(iArr, 5) + 257;
        int n02 = deVar.n0(iArr, 5) + 1;
        int n03 = deVar.n0(iArr, 4) + 4;
        int[] iArr2 = new int[19];
        for (int i = 0; i < n03; i++) {
            iArr2[a[i]] = (byte) deVar.n0(iArr, 3);
        }
        ir irVar = new ir(iArr2);
        int[] iArr3 = new int[n0];
        b(deVar, iArr, iArr3, irVar);
        ir irVar2 = new ir(iArr3);
        int[] iArr4 = new int[n02];
        b(deVar, iArr, iArr4, irVar);
        ir irVar3 = new ir(iArr4);
        irVarArr[0] = irVar2;
        irVarArr[1] = irVar3;
    }

    public static int e(de deVar, int[] iArr, int i) {
        int i2;
        int i3 = 1;
        switch (i) {
            case 257:
            case 258:
            case 259:
            case 260:
            case 261:
            case 262:
            case 263:
            case 264:
                return i - 254;
            case 265:
                i2 = 11;
                break;
            case 266:
                i2 = 13;
                break;
            case 267:
                i2 = 15;
                break;
            case 268:
                i2 = 17;
                break;
            case 269:
                i2 = 19;
                i3 = 2;
                break;
            case 270:
                i2 = 23;
                i3 = 2;
                break;
            case 271:
                i2 = 27;
                i3 = 2;
                break;
            case 272:
                i2 = 31;
                i3 = 2;
                break;
            case 273:
                i2 = 35;
                i3 = 3;
                break;
            case 274:
                i2 = 43;
                i3 = 3;
                break;
            case 275:
                i2 = 51;
                i3 = 3;
                break;
            case 276:
                i2 = 59;
                i3 = 3;
                break;
            case 277:
                i2 = 67;
                i3 = 4;
                break;
            case 278:
                i2 = 83;
                i3 = 4;
                break;
            case 279:
                i2 = 99;
                i3 = 4;
                break;
            case 280:
                i2 = 115;
                i3 = 4;
                break;
            case 281:
                i2 = 131;
                i3 = 5;
                break;
            case 282:
                i2 = 163;
                i3 = 5;
                break;
            case 283:
                i2 = 195;
                i3 = 5;
                break;
            case 284:
                i2 = 227;
                i3 = 5;
                break;
            case 285:
                return 258;
            default:
                throw new Exception(String.format("[%s] Bad literal/length code '%d' at the bit index '%d'.", oe3.class.getSimpleName(), Integer.valueOf(i), Integer.valueOf(iArr[0])));
        }
        return deVar.n0(iArr, i3) + i2;
    }
}
