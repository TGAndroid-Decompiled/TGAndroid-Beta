package defpackage;

import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
public abstract class qoe {
    public static FrameLayout.LayoutParams a(float f, float f2, int i) {
        return new FrameLayout.LayoutParams(z(f), z(f2), i);
    }

    public static FrameLayout.LayoutParams b(float f, float f2, int i, float f3, float f4, float f5, float f6) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(f), z(f2), i);
        layoutParams.setMargins(gm.L(f3), gm.L(f4), gm.L(f5), gm.L(f6));
        return layoutParams;
    }

    public static FrameLayout.LayoutParams c(float f, int i) {
        return new FrameLayout.LayoutParams(z(i), z(f));
    }

    public static FrameLayout.LayoutParams d(int i, float f, int i2, float f2, float f3, float f4, float f5) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(i), z(f), i2);
        layoutParams.setMargins(gm.L(f2), gm.L(f3), gm.L(f4), gm.L(f5));
        return layoutParams;
    }

    public static FrameLayout.LayoutParams e(int i, int i2, int i3) {
        return new FrameLayout.LayoutParams(z(i), z(i2), i3);
    }

    public static FrameLayout.LayoutParams f(float f, int i, int i2, int i3, int i4, int i5, int i6) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(i), z(f), i2);
        layoutParams.setMargins(i3, i4, i5, i6);
        return layoutParams;
    }

    public static FrameLayout.LayoutParams g() {
        return c(-1.0f, -1);
    }

    public static FrameLayout.LayoutParams h(float f, float f2, int i) {
        return new FrameLayout.LayoutParams(z(f), z(f2), Gravity.getAbsoluteGravity(i, jb6.a0 ? 1 : 0));
    }

    public static FrameLayout.LayoutParams i(float f, float f2, int i, float f3, float f4, float f5, float f6) {
        float f7;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(f), z(f2), Gravity.getAbsoluteGravity(i, jb6.a0 ? 1 : 0));
        if (jb6.a0) {
            f7 = f5;
        } else {
            f7 = f3;
        }
        layoutParams.leftMargin = gm.L(f7);
        layoutParams.topMargin = gm.L(f4);
        if (!jb6.a0) {
            f3 = f5;
        }
        layoutParams.rightMargin = gm.L(f3);
        layoutParams.bottomMargin = gm.L(f6);
        return layoutParams;
    }

    public static LinearLayout.LayoutParams j(float f, float f2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(-2.0f), z(20.66f));
        layoutParams.setMargins(gm.L(f), gm.L(0.0f), gm.L(f2), gm.L(0.0f));
        layoutParams.gravity = 16;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams k(float f, float f2, float f3, float f4, int i, int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i), z(i2));
        layoutParams.setMargins(gm.L(f), gm.L(f2), gm.L(f3), gm.L(f4));
        return layoutParams;
    }

    public static LinearLayout.LayoutParams l(float f, int i, int i2) {
        return new LinearLayout.LayoutParams(z(i), z(i2), f);
    }

    public static LinearLayout.LayoutParams m(float f, int i, int i2, int i3, int i4, int i5) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i), z(i2), f);
        layoutParams.setMargins(gm.L(i3), gm.L(0.0f), gm.L(i4), gm.L(i5));
        return layoutParams;
    }

    public static LinearLayout.LayoutParams n(float f, int i, int i2, int i3, int i4, int i5, int i6) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i), z(f));
        layoutParams.setMargins(gm.L(i3), gm.L(i4), gm.L(i5), gm.L(i6));
        layoutParams.gravity = i2;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams o(int i, int i2) {
        return new LinearLayout.LayoutParams(z(i), z(i2));
    }

    public static LinearLayout.LayoutParams p(int i, int i2, float f, int i3) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i), z(i2), f);
        layoutParams.gravity = i3;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams q(int i, int i2, float f, int i3, int i4, int i5, int i6, int i7) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i), z(i2), f);
        layoutParams.setMargins(gm.L(i4), gm.L(i5), gm.L(i6), gm.L(i7));
        layoutParams.gravity = i3;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams r(int i, int i2, int i3) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i), z(i2));
        layoutParams.gravity = i3;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams s(int i, int i2, int i3, float f, float f2, float f3, float f4) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i), z(i2));
        layoutParams.setMargins(gm.L(f), gm.L(f2), gm.L(f3), gm.L(f4));
        layoutParams.gravity = i3;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams t(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i), z(i2));
        layoutParams.setMargins(gm.L(i4), gm.L(i5), gm.L(i6), gm.L(i7));
        layoutParams.gravity = i3;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams u(float f, float f2, int i, float f3, float f4, float f5, float f6) {
        float f7;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(f), z(f2), Gravity.getAbsoluteGravity(i, jb6.a0 ? 1 : 0));
        if (jb6.a0) {
            f7 = f5;
        } else {
            f7 = f3;
        }
        layoutParams.leftMargin = gm.L(f7);
        layoutParams.topMargin = gm.L(f4);
        if (!jb6.a0) {
            f3 = f5;
        }
        layoutParams.rightMargin = gm.L(f3);
        layoutParams.bottomMargin = gm.L(f6);
        return layoutParams;
    }

    public static RelativeLayout.LayoutParams v(int i, float f, int i2, float f2, int i3) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(z(f), z(f2));
        if (i3 >= 0) {
            layoutParams.addRule(i3);
        }
        layoutParams.leftMargin = gm.L(i);
        layoutParams.topMargin = gm.L(0.0f);
        layoutParams.rightMargin = gm.L(i2);
        layoutParams.bottomMargin = gm.L(0.0f);
        return layoutParams;
    }

    public static RelativeLayout.LayoutParams w(int i, int i2) {
        return v(0, i, 0, i2, -1);
    }

    public static FrameLayout.LayoutParams x(int i, int i2, int i3) {
        return new FrameLayout.LayoutParams(z(i), z(i2), i3);
    }

    public static int y() {
        if (jb6.a0) {
            return 5;
        }
        return 3;
    }

    public static int z(float f) {
        if (f >= 0.0f) {
            f = gm.L(f);
        }
        return (int) f;
    }
}
