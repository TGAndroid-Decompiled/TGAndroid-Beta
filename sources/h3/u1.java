package h3;

import fh.y5;
import java.util.Arrays;
public final class u1 extends g2 {
    public static final String d;
    public static final y5 f9779e;
    public final float f9780c;

    static {
        int i9 = d5.f0.f4349a;
        d = Integer.toString(1, 36);
        f9779e = new y5(21);
    }

    public u1() {
        this.f9780c = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u1)) {
            return false;
        }
        if (this.f9780c != ((u1) obj).f9780c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f9780c)});
    }

    public u1(float f10) {
        d5.a.e("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.f9780c = f10;
    }
}
