package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
public final class s {
    public static final PorterDuff.Mode f14958b = PorterDuff.Mode.SRC_IN;
    public static s f14959c;
    public o2 f14960a;

    public static synchronized s a() {
        s sVar;
        synchronized (s.class) {
            try {
                if (f14959c == null) {
                    c();
                }
                sVar = f14959c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }

    public static synchronized void c() {
        synchronized (s.class) {
            if (f14959c == null) {
                ?? obj = new Object();
                f14959c = obj;
                obj.f14960a = o2.d();
                f14959c.f14960a.l(new com.google.firebase.messaging.m(3));
            }
        }
    }

    public static void d(Drawable drawable, f3 f3Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = o2.h;
        int[] state = drawable.getState();
        int[] iArr2 = n1.f14901a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z10 = f3Var.f14844b;
            if (!z10 && !f3Var.f14843a) {
                drawable.clearColorFilter();
            } else {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z10) {
                    colorStateList = (ColorStateList) f3Var.f14845c;
                } else {
                    colorStateList = null;
                }
                if (f3Var.f14843a) {
                    mode = (PorterDuff.Mode) f3Var.d;
                } else {
                    mode = o2.h;
                }
                if (colorStateList != null && mode != null) {
                    porterDuffColorFilter = o2.h(colorStateList.getColorForState(iArr, 0), mode);
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
        return this.f14960a.g(context, i10);
    }
}
