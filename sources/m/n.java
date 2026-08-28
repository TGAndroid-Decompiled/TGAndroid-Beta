package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
public final class n {
    public final View f17005a;
    public f3 d;
    public f3 f17008e;
    public f3 f17009f;
    public int f17007c = -1;
    public final r f17006b = r.a();

    public n(View view) {
        this.f17005a = view;
    }

    public final void a() {
        View view = this.f17005a;
        Drawable background = view.getBackground();
        if (background != null) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 <= 21 ? i9 == 21 : this.d != null) {
                if (this.f17009f == null) {
                    this.f17009f = new Object();
                }
                f3 f3Var = this.f17009f;
                f3Var.f16946c = null;
                f3Var.f16945b = false;
                f3Var.d = null;
                f3Var.f16944a = false;
                WeakHashMap weakHashMap = r0.j0.f46915a;
                ColorStateList c10 = r0.b0.c(view);
                if (c10 != null) {
                    f3Var.f16945b = true;
                    f3Var.f16946c = c10;
                }
                PorterDuff.Mode d = r0.b0.d(view);
                if (d != null) {
                    f3Var.f16944a = true;
                    f3Var.d = d;
                }
                if (f3Var.f16945b || f3Var.f16944a) {
                    r.d(background, f3Var, view.getDrawableState());
                    return;
                }
            }
            f3 f3Var2 = this.f17008e;
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
        f3 f3Var = this.f17008e;
        if (f3Var != null) {
            return (ColorStateList) f3Var.f16946c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        f3 f3Var = this.f17008e;
        if (f3Var != null) {
            return (PorterDuff.Mode) f3Var.d;
        }
        return null;
    }

    public final void d(android.util.AttributeSet r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: m.n.d(android.util.AttributeSet, int):void");
    }

    public final void e() {
        this.f17007c = -1;
        g(null);
        a();
    }

    public final void f(int i9) {
        ColorStateList colorStateList;
        this.f17007c = i9;
        r rVar = this.f17006b;
        if (rVar != null) {
            Context context = this.f17005a.getContext();
            synchronized (rVar) {
                colorStateList = rVar.f17064a.i(context, i9);
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
            f3Var.f16946c = colorStateList;
            f3Var.f16945b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f17008e == null) {
            this.f17008e = new Object();
        }
        f3 f3Var = this.f17008e;
        f3Var.f16946c = colorStateList;
        f3Var.f16945b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f17008e == null) {
            this.f17008e = new Object();
        }
        f3 f3Var = this.f17008e;
        f3Var.d = mode;
        f3Var.f16944a = true;
        a();
    }
}
