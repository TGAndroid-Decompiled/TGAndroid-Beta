package f7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;
public abstract class d0 {
    public static ContextThemeWrapper a(Context context, boolean z10) {
        int i9;
        if (!z10) {
            i9 = 2130968755;
        } else {
            i9 = 2130968615;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, g(context, i9));
        if (g(contextThemeWrapper, 2130968876) != 0) {
            return new ContextThemeWrapper(contextThemeWrapper, e(contextThemeWrapper));
        }
        return contextThemeWrapper;
    }

    public static int b(Context context, int i9) {
        if (i0.a.e(-1, f(context, i9, 2130968731)) >= 3.0d) {
            return -1;
        }
        return -570425344;
    }

    public static float c(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842803, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Drawable d(Context context, int i9) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i9});
        Drawable d = q8.d(t7.b(context, obtainStyledAttributes.getResourceId(0, 0)));
        if (h(context)) {
            d.setTint(f0.e.c(context, 2131099765));
        }
        obtainStyledAttributes.recycle();
        return d;
    }

    public static int e(Context context) {
        if (h(context)) {
            if (b(context, 0) == -570425344) {
                return 2131755314;
            }
            return 2131755315;
        } else if (b(context, 0) == -570425344) {
            return 2131755316;
        } else {
            return 2131755313;
        }
    }

    public static int f(Context context, int i9, int i10) {
        if (i9 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i9, new int[]{i10});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        if (typedValue.resourceId != 0) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }

    public static int g(Context context, int i9) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i9, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static boolean h(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(2130968817, typedValue, true) && typedValue.data != 0) {
            return true;
        }
        return false;
    }

    public static void i(Context context, ProgressBar progressBar) {
        int i9;
        if (!progressBar.isIndeterminate()) {
            return;
        }
        if (h(context)) {
            i9 = 2131099757;
        } else {
            i9 = 2131099756;
        }
        progressBar.getIndeterminateDrawable().setColorFilter(f0.e.c(context, i9), PorterDuff.Mode.SRC_IN);
    }
}
