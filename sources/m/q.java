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
    public static final PorterDuff.Mode f17819b = PorterDuff.Mode.SRC_IN;
    public static q f17820c;
    public m2 f17821a;

    public static synchronized q a() {
        q qVar;
        synchronized (q.class) {
            try {
                if (f17820c == null) {
                    c();
                }
                qVar = f17820c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    public static synchronized void c() {
        synchronized (q.class) {
            if (f17820c == null) {
                ?? obj = new Object();
                f17820c = obj;
                obj.f17821a = m2.d();
                f17820c.f17821a.l(new aa.m0(4));
            }
        }
    }

    public static void d(Drawable drawable, d3 d3Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = m2.h;
        int[] state = drawable.getState();
        int[] iArr2 = l1.f17762a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z10 = d3Var.f17706b;
            if (!z10 && !d3Var.f17705a) {
                drawable.clearColorFilter();
            } else {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z10) {
                    colorStateList = (ColorStateList) d3Var.f17707c;
                } else {
                    colorStateList = null;
                }
                if (d3Var.f17705a) {
                    mode = (PorterDuff.Mode) d3Var.d;
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
        return this.f17821a.g(context, i10);
    }
}
