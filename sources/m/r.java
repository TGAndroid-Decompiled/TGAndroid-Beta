package m;

import a8.b8;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
public final class r {
    public static final PorterDuff.Mode f19231b = PorterDuff.Mode.SRC_IN;
    public static r f19232c;
    public n2 f19233a;

    public static synchronized r a() {
        r rVar;
        synchronized (r.class) {
            try {
                if (f19232c == null) {
                    c();
                }
                rVar = f19232c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }

    public static synchronized void c() {
        synchronized (r.class) {
            if (f19232c == null) {
                ?? obj = new Object();
                f19232c = obj;
                obj.f19233a = n2.d();
                f19232c.f19233a.l(new b8(2));
            }
        }
    }

    public static void d(Drawable drawable, c3 c3Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = n2.h;
        int[] state = drawable.getState();
        int[] iArr2 = m1.f19156a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z9 = c3Var.f19073b;
            if (!z9 && !c3Var.f19072a) {
                drawable.clearColorFilter();
            } else {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z9) {
                    colorStateList = (ColorStateList) c3Var.f19074c;
                } else {
                    colorStateList = null;
                }
                if (c3Var.f19072a) {
                    mode = (PorterDuff.Mode) c3Var.d;
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

    public final synchronized Drawable b(Context context, int i7) {
        return this.f19233a.g(context, i7);
    }
}
