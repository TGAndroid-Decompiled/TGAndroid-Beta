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
    public static final PorterDuff.Mode f16372b = PorterDuff.Mode.SRC_IN;
    public static r f16373c;
    public n2 f16374a;

    public static synchronized r a() {
        r rVar;
        synchronized (r.class) {
            try {
                if (f16373c == null) {
                    c();
                }
                rVar = f16373c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }

    public static synchronized void c() {
        synchronized (r.class) {
            if (f16373c == null) {
                ?? obj = new Object();
                f16373c = obj;
                obj.f16374a = n2.d();
                f16373c.f16374a.l(new com.google.firebase.messaging.l(3));
            }
        }
    }

    public static void d(Drawable drawable, e3 e3Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = n2.h;
        int[] state = drawable.getState();
        int[] iArr2 = m1.f16315a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z10 = e3Var.f16258b;
            if (!z10 && !e3Var.f16257a) {
                drawable.clearColorFilter();
            } else {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z10) {
                    colorStateList = (ColorStateList) e3Var.f16259c;
                } else {
                    colorStateList = null;
                }
                if (e3Var.f16257a) {
                    mode = (PorterDuff.Mode) e3Var.d;
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
        return this.f16374a.g(context, i10);
    }
}
