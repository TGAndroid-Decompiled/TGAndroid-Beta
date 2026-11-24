package defpackage;

import android.os.Build;
public abstract class kj5 {
    public static final ym5 a;

    static {
        ym5 s;
        if (Build.VERSION.SDK_INT < 32) {
            s = ym5.p(4, 12, 252, 6396, 4);
        } else {
            s = ym5.s(12, 252, 6396, 4, 3145980, 82172, 737532, 9126140, 33904892, 202070268, 744444, 67108860, 743676, 3152124, 88316, 81980, 205215996, 3890172);
        }
        a = s;
    }
}
