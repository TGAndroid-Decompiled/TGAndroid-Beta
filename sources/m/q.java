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
    public static final PorterDuff.Mode f13586b = PorterDuff.Mode.SRC_IN;
    public static q f13587c;
    public n2 f13588a;

    public static synchronized q a() {
        q qVar;
        synchronized (q.class) {
            try {
                if (f13587c == null) {
                    c();
                }
                qVar = f13587c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    public static synchronized void c() {
        synchronized (q.class) {
            if (f13587c == null) {
                ?? obj = new Object();
                f13587c = obj;
                obj.f13588a = n2.d();
                f13587c.f13588a.l(new a9.a(8));
            }
        }
    }

    public static void d(Drawable drawable, f3 f3Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = n2.h;
        int[] state = drawable.getState();
        int[] iArr2 = m1.f13543a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z4 = f3Var.f13488b;
            if (!z4 && !f3Var.f13487a) {
                drawable.clearColorFilter();
            } else {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z4) {
                    colorStateList = (ColorStateList) f3Var.f13489c;
                } else {
                    colorStateList = null;
                }
                if (f3Var.f13487a) {
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
        return this.f13588a.g(context, i10);
    }
}
