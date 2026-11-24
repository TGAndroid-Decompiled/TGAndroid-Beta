package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;
public abstract class yqe {
    public static ContextThemeWrapper a(Context context, boolean z) {
        int i;
        if (!z) {
            i = 2130968755;
        } else {
            i = 2130968615;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, g(context, i));
        if (g(contextThemeWrapper, 2130968876) != 0) {
            return new ContextThemeWrapper(contextThemeWrapper, e(contextThemeWrapper));
        }
        return contextThemeWrapper;
    }

    public static int b(Context context) {
        if (on2.g(-1, f(context, 2130968731)) >= 3.0d) {
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

    public static Drawable d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable a = kod.a(context, obtainStyledAttributes.getResourceId(0, 0));
        if (h(context)) {
            a.setTint(context.getColor(2131099765));
        }
        obtainStyledAttributes.recycle();
        return a;
    }

    public static int e(Context context) {
        if (h(context)) {
            if (b(context) == -570425344) {
                return 2131755314;
            }
            return 2131755315;
        } else if (b(context) == -570425344) {
            return 2131755316;
        } else {
            return 2131755313;
        }
    }

    public static int f(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }

    public static int g(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
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
        int i;
        if (!progressBar.isIndeterminate()) {
            return;
        }
        if (h(context)) {
            i = 2131099757;
        } else {
            i = 2131099756;
        }
        progressBar.getIndeterminateDrawable().setColorFilter(context.getColor(i), PorterDuff.Mode.SRC_IN);
    }
}
