package f7;
public abstract class z6 {
    public static int a(int i9) {
        if (i9 != 0) {
            if (i9 != 90) {
                if (i9 != 180) {
                    if (i9 == 270) {
                        return 3;
                    }
                    throw new IllegalArgumentException(j3.r0.l(i9, "Invalid rotation: "));
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }
}
