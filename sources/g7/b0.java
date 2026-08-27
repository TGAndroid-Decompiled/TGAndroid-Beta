package g7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;

public abstract class b0 {
    public static ContextThemeWrapper a(Context context, boolean z10) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, g(context, !z10 ? 2130968755 : 2130968615));
        return g(contextThemeWrapper, 2130968876) != 0 ? new ContextThemeWrapper(contextThemeWrapper, e(contextThemeWrapper)) : contextThemeWrapper;
    }

    public static int b(Context context) {
        return i0.b.e(-1, f(context, 2130968731)) >= 3.0d ? -1 : -570425344;
    }

    public static float c(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842803, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Drawable d(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i10});
        Drawable drawableD = k8.d(o7.b(context, typedArrayObtainStyledAttributes.getResourceId(0, 0)));
        if (h(context)) {
            drawableD.setTint(f0.e.c(context, 2131099765));
        }
        typedArrayObtainStyledAttributes.recycle();
        return drawableD;
    }

    public static int e(Context context) {
        if (h(context)) {
            return b(context) == -570425344 ? 2131755314 : 2131755315;
        }
        return b(context) == -570425344 ? 2131755316 : 2131755313;
    }

    public static int f(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    public static int g(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static boolean h(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(2130968817, typedValue, true) && typedValue.data != 0;
    }

    public static void i(Context context, ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar.getIndeterminateDrawable().setColorFilter(f0.e.c(context, h(context) ? 2131099757 : 2131099756), PorterDuff.Mode.SRC_IN);
        }
    }
}
