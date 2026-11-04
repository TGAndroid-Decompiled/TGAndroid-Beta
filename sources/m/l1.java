package m;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
public abstract class l1 {
    public static final int[] f18640a = {16842912};
    public static final int[] f18641b = new int[0];

    static {
        new Rect();
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29 && i3 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(f18641b);
            } else {
                drawable.setState(f18640a);
            }
            drawable.setState(state);
        }
    }

    public static PorterDuff.Mode b(int i3, PorterDuff.Mode mode) {
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 9) {
                    switch (i3) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
