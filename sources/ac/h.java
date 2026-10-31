package ac;

import c5.x;
public final class h {
    public static final int[] e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    public static final h[] f387f = a();
    public final int f388a;
    public final int[] f389b;
    public final x[] f390c;
    public final int d;

    public h(int i10, int[] iArr, x... xVarArr) {
        g[] gVarArr;
        this.f388a = i10;
        this.f389b = iArr;
        this.f390c = xVarArr;
        x xVar = xVarArr[0];
        int i11 = xVar.f3827b;
        int i12 = 0;
        for (g gVar : (g[]) xVar.f3828c) {
            i12 += (gVar.f386b + i11) * gVar.f385a;
        }
        this.d = i12;
    }

    public static h[] a() {
        return new h[]{new h(1, new int[0], new x(7, new g[]{new g(1, 19)}, 1), new x(10, new g[]{new g(1, 16)}, 1), new x(13, new g[]{new g(1, 13)}, 1), new x(17, new g[]{new g(1, 9)}, 1)), new h(2, new int[]{6, 18}, new x(10, new g[]{new g(1, 34)}, 1), new x(16, new g[]{new g(1, 28)}, 1), new x(22, new g[]{new g(1, 22)}, 1), new x(28, new g[]{new g(1, 16)}, 1)), new h(3, new int[]{6, 22}, new x(15, new g[]{new g(1, 55)}, 1), new x(26, new g[]{new g(1, 44)}, 1), new x(18, new g[]{new g(2, 17)}, 1), new x(22, new g[]{new g(2, 13)}, 1)), new h(4, new int[]{6, 26}, new x(20, new g[]{new g(1, 80)}, 1), new x(18, new g[]{new g(2, 32)}, 1), new x(26, new g[]{new g(2, 24)}, 1), new x(16, new g[]{new g(4, 9)}, 1)), new h(5, new int[]{6, 30}, new x(26, new g[]{new g(1, 108)}, 1), new x(24, new g[]{new g(2, 43)}, 1), new x(18, new g[]{new g(2, 15), new g(2, 16)}, 1), new x(22, new g[]{new g(2, 11), new g(2, 12)}, 1)), new h(6, new int[]{6, 34}, new x(18, new g[]{new g(2, 68)}, 1), new x(16, new g[]{new g(4, 27)}, 1), new x(24, new g[]{new g(4, 19)}, 1), new x(28, new g[]{new g(4, 15)}, 1)), new h(7, new int[]{6, 22, 38}, new x(20, new g[]{new g(2, 78)}, 1), new x(18, new g[]{new g(4, 31)}, 1), new x(18, new g[]{new g(2, 14), new g(4, 15)}, 1), new x(26, new g[]{new g(4, 13), new g(1, 14)}, 1)), new h(8, new int[]{6, 24, 42}, new x(24, new g[]{new g(2, 97)}, 1), new x(22, new g[]{new g(2, 38), new g(2, 39)}, 1), new x(22, new g[]{new g(4, 18), new g(2, 19)}, 1), new x(26, new g[]{new g(4, 14), new g(2, 15)}, 1)), new h(9, new int[]{6, 26, 46}, new x(30, new g[]{new g(2, 116)}, 1), new x(22, new g[]{new g(3, 36), new g(2, 37)}, 1), new x(20, new g[]{new g(4, 16), new g(4, 17)}, 1), new x(24, new g[]{new g(4, 12), new g(4, 13)}, 1)), new h(10, new int[]{6, 28, 50}, new x(18, new g[]{new g(2, 68), new g(2, 69)}, 1), new x(26, new g[]{new g(4, 43), new g(1, 44)}, 1), new x(24, new g[]{new g(6, 19), new g(2, 20)}, 1), new x(28, new g[]{new g(6, 15), new g(2, 16)}, 1)), new h(11, new int[]{6, 30, 54}, new x(20, new g[]{new g(4, 81)}, 1), new x(30, new g[]{new g(1, 50), new g(4, 51)}, 1), new x(28, new g[]{new g(4, 22), new g(4, 23)}, 1), new x(24, new g[]{new g(3, 12), new g(8, 13)}, 1)), new h(12, new int[]{6, 32, 58}, new x(24, new g[]{new g(2, 92), new g(2, 93)}, 1), new x(22, new g[]{new g(6, 36), new g(2, 37)}, 1), new x(26, new g[]{new g(4, 20), new g(6, 21)}, 1), new x(28, new g[]{new g(7, 14), new g(4, 15)}, 1)), new h(13, new int[]{6, 34, 62}, new x(26, new g[]{new g(4, 107)}, 1), new x(22, new g[]{new g(8, 37), new g(1, 38)}, 1), new x(24, new g[]{new g(8, 20), new g(4, 21)}, 1), new x(22, new g[]{new g(12, 11), new g(4, 12)}, 1)), new h(14, new int[]{6, 26, 46, 66}, new x(30, new g[]{new g(3, 115), new g(1, 116)}, 1), new x(24, new g[]{new g(4, 40), new g(5, 41)}, 1), new x(20, new g[]{new g(11, 16), new g(5, 17)}, 1), new x(24, new g[]{new g(11, 12), new g(5, 13)}, 1)), new h(15, new int[]{6, 26, 48, 70}, new x(22, new g[]{new g(5, 87), new g(1, 88)}, 1), new x(24, new g[]{new g(5, 41), new g(5, 42)}, 1), new x(30, new g[]{new g(5, 24), new g(7, 25)}, 1), new x(24, new g[]{new g(11, 12), new g(7, 13)}, 1)), new h(16, new int[]{6, 26, 50, 74}, new x(24, new g[]{new g(5, 98), new g(1, 99)}, 1), new x(28, new g[]{new g(7, 45), new g(3, 46)}, 1), new x(24, new g[]{new g(15, 19), new g(2, 20)}, 1), new x(30, new g[]{new g(3, 15), new g(13, 16)}, 1)), new h(17, new int[]{6, 30, 54, 78}, new x(28, new g[]{new g(1, 107), new g(5, 108)}, 1), new x(28, new g[]{new g(10, 46), new g(1, 47)}, 1), new x(28, new g[]{new g(1, 22), new g(15, 23)}, 1), new x(28, new g[]{new g(2, 14), new g(17, 15)}, 1)), new h(18, new int[]{6, 30, 56, 82}, new x(30, new g[]{new g(5, 120), new g(1, 121)}, 1), new x(26, new g[]{new g(9, 43), new g(4, 44)}, 1), new x(28, new g[]{new g(17, 22), new g(1, 23)}, 1), new x(28, new g[]{new g(2, 14), new g(19, 15)}, 1)), new h(19, new int[]{6, 30, 58, 86}, new x(28, new g[]{new g(3, 113), new g(4, 114)}, 1), new x(26, new g[]{new g(3, 44), new g(11, 45)}, 1), new x(26, new g[]{new g(17, 21), new g(4, 22)}, 1), new x(26, new g[]{new g(9, 13), new g(16, 14)}, 1)), new h(20, new int[]{6, 34, 62, 90}, new x(28, new g[]{new g(3, 107), new g(5, 108)}, 1), new x(26, new g[]{new g(3, 41), new g(13, 42)}, 1), new x(30, new g[]{new g(15, 24), new g(5, 25)}, 1), new x(28, new g[]{new g(15, 15), new g(10, 16)}, 1)), new h(21, new int[]{6, 28, 50, 72, 94}, new x(28, new g[]{new g(4, 116), new g(4, 117)}, 1), new x(26, new g[]{new g(17, 42)}, 1), new x(28, new g[]{new g(17, 22), new g(6, 23)}, 1), new x(30, new g[]{new g(19, 16), new g(6, 17)}, 1)), new h(22, new int[]{6, 26, 50, 74, 98}, new x(28, new g[]{new g(2, 111), new g(7, 112)}, 1), new x(28, new g[]{new g(17, 46)}, 1), new x(30, new g[]{new g(7, 24), new g(16, 25)}, 1), new x(24, new g[]{new g(34, 13)}, 1)), new h(23, new int[]{6, 30, 54, 78, 102}, new x(30, new g[]{new g(4, 121), new g(5, 122)}, 1), new x(28, new g[]{new g(4, 47), new g(14, 48)}, 1), new x(30, new g[]{new g(11, 24), new g(14, 25)}, 1), new x(30, new g[]{new g(16, 15), new g(14, 16)}, 1)), new h(24, new int[]{6, 28, 54, 80, 106}, new x(30, new g[]{new g(6, 117), new g(4, 118)}, 1), new x(28, new g[]{new g(6, 45), new g(14, 46)}, 1), new x(30, new g[]{new g(11, 24), new g(16, 25)}, 1), new x(30, new g[]{new g(30, 16), new g(2, 17)}, 1)), new h(25, new int[]{6, 32, 58, 84, 110}, new x(26, new g[]{new g(8, 106), new g(4, 107)}, 1), new x(28, new g[]{new g(8, 47), new g(13, 48)}, 1), new x(30, new g[]{new g(7, 24), new g(22, 25)}, 1), new x(30, new g[]{new g(22, 15), new g(13, 16)}, 1)), new h(26, new int[]{6, 30, 58, 86, 114}, new x(28, new g[]{new g(10, 114), new g(2, 115)}, 1), new x(28, new g[]{new g(19, 46), new g(4, 47)}, 1), new x(28, new g[]{new g(28, 22), new g(6, 23)}, 1), new x(30, new g[]{new g(33, 16), new g(4, 17)}, 1)), new h(27, new int[]{6, 34, 62, 90, 118}, new x(30, new g[]{new g(8, 122), new g(4, 123)}, 1), new x(28, new g[]{new g(22, 45), new g(3, 46)}, 1), new x(30, new g[]{new g(8, 23), new g(26, 24)}, 1), new x(30, new g[]{new g(12, 15), new g(28, 16)}, 1)), new h(28, new int[]{6, 26, 50, 74, 98, 122}, new x(30, new g[]{new g(3, 117), new g(10, 118)}, 1), new x(28, new g[]{new g(3, 45), new g(23, 46)}, 1), new x(30, new g[]{new g(4, 24), new g(31, 25)}, 1), new x(30, new g[]{new g(11, 15), new g(31, 16)}, 1)), new h(29, new int[]{6, 30, 54, 78, 102, 126}, new x(30, new g[]{new g(7, 116), new g(7, 117)}, 1), new x(28, new g[]{new g(21, 45), new g(7, 46)}, 1), new x(30, new g[]{new g(1, 23), new g(37, 24)}, 1), new x(30, new g[]{new g(19, 15), new g(26, 16)}, 1)), new h(30, new int[]{6, 26, 52, 78, 104, 130}, new x(30, new g[]{new g(5, 115), new g(10, 116)}, 1), new x(28, new g[]{new g(19, 47), new g(10, 48)}, 1), new x(30, new g[]{new g(15, 24), new g(25, 25)}, 1), new x(30, new g[]{new g(23, 15), new g(25, 16)}, 1)), new h(31, new int[]{6, 30, 56, 82, 108, 134}, new x(30, new g[]{new g(13, 115), new g(3, 116)}, 1), new x(28, new g[]{new g(2, 46), new g(29, 47)}, 1), new x(30, new g[]{new g(42, 24), new g(1, 25)}, 1), new x(30, new g[]{new g(23, 15), new g(28, 16)}, 1)), new h(32, new int[]{6, 34, 60, 86, 112, 138}, new x(30, new g[]{new g(17, 115)}, 1), new x(28, new g[]{new g(10, 46), new g(23, 47)}, 1), new x(30, new g[]{new g(10, 24), new g(35, 25)}, 1), new x(30, new g[]{new g(19, 15), new g(35, 16)}, 1)), new h(33, new int[]{6, 30, 58, 86, 114, 142}, new x(30, new g[]{new g(17, 115), new g(1, 116)}, 1), new x(28, new g[]{new g(14, 46), new g(21, 47)}, 1), new x(30, new g[]{new g(29, 24), new g(19, 25)}, 1), new x(30, new g[]{new g(11, 15), new g(46, 16)}, 1)), new h(34, new int[]{6, 34, 62, 90, 118, 146}, new x(30, new g[]{new g(13, 115), new g(6, 116)}, 1), new x(28, new g[]{new g(14, 46), new g(23, 47)}, 1), new x(30, new g[]{new g(44, 24), new g(7, 25)}, 1), new x(30, new g[]{new g(59, 16), new g(1, 17)}, 1)), new h(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new x(30, new g[]{new g(12, 121), new g(7, 122)}, 1), new x(28, new g[]{new g(12, 47), new g(26, 48)}, 1), new x(30, new g[]{new g(39, 24), new g(14, 25)}, 1), new x(30, new g[]{new g(22, 15), new g(41, 16)}, 1)), new h(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new x(30, new g[]{new g(6, 121), new g(14, 122)}, 1), new x(28, new g[]{new g(6, 47), new g(34, 48)}, 1), new x(30, new g[]{new g(46, 24), new g(10, 25)}, 1), new x(30, new g[]{new g(2, 15), new g(64, 16)}, 1)), new h(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new x(30, new g[]{new g(17, 122), new g(4, 123)}, 1), new x(28, new g[]{new g(29, 46), new g(14, 47)}, 1), new x(30, new g[]{new g(49, 24), new g(10, 25)}, 1), new x(30, new g[]{new g(24, 15), new g(46, 16)}, 1)), new h(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new x(30, new g[]{new g(4, 122), new g(18, 123)}, 1), new x(28, new g[]{new g(13, 46), new g(32, 47)}, 1), new x(30, new g[]{new g(48, 24), new g(14, 25)}, 1), new x(30, new g[]{new g(42, 15), new g(32, 16)}, 1)), new h(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new x(30, new g[]{new g(20, 117), new g(4, 118)}, 1), new x(28, new g[]{new g(40, 47), new g(7, 48)}, 1), new x(30, new g[]{new g(43, 24), new g(22, 25)}, 1), new x(30, new g[]{new g(10, 15), new g(67, 16)}, 1)), new h(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new x(30, new g[]{new g(19, 118), new g(6, 119)}, 1), new x(28, new g[]{new g(18, 47), new g(31, 48)}, 1), new x(30, new g[]{new g(34, 24), new g(34, 25)}, 1), new x(30, new g[]{new g(20, 15), new g(61, 16)}, 1))};
    }

    public static h b(int i10) {
        int i11 = Integer.MAX_VALUE;
        int i12 = 0;
        for (int i13 = 0; i13 < 34; i13++) {
            int i14 = e[i13];
            if (i14 == i10) {
                return c(i13 + 7);
            }
            int bitCount = Integer.bitCount(i14 ^ i10);
            if (bitCount < i11) {
                i12 = i13 + 7;
                i11 = bitCount;
            }
        }
        if (i11 <= 3) {
            return c(i12);
        }
        return null;
    }

    public static h c(int i10) {
        if (i10 >= 1 && i10 <= 40) {
            return f387f[i10 - 1];
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        return String.valueOf(this.f388a);
    }
}
