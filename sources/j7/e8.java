package j7;
public abstract class e8 {
    public static int a(int i10) {
        if (i10 != 0) {
            if (i10 != 90) {
                if (i10 != 180) {
                    if (i10 == 270) {
                        return 3;
                    }
                    throw new IllegalArgumentException(kh.a2.j(i10, "Invalid rotation: "));
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }
}
