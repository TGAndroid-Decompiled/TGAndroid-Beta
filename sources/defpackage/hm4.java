package defpackage;
public final class hm4 {
    public static final int[][] c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};
    public final w34 a;
    public final byte b;

    public hm4(int i) {
        int i2 = (i >> 3) & 3;
        if (i2 >= 0 && i2 < 4) {
            this.a = w34.e[i2];
            this.b = (byte) (i & 7);
            return;
        }
        sc8.e();
        throw null;
    }

    public static hm4 a(int i, int i2) {
        int bitCount;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int i5 = 0; i5 < 32; i5++) {
            int[] iArr = c[i5];
            int i6 = iArr[0];
            if (i6 != i && i6 != i2) {
                int bitCount2 = Integer.bitCount(i ^ i6);
                if (bitCount2 < i3) {
                    i4 = iArr[1];
                    i3 = bitCount2;
                }
                if (i != i2 && (bitCount = Integer.bitCount(i6 ^ i2)) < i3) {
                    i4 = iArr[1];
                    i3 = bitCount;
                }
            } else {
                return new hm4(iArr[1]);
            }
        }
        if (i3 <= 3) {
            return new hm4(i4);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hm4)) {
            return false;
        }
        hm4 hm4Var = (hm4) obj;
        if (this.a != hm4Var.a || this.b != hm4Var.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a.ordinal() << 3) | this.b;
    }
}
