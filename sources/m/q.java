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
    public static final PorterDuff.Mode f13112b = PorterDuff.Mode.SRC_IN;
    public static q f13113c;
    public m2 f13114a;

    public static synchronized q a() {
        q qVar;
        synchronized (q.class) {
            try {
                if (f13113c == null) {
                    c();
                }
                qVar = f13113c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    public static synchronized void c() {
        synchronized (q.class) {
            if (f13113c == null) {
                ?? obj = new Object();
                f13113c = obj;
                obj.f13114a = m2.d();
                f13113c.f13114a.l(new com.google.firebase.messaging.n(3));
            }
        }
    }

    public static void d(Drawable drawable, c3 c3Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = m2.h;
        int[] state = drawable.getState();
        int[] iArr2 = l1.f13055a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z10 = c3Var.f12980b;
            if (!z10 && !c3Var.f12979a) {
                drawable.clearColorFilter();
            } else {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z10) {
                    colorStateList = (ColorStateList) c3Var.f12981c;
                } else {
                    colorStateList = null;
                }
                if (c3Var.f12979a) {
                    mode = (PorterDuff.Mode) c3Var.d;
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
        return this.f13114a.g(context, i10);
    }
}
