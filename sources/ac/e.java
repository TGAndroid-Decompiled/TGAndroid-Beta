package ac;
public final class e {
    public static final int[][] f372c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};
    public final d f373a;
    public final byte f374b;

    public e(int i10) {
        int i11 = (i10 >> 3) & 3;
        if (i11 >= 0 && i11 < 4) {
            this.f373a = d.e[i11];
            this.f374b = (byte) (i10 & 7);
            return;
        }
        throw new IllegalArgumentException();
    }

    public static e a(int i10, int i11) {
        int bitCount;
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        for (int i14 = 0; i14 < 32; i14++) {
            int[] iArr = f372c[i14];
            int i15 = iArr[0];
            if (i15 != i10 && i15 != i11) {
                int bitCount2 = Integer.bitCount(i10 ^ i15);
                if (bitCount2 < i12) {
                    i13 = iArr[1];
                    i12 = bitCount2;
                }
                if (i10 != i11 && (bitCount = Integer.bitCount(i15 ^ i11)) < i12) {
                    i13 = iArr[1];
                    i12 = bitCount;
                }
            } else {
                return new e(iArr[1]);
            }
        }
        if (i12 <= 3) {
            return new e(i13);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f373a != eVar.f373a || this.f374b != eVar.f374b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f373a.ordinal() << 3) | this.f374b;
    }
}
