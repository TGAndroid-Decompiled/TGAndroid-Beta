package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import b8.oc;
public final class z extends RadioButton implements u0.k {
    public final p f18793a;
    public final g2.d f18794b;
    public final w0 f18795c;
    public t d;

    public z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968907);
        a3.a(context);
        z2.a(this, getContext());
        p pVar = new p(this);
        this.f18793a = pVar;
        pVar.e(attributeSet, 2130968907);
        g2.d dVar = new g2.d(this);
        this.f18794b = dVar;
        dVar.x(attributeSet, 2130968907);
        w0 w0Var = new w0(this);
        this.f18795c = w0Var;
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
        g2.d dVar = this.f18794b;
        if (dVar != null) {
            dVar.b();
        }
        w0 w0Var = this.f18795c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        p pVar = this.f18793a;
        if (pVar != null) {
            pVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        g2.d dVar = this.f18794b;
        if (dVar != null) {
            return dVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        g2.d dVar = this.f18794b;
        if (dVar != null) {
            return dVar.w();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        p pVar = this.f18793a;
        if (pVar != null) {
            return (ColorStateList) pVar.f18688a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        p pVar = this.f18793a;
        if (pVar != null) {
            return (PorterDuff.Mode) pVar.f18689b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f18795c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f18795c.e();
    }

    @Override
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        g2.d dVar = this.f18794b;
        if (dVar != null) {
            dVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        g2.d dVar = this.f18794b;
        if (dVar != null) {
            dVar.z(i3);
        }
    }

    @Override
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        p pVar = this.f18793a;
        if (pVar != null) {
            if (pVar.f18691e) {
                pVar.f18691e = false;
                return;
            }
            pVar.f18691e = true;
            pVar.a();
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f18795c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f18795c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((x7.p) getEmojiTextViewHelper().f18730b.f40562a).a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        g2.d dVar = this.f18794b;
        if (dVar != null) {
            dVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        g2.d dVar = this.f18794b;
        if (dVar != null) {
            dVar.E(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        p pVar = this.f18793a;
        if (pVar != null) {
            pVar.f18688a = colorStateList;
            pVar.f18690c = true;
            pVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        p pVar = this.f18793a;
        if (pVar != null) {
            pVar.f18689b = mode;
            pVar.d = true;
            pVar.a();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f18795c;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f18795c;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override
    public void setButtonDrawable(int i3) {
        setButtonDrawable(oc.b(getContext(), i3));
    }
}
