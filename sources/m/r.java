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

    public static final PorterDuff.Mode f17437b = PorterDuff.Mode.SRC_IN;

    public static r f17438c;

    public n2 f17439a;

    public static synchronized r a() {
        try {
            if (f17438c == null) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f17438c;
    }

    public static synchronized void c() {
        if (f17438c == null) {
            r rVar = new r();
            f17438c = rVar;
            rVar.f17439a = n2.d();
            f17438c.f17439a.l(new com.google.firebase.messaging.m(6));
        }
    }

    public static void d(Drawable drawable, f3 f3Var, int[] iArr) {
        PorterDuff.Mode mode = n2.h;
        int[] state = drawable.getState();
        int[] iArr2 = m1.f17377a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = f3Var.f17320b;
        if (z10 || f3Var.f17319a) {
            PorterDuffColorFilter porterDuffColorFilterH = null;
            ColorStateList colorStateList = z10 ? (ColorStateList) f3Var.f17321c : null;
            PorterDuff.Mode mode2 = f3Var.f17319a ? (PorterDuff.Mode) f3Var.d : n2.h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterH = n2.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterH);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f17439a.g(context, i10);
    }
}
