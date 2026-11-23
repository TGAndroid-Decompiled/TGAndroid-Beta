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
public final class q {
    public static final PorterDuff.Mode f20210b = PorterDuff.Mode.SRC_IN;
    public static q f20211c;
    public m2 f20212a;

    public static synchronized q a() {
        q qVar;
        synchronized (q.class) {
            try {
                if (f20211c == null) {
                    c();
                }
                qVar = f20211c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    public static synchronized void c() {
        synchronized (q.class) {
            if (f20211c == null) {
                ?? obj = new Object();
                f20211c = obj;
                obj.f20212a = m2.d();
                f20211c.f20212a.l(new b8(2));
            }
        }
    }

    public static void d(Drawable drawable, b3 b3Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = m2.h;
        int[] state = drawable.getState();
        int[] iArr2 = l1.f20147a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z10 = b3Var.f20053b;
            if (!z10 && !b3Var.f20052a) {
                drawable.clearColorFilter();
            } else {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z10) {
                    colorStateList = (ColorStateList) b3Var.f20054c;
                } else {
                    colorStateList = null;
                }
                if (b3Var.f20052a) {
                    mode = (PorterDuff.Mode) b3Var.d;
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

    public final synchronized Drawable b(Context context, int i7) {
        return this.f20212a.g(context, i7);
    }
}
