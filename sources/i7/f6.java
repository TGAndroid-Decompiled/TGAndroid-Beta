package i7;

import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public abstract class f6 {
    public static FrameLayout.LayoutParams a(float f9, float f10, int i10) {
        return new FrameLayout.LayoutParams(z(f9), z(f10), i10);
    }

    public static FrameLayout.LayoutParams b(float f9, float f10, int i10, float f11, float f12, float f13, float f14) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(f9), z(f10), i10);
        layoutParams.setMargins(AndroidUtilities.dp(f11), AndroidUtilities.dp(f12), AndroidUtilities.dp(f13), AndroidUtilities.dp(f14));
        return layoutParams;
    }

    public static FrameLayout.LayoutParams c(float f9, int i10) {
        return new FrameLayout.LayoutParams(z(i10), z(f9));
    }

    public static FrameLayout.LayoutParams d(int i10, float f9, int i11, float f10, float f11, float f12, float f13) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(i10), z(f9), i11);
        layoutParams.setMargins(AndroidUtilities.dp(f10), AndroidUtilities.dp(f11), AndroidUtilities.dp(f12), AndroidUtilities.dp(f13));
        return layoutParams;
    }

    public static FrameLayout.LayoutParams e(int i10, int i11, int i12) {
        return new FrameLayout.LayoutParams(z(i10), z(i11), i12);
    }

    public static FrameLayout.LayoutParams f(float f9, int i10, int i11, int i12, int i13, int i14) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(-1), z(f9), i10);
        layoutParams.setMargins(i11, i12, i13, i14);
        return layoutParams;
    }

    public static FrameLayout.LayoutParams g() {
        return c(-1.0f, -1);
    }

    public static FrameLayout.LayoutParams h(float f9, float f10, int i10) {
        return new FrameLayout.LayoutParams(z(f9), z(f10), Gravity.getAbsoluteGravity(i10, LocaleController.isRTL ? 1 : 0));
    }

    public static FrameLayout.LayoutParams i(float f9, float f10, int i10, float f11, float f12, float f13, float f14) {
        float f15;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(f9), z(f10), Gravity.getAbsoluteGravity(i10, LocaleController.isRTL ? 1 : 0));
        if (LocaleController.isRTL) {
            f15 = f13;
        } else {
            f15 = f11;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f15);
        layoutParams.topMargin = AndroidUtilities.dp(f12);
        if (!LocaleController.isRTL) {
            f11 = f13;
        }
        layoutParams.rightMargin = AndroidUtilities.dp(f11);
        layoutParams.bottomMargin = AndroidUtilities.dp(f14);
        return layoutParams;
    }

    public static LinearLayout.LayoutParams j(float f9, float f10) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(-2.0f), z(20.66f));
        layoutParams.setMargins(AndroidUtilities.dp(f9), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(0.0f));
        layoutParams.gravity = 16;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams k(float f9, float f10, float f11, float f12, int i10, int i11) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i10), z(i11));
        layoutParams.setMargins(AndroidUtilities.dp(f9), AndroidUtilities.dp(f10), AndroidUtilities.dp(f11), AndroidUtilities.dp(f12));
        return layoutParams;
    }

    public static LinearLayout.LayoutParams l(float f9, int i10, int i11) {
        return new LinearLayout.LayoutParams(z(i10), z(i11), f9);
    }

    public static LinearLayout.LayoutParams m(float f9, int i10, int i11, int i12, int i13, int i14) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i10), z(i11), f9);
        layoutParams.setMargins(AndroidUtilities.dp(i12), AndroidUtilities.dp(0), AndroidUtilities.dp(i13), AndroidUtilities.dp(i14));
        return layoutParams;
    }

    public static LinearLayout.LayoutParams n(int i10, int i11) {
        return new LinearLayout.LayoutParams(z(i10), z(i11));
    }

    public static LinearLayout.LayoutParams o(int i10, int i11, float f9, int i12) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i10), z(i11), f9);
        layoutParams.gravity = i12;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams p(int i10, int i11, float f9, int i12, int i13, int i14, int i15, int i16) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i10), z(i11), f9);
        layoutParams.setMargins(AndroidUtilities.dp(i13), AndroidUtilities.dp(i14), AndroidUtilities.dp(i15), AndroidUtilities.dp(i16));
        layoutParams.gravity = i12;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams q(int i10, int i11, int i12) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i10), z(i11));
        layoutParams.gravity = i12;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams r(int i10, int i11, int i12, float f9, float f10, float f11, float f12) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i10), z(i11));
        layoutParams.setMargins(AndroidUtilities.dp(f9), AndroidUtilities.dp(f10), AndroidUtilities.dp(f11), AndroidUtilities.dp(f12));
        layoutParams.gravity = i12;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams s(int i10, int i11, int i12, int i13, int i14, float f9, int i15) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i10), z(f9));
        layoutParams.setMargins(AndroidUtilities.dp(i12), AndroidUtilities.dp(i13), AndroidUtilities.dp(i14), AndroidUtilities.dp(i15));
        layoutParams.gravity = i11;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams t(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i10), z(i11));
        layoutParams.setMargins(AndroidUtilities.dp(i13), AndroidUtilities.dp(i14), AndroidUtilities.dp(i15), AndroidUtilities.dp(i16));
        layoutParams.gravity = i12;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams u(float f9, float f10, int i10, float f11, float f12, float f13, float f14) {
        float f15;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(f9), z(f10), Gravity.getAbsoluteGravity(i10, LocaleController.isRTL ? 1 : 0));
        if (LocaleController.isRTL) {
            f15 = f13;
        } else {
            f15 = f11;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f15);
        layoutParams.topMargin = AndroidUtilities.dp(f12);
        if (!LocaleController.isRTL) {
            f11 = f13;
        }
        layoutParams.rightMargin = AndroidUtilities.dp(f11);
        layoutParams.bottomMargin = AndroidUtilities.dp(f14);
        return layoutParams;
    }

    public static RelativeLayout.LayoutParams v(int i10, float f9, int i11, float f10, int i12) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(z(f9), z(f10));
        if (i12 >= 0) {
            layoutParams.addRule(i12);
        }
        layoutParams.leftMargin = AndroidUtilities.dp(i10);
        float f11 = 0;
        layoutParams.topMargin = AndroidUtilities.dp(f11);
        layoutParams.rightMargin = AndroidUtilities.dp(i11);
        layoutParams.bottomMargin = AndroidUtilities.dp(f11);
        return layoutParams;
    }

    public static RelativeLayout.LayoutParams w(int i10, int i11) {
        return v(0, i10, 0, i11, -1);
    }

    public static FrameLayout.LayoutParams x(int i10, int i11, int i12) {
        return new FrameLayout.LayoutParams(z(i10), z(i11), i12);
    }

    public static int y() {
        if (LocaleController.isRTL) {
            return 5;
        }
        return 3;
    }

    public static int z(float f9) {
        if (f9 >= 0.0f) {
            f9 = AndroidUtilities.dp(f9);
        }
        return (int) f9;
    }
}
