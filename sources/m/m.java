package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
public final class m {
    public final View f13537a;
    public f3 d;
    public f3 e;
    public f3 f13540f;
    public int f13539c = -1;
    public final q f13538b = q.a();

    public m(View view) {
        this.f13537a = view;
    }

    public final void a() {
        View view = this.f13537a;
        Drawable background = view.getBackground();
        if (background != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 ? i10 == 21 : this.d != null) {
                if (this.f13540f == null) {
                    this.f13540f = new Object();
                }
                f3 f3Var = this.f13540f;
                f3Var.f13489c = null;
                f3Var.f13488b = false;
                f3Var.d = null;
                f3Var.f13487a = false;
                WeakHashMap weakHashMap = r0.j0.f43142a;
                ColorStateList c3 = r0.b0.c(view);
                if (c3 != null) {
                    f3Var.f13488b = true;
                    f3Var.f13489c = c3;
                }
                PorterDuff.Mode d = r0.b0.d(view);
                if (d != null) {
                    f3Var.f13487a = true;
                    f3Var.d = d;
                }
                if (f3Var.f13488b || f3Var.f13487a) {
                    q.d(background, f3Var, view.getDrawableState());
                    return;
                }
            }
            f3 f3Var2 = this.e;
            if (f3Var2 != null) {
                q.d(background, f3Var2, view.getDrawableState());
                return;
            }
            f3 f3Var3 = this.d;
            if (f3Var3 != null) {
                q.d(background, f3Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        f3 f3Var = this.e;
        if (f3Var != null) {
            return (ColorStateList) f3Var.f13489c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        f3 f3Var = this.e;
        if (f3Var != null) {
            return (PorterDuff.Mode) f3Var.d;
        }
        return null;
    }

    public final void d(android.util.AttributeSet r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: m.m.d(android.util.AttributeSet, int):void");
    }

    public final void e() {
        this.f13539c = -1;
        g(null);
        a();
    }

    public final void f(int i10) {
        ColorStateList colorStateList;
        this.f13539c = i10;
        q qVar = this.f13538b;
        if (qVar != null) {
            Context context = this.f13537a.getContext();
            synchronized (qVar) {
                colorStateList = qVar.f13588a.i(context, i10);
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
            f3Var.f13489c = colorStateList;
            f3Var.f13488b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new Object();
        }
        f3 f3Var = this.e;
        f3Var.f13489c = colorStateList;
        f3Var.f13488b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new Object();
        }
        f3 f3Var = this.e;
        f3Var.d = mode;
        f3Var.f13487a = true;
        a();
    }
}
