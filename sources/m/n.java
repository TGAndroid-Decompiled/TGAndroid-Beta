package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
public final class n {
    public final View f16603a;
    public f3 d;
    public f3 f16606e;
    public f3 f16607f;
    public int f16605c = -1;
    public final r f16604b = r.a();

    public n(View view) {
        this.f16603a = view;
    }

    public final void a() {
        View view = this.f16603a;
        Drawable background = view.getBackground();
        if (background != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 ? i10 == 21 : this.d != null) {
                if (this.f16607f == null) {
                    this.f16607f = new Object();
                }
                f3 f3Var = this.f16607f;
                f3Var.f16545c = null;
                f3Var.f16544b = false;
                f3Var.d = null;
                f3Var.f16543a = false;
                WeakHashMap weakHashMap = r0.j0.f46829a;
                ColorStateList c3 = r0.b0.c(view);
                if (c3 != null) {
                    f3Var.f16544b = true;
                    f3Var.f16545c = c3;
                }
                PorterDuff.Mode d = r0.b0.d(view);
                if (d != null) {
                    f3Var.f16543a = true;
                    f3Var.d = d;
                }
                if (f3Var.f16544b || f3Var.f16543a) {
                    r.d(background, f3Var, view.getDrawableState());
                    return;
                }
            }
            f3 f3Var2 = this.f16606e;
            if (f3Var2 != null) {
                r.d(background, f3Var2, view.getDrawableState());
                return;
            }
            f3 f3Var3 = this.d;
            if (f3Var3 != null) {
                r.d(background, f3Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        f3 f3Var = this.f16606e;
        if (f3Var != null) {
            return (ColorStateList) f3Var.f16545c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        f3 f3Var = this.f16606e;
        if (f3Var != null) {
            return (PorterDuff.Mode) f3Var.d;
        }
        return null;
    }

    public final void d(android.util.AttributeSet r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: m.n.d(android.util.AttributeSet, int):void");
    }

    public final void e() {
        this.f16605c = -1;
        g(null);
        a();
    }

    public final void f(int i10) {
        ColorStateList colorStateList;
        this.f16605c = i10;
        r rVar = this.f16604b;
        if (rVar != null) {
            Context context = this.f16603a.getContext();
            synchronized (rVar) {
                colorStateList = rVar.f16663a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new Object();
            }
            f3 f3Var = this.d;
            f3Var.f16545c = colorStateList;
            f3Var.f16544b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f16606e == null) {
            this.f16606e = new Object();
        }
        f3 f3Var = this.f16606e;
        f3Var.f16545c = colorStateList;
        f3Var.f16544b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f16606e == null) {
            this.f16606e = new Object();
        }
        f3 f3Var = this.f16606e;
        f3Var.d = mode;
        f3Var.f16543a = true;
        a();
    }
}
