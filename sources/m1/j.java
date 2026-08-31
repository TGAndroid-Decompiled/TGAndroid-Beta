package m1;
public abstract class j {
    public static final int[] f13417a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138};

    public static Integer a(int i10) {
        if (i10 == 0) {
            return null;
        }
        return Integer.valueOf(i10 - 1);
    }

    public static boolean b(int i10, int i11) {
        if (i10 != 0) {
            if (i10 == i11) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public static int c(int i10) {
        if (i10 != 0) {
            return i10 - 1;
        }
        throw null;
    }

    public static int[] d(int i10) {
        int[] iArr = new int[i10];
        System.arraycopy(f13417a, 0, iArr, 0, i10);
        return iArr;
    }
}
