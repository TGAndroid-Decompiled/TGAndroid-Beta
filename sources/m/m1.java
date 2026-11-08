package m;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
public abstract class m1 {
    public static final int[] f19159a = {16842912};
    public static final int[] f19160b = new int[0];

    static {
        new Rect();
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29 && i7 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(f19160b);
            } else {
                drawable.setState(f19159a);
            }
            drawable.setState(state);
        }
    }

    public static PorterDuff.Mode b(int i7, PorterDuff.Mode mode) {
        if (i7 != 3) {
            if (i7 != 5) {
                if (i7 != 9) {
                    switch (i7) {
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
