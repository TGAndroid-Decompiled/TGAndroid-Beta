package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
public final class r {
    public static final PorterDuff.Mode f16661b = PorterDuff.Mode.SRC_IN;
    public static r f16662c;
    public n2 f16663a;

    public static synchronized r a() {
        r rVar;
        synchronized (r.class) {
            try {
                if (f16662c == null) {
                    c();
                }
                rVar = f16662c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }

    public static synchronized void c() {
        synchronized (r.class) {
            if (f16662c == null) {
                ?? obj = new Object();
                f16662c = obj;
                obj.f16663a = n2.d();
                f16662c.f16663a.l(new bg.c2(7));
            }
        }
    }

    public static void d(Drawable drawable, f3 f3Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = n2.h;
        int[] state = drawable.getState();
        int[] iArr2 = m1.f16599a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z10 = f3Var.f16544b;
            if (!z10 && !f3Var.f16543a) {
                drawable.clearColorFilter();
            } else {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z10) {
                    colorStateList = (ColorStateList) f3Var.f16545c;
                } else {
                    colorStateList = null;
                }
                if (f3Var.f16543a) {
                    mode = (PorterDuff.Mode) f3Var.d;
                } else {
                    mode = n2.h;
                }
                if (colorStateList != null && mode != null) {
                    porterDuffColorFilter = n2.h(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f16663a.g(context, i10);
    }
}
