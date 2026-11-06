package c8;
public abstract class vb {
    public static int a(int i7) {
        if (i7 != 1) {
            if (i7 == 2) {
                return 1;
            }
            if (i7 == 4) {
                return 2;
            }
            if (i7 != 8) {
                if (i7 == 16) {
                    return 4;
                }
                if (i7 != 32) {
                    if (i7 != 64) {
                        if (i7 != 128) {
                            if (i7 == 256) {
                                return 8;
                            }
                            if (i7 == 512) {
                                return 9;
                            }
                            throw new IllegalArgumentException(jg.g.j(i7, "type needs to be >= FIRST and <= LAST, type="));
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
