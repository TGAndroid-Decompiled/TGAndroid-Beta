package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

public final class n {

    public final View f17380a;
    public f3 d;

    public f3 f17383e;

    public f3 f17384f;

    public int f17382c = -1;

    public final r f17381b = r.a();

    public n(View view) {
        this.f17380a = view;
    }

    public final void a() {
        View view = this.f17380a;
        Drawable background = view.getBackground();
        if (background != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 ? i10 == 21 : this.d != null) {
                if (this.f17384f == null) {
                    this.f17384f = new f3();
                }
                f3 f3Var = this.f17384f;
                f3Var.f17321c = null;
                f3Var.f17320b = false;
                f3Var.d = null;
                f3Var.f17319a = false;
                WeakHashMap weakHashMap = r0.j0.f46605a;
                ColorStateList colorStateListC = r0.b0.c(view);
                if (colorStateListC != null) {
                    f3Var.f17320b = true;
                    f3Var.f17321c = colorStateListC;
                }
                PorterDuff.Mode modeD = r0.b0.d(view);
                if (modeD != null) {
                    f3Var.f17319a = true;
                    f3Var.d = modeD;
                }
                if (f3Var.f17320b || f3Var.f17319a) {
                    r.d(background, f3Var, view.getDrawableState());
                    return;
                }
            }
            f3 f3Var2 = this.f17383e;
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
        f3 f3Var = this.f17383e;
        if (f3Var != null) {
            return (ColorStateList) f3Var.f17321c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        f3 f3Var = this.f17383e;
        if (f3Var != null) {
            return (PorterDuff.Mode) f3Var.d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListI;
        View view = this.f17380a;
        Context context = view.getContext();
        int[] iArr = f.a.f5596z;
        j9.a aVarG = j9.a.G(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) aVarG.f12864c;
        View view2 = this.f17380a;
        r0.j0.j(view2, view2.getContext(), iArr, attributeSet, (TypedArray) aVarG.f12864c, i10);
        try {
            if (typedArray.hasValue(0)) {
                this.f17382c = typedArray.getResourceId(0, -1);
                r rVar = this.f17381b;
                Context context2 = view.getContext();
                int i11 = this.f17382c;
                synchronized (rVar) {
                    colorStateListI = rVar.f17439a.i(context2, i11);
                }
                if (colorStateListI != null) {
                    g(colorStateListI);
                }
            }
            if (typedArray.hasValue(1)) {
                ColorStateList colorStateListX = aVarG.x(1);
                int i12 = Build.VERSION.SDK_INT;
                r0.b0.g(view, colorStateListX);
                if (i12 == 21) {
                    Drawable background = view.getBackground();
                    boolean z10 = (r0.b0.c(view) == null && r0.b0.d(view) == null) ? false : true;
                    if (background != null && z10) {
                        if (background.isStateful()) {
                            background.setState(view.getDrawableState());
                        }
                        view.setBackground(background);
                    }
                }
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode modeB = m1.b(typedArray.getInt(2, -1), null);
                int i13 = Build.VERSION.SDK_INT;
                r0.b0.h(view, modeB);
                if (i13 == 21) {
                    Drawable background2 = view.getBackground();
                    boolean z11 = (r0.b0.c(view) == null && r0.b0.d(view) == null) ? false : true;
                    if (background2 != null && z11) {
                        if (background2.isStateful()) {
                            background2.setState(view.getDrawableState());
                        }
                        view.setBackground(background2);
                    }
                }
            }
            aVarG.I();
        } catch (Throwable th) {
            aVarG.I();
            throw th;
        }
    }

    public final void e() {
        this.f17382c = -1;
        g(null);
        a();
    }

    public final void f(int i10) {
        ColorStateList colorStateListI;
        this.f17382c = i10;
        r rVar = this.f17381b;
        if (rVar != null) {
            Context context = this.f17380a.getContext();
            synchronized (rVar) {
                colorStateListI = rVar.f17439a.i(context, i10);
            }
        } else {
            colorStateListI = null;
        }
        g(colorStateListI);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new f3();
            }
            f3 f3Var = this.d;
            f3Var.f17321c = colorStateList;
            f3Var.f17320b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f17383e == null) {
            this.f17383e = new f3();
        }
        f3 f3Var = this.f17383e;
        f3Var.f17321c = colorStateList;
        f3Var.f17320b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f17383e == null) {
            this.f17383e = new f3();
        }
        f3 f3Var = this.f17383e;
        f3Var.d = mode;
        f3Var.f17319a = true;
        a();
    }
}
