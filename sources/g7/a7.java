package g7;
public abstract class a7 {
    public static int a(int i9) {
        if (i9 != 1) {
            if (i9 == 2) {
                return 1;
            }
            if (i9 == 4) {
                return 2;
            }
            if (i9 != 8) {
                if (i9 == 16) {
                    return 4;
                }
                if (i9 != 32) {
                    if (i9 != 64) {
                        if (i9 != 128) {
                            if (i9 == 256) {
                                return 8;
                            }
                            if (i9 == 512) {
                                return 9;
                            }
                            throw new IllegalArgumentException(j3.r0.l(i9, "type needs to be >= FIRST and <= LAST, type="));
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }
}
