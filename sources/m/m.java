package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
public final class m {
    public final View f13242a;
    public e3 d;
    public e3 f13245e;
    public e3 f13246f;
    public int f13244c = -1;
    public final q f13243b = q.a();

    public m(View view) {
        this.f13242a = view;
    }

    public final void a() {
        View view = this.f13242a;
        Drawable background = view.getBackground();
        if (background != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 ? i10 == 21 : this.d != null) {
                if (this.f13246f == null) {
                    this.f13246f = new Object();
                }
                e3 e3Var = this.f13246f;
                e3Var.f13184c = null;
                e3Var.f13183b = false;
                e3Var.d = null;
                e3Var.f13182a = false;
                WeakHashMap weakHashMap = r0.j0.f46438a;
                ColorStateList c3 = r0.b0.c(view);
                if (c3 != null) {
                    e3Var.f13183b = true;
                    e3Var.f13184c = c3;
                }
                PorterDuff.Mode d = r0.b0.d(view);
                if (d != null) {
                    e3Var.f13182a = true;
                    e3Var.d = d;
                }
                if (e3Var.f13183b || e3Var.f13182a) {
                    q.d(background, e3Var, view.getDrawableState());
                    return;
                }
            }
            e3 e3Var2 = this.f13245e;
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
        e3 e3Var = this.f13245e;
        if (e3Var != null) {
            return (ColorStateList) e3Var.f13184c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        e3 e3Var = this.f13245e;
        if (e3Var != null) {
            return (PorterDuff.Mode) e3Var.d;
        }
        return null;
    }

    public final void d(android.util.AttributeSet r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: m.m.d(android.util.AttributeSet, int):void");
    }

    public final void e() {
        this.f13244c = -1;
        g(null);
        a();
    }

    public final void f(int i10) {
        ColorStateList colorStateList;
        this.f13244c = i10;
        q qVar = this.f13243b;
        if (qVar != null) {
            Context context = this.f13242a.getContext();
            synchronized (qVar) {
                colorStateList = qVar.f13302a.i(context, i10);
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
            e3Var.f13184c = colorStateList;
            e3Var.f13183b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f13245e == null) {
            this.f13245e = new Object();
        }
        e3 e3Var = this.f13245e;
        e3Var.f13184c = colorStateList;
        e3Var.f13183b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f13245e == null) {
            this.f13245e = new Object();
        }
        e3 e3Var = this.f13245e;
        e3Var.d = mode;
        e3Var.f13182a = true;
        a();
    }
}
