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
    public static final PorterDuff.Mode f17062b = PorterDuff.Mode.SRC_IN;
    public static r f17063c;
    public n2 f17064a;

    public static synchronized r a() {
        r rVar;
        synchronized (r.class) {
            try {
                if (f17063c == null) {
                    c();
                }
                rVar = f17063c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    public static synchronized void c() {
        synchronized (r.class) {
            if (f17063c == null) {
                ?? obj = new Object();
                f17063c = obj;
                obj.f17064a = n2.d();
                f17063c.f17064a.l(new com.google.firebase.messaging.m(6));
            }
        }
    }

    public static void d(Drawable drawable, f3 f3Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = n2.h;
        int[] state = drawable.getState();
        int[] iArr2 = m1.f17002a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z10 = f3Var.f16945b;
            if (!z10 && !f3Var.f16944a) {
                drawable.clearColorFilter();
            } else {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z10) {
                    colorStateList = (ColorStateList) f3Var.f16946c;
                } else {
                    colorStateList = null;
                }
                if (f3Var.f16944a) {
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

    public final synchronized Drawable b(Context context, int i9) {
        return this.f17064a.g(context, i9);
    }
}
