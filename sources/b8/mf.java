package b8;

import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
public abstract class mf {
    public static FrameLayout.LayoutParams a(float f10, float f11, int i3) {
        return new FrameLayout.LayoutParams(z(f10), z(f11), i3);
    }

    public static FrameLayout.LayoutParams b(float f10, float f11, int i3, float f12, float f13, float f14, float f15) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(f10), z(f11), i3);
        layoutParams.setMargins(org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(f14), org.telegram.messenger.g0.L(f15));
        return layoutParams;
    }

    public static FrameLayout.LayoutParams c(float f10, int i3) {
        return new FrameLayout.LayoutParams(z(i3), z(f10));
    }

    public static FrameLayout.LayoutParams d(int i3, float f10, int i10, float f11, float f12, float f13, float f14) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(i3), z(f10), i10);
        layoutParams.setMargins(org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(f14));
        return layoutParams;
    }

    public static FrameLayout.LayoutParams e(int i3, int i10, int i11) {
        return new FrameLayout.LayoutParams(z(i3), z(i10), i11);
    }

    public static FrameLayout.LayoutParams f(float f10, int i3, int i10, int i11, int i12, int i13, int i14) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(i3), z(f10), i10);
        layoutParams.setMargins(i11, i12, i13, i14);
        return layoutParams;
    }

    public static FrameLayout.LayoutParams g() {
        return c(-1.0f, -1);
    }

    public static FrameLayout.LayoutParams h(float f10, float f11, int i3) {
        return new FrameLayout.LayoutParams(z(f10), z(f11), Gravity.getAbsoluteGravity(i3, org.telegram.messenger.bd.f21784a0 ? 1 : 0));
    }

    public static FrameLayout.LayoutParams i(float f10, float f11, int i3, float f12, float f13, float f14, float f15) {
        float f16;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(f10), z(f11), Gravity.getAbsoluteGravity(i3, org.telegram.messenger.bd.f21784a0 ? 1 : 0));
        if (org.telegram.messenger.bd.f21784a0) {
            f16 = f14;
        } else {
            f16 = f12;
        }
        layoutParams.leftMargin = org.telegram.messenger.g0.L(f16);
        layoutParams.topMargin = org.telegram.messenger.g0.L(f13);
        if (!org.telegram.messenger.bd.f21784a0) {
            f12 = f14;
        }
        layoutParams.rightMargin = org.telegram.messenger.g0.L(f12);
        layoutParams.bottomMargin = org.telegram.messenger.g0.L(f15);
        return layoutParams;
    }

    public static LinearLayout.LayoutParams j(float f10, float f11) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(-2.0f), z(20.66f));
        layoutParams.setMargins(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(0.0f));
        layoutParams.gravity = 16;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams k(float f10, float f11, float f12, float f13, int i3, int i10) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i3), z(i10));
        layoutParams.setMargins(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f13));
        return layoutParams;
    }

    public static LinearLayout.LayoutParams l(float f10, int i3, int i10) {
        return new LinearLayout.LayoutParams(z(i3), z(i10), f10);
    }

    public static LinearLayout.LayoutParams m(float f10, int i3, int i10, int i11, int i12, int i13) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i3), z(i10), f10);
        layoutParams.setMargins(org.telegram.messenger.g0.L(i11), org.telegram.messenger.g0.L(0), org.telegram.messenger.g0.L(i12), org.telegram.messenger.g0.L(i13));
        return layoutParams;
    }

    public static LinearLayout.LayoutParams n(float f10, int i3, int i10, int i11, int i12, int i13, int i14) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i3), z(f10));
        layoutParams.setMargins(org.telegram.messenger.g0.L(i11), org.telegram.messenger.g0.L(i12), org.telegram.messenger.g0.L(i13), org.telegram.messenger.g0.L(i14));
        layoutParams.gravity = i10;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams o(int i3, int i10) {
        return new LinearLayout.LayoutParams(z(i3), z(i10));
    }

    public static LinearLayout.LayoutParams p(int i3, int i10, float f10, int i11) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i3), z(i10), f10);
        layoutParams.gravity = i11;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams q(int i3, int i10, float f10, int i11, int i12, int i13, int i14, int i15) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i3), z(i10), f10);
        layoutParams.setMargins(org.telegram.messenger.g0.L(i12), org.telegram.messenger.g0.L(i13), org.telegram.messenger.g0.L(i14), org.telegram.messenger.g0.L(i15));
        layoutParams.gravity = i11;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams r(int i3, int i10, int i11) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i3), z(i10));
        layoutParams.gravity = i11;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams s(int i3, int i10, int i11, float f10, float f11, float f12, float f13) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i3), z(i10));
        layoutParams.setMargins(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f13));
        layoutParams.gravity = i11;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams t(int i3, int i10, int i11, int i12, int i13, int i14, int i15) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i3), z(i10));
        layoutParams.setMargins(org.telegram.messenger.g0.L(i12), org.telegram.messenger.g0.L(i13), org.telegram.messenger.g0.L(i14), org.telegram.messenger.g0.L(i15));
        layoutParams.gravity = i11;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams u(float f10, float f11, int i3, float f12, float f13, float f14, float f15) {
        float f16;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(f10), z(f11), Gravity.getAbsoluteGravity(i3, org.telegram.messenger.bd.f21784a0 ? 1 : 0));
        if (org.telegram.messenger.bd.f21784a0) {
            f16 = f14;
        } else {
            f16 = f12;
        }
        layoutParams.leftMargin = org.telegram.messenger.g0.L(f16);
        layoutParams.topMargin = org.telegram.messenger.g0.L(f13);
        if (!org.telegram.messenger.bd.f21784a0) {
            f12 = f14;
        }
        layoutParams.rightMargin = org.telegram.messenger.g0.L(f12);
        layoutParams.bottomMargin = org.telegram.messenger.g0.L(f15);
        return layoutParams;
    }

    public static RelativeLayout.LayoutParams v(int i3, float f10, int i10, float f11, int i11) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(z(f10), z(f11));
        if (i11 >= 0) {
            layoutParams.addRule(i11);
        }
        layoutParams.leftMargin = org.telegram.messenger.g0.L(i3);
        float f12 = 0;
        layoutParams.topMargin = org.telegram.messenger.g0.L(f12);
        layoutParams.rightMargin = org.telegram.messenger.g0.L(i10);
        layoutParams.bottomMargin = org.telegram.messenger.g0.L(f12);
        return layoutParams;
    }

    public static RelativeLayout.LayoutParams w(int i3, int i10) {
        return v(0, i3, 0, i10, -1);
    }

    public static FrameLayout.LayoutParams x(int i3, int i10, int i11) {
        return new FrameLayout.LayoutParams(z(i3), z(i10), i11);
    }

    public static int y() {
        if (org.telegram.messenger.bd.f21784a0) {
            return 5;
        }
        return 3;
    }

    public static int z(float f10) {
        if (f10 >= 0.0f) {
            f10 = org.telegram.messenger.g0.L(f10);
        }
        return (int) f10;
    }
}
