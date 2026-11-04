package dc;

import d2.t0;
import e5.u;
public final class e {
    public static final int[] f8782e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    public static final e[] f8783f = a();
    public final int f8784a;
    public final int[] f8785b;
    public final u[] f8786c;
    public final int d;

    public e(int i3, int[] iArr, u... uVarArr) {
        t0[] t0VarArr;
        this.f8784a = i3;
        this.f8785b = iArr;
        this.f8786c = uVarArr;
        u uVar = uVarArr[0];
        int i10 = uVar.f9633b;
        int i11 = 0;
        for (t0 t0Var : (t0[]) uVar.f9634c) {
            i11 += (t0Var.f8414b + i10) * t0Var.f8413a;
        }
        this.d = i11;
    }

    public static e[] a() {
        return new e[]{new e(1, new int[0], new u(7, new t0[]{new t0(1, 19)}, 4), new u(10, new t0[]{new t0(1, 16)}, 4), new u(13, new t0[]{new t0(1, 13)}, 4), new u(17, new t0[]{new t0(1, 9)}, 4)), new e(2, new int[]{6, 18}, new u(10, new t0[]{new t0(1, 34)}, 4), new u(16, new t0[]{new t0(1, 28)}, 4), new u(22, new t0[]{new t0(1, 22)}, 4), new u(28, new t0[]{new t0(1, 16)}, 4)), new e(3, new int[]{6, 22}, new u(15, new t0[]{new t0(1, 55)}, 4), new u(26, new t0[]{new t0(1, 44)}, 4), new u(18, new t0[]{new t0(2, 17)}, 4), new u(22, new t0[]{new t0(2, 13)}, 4)), new e(4, new int[]{6, 26}, new u(20, new t0[]{new t0(1, 80)}, 4), new u(18, new t0[]{new t0(2, 32)}, 4), new u(26, new t0[]{new t0(2, 24)}, 4), new u(16, new t0[]{new t0(4, 9)}, 4)), new e(5, new int[]{6, 30}, new u(26, new t0[]{new t0(1, 108)}, 4), new u(24, new t0[]{new t0(2, 43)}, 4), new u(18, new t0[]{new t0(2, 15), new t0(2, 16)}, 4), new u(22, new t0[]{new t0(2, 11), new t0(2, 12)}, 4)), new e(6, new int[]{6, 34}, new u(18, new t0[]{new t0(2, 68)}, 4), new u(16, new t0[]{new t0(4, 27)}, 4), new u(24, new t0[]{new t0(4, 19)}, 4), new u(28, new t0[]{new t0(4, 15)}, 4)), new e(7, new int[]{6, 22, 38}, new u(20, new t0[]{new t0(2, 78)}, 4), new u(18, new t0[]{new t0(4, 31)}, 4), new u(18, new t0[]{new t0(2, 14), new t0(4, 15)}, 4), new u(26, new t0[]{new t0(4, 13), new t0(1, 14)}, 4)), new e(8, new int[]{6, 24, 42}, new u(24, new t0[]{new t0(2, 97)}, 4), new u(22, new t0[]{new t0(2, 38), new t0(2, 39)}, 4), new u(22, new t0[]{new t0(4, 18), new t0(2, 19)}, 4), new u(26, new t0[]{new t0(4, 14), new t0(2, 15)}, 4)), new e(9, new int[]{6, 26, 46}, new u(30, new t0[]{new t0(2, 116)}, 4), new u(22, new t0[]{new t0(3, 36), new t0(2, 37)}, 4), new u(20, new t0[]{new t0(4, 16), new t0(4, 17)}, 4), new u(24, new t0[]{new t0(4, 12), new t0(4, 13)}, 4)), new e(10, new int[]{6, 28, 50}, new u(18, new t0[]{new t0(2, 68), new t0(2, 69)}, 4), new u(26, new t0[]{new t0(4, 43), new t0(1, 44)}, 4), new u(24, new t0[]{new t0(6, 19), new t0(2, 20)}, 4), new u(28, new t0[]{new t0(6, 15), new t0(2, 16)}, 4)), new e(11, new int[]{6, 30, 54}, new u(20, new t0[]{new t0(4, 81)}, 4), new u(30, new t0[]{new t0(1, 50), new t0(4, 51)}, 4), new u(28, new t0[]{new t0(4, 22), new t0(4, 23)}, 4), new u(24, new t0[]{new t0(3, 12), new t0(8, 13)}, 4)), new e(12, new int[]{6, 32, 58}, new u(24, new t0[]{new t0(2, 92), new t0(2, 93)}, 4), new u(22, new t0[]{new t0(6, 36), new t0(2, 37)}, 4), new u(26, new t0[]{new t0(4, 20), new t0(6, 21)}, 4), new u(28, new t0[]{new t0(7, 14), new t0(4, 15)}, 4)), new e(13, new int[]{6, 34, 62}, new u(26, new t0[]{new t0(4, 107)}, 4), new u(22, new t0[]{new t0(8, 37), new t0(1, 38)}, 4), new u(24, new t0[]{new t0(8, 20), new t0(4, 21)}, 4), new u(22, new t0[]{new t0(12, 11), new t0(4, 12)}, 4)), new e(14, new int[]{6, 26, 46, 66}, new u(30, new t0[]{new t0(3, 115), new t0(1, 116)}, 4), new u(24, new t0[]{new t0(4, 40), new t0(5, 41)}, 4), new u(20, new t0[]{new t0(11, 16), new t0(5, 17)}, 4), new u(24, new t0[]{new t0(11, 12), new t0(5, 13)}, 4)), new e(15, new int[]{6, 26, 48, 70}, new u(22, new t0[]{new t0(5, 87), new t0(1, 88)}, 4), new u(24, new t0[]{new t0(5, 41), new t0(5, 42)}, 4), new u(30, new t0[]{new t0(5, 24), new t0(7, 25)}, 4), new u(24, new t0[]{new t0(11, 12), new t0(7, 13)}, 4)), new e(16, new int[]{6, 26, 50, 74}, new u(24, new t0[]{new t0(5, 98), new t0(1, 99)}, 4), new u(28, new t0[]{new t0(7, 45), new t0(3, 46)}, 4), new u(24, new t0[]{new t0(15, 19), new t0(2, 20)}, 4), new u(30, new t0[]{new t0(3, 15), new t0(13, 16)}, 4)), new e(17, new int[]{6, 30, 54, 78}, new u(28, new t0[]{new t0(1, 107), new t0(5, 108)}, 4), new u(28, new t0[]{new t0(10, 46), new t0(1, 47)}, 4), new u(28, new t0[]{new t0(1, 22), new t0(15, 23)}, 4), new u(28, new t0[]{new t0(2, 14), new t0(17, 15)}, 4)), new e(18, new int[]{6, 30, 56, 82}, new u(30, new t0[]{new t0(5, 120), new t0(1, 121)}, 4), new u(26, new t0[]{new t0(9, 43), new t0(4, 44)}, 4), new u(28, new t0[]{new t0(17, 22), new t0(1, 23)}, 4), new u(28, new t0[]{new t0(2, 14), new t0(19, 15)}, 4)), new e(19, new int[]{6, 30, 58, 86}, new u(28, new t0[]{new t0(3, 113), new t0(4, 114)}, 4), new u(26, new t0[]{new t0(3, 44), new t0(11, 45)}, 4), new u(26, new t0[]{new t0(17, 21), new t0(4, 22)}, 4), new u(26, new t0[]{new t0(9, 13), new t0(16, 14)}, 4)), new e(20, new int[]{6, 34, 62, 90}, new u(28, new t0[]{new t0(3, 107), new t0(5, 108)}, 4), new u(26, new t0[]{new t0(3, 41), new t0(13, 42)}, 4), new u(30, new t0[]{new t0(15, 24), new t0(5, 25)}, 4), new u(28, new t0[]{new t0(15, 15), new t0(10, 16)}, 4)), new e(21, new int[]{6, 28, 50, 72, 94}, new u(28, new t0[]{new t0(4, 116), new t0(4, 117)}, 4), new u(26, new t0[]{new t0(17, 42)}, 4), new u(28, new t0[]{new t0(17, 22), new t0(6, 23)}, 4), new u(30, new t0[]{new t0(19, 16), new t0(6, 17)}, 4)), new e(22, new int[]{6, 26, 50, 74, 98}, new u(28, new t0[]{new t0(2, 111), new t0(7, 112)}, 4), new u(28, new t0[]{new t0(17, 46)}, 4), new u(30, new t0[]{new t0(7, 24), new t0(16, 25)}, 4), new u(24, new t0[]{new t0(34, 13)}, 4)), new e(23, new int[]{6, 30, 54, 78, 102}, new u(30, new t0[]{new t0(4, 121), new t0(5, 122)}, 4), new u(28, new t0[]{new t0(4, 47), new t0(14, 48)}, 4), new u(30, new t0[]{new t0(11, 24), new t0(14, 25)}, 4), new u(30, new t0[]{new t0(16, 15), new t0(14, 16)}, 4)), new e(24, new int[]{6, 28, 54, 80, 106}, new u(30, new t0[]{new t0(6, 117), new t0(4, 118)}, 4), new u(28, new t0[]{new t0(6, 45), new t0(14, 46)}, 4), new u(30, new t0[]{new t0(11, 24), new t0(16, 25)}, 4), new u(30, new t0[]{new t0(30, 16), new t0(2, 17)}, 4)), new e(25, new int[]{6, 32, 58, 84, 110}, new u(26, new t0[]{new t0(8, 106), new t0(4, 107)}, 4), new u(28, new t0[]{new t0(8, 47), new t0(13, 48)}, 4), new u(30, new t0[]{new t0(7, 24), new t0(22, 25)}, 4), new u(30, new t0[]{new t0(22, 15), new t0(13, 16)}, 4)), new e(26, new int[]{6, 30, 58, 86, 114}, new u(28, new t0[]{new t0(10, 114), new t0(2, 115)}, 4), new u(28, new t0[]{new t0(19, 46), new t0(4, 47)}, 4), new u(28, new t0[]{new t0(28, 22), new t0(6, 23)}, 4), new u(30, new t0[]{new t0(33, 16), new t0(4, 17)}, 4)), new e(27, new int[]{6, 34, 62, 90, 118}, new u(30, new t0[]{new t0(8, 122), new t0(4, 123)}, 4), new u(28, new t0[]{new t0(22, 45), new t0(3, 46)}, 4), new u(30, new t0[]{new t0(8, 23), new t0(26, 24)}, 4), new u(30, new t0[]{new t0(12, 15), new t0(28, 16)}, 4)), new e(28, new int[]{6, 26, 50, 74, 98, 122}, new u(30, new t0[]{new t0(3, 117), new t0(10, 118)}, 4), new u(28, new t0[]{new t0(3, 45), new t0(23, 46)}, 4), new u(30, new t0[]{new t0(4, 24), new t0(31, 25)}, 4), new u(30, new t0[]{new t0(11, 15), new t0(31, 16)}, 4)), new e(29, new int[]{6, 30, 54, 78, 102, 126}, new u(30, new t0[]{new t0(7, 116), new t0(7, 117)}, 4), new u(28, new t0[]{new t0(21, 45), new t0(7, 46)}, 4), new u(30, new t0[]{new t0(1, 23), new t0(37, 24)}, 4), new u(30, new t0[]{new t0(19, 15), new t0(26, 16)}, 4)), new e(30, new int[]{6, 26, 52, 78, 104, 130}, new u(30, new t0[]{new t0(5, 115), new t0(10, 116)}, 4), new u(28, new t0[]{new t0(19, 47), new t0(10, 48)}, 4), new u(30, new t0[]{new t0(15, 24), new t0(25, 25)}, 4), new u(30, new t0[]{new t0(23, 15), new t0(25, 16)}, 4)), new e(31, new int[]{6, 30, 56, 82, 108, 134}, new u(30, new t0[]{new t0(13, 115), new t0(3, 116)}, 4), new u(28, new t0[]{new t0(2, 46), new t0(29, 47)}, 4), new u(30, new t0[]{new t0(42, 24), new t0(1, 25)}, 4), new u(30, new t0[]{new t0(23, 15), new t0(28, 16)}, 4)), new e(32, new int[]{6, 34, 60, 86, 112, 138}, new u(30, new t0[]{new t0(17, 115)}, 4), new u(28, new t0[]{new t0(10, 46), new t0(23, 47)}, 4), new u(30, new t0[]{new t0(10, 24), new t0(35, 25)}, 4), new u(30, new t0[]{new t0(19, 15), new t0(35, 16)}, 4)), new e(33, new int[]{6, 30, 58, 86, 114, 142}, new u(30, new t0[]{new t0(17, 115), new t0(1, 116)}, 4), new u(28, new t0[]{new t0(14, 46), new t0(21, 47)}, 4), new u(30, new t0[]{new t0(29, 24), new t0(19, 25)}, 4), new u(30, new t0[]{new t0(11, 15), new t0(46, 16)}, 4)), new e(34, new int[]{6, 34, 62, 90, 118, 146}, new u(30, new t0[]{new t0(13, 115), new t0(6, 116)}, 4), new u(28, new t0[]{new t0(14, 46), new t0(23, 47)}, 4), new u(30, new t0[]{new t0(44, 24), new t0(7, 25)}, 4), new u(30, new t0[]{new t0(59, 16), new t0(1, 17)}, 4)), new e(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new u(30, new t0[]{new t0(12, 121), new t0(7, 122)}, 4), new u(28, new t0[]{new t0(12, 47), new t0(26, 48)}, 4), new u(30, new t0[]{new t0(39, 24), new t0(14, 25)}, 4), new u(30, new t0[]{new t0(22, 15), new t0(41, 16)}, 4)), new e(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new u(30, new t0[]{new t0(6, 121), new t0(14, 122)}, 4), new u(28, new t0[]{new t0(6, 47), new t0(34, 48)}, 4), new u(30, new t0[]{new t0(46, 24), new t0(10, 25)}, 4), new u(30, new t0[]{new t0(2, 15), new t0(64, 16)}, 4)), new e(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new u(30, new t0[]{new t0(17, 122), new t0(4, 123)}, 4), new u(28, new t0[]{new t0(29, 46), new t0(14, 47)}, 4), new u(30, new t0[]{new t0(49, 24), new t0(10, 25)}, 4), new u(30, new t0[]{new t0(24, 15), new t0(46, 16)}, 4)), new e(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new u(30, new t0[]{new t0(4, 122), new t0(18, 123)}, 4), new u(28, new t0[]{new t0(13, 46), new t0(32, 47)}, 4), new u(30, new t0[]{new t0(48, 24), new t0(14, 25)}, 4), new u(30, new t0[]{new t0(42, 15), new t0(32, 16)}, 4)), new e(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new u(30, new t0[]{new t0(20, 117), new t0(4, 118)}, 4), new u(28, new t0[]{new t0(40, 47), new t0(7, 48)}, 4), new u(30, new t0[]{new t0(43, 24), new t0(22, 25)}, 4), new u(30, new t0[]{new t0(10, 15), new t0(67, 16)}, 4)), new e(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new u(30, new t0[]{new t0(19, 118), new t0(6, 119)}, 4), new u(28, new t0[]{new t0(18, 47), new t0(31, 48)}, 4), new u(30, new t0[]{new t0(34, 24), new t0(34, 25)}, 4), new u(30, new t0[]{new t0(20, 15), new t0(61, 16)}, 4))};
    }

    public static e b(int i3) {
        int i10 = Integer.MAX_VALUE;
        int i11 = 0;
        for (int i12 = 0; i12 < 34; i12++) {
            int i13 = f8782e[i12];
            if (i13 == i3) {
                return c(i12 + 7);
            }
            int bitCount = Integer.bitCount(i13 ^ i3);
            if (bitCount < i10) {
                i11 = i12 + 7;
                i10 = bitCount;
            }
        }
        if (i10 <= 3) {
            return c(i11);
        }
        return null;
    }

    public static e c(int i3) {
        if (i3 >= 1 && i3 <= 40) {
            return f8783f[i3 - 1];
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        return String.valueOf(this.f8784a);
    }
}
