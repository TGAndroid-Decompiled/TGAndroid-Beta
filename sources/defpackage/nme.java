package defpackage;

import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
public abstract class nme {
    public static FrameLayout.LayoutParams a(float f, float f2, int i) {
        return new FrameLayout.LayoutParams(z(f), z(f2), i);
    }

    public static FrameLayout.LayoutParams b(float f, float f2, int i, float f3, float f4, float f5, float f6) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(f), z(f2), i);
        layoutParams.setMargins(gl.L(f3), gl.L(f4), gl.L(f5), gl.L(f6));
        return layoutParams;
    }

    public static FrameLayout.LayoutParams c(float f, int i) {
        return new FrameLayout.LayoutParams(z(i), z(f));
    }

    public static FrameLayout.LayoutParams d(int i, float f, int i2, float f2, float f3, float f4, float f5) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(i), z(f), i2);
        layoutParams.setMargins(gl.L(f2), gl.L(f3), gl.L(f4), gl.L(f5));
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
        return new FrameLayout.LayoutParams(z(f), z(f2), Gravity.getAbsoluteGravity(i, k96.a0 ? 1 : 0));
    }

    public static FrameLayout.LayoutParams i(float f, float f2, int i, float f3, float f4, float f5, float f6) {
        float f7;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(f), z(f2), Gravity.getAbsoluteGravity(i, k96.a0 ? 1 : 0));
        if (k96.a0) {
            f7 = f5;
        } else {
            f7 = f3;
        }
        layoutParams.leftMargin = gl.L(f7);
        layoutParams.topMargin = gl.L(f4);
        if (!k96.a0) {
            f3 = f5;
        }
        layoutParams.rightMargin = gl.L(f3);
        layoutParams.bottomMargin = gl.L(f6);
        return layoutParams;
    }

    public static LinearLayout.LayoutParams j(float f, float f2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(-2.0f), z(20.66f));
        layoutParams.setMargins(gl.L(f), gl.L(0.0f), gl.L(f2), gl.L(0.0f));
        layoutParams.gravity = 16;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams k(float f, float f2, float f3, float f4, int i, int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i), z(i2));
        layoutParams.setMargins(gl.L(f), gl.L(f2), gl.L(f3), gl.L(f4));
        return layoutParams;
    }

    public static LinearLayout.LayoutParams l(float f, int i, int i2) {
        return new LinearLayout.LayoutParams(z(i), z(i2), f);
    }

    public static LinearLayout.LayoutParams m(float f, int i, int i2, int i3, int i4, int i5) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i), z(i2), f);
        layoutParams.setMargins(gl.L(i3), gl.L(0.0f), gl.L(i4), gl.L(i5));
        return layoutParams;
    }

    public static LinearLayout.LayoutParams n(float f, int i, int i2, int i3, int i4, int i5, int i6) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i), z(f));
        layoutParams.setMargins(gl.L(i3), gl.L(i4), gl.L(i5), gl.L(i6));
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
        layoutParams.setMargins(gl.L(i4), gl.L(i5), gl.L(i6), gl.L(i7));
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
        layoutParams.setMargins(gl.L(f), gl.L(f2), gl.L(f3), gl.L(f4));
        layoutParams.gravity = i3;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams t(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i), z(i2));
        layoutParams.setMargins(gl.L(i4), gl.L(i5), gl.L(i6), gl.L(i7));
        layoutParams.gravity = i3;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams u(float f, float f2, int i, float f3, float f4, float f5, float f6) {
        float f7;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(f), z(f2), Gravity.getAbsoluteGravity(i, k96.a0 ? 1 : 0));
        if (k96.a0) {
            f7 = f5;
        } else {
            f7 = f3;
        }
        layoutParams.leftMargin = gl.L(f7);
        layoutParams.topMargin = gl.L(f4);
        if (!k96.a0) {
            f3 = f5;
        }
        layoutParams.rightMargin = gl.L(f3);
        layoutParams.bottomMargin = gl.L(f6);
        return layoutParams;
    }

    public static RelativeLayout.LayoutParams v(int i, float f, int i2, float f2, int i3) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(z(f), z(f2));
        if (i3 >= 0) {
            layoutParams.addRule(i3);
        }
        layoutParams.leftMargin = gl.L(i);
        layoutParams.topMargin = gl.L(0.0f);
        layoutParams.rightMargin = gl.L(i2);
        layoutParams.bottomMargin = gl.L(0.0f);
        return layoutParams;
    }

    public static RelativeLayout.LayoutParams w(int i, int i2) {
        return v(0, i, 0, i2, -1);
    }

    public static FrameLayout.LayoutParams x(int i, int i2, int i3) {
        return new FrameLayout.LayoutParams(z(i), z(i2), i3);
    }

    public static int y() {
        if (k96.a0) {
            return 5;
        }
        return 3;
    }

    public static int z(float f) {
        if (f >= 0.0f) {
            f = gl.L(f);
        }
        return (int) f;
    }
}
