package g7;

import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public abstract class e6 {
    public static FrameLayout.LayoutParams a(float f10, float f11, int i9) {
        return new FrameLayout.LayoutParams(z(f10), z(f11), i9);
    }

    public static FrameLayout.LayoutParams b(float f10, float f11, int i9, float f12, float f13, float f14, float f15) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(f10), z(f11), i9);
        layoutParams.setMargins(AndroidUtilities.dp(f12), AndroidUtilities.dp(f13), AndroidUtilities.dp(f14), AndroidUtilities.dp(f15));
        return layoutParams;
    }

    public static FrameLayout.LayoutParams c(float f10, int i9) {
        return new FrameLayout.LayoutParams(z(i9), z(f10));
    }

    public static FrameLayout.LayoutParams d(int i9, float f10, int i10, float f11, float f12, float f13, float f14) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(i9), z(f10), i10);
        layoutParams.setMargins(AndroidUtilities.dp(f11), AndroidUtilities.dp(f12), AndroidUtilities.dp(f13), AndroidUtilities.dp(f14));
        return layoutParams;
    }

    public static FrameLayout.LayoutParams e(int i9, int i10, int i11) {
        return new FrameLayout.LayoutParams(z(i9), z(i10), i11);
    }

    public static FrameLayout.LayoutParams f(float f10, int i9, int i10, int i11, int i12, int i13) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(-1), z(f10), i9);
        layoutParams.setMargins(i10, i11, i12, i13);
        return layoutParams;
    }

    public static FrameLayout.LayoutParams g() {
        return c(-1.0f, -1);
    }

    public static FrameLayout.LayoutParams h(float f10, float f11, int i9) {
        return new FrameLayout.LayoutParams(z(f10), z(f11), Gravity.getAbsoluteGravity(i9, LocaleController.isRTL ? 1 : 0));
    }

    public static FrameLayout.LayoutParams i(float f10, float f11, int i9, float f12, float f13, float f14, float f15) {
        float f16;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(f10), z(f11), Gravity.getAbsoluteGravity(i9, LocaleController.isRTL ? 1 : 0));
        if (LocaleController.isRTL) {
            f16 = f14;
        } else {
            f16 = f12;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f16);
        layoutParams.topMargin = AndroidUtilities.dp(f13);
        if (!LocaleController.isRTL) {
            f12 = f14;
        }
        layoutParams.rightMargin = AndroidUtilities.dp(f12);
        layoutParams.bottomMargin = AndroidUtilities.dp(f15);
        return layoutParams;
    }

    public static LinearLayout.LayoutParams j(float f10, float f11) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(-2.0f), z(20.66f));
        layoutParams.setMargins(AndroidUtilities.dp(f10), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(0.0f));
        layoutParams.gravity = 16;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams k(float f10, float f11, float f12, float f13, int i9, int i10) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i9), z(i10));
        layoutParams.setMargins(AndroidUtilities.dp(f10), AndroidUtilities.dp(f11), AndroidUtilities.dp(f12), AndroidUtilities.dp(f13));
        return layoutParams;
    }

    public static LinearLayout.LayoutParams l(float f10, int i9, int i10) {
        return new LinearLayout.LayoutParams(z(i9), z(i10), f10);
    }

    public static LinearLayout.LayoutParams m(float f10, int i9, int i10, int i11, int i12, int i13) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i9), z(i10), f10);
        layoutParams.setMargins(AndroidUtilities.dp(i11), AndroidUtilities.dp(0), AndroidUtilities.dp(i12), AndroidUtilities.dp(i13));
        return layoutParams;
    }

    public static LinearLayout.LayoutParams n(int i9, int i10) {
        return new LinearLayout.LayoutParams(z(i9), z(i10));
    }

    public static LinearLayout.LayoutParams o(int i9, int i10, float f10, int i11) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i9), z(i10), f10);
        layoutParams.gravity = i11;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams p(int i9, int i10, float f10, int i11, int i12, int i13, int i14, int i15) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i9), z(i10), f10);
        layoutParams.setMargins(AndroidUtilities.dp(i12), AndroidUtilities.dp(i13), AndroidUtilities.dp(i14), AndroidUtilities.dp(i15));
        layoutParams.gravity = i11;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams q(int i9, int i10, int i11) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i9), z(i10));
        layoutParams.gravity = i11;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams r(int i9, int i10, int i11, float f10, float f11, float f12, float f13) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i9), z(i10));
        layoutParams.setMargins(AndroidUtilities.dp(f10), AndroidUtilities.dp(f11), AndroidUtilities.dp(f12), AndroidUtilities.dp(f13));
        layoutParams.gravity = i11;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams s(int i9, int i10, int i11, int i12, int i13, float f10, int i14) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i9), z(f10));
        layoutParams.setMargins(AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), AndroidUtilities.dp(i13), AndroidUtilities.dp(i14));
        layoutParams.gravity = i10;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams t(int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i9), z(i10));
        layoutParams.setMargins(AndroidUtilities.dp(i12), AndroidUtilities.dp(i13), AndroidUtilities.dp(i14), AndroidUtilities.dp(i15));
        layoutParams.gravity = i11;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams u(float f10, float f11, int i9, float f12, float f13, float f14, float f15) {
        float f16;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(f10), z(f11), Gravity.getAbsoluteGravity(i9, LocaleController.isRTL ? 1 : 0));
        if (LocaleController.isRTL) {
            f16 = f14;
        } else {
            f16 = f12;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f16);
        layoutParams.topMargin = AndroidUtilities.dp(f13);
        if (!LocaleController.isRTL) {
            f12 = f14;
        }
        layoutParams.rightMargin = AndroidUtilities.dp(f12);
        layoutParams.bottomMargin = AndroidUtilities.dp(f15);
        return layoutParams;
    }

    public static RelativeLayout.LayoutParams v(int i9, float f10, int i10, float f11, int i11) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(z(f10), z(f11));
        if (i11 >= 0) {
            layoutParams.addRule(i11);
        }
        layoutParams.leftMargin = AndroidUtilities.dp(i9);
        float f12 = 0;
        layoutParams.topMargin = AndroidUtilities.dp(f12);
        layoutParams.rightMargin = AndroidUtilities.dp(i10);
        layoutParams.bottomMargin = AndroidUtilities.dp(f12);
        return layoutParams;
    }

    public static RelativeLayout.LayoutParams w(int i9, int i10) {
        return v(0, i9, 0, i10, -1);
    }

    public static FrameLayout.LayoutParams x(int i9, int i10, int i11) {
        return new FrameLayout.LayoutParams(z(i9), z(i10), i11);
    }

    public static int y() {
        if (LocaleController.isRTL) {
            return 5;
        }
        return 3;
    }

    public static int z(float f10) {
        if (f10 >= 0.0f) {
            f10 = AndroidUtilities.dp(f10);
        }
        return (int) f10;
    }
}
