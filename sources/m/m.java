package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
public final class m {
    public final View f13244a;
    public e3 d;
    public e3 f13247e;
    public e3 f13248f;
    public int f13246c = -1;
    public final q f13245b = q.a();

    public m(View view) {
        this.f13244a = view;
    }

    public final void a() {
        View view = this.f13244a;
        Drawable background = view.getBackground();
        if (background != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 ? i10 == 21 : this.d != null) {
                if (this.f13248f == null) {
                    this.f13248f = new Object();
                }
                e3 e3Var = this.f13248f;
                e3Var.f13186c = null;
                e3Var.f13185b = false;
                e3Var.d = null;
                e3Var.f13184a = false;
                WeakHashMap weakHashMap = r0.j0.f46469a;
                ColorStateList c3 = r0.b0.c(view);
                if (c3 != null) {
                    e3Var.f13185b = true;
                    e3Var.f13186c = c3;
                }
                PorterDuff.Mode d = r0.b0.d(view);
                if (d != null) {
                    e3Var.f13184a = true;
                    e3Var.d = d;
                }
                if (e3Var.f13185b || e3Var.f13184a) {
                    q.d(background, e3Var, view.getDrawableState());
                    return;
                }
            }
            e3 e3Var2 = this.f13247e;
            if (e3Var2 != null) {
                q.d(background, e3Var2, view.getDrawableState());
                return;
            }
            e3 e3Var3 = this.d;
            if (e3Var3 != null) {
                q.d(background, e3Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        e3 e3Var = this.f13247e;
        if (e3Var != null) {
            return (ColorStateList) e3Var.f13186c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        e3 e3Var = this.f13247e;
        if (e3Var != null) {
            return (PorterDuff.Mode) e3Var.d;
        }
        return null;
    }

    public final void d(android.util.AttributeSet r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: m.m.d(android.util.AttributeSet, int):void");
    }

    public final void e() {
        this.f13246c = -1;
        g(null);
        a();
    }

    public final void f(int i10) {
        ColorStateList colorStateList;
        this.f13246c = i10;
        q qVar = this.f13245b;
        if (qVar != null) {
            Context context = this.f13244a.getContext();
            synchronized (qVar) {
                colorStateList = qVar.f13304a.i(context, i10);
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
            e3 e3Var = this.d;
            e3Var.f13186c = colorStateList;
            e3Var.f13185b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f13247e == null) {
            this.f13247e = new Object();
        }
        e3 e3Var = this.f13247e;
        e3Var.f13186c = colorStateList;
        e3Var.f13185b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f13247e == null) {
            this.f13247e = new Object();
        }
        e3 e3Var = this.f13247e;
        e3Var.d = mode;
        e3Var.f13184a = true;
        a();
    }
}
