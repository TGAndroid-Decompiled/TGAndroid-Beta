package defpackage;

import java.util.HashSet;
public final class rd1 {
    public static final rd1 b = new rd1(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
    public final HashSet a = new HashSet();

    static {
        new rd1(new int[]{1, 2, 3, 4, 5, 6, 7});
    }

    public rd1(int[] iArr) {
        for (int i : iArr) {
            this.a.add(Integer.valueOf(i));
        }
    }
}
