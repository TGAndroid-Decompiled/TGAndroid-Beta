package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
public final class q {
    public static final PorterDuff.Mode f13302b = PorterDuff.Mode.SRC_IN;
    public static q f13303c;
    public m2 f13304a;

    public static synchronized q a() {
        q qVar;
        synchronized (q.class) {
            try {
                if (f13303c == null) {
                    c();
                }
                qVar = f13303c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    public static synchronized void c() {
        synchronized (q.class) {
            if (f13303c == null) {
                ?? obj = new Object();
                f13303c = obj;
                obj.f13304a = m2.d();
                f13303c.f13304a.l(new a9.a(8));
            }
        }
    }

    public static void d(Drawable drawable, e3 e3Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = m2.h;
        int[] state = drawable.getState();
        int[] iArr2 = l1.f13240a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z4 = e3Var.f13185b;
            if (!z4 && !e3Var.f13184a) {
                drawable.clearColorFilter();
            } else {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z4) {
                    colorStateList = (ColorStateList) e3Var.f13186c;
                } else {
                    colorStateList = null;
                }
                if (e3Var.f13184a) {
                    mode = (PorterDuff.Mode) e3Var.d;
                } else {
                    mode = m2.h;
                }
                if (colorStateList != null && mode != null) {
                    porterDuffColorFilter = m2.h(colorStateList.getColorForState(iArr, 0), mode);
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
        return this.f13304a.g(context, i10);
    }
}
