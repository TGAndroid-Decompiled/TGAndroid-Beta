package gc;

import e2.r0;
import f5.v;
public final class f {
    public static final int[] f13154e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    public static final f[] f13155f = a();
    public final int f13156a;
    public final int[] f13157b;
    public final v[] f13158c;
    public final int d;

    public f(int i7, int[] iArr, v... vVarArr) {
        r0[] r0VarArr;
        this.f13156a = i7;
        this.f13157b = iArr;
        this.f13158c = vVarArr;
        v vVar = vVarArr[0];
        int i10 = vVar.f11018b;
        int i11 = 0;
        for (r0 r0Var : (r0[]) vVar.f11019c) {
            i11 += (r0Var.f10370b + i10) * r0Var.f10369a;
        }
        this.d = i11;
    }

    public static f[] a() {
        return new f[]{new f(1, new int[0], new v(7, new r0[]{new r0(1, 19)}, 5), new v(10, new r0[]{new r0(1, 16)}, 5), new v(13, new r0[]{new r0(1, 13)}, 5), new v(17, new r0[]{new r0(1, 9)}, 5)), new f(2, new int[]{6, 18}, new v(10, new r0[]{new r0(1, 34)}, 5), new v(16, new r0[]{new r0(1, 28)}, 5), new v(22, new r0[]{new r0(1, 22)}, 5), new v(28, new r0[]{new r0(1, 16)}, 5)), new f(3, new int[]{6, 22}, new v(15, new r0[]{new r0(1, 55)}, 5), new v(26, new r0[]{new r0(1, 44)}, 5), new v(18, new r0[]{new r0(2, 17)}, 5), new v(22, new r0[]{new r0(2, 13)}, 5)), new f(4, new int[]{6, 26}, new v(20, new r0[]{new r0(1, 80)}, 5), new v(18, new r0[]{new r0(2, 32)}, 5), new v(26, new r0[]{new r0(2, 24)}, 5), new v(16, new r0[]{new r0(4, 9)}, 5)), new f(5, new int[]{6, 30}, new v(26, new r0[]{new r0(1, 108)}, 5), new v(24, new r0[]{new r0(2, 43)}, 5), new v(18, new r0[]{new r0(2, 15), new r0(2, 16)}, 5), new v(22, new r0[]{new r0(2, 11), new r0(2, 12)}, 5)), new f(6, new int[]{6, 34}, new v(18, new r0[]{new r0(2, 68)}, 5), new v(16, new r0[]{new r0(4, 27)}, 5), new v(24, new r0[]{new r0(4, 19)}, 5), new v(28, new r0[]{new r0(4, 15)}, 5)), new f(7, new int[]{6, 22, 38}, new v(20, new r0[]{new r0(2, 78)}, 5), new v(18, new r0[]{new r0(4, 31)}, 5), new v(18, new r0[]{new r0(2, 14), new r0(4, 15)}, 5), new v(26, new r0[]{new r0(4, 13), new r0(1, 14)}, 5)), new f(8, new int[]{6, 24, 42}, new v(24, new r0[]{new r0(2, 97)}, 5), new v(22, new r0[]{new r0(2, 38), new r0(2, 39)}, 5), new v(22, new r0[]{new r0(4, 18), new r0(2, 19)}, 5), new v(26, new r0[]{new r0(4, 14), new r0(2, 15)}, 5)), new f(9, new int[]{6, 26, 46}, new v(30, new r0[]{new r0(2, 116)}, 5), new v(22, new r0[]{new r0(3, 36), new r0(2, 37)}, 5), new v(20, new r0[]{new r0(4, 16), new r0(4, 17)}, 5), new v(24, new r0[]{new r0(4, 12), new r0(4, 13)}, 5)), new f(10, new int[]{6, 28, 50}, new v(18, new r0[]{new r0(2, 68), new r0(2, 69)}, 5), new v(26, new r0[]{new r0(4, 43), new r0(1, 44)}, 5), new v(24, new r0[]{new r0(6, 19), new r0(2, 20)}, 5), new v(28, new r0[]{new r0(6, 15), new r0(2, 16)}, 5)), new f(11, new int[]{6, 30, 54}, new v(20, new r0[]{new r0(4, 81)}, 5), new v(30, new r0[]{new r0(1, 50), new r0(4, 51)}, 5), new v(28, new r0[]{new r0(4, 22), new r0(4, 23)}, 5), new v(24, new r0[]{new r0(3, 12), new r0(8, 13)}, 5)), new f(12, new int[]{6, 32, 58}, new v(24, new r0[]{new r0(2, 92), new r0(2, 93)}, 5), new v(22, new r0[]{new r0(6, 36), new r0(2, 37)}, 5), new v(26, new r0[]{new r0(4, 20), new r0(6, 21)}, 5), new v(28, new r0[]{new r0(7, 14), new r0(4, 15)}, 5)), new f(13, new int[]{6, 34, 62}, new v(26, new r0[]{new r0(4, 107)}, 5), new v(22, new r0[]{new r0(8, 37), new r0(1, 38)}, 5), new v(24, new r0[]{new r0(8, 20), new r0(4, 21)}, 5), new v(22, new r0[]{new r0(12, 11), new r0(4, 12)}, 5)), new f(14, new int[]{6, 26, 46, 66}, new v(30, new r0[]{new r0(3, 115), new r0(1, 116)}, 5), new v(24, new r0[]{new r0(4, 40), new r0(5, 41)}, 5), new v(20, new r0[]{new r0(11, 16), new r0(5, 17)}, 5), new v(24, new r0[]{new r0(11, 12), new r0(5, 13)}, 5)), new f(15, new int[]{6, 26, 48, 70}, new v(22, new r0[]{new r0(5, 87), new r0(1, 88)}, 5), new v(24, new r0[]{new r0(5, 41), new r0(5, 42)}, 5), new v(30, new r0[]{new r0(5, 24), new r0(7, 25)}, 5), new v(24, new r0[]{new r0(11, 12), new r0(7, 13)}, 5)), new f(16, new int[]{6, 26, 50, 74}, new v(24, new r0[]{new r0(5, 98), new r0(1, 99)}, 5), new v(28, new r0[]{new r0(7, 45), new r0(3, 46)}, 5), new v(24, new r0[]{new r0(15, 19), new r0(2, 20)}, 5), new v(30, new r0[]{new r0(3, 15), new r0(13, 16)}, 5)), new f(17, new int[]{6, 30, 54, 78}, new v(28, new r0[]{new r0(1, 107), new r0(5, 108)}, 5), new v(28, new r0[]{new r0(10, 46), new r0(1, 47)}, 5), new v(28, new r0[]{new r0(1, 22), new r0(15, 23)}, 5), new v(28, new r0[]{new r0(2, 14), new r0(17, 15)}, 5)), new f(18, new int[]{6, 30, 56, 82}, new v(30, new r0[]{new r0(5, 120), new r0(1, 121)}, 5), new v(26, new r0[]{new r0(9, 43), new r0(4, 44)}, 5), new v(28, new r0[]{new r0(17, 22), new r0(1, 23)}, 5), new v(28, new r0[]{new r0(2, 14), new r0(19, 15)}, 5)), new f(19, new int[]{6, 30, 58, 86}, new v(28, new r0[]{new r0(3, 113), new r0(4, 114)}, 5), new v(26, new r0[]{new r0(3, 44), new r0(11, 45)}, 5), new v(26, new r0[]{new r0(17, 21), new r0(4, 22)}, 5), new v(26, new r0[]{new r0(9, 13), new r0(16, 14)}, 5)), new f(20, new int[]{6, 34, 62, 90}, new v(28, new r0[]{new r0(3, 107), new r0(5, 108)}, 5), new v(26, new r0[]{new r0(3, 41), new r0(13, 42)}, 5), new v(30, new r0[]{new r0(15, 24), new r0(5, 25)}, 5), new v(28, new r0[]{new r0(15, 15), new r0(10, 16)}, 5)), new f(21, new int[]{6, 28, 50, 72, 94}, new v(28, new r0[]{new r0(4, 116), new r0(4, 117)}, 5), new v(26, new r0[]{new r0(17, 42)}, 5), new v(28, new r0[]{new r0(17, 22), new r0(6, 23)}, 5), new v(30, new r0[]{new r0(19, 16), new r0(6, 17)}, 5)), new f(22, new int[]{6, 26, 50, 74, 98}, new v(28, new r0[]{new r0(2, 111), new r0(7, 112)}, 5), new v(28, new r0[]{new r0(17, 46)}, 5), new v(30, new r0[]{new r0(7, 24), new r0(16, 25)}, 5), new v(24, new r0[]{new r0(34, 13)}, 5)), new f(23, new int[]{6, 30, 54, 78, 102}, new v(30, new r0[]{new r0(4, 121), new r0(5, 122)}, 5), new v(28, new r0[]{new r0(4, 47), new r0(14, 48)}, 5), new v(30, new r0[]{new r0(11, 24), new r0(14, 25)}, 5), new v(30, new r0[]{new r0(16, 15), new r0(14, 16)}, 5)), new f(24, new int[]{6, 28, 54, 80, 106}, new v(30, new r0[]{new r0(6, 117), new r0(4, 118)}, 5), new v(28, new r0[]{new r0(6, 45), new r0(14, 46)}, 5), new v(30, new r0[]{new r0(11, 24), new r0(16, 25)}, 5), new v(30, new r0[]{new r0(30, 16), new r0(2, 17)}, 5)), new f(25, new int[]{6, 32, 58, 84, 110}, new v(26, new r0[]{new r0(8, 106), new r0(4, 107)}, 5), new v(28, new r0[]{new r0(8, 47), new r0(13, 48)}, 5), new v(30, new r0[]{new r0(7, 24), new r0(22, 25)}, 5), new v(30, new r0[]{new r0(22, 15), new r0(13, 16)}, 5)), new f(26, new int[]{6, 30, 58, 86, 114}, new v(28, new r0[]{new r0(10, 114), new r0(2, 115)}, 5), new v(28, new r0[]{new r0(19, 46), new r0(4, 47)}, 5), new v(28, new r0[]{new r0(28, 22), new r0(6, 23)}, 5), new v(30, new r0[]{new r0(33, 16), new r0(4, 17)}, 5)), new f(27, new int[]{6, 34, 62, 90, 118}, new v(30, new r0[]{new r0(8, 122), new r0(4, 123)}, 5), new v(28, new r0[]{new r0(22, 45), new r0(3, 46)}, 5), new v(30, new r0[]{new r0(8, 23), new r0(26, 24)}, 5), new v(30, new r0[]{new r0(12, 15), new r0(28, 16)}, 5)), new f(28, new int[]{6, 26, 50, 74, 98, 122}, new v(30, new r0[]{new r0(3, 117), new r0(10, 118)}, 5), new v(28, new r0[]{new r0(3, 45), new r0(23, 46)}, 5), new v(30, new r0[]{new r0(4, 24), new r0(31, 25)}, 5), new v(30, new r0[]{new r0(11, 15), new r0(31, 16)}, 5)), new f(29, new int[]{6, 30, 54, 78, 102, 126}, new v(30, new r0[]{new r0(7, 116), new r0(7, 117)}, 5), new v(28, new r0[]{new r0(21, 45), new r0(7, 46)}, 5), new v(30, new r0[]{new r0(1, 23), new r0(37, 24)}, 5), new v(30, new r0[]{new r0(19, 15), new r0(26, 16)}, 5)), new f(30, new int[]{6, 26, 52, 78, 104, 130}, new v(30, new r0[]{new r0(5, 115), new r0(10, 116)}, 5), new v(28, new r0[]{new r0(19, 47), new r0(10, 48)}, 5), new v(30, new r0[]{new r0(15, 24), new r0(25, 25)}, 5), new v(30, new r0[]{new r0(23, 15), new r0(25, 16)}, 5)), new f(31, new int[]{6, 30, 56, 82, 108, 134}, new v(30, new r0[]{new r0(13, 115), new r0(3, 116)}, 5), new v(28, new r0[]{new r0(2, 46), new r0(29, 47)}, 5), new v(30, new r0[]{new r0(42, 24), new r0(1, 25)}, 5), new v(30, new r0[]{new r0(23, 15), new r0(28, 16)}, 5)), new f(32, new int[]{6, 34, 60, 86, 112, 138}, new v(30, new r0[]{new r0(17, 115)}, 5), new v(28, new r0[]{new r0(10, 46), new r0(23, 47)}, 5), new v(30, new r0[]{new r0(10, 24), new r0(35, 25)}, 5), new v(30, new r0[]{new r0(19, 15), new r0(35, 16)}, 5)), new f(33, new int[]{6, 30, 58, 86, 114, 142}, new v(30, new r0[]{new r0(17, 115), new r0(1, 116)}, 5), new v(28, new r0[]{new r0(14, 46), new r0(21, 47)}, 5), new v(30, new r0[]{new r0(29, 24), new r0(19, 25)}, 5), new v(30, new r0[]{new r0(11, 15), new r0(46, 16)}, 5)), new f(34, new int[]{6, 34, 62, 90, 118, 146}, new v(30, new r0[]{new r0(13, 115), new r0(6, 116)}, 5), new v(28, new r0[]{new r0(14, 46), new r0(23, 47)}, 5), new v(30, new r0[]{new r0(44, 24), new r0(7, 25)}, 5), new v(30, new r0[]{new r0(59, 16), new r0(1, 17)}, 5)), new f(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new v(30, new r0[]{new r0(12, 121), new r0(7, 122)}, 5), new v(28, new r0[]{new r0(12, 47), new r0(26, 48)}, 5), new v(30, new r0[]{new r0(39, 24), new r0(14, 25)}, 5), new v(30, new r0[]{new r0(22, 15), new r0(41, 16)}, 5)), new f(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new v(30, new r0[]{new r0(6, 121), new r0(14, 122)}, 5), new v(28, new r0[]{new r0(6, 47), new r0(34, 48)}, 5), new v(30, new r0[]{new r0(46, 24), new r0(10, 25)}, 5), new v(30, new r0[]{new r0(2, 15), new r0(64, 16)}, 5)), new f(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new v(30, new r0[]{new r0(17, 122), new r0(4, 123)}, 5), new v(28, new r0[]{new r0(29, 46), new r0(14, 47)}, 5), new v(30, new r0[]{new r0(49, 24), new r0(10, 25)}, 5), new v(30, new r0[]{new r0(24, 15), new r0(46, 16)}, 5)), new f(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new v(30, new r0[]{new r0(4, 122), new r0(18, 123)}, 5), new v(28, new r0[]{new r0(13, 46), new r0(32, 47)}, 5), new v(30, new r0[]{new r0(48, 24), new r0(14, 25)}, 5), new v(30, new r0[]{new r0(42, 15), new r0(32, 16)}, 5)), new f(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new v(30, new r0[]{new r0(20, 117), new r0(4, 118)}, 5), new v(28, new r0[]{new r0(40, 47), new r0(7, 48)}, 5), new v(30, new r0[]{new r0(43, 24), new r0(22, 25)}, 5), new v(30, new r0[]{new r0(10, 15), new r0(67, 16)}, 5)), new f(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new v(30, new r0[]{new r0(19, 118), new r0(6, 119)}, 5), new v(28, new r0[]{new r0(18, 47), new r0(31, 48)}, 5), new v(30, new r0[]{new r0(34, 24), new r0(34, 25)}, 5), new v(30, new r0[]{new r0(20, 15), new r0(61, 16)}, 5))};
    }

    public static f b(int i7) {
        int i10 = Integer.MAX_VALUE;
        int i11 = 0;
        for (int i12 = 0; i12 < 34; i12++) {
            int i13 = f13154e[i12];
            if (i13 == i7) {
                return c(i12 + 7);
            }
            int bitCount = Integer.bitCount(i13 ^ i7);
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

    public static f c(int i7) {
        if (i7 >= 1 && i7 <= 40) {
            return f13155f[i7 - 1];
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        return String.valueOf(this.f13156a);
    }
}
