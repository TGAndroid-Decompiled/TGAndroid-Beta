package defpackage;

import java.util.HashSet;
public final class rc1 {
    public static final rc1 b = new rc1(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
    public final HashSet a = new HashSet();

    static {
        new rc1(new int[]{1, 2, 3, 4, 5, 6, 7});
    }

    public rc1(int[] iArr) {
        for (int i : iArr) {
            this.a.add(Integer.valueOf(i));
        }
    }
}
