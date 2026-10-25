package jc;

import b2.v0;
import d5.z;
public final class f {
    public static final int[] e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    public static final f[] f15566f = a();
    public final int f15567a;
    public final int[] f15568b;
    public final z[] f15569c;
    public final int d;

    public f(int i10, int[] iArr, z... zVarArr) {
        v0[] v0VarArr;
        this.f15567a = i10;
        this.f15568b = iArr;
        this.f15569c = zVarArr;
        z zVar = zVarArr[0];
        int i11 = zVar.f8026b;
        int i12 = 0;
        for (v0 v0Var : (v0[]) zVar.f8027c) {
            i12 += (v0Var.f3512b + i11) * v0Var.f3511a;
        }
        this.d = i12;
    }

    public static f[] a() {
        return new f[]{new f(1, new int[0], new z(7, new v0[]{new v0(1, 19)}), new z(10, new v0[]{new v0(1, 16)}), new z(13, new v0[]{new v0(1, 13)}), new z(17, new v0[]{new v0(1, 9)})), new f(2, new int[]{6, 18}, new z(10, new v0[]{new v0(1, 34)}), new z(16, new v0[]{new v0(1, 28)}), new z(22, new v0[]{new v0(1, 22)}), new z(28, new v0[]{new v0(1, 16)})), new f(3, new int[]{6, 22}, new z(15, new v0[]{new v0(1, 55)}), new z(26, new v0[]{new v0(1, 44)}), new z(18, new v0[]{new v0(2, 17)}), new z(22, new v0[]{new v0(2, 13)})), new f(4, new int[]{6, 26}, new z(20, new v0[]{new v0(1, 80)}), new z(18, new v0[]{new v0(2, 32)}), new z(26, new v0[]{new v0(2, 24)}), new z(16, new v0[]{new v0(4, 9)})), new f(5, new int[]{6, 30}, new z(26, new v0[]{new v0(1, 108)}), new z(24, new v0[]{new v0(2, 43)}), new z(18, new v0[]{new v0(2, 15), new v0(2, 16)}), new z(22, new v0[]{new v0(2, 11), new v0(2, 12)})), new f(6, new int[]{6, 34}, new z(18, new v0[]{new v0(2, 68)}), new z(16, new v0[]{new v0(4, 27)}), new z(24, new v0[]{new v0(4, 19)}), new z(28, new v0[]{new v0(4, 15)})), new f(7, new int[]{6, 22, 38}, new z(20, new v0[]{new v0(2, 78)}), new z(18, new v0[]{new v0(4, 31)}), new z(18, new v0[]{new v0(2, 14), new v0(4, 15)}), new z(26, new v0[]{new v0(4, 13), new v0(1, 14)})), new f(8, new int[]{6, 24, 42}, new z(24, new v0[]{new v0(2, 97)}), new z(22, new v0[]{new v0(2, 38), new v0(2, 39)}), new z(22, new v0[]{new v0(4, 18), new v0(2, 19)}), new z(26, new v0[]{new v0(4, 14), new v0(2, 15)})), new f(9, new int[]{6, 26, 46}, new z(30, new v0[]{new v0(2, 116)}), new z(22, new v0[]{new v0(3, 36), new v0(2, 37)}), new z(20, new v0[]{new v0(4, 16), new v0(4, 17)}), new z(24, new v0[]{new v0(4, 12), new v0(4, 13)})), new f(10, new int[]{6, 28, 50}, new z(18, new v0[]{new v0(2, 68), new v0(2, 69)}), new z(26, new v0[]{new v0(4, 43), new v0(1, 44)}), new z(24, new v0[]{new v0(6, 19), new v0(2, 20)}), new z(28, new v0[]{new v0(6, 15), new v0(2, 16)})), new f(11, new int[]{6, 30, 54}, new z(20, new v0[]{new v0(4, 81)}), new z(30, new v0[]{new v0(1, 50), new v0(4, 51)}), new z(28, new v0[]{new v0(4, 22), new v0(4, 23)}), new z(24, new v0[]{new v0(3, 12), new v0(8, 13)})), new f(12, new int[]{6, 32, 58}, new z(24, new v0[]{new v0(2, 92), new v0(2, 93)}), new z(22, new v0[]{new v0(6, 36), new v0(2, 37)}), new z(26, new v0[]{new v0(4, 20), new v0(6, 21)}), new z(28, new v0[]{new v0(7, 14), new v0(4, 15)})), new f(13, new int[]{6, 34, 62}, new z(26, new v0[]{new v0(4, 107)}), new z(22, new v0[]{new v0(8, 37), new v0(1, 38)}), new z(24, new v0[]{new v0(8, 20), new v0(4, 21)}), new z(22, new v0[]{new v0(12, 11), new v0(4, 12)})), new f(14, new int[]{6, 26, 46, 66}, new z(30, new v0[]{new v0(3, 115), new v0(1, 116)}), new z(24, new v0[]{new v0(4, 40), new v0(5, 41)}), new z(20, new v0[]{new v0(11, 16), new v0(5, 17)}), new z(24, new v0[]{new v0(11, 12), new v0(5, 13)})), new f(15, new int[]{6, 26, 48, 70}, new z(22, new v0[]{new v0(5, 87), new v0(1, 88)}), new z(24, new v0[]{new v0(5, 41), new v0(5, 42)}), new z(30, new v0[]{new v0(5, 24), new v0(7, 25)}), new z(24, new v0[]{new v0(11, 12), new v0(7, 13)})), new f(16, new int[]{6, 26, 50, 74}, new z(24, new v0[]{new v0(5, 98), new v0(1, 99)}), new z(28, new v0[]{new v0(7, 45), new v0(3, 46)}), new z(24, new v0[]{new v0(15, 19), new v0(2, 20)}), new z(30, new v0[]{new v0(3, 15), new v0(13, 16)})), new f(17, new int[]{6, 30, 54, 78}, new z(28, new v0[]{new v0(1, 107), new v0(5, 108)}), new z(28, new v0[]{new v0(10, 46), new v0(1, 47)}), new z(28, new v0[]{new v0(1, 22), new v0(15, 23)}), new z(28, new v0[]{new v0(2, 14), new v0(17, 15)})), new f(18, new int[]{6, 30, 56, 82}, new z(30, new v0[]{new v0(5, 120), new v0(1, 121)}), new z(26, new v0[]{new v0(9, 43), new v0(4, 44)}), new z(28, new v0[]{new v0(17, 22), new v0(1, 23)}), new z(28, new v0[]{new v0(2, 14), new v0(19, 15)})), new f(19, new int[]{6, 30, 58, 86}, new z(28, new v0[]{new v0(3, 113), new v0(4, 114)}), new z(26, new v0[]{new v0(3, 44), new v0(11, 45)}), new z(26, new v0[]{new v0(17, 21), new v0(4, 22)}), new z(26, new v0[]{new v0(9, 13), new v0(16, 14)})), new f(20, new int[]{6, 34, 62, 90}, new z(28, new v0[]{new v0(3, 107), new v0(5, 108)}), new z(26, new v0[]{new v0(3, 41), new v0(13, 42)}), new z(30, new v0[]{new v0(15, 24), new v0(5, 25)}), new z(28, new v0[]{new v0(15, 15), new v0(10, 16)})), new f(21, new int[]{6, 28, 50, 72, 94}, new z(28, new v0[]{new v0(4, 116), new v0(4, 117)}), new z(26, new v0[]{new v0(17, 42)}), new z(28, new v0[]{new v0(17, 22), new v0(6, 23)}), new z(30, new v0[]{new v0(19, 16), new v0(6, 17)})), new f(22, new int[]{6, 26, 50, 74, 98}, new z(28, new v0[]{new v0(2, 111), new v0(7, 112)}), new z(28, new v0[]{new v0(17, 46)}), new z(30, new v0[]{new v0(7, 24), new v0(16, 25)}), new z(24, new v0[]{new v0(34, 13)})), new f(23, new int[]{6, 30, 54, 78, 102}, new z(30, new v0[]{new v0(4, 121), new v0(5, 122)}), new z(28, new v0[]{new v0(4, 47), new v0(14, 48)}), new z(30, new v0[]{new v0(11, 24), new v0(14, 25)}), new z(30, new v0[]{new v0(16, 15), new v0(14, 16)})), new f(24, new int[]{6, 28, 54, 80, 106}, new z(30, new v0[]{new v0(6, 117), new v0(4, 118)}), new z(28, new v0[]{new v0(6, 45), new v0(14, 46)}), new z(30, new v0[]{new v0(11, 24), new v0(16, 25)}), new z(30, new v0[]{new v0(30, 16), new v0(2, 17)})), new f(25, new int[]{6, 32, 58, 84, 110}, new z(26, new v0[]{new v0(8, 106), new v0(4, 107)}), new z(28, new v0[]{new v0(8, 47), new v0(13, 48)}), new z(30, new v0[]{new v0(7, 24), new v0(22, 25)}), new z(30, new v0[]{new v0(22, 15), new v0(13, 16)})), new f(26, new int[]{6, 30, 58, 86, 114}, new z(28, new v0[]{new v0(10, 114), new v0(2, 115)}), new z(28, new v0[]{new v0(19, 46), new v0(4, 47)}), new z(28, new v0[]{new v0(28, 22), new v0(6, 23)}), new z(30, new v0[]{new v0(33, 16), new v0(4, 17)})), new f(27, new int[]{6, 34, 62, 90, 118}, new z(30, new v0[]{new v0(8, 122), new v0(4, 123)}), new z(28, new v0[]{new v0(22, 45), new v0(3, 46)}), new z(30, new v0[]{new v0(8, 23), new v0(26, 24)}), new z(30, new v0[]{new v0(12, 15), new v0(28, 16)})), new f(28, new int[]{6, 26, 50, 74, 98, 122}, new z(30, new v0[]{new v0(3, 117), new v0(10, 118)}), new z(28, new v0[]{new v0(3, 45), new v0(23, 46)}), new z(30, new v0[]{new v0(4, 24), new v0(31, 25)}), new z(30, new v0[]{new v0(11, 15), new v0(31, 16)})), new f(29, new int[]{6, 30, 54, 78, 102, 126}, new z(30, new v0[]{new v0(7, 116), new v0(7, 117)}), new z(28, new v0[]{new v0(21, 45), new v0(7, 46)}), new z(30, new v0[]{new v0(1, 23), new v0(37, 24)}), new z(30, new v0[]{new v0(19, 15), new v0(26, 16)})), new f(30, new int[]{6, 26, 52, 78, 104, 130}, new z(30, new v0[]{new v0(5, 115), new v0(10, 116)}), new z(28, new v0[]{new v0(19, 47), new v0(10, 48)}), new z(30, new v0[]{new v0(15, 24), new v0(25, 25)}), new z(30, new v0[]{new v0(23, 15), new v0(25, 16)})), new f(31, new int[]{6, 30, 56, 82, 108, 134}, new z(30, new v0[]{new v0(13, 115), new v0(3, 116)}), new z(28, new v0[]{new v0(2, 46), new v0(29, 47)}), new z(30, new v0[]{new v0(42, 24), new v0(1, 25)}), new z(30, new v0[]{new v0(23, 15), new v0(28, 16)})), new f(32, new int[]{6, 34, 60, 86, 112, 138}, new z(30, new v0[]{new v0(17, 115)}), new z(28, new v0[]{new v0(10, 46), new v0(23, 47)}), new z(30, new v0[]{new v0(10, 24), new v0(35, 25)}), new z(30, new v0[]{new v0(19, 15), new v0(35, 16)})), new f(33, new int[]{6, 30, 58, 86, 114, 142}, new z(30, new v0[]{new v0(17, 115), new v0(1, 116)}), new z(28, new v0[]{new v0(14, 46), new v0(21, 47)}), new z(30, new v0[]{new v0(29, 24), new v0(19, 25)}), new z(30, new v0[]{new v0(11, 15), new v0(46, 16)})), new f(34, new int[]{6, 34, 62, 90, 118, 146}, new z(30, new v0[]{new v0(13, 115), new v0(6, 116)}), new z(28, new v0[]{new v0(14, 46), new v0(23, 47)}), new z(30, new v0[]{new v0(44, 24), new v0(7, 25)}), new z(30, new v0[]{new v0(59, 16), new v0(1, 17)})), new f(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new z(30, new v0[]{new v0(12, 121), new v0(7, 122)}), new z(28, new v0[]{new v0(12, 47), new v0(26, 48)}), new z(30, new v0[]{new v0(39, 24), new v0(14, 25)}), new z(30, new v0[]{new v0(22, 15), new v0(41, 16)})), new f(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new z(30, new v0[]{new v0(6, 121), new v0(14, 122)}), new z(28, new v0[]{new v0(6, 47), new v0(34, 48)}), new z(30, new v0[]{new v0(46, 24), new v0(10, 25)}), new z(30, new v0[]{new v0(2, 15), new v0(64, 16)})), new f(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new z(30, new v0[]{new v0(17, 122), new v0(4, 123)}), new z(28, new v0[]{new v0(29, 46), new v0(14, 47)}), new z(30, new v0[]{new v0(49, 24), new v0(10, 25)}), new z(30, new v0[]{new v0(24, 15), new v0(46, 16)})), new f(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new z(30, new v0[]{new v0(4, 122), new v0(18, 123)}), new z(28, new v0[]{new v0(13, 46), new v0(32, 47)}), new z(30, new v0[]{new v0(48, 24), new v0(14, 25)}), new z(30, new v0[]{new v0(42, 15), new v0(32, 16)})), new f(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new z(30, new v0[]{new v0(20, 117), new v0(4, 118)}), new z(28, new v0[]{new v0(40, 47), new v0(7, 48)}), new z(30, new v0[]{new v0(43, 24), new v0(22, 25)}), new z(30, new v0[]{new v0(10, 15), new v0(67, 16)})), new f(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new z(30, new v0[]{new v0(19, 118), new v0(6, 119)}), new z(28, new v0[]{new v0(18, 47), new v0(31, 48)}), new z(30, new v0[]{new v0(34, 24), new v0(34, 25)}), new z(30, new v0[]{new v0(20, 15), new v0(61, 16)}))};
    }

    public static f b(int i10) {
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

    public static f c(int i10) {
        if (i10 >= 1 && i10 <= 40) {
            return f15566f[i10 - 1];
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        return String.valueOf(this.f15567a);
    }
}
