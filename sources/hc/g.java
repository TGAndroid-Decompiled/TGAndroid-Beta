package hc;

import b2.q0;
import c5.b0;
public final class g {
    public static final int[] e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    public static final g[] f9295f = a();
    public final int f9296a;
    public final int[] f9297b;
    public final b0[] f9298c;
    public final int d;

    public g(int i10, int[] iArr, b0... b0VarArr) {
        q0[] q0VarArr;
        this.f9296a = i10;
        this.f9297b = iArr;
        this.f9298c = b0VarArr;
        b0 b0Var = b0VarArr[0];
        int i11 = b0Var.f4260b;
        int i12 = 0;
        for (q0 q0Var : (q0[]) b0Var.f4261c) {
            i12 += (q0Var.f1897b + i11) * q0Var.f1896a;
        }
        this.d = i12;
    }

    public static g[] a() {
        return new g[]{new g(1, new int[0], new b0(7, new q0[]{new q0(1, 19)}), new b0(10, new q0[]{new q0(1, 16)}), new b0(13, new q0[]{new q0(1, 13)}), new b0(17, new q0[]{new q0(1, 9)})), new g(2, new int[]{6, 18}, new b0(10, new q0[]{new q0(1, 34)}), new b0(16, new q0[]{new q0(1, 28)}), new b0(22, new q0[]{new q0(1, 22)}), new b0(28, new q0[]{new q0(1, 16)})), new g(3, new int[]{6, 22}, new b0(15, new q0[]{new q0(1, 55)}), new b0(26, new q0[]{new q0(1, 44)}), new b0(18, new q0[]{new q0(2, 17)}), new b0(22, new q0[]{new q0(2, 13)})), new g(4, new int[]{6, 26}, new b0(20, new q0[]{new q0(1, 80)}), new b0(18, new q0[]{new q0(2, 32)}), new b0(26, new q0[]{new q0(2, 24)}), new b0(16, new q0[]{new q0(4, 9)})), new g(5, new int[]{6, 30}, new b0(26, new q0[]{new q0(1, 108)}), new b0(24, new q0[]{new q0(2, 43)}), new b0(18, new q0[]{new q0(2, 15), new q0(2, 16)}), new b0(22, new q0[]{new q0(2, 11), new q0(2, 12)})), new g(6, new int[]{6, 34}, new b0(18, new q0[]{new q0(2, 68)}), new b0(16, new q0[]{new q0(4, 27)}), new b0(24, new q0[]{new q0(4, 19)}), new b0(28, new q0[]{new q0(4, 15)})), new g(7, new int[]{6, 22, 38}, new b0(20, new q0[]{new q0(2, 78)}), new b0(18, new q0[]{new q0(4, 31)}), new b0(18, new q0[]{new q0(2, 14), new q0(4, 15)}), new b0(26, new q0[]{new q0(4, 13), new q0(1, 14)})), new g(8, new int[]{6, 24, 42}, new b0(24, new q0[]{new q0(2, 97)}), new b0(22, new q0[]{new q0(2, 38), new q0(2, 39)}), new b0(22, new q0[]{new q0(4, 18), new q0(2, 19)}), new b0(26, new q0[]{new q0(4, 14), new q0(2, 15)})), new g(9, new int[]{6, 26, 46}, new b0(30, new q0[]{new q0(2, 116)}), new b0(22, new q0[]{new q0(3, 36), new q0(2, 37)}), new b0(20, new q0[]{new q0(4, 16), new q0(4, 17)}), new b0(24, new q0[]{new q0(4, 12), new q0(4, 13)})), new g(10, new int[]{6, 28, 50}, new b0(18, new q0[]{new q0(2, 68), new q0(2, 69)}), new b0(26, new q0[]{new q0(4, 43), new q0(1, 44)}), new b0(24, new q0[]{new q0(6, 19), new q0(2, 20)}), new b0(28, new q0[]{new q0(6, 15), new q0(2, 16)})), new g(11, new int[]{6, 30, 54}, new b0(20, new q0[]{new q0(4, 81)}), new b0(30, new q0[]{new q0(1, 50), new q0(4, 51)}), new b0(28, new q0[]{new q0(4, 22), new q0(4, 23)}), new b0(24, new q0[]{new q0(3, 12), new q0(8, 13)})), new g(12, new int[]{6, 32, 58}, new b0(24, new q0[]{new q0(2, 92), new q0(2, 93)}), new b0(22, new q0[]{new q0(6, 36), new q0(2, 37)}), new b0(26, new q0[]{new q0(4, 20), new q0(6, 21)}), new b0(28, new q0[]{new q0(7, 14), new q0(4, 15)})), new g(13, new int[]{6, 34, 62}, new b0(26, new q0[]{new q0(4, 107)}), new b0(22, new q0[]{new q0(8, 37), new q0(1, 38)}), new b0(24, new q0[]{new q0(8, 20), new q0(4, 21)}), new b0(22, new q0[]{new q0(12, 11), new q0(4, 12)})), new g(14, new int[]{6, 26, 46, 66}, new b0(30, new q0[]{new q0(3, 115), new q0(1, 116)}), new b0(24, new q0[]{new q0(4, 40), new q0(5, 41)}), new b0(20, new q0[]{new q0(11, 16), new q0(5, 17)}), new b0(24, new q0[]{new q0(11, 12), new q0(5, 13)})), new g(15, new int[]{6, 26, 48, 70}, new b0(22, new q0[]{new q0(5, 87), new q0(1, 88)}), new b0(24, new q0[]{new q0(5, 41), new q0(5, 42)}), new b0(30, new q0[]{new q0(5, 24), new q0(7, 25)}), new b0(24, new q0[]{new q0(11, 12), new q0(7, 13)})), new g(16, new int[]{6, 26, 50, 74}, new b0(24, new q0[]{new q0(5, 98), new q0(1, 99)}), new b0(28, new q0[]{new q0(7, 45), new q0(3, 46)}), new b0(24, new q0[]{new q0(15, 19), new q0(2, 20)}), new b0(30, new q0[]{new q0(3, 15), new q0(13, 16)})), new g(17, new int[]{6, 30, 54, 78}, new b0(28, new q0[]{new q0(1, 107), new q0(5, 108)}), new b0(28, new q0[]{new q0(10, 46), new q0(1, 47)}), new b0(28, new q0[]{new q0(1, 22), new q0(15, 23)}), new b0(28, new q0[]{new q0(2, 14), new q0(17, 15)})), new g(18, new int[]{6, 30, 56, 82}, new b0(30, new q0[]{new q0(5, 120), new q0(1, 121)}), new b0(26, new q0[]{new q0(9, 43), new q0(4, 44)}), new b0(28, new q0[]{new q0(17, 22), new q0(1, 23)}), new b0(28, new q0[]{new q0(2, 14), new q0(19, 15)})), new g(19, new int[]{6, 30, 58, 86}, new b0(28, new q0[]{new q0(3, 113), new q0(4, 114)}), new b0(26, new q0[]{new q0(3, 44), new q0(11, 45)}), new b0(26, new q0[]{new q0(17, 21), new q0(4, 22)}), new b0(26, new q0[]{new q0(9, 13), new q0(16, 14)})), new g(20, new int[]{6, 34, 62, 90}, new b0(28, new q0[]{new q0(3, 107), new q0(5, 108)}), new b0(26, new q0[]{new q0(3, 41), new q0(13, 42)}), new b0(30, new q0[]{new q0(15, 24), new q0(5, 25)}), new b0(28, new q0[]{new q0(15, 15), new q0(10, 16)})), new g(21, new int[]{6, 28, 50, 72, 94}, new b0(28, new q0[]{new q0(4, 116), new q0(4, 117)}), new b0(26, new q0[]{new q0(17, 42)}), new b0(28, new q0[]{new q0(17, 22), new q0(6, 23)}), new b0(30, new q0[]{new q0(19, 16), new q0(6, 17)})), new g(22, new int[]{6, 26, 50, 74, 98}, new b0(28, new q0[]{new q0(2, 111), new q0(7, 112)}), new b0(28, new q0[]{new q0(17, 46)}), new b0(30, new q0[]{new q0(7, 24), new q0(16, 25)}), new b0(24, new q0[]{new q0(34, 13)})), new g(23, new int[]{6, 30, 54, 78, 102}, new b0(30, new q0[]{new q0(4, 121), new q0(5, 122)}), new b0(28, new q0[]{new q0(4, 47), new q0(14, 48)}), new b0(30, new q0[]{new q0(11, 24), new q0(14, 25)}), new b0(30, new q0[]{new q0(16, 15), new q0(14, 16)})), new g(24, new int[]{6, 28, 54, 80, 106}, new b0(30, new q0[]{new q0(6, 117), new q0(4, 118)}), new b0(28, new q0[]{new q0(6, 45), new q0(14, 46)}), new b0(30, new q0[]{new q0(11, 24), new q0(16, 25)}), new b0(30, new q0[]{new q0(30, 16), new q0(2, 17)})), new g(25, new int[]{6, 32, 58, 84, 110}, new b0(26, new q0[]{new q0(8, 106), new q0(4, 107)}), new b0(28, new q0[]{new q0(8, 47), new q0(13, 48)}), new b0(30, new q0[]{new q0(7, 24), new q0(22, 25)}), new b0(30, new q0[]{new q0(22, 15), new q0(13, 16)})), new g(26, new int[]{6, 30, 58, 86, 114}, new b0(28, new q0[]{new q0(10, 114), new q0(2, 115)}), new b0(28, new q0[]{new q0(19, 46), new q0(4, 47)}), new b0(28, new q0[]{new q0(28, 22), new q0(6, 23)}), new b0(30, new q0[]{new q0(33, 16), new q0(4, 17)})), new g(27, new int[]{6, 34, 62, 90, 118}, new b0(30, new q0[]{new q0(8, 122), new q0(4, 123)}), new b0(28, new q0[]{new q0(22, 45), new q0(3, 46)}), new b0(30, new q0[]{new q0(8, 23), new q0(26, 24)}), new b0(30, new q0[]{new q0(12, 15), new q0(28, 16)})), new g(28, new int[]{6, 26, 50, 74, 98, 122}, new b0(30, new q0[]{new q0(3, 117), new q0(10, 118)}), new b0(28, new q0[]{new q0(3, 45), new q0(23, 46)}), new b0(30, new q0[]{new q0(4, 24), new q0(31, 25)}), new b0(30, new q0[]{new q0(11, 15), new q0(31, 16)})), new g(29, new int[]{6, 30, 54, 78, 102, 126}, new b0(30, new q0[]{new q0(7, 116), new q0(7, 117)}), new b0(28, new q0[]{new q0(21, 45), new q0(7, 46)}), new b0(30, new q0[]{new q0(1, 23), new q0(37, 24)}), new b0(30, new q0[]{new q0(19, 15), new q0(26, 16)})), new g(30, new int[]{6, 26, 52, 78, 104, 130}, new b0(30, new q0[]{new q0(5, 115), new q0(10, 116)}), new b0(28, new q0[]{new q0(19, 47), new q0(10, 48)}), new b0(30, new q0[]{new q0(15, 24), new q0(25, 25)}), new b0(30, new q0[]{new q0(23, 15), new q0(25, 16)})), new g(31, new int[]{6, 30, 56, 82, 108, 134}, new b0(30, new q0[]{new q0(13, 115), new q0(3, 116)}), new b0(28, new q0[]{new q0(2, 46), new q0(29, 47)}), new b0(30, new q0[]{new q0(42, 24), new q0(1, 25)}), new b0(30, new q0[]{new q0(23, 15), new q0(28, 16)})), new g(32, new int[]{6, 34, 60, 86, 112, 138}, new b0(30, new q0[]{new q0(17, 115)}), new b0(28, new q0[]{new q0(10, 46), new q0(23, 47)}), new b0(30, new q0[]{new q0(10, 24), new q0(35, 25)}), new b0(30, new q0[]{new q0(19, 15), new q0(35, 16)})), new g(33, new int[]{6, 30, 58, 86, 114, 142}, new b0(30, new q0[]{new q0(17, 115), new q0(1, 116)}), new b0(28, new q0[]{new q0(14, 46), new q0(21, 47)}), new b0(30, new q0[]{new q0(29, 24), new q0(19, 25)}), new b0(30, new q0[]{new q0(11, 15), new q0(46, 16)})), new g(34, new int[]{6, 34, 62, 90, 118, 146}, new b0(30, new q0[]{new q0(13, 115), new q0(6, 116)}), new b0(28, new q0[]{new q0(14, 46), new q0(23, 47)}), new b0(30, new q0[]{new q0(44, 24), new q0(7, 25)}), new b0(30, new q0[]{new q0(59, 16), new q0(1, 17)})), new g(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new b0(30, new q0[]{new q0(12, 121), new q0(7, 122)}), new b0(28, new q0[]{new q0(12, 47), new q0(26, 48)}), new b0(30, new q0[]{new q0(39, 24), new q0(14, 25)}), new b0(30, new q0[]{new q0(22, 15), new q0(41, 16)})), new g(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new b0(30, new q0[]{new q0(6, 121), new q0(14, 122)}), new b0(28, new q0[]{new q0(6, 47), new q0(34, 48)}), new b0(30, new q0[]{new q0(46, 24), new q0(10, 25)}), new b0(30, new q0[]{new q0(2, 15), new q0(64, 16)})), new g(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new b0(30, new q0[]{new q0(17, 122), new q0(4, 123)}), new b0(28, new q0[]{new q0(29, 46), new q0(14, 47)}), new b0(30, new q0[]{new q0(49, 24), new q0(10, 25)}), new b0(30, new q0[]{new q0(24, 15), new q0(46, 16)})), new g(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new b0(30, new q0[]{new q0(4, 122), new q0(18, 123)}), new b0(28, new q0[]{new q0(13, 46), new q0(32, 47)}), new b0(30, new q0[]{new q0(48, 24), new q0(14, 25)}), new b0(30, new q0[]{new q0(42, 15), new q0(32, 16)})), new g(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new b0(30, new q0[]{new q0(20, 117), new q0(4, 118)}), new b0(28, new q0[]{new q0(40, 47), new q0(7, 48)}), new b0(30, new q0[]{new q0(43, 24), new q0(22, 25)}), new b0(30, new q0[]{new q0(10, 15), new q0(67, 16)})), new g(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new b0(30, new q0[]{new q0(19, 118), new q0(6, 119)}), new b0(28, new q0[]{new q0(18, 47), new q0(31, 48)}), new b0(30, new q0[]{new q0(34, 24), new q0(34, 25)}), new b0(30, new q0[]{new q0(20, 15), new q0(61, 16)}))};
    }

    public static g b(int i10) {
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

    public static g c(int i10) {
        if (i10 >= 1 && i10 <= 40) {
            return f9295f[i10 - 1];
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        return String.valueOf(this.f9296a);
    }
}
