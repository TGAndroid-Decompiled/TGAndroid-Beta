package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import c8.lc;
public final class z extends RadioButton implements u0.k {
    public final p f20269a;
    public final h2.c f20270b;
    public final w0 f20271c;
    public t d;

    public z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968907);
        a3.a(context);
        z2.a(this, getContext());
        p pVar = new p(this);
        this.f20269a = pVar;
        pVar.e(attributeSet, 2130968907);
        h2.c cVar = new h2.c(this);
        this.f20270b = cVar;
        cVar.x(attributeSet, 2130968907);
        w0 w0Var = new w0(this);
        this.f20271c = w0Var;
        w0Var.f(attributeSet, 2130968907);
        getEmojiTextViewHelper().a(attributeSet, 2130968907);
    }

    private t getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new t(this);
        }
        return this.d;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h2.c cVar = this.f20270b;
        if (cVar != null) {
            cVar.b();
        }
        w0 w0Var = this.f20271c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        p pVar = this.f20269a;
        if (pVar != null) {
            pVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        h2.c cVar = this.f20270b;
        if (cVar != null) {
            return cVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h2.c cVar = this.f20270b;
        if (cVar != null) {
            return cVar.w();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        p pVar = this.f20269a;
        if (pVar != null) {
            return (ColorStateList) pVar.f20164a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        p pVar = this.f20269a;
        if (pVar != null) {
            return (PorterDuff.Mode) pVar.f20165b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f20271c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f20271c.e();
    }

    @Override
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h2.c cVar = this.f20270b;
        if (cVar != null) {
            cVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        h2.c cVar = this.f20270b;
        if (cVar != null) {
            cVar.z(i7);
        }
    }

    @Override
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        p pVar = this.f20269a;
        if (pVar != null) {
            if (pVar.f20167e) {
                pVar.f20167e = false;
                return;
            }
            pVar.f20167e = true;
            pVar.a();
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f20271c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f20271c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((lc) getEmojiTextViewHelper().f20206b.f35933b).a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h2.c cVar = this.f20270b;
        if (cVar != null) {
            cVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h2.c cVar = this.f20270b;
        if (cVar != null) {
            cVar.E(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        p pVar = this.f20269a;
        if (pVar != null) {
            pVar.f20164a = colorStateList;
            pVar.f20166c = true;
            pVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        p pVar = this.f20269a;
        if (pVar != null) {
            pVar.f20165b = mode;
            pVar.d = true;
            pVar.a();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f20271c;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f20271c;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override
    public void setButtonDrawable(int i7) {
        setButtonDrawable(c8.z.b(getContext(), i7));
    }
}
