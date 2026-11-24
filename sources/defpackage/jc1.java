package defpackage;

import java.util.HashSet;
public final class jc1 {
    public static final jc1 b = new jc1(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
    public final HashSet a = new HashSet();

    static {
        new jc1(new int[]{1, 2, 3, 4, 5, 6, 7});
    }

    public jc1(int[] iArr) {
        for (int i : iArr) {
            this.a.add(Integer.valueOf(i));
        }
    }
}
