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
    public static final PorterDuff.Mode f13602b = PorterDuff.Mode.SRC_IN;
    public static q f13603c;
    public n2 f13604a;

    public static synchronized q a() {
        q qVar;
        synchronized (q.class) {
            try {
                if (f13603c == null) {
                    c();
                }
                qVar = f13603c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    public static synchronized void c() {
        synchronized (q.class) {
            if (f13603c == null) {
                ?? obj = new Object();
                f13603c = obj;
                obj.f13604a = n2.d();
                f13603c.f13604a.l(new a9.a(8));
            }
        }
    }

    public static void d(Drawable drawable, f3 f3Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = n2.h;
        int[] state = drawable.getState();
        int[] iArr2 = m1.f13559a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z4 = f3Var.f13504b;
            if (!z4 && !f3Var.f13503a) {
                drawable.clearColorFilter();
            } else {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z4) {
                    colorStateList = (ColorStateList) f3Var.f13505c;
                } else {
                    colorStateList = null;
                }
                if (f3Var.f13503a) {
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
        return this.f13604a.g(context, i10);
    }
}
