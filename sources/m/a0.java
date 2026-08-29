package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import h7.s7;
import i7.v6;
public final class a0 extends RadioButton implements u0.k {
    public final g2.e f16484a;
    public final n f16485b;
    public final x0 f16486c;
    public u d;

    public a0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968907);
        e3.a(context);
        d3.a(this, getContext());
        g2.e eVar = new g2.e(this);
        this.f16484a = eVar;
        eVar.e(attributeSet, 2130968907);
        n nVar = new n(this);
        this.f16485b = nVar;
        nVar.d(attributeSet, 2130968907);
        x0 x0Var = new x0(this);
        this.f16486c = x0Var;
        x0Var.f(attributeSet, 2130968907);
        getEmojiTextViewHelper().a(attributeSet, 2130968907);
    }

    private u getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new u(this);
        }
        return this.d;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.f16485b;
        if (nVar != null) {
            nVar.a();
        }
        x0 x0Var = this.f16486c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        g2.e eVar = this.f16484a;
        if (eVar != null) {
            eVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.f16485b;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.f16485b;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        g2.e eVar = this.f16484a;
        if (eVar != null) {
            return (ColorStateList) eVar.f6982e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        g2.e eVar = this.f16484a;
        if (eVar != null) {
            return (PorterDuff.Mode) eVar.f6983f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f16486c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f16486c.e();
    }

    @Override
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f16485b;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        n nVar = this.f16485b;
        if (nVar != null) {
            nVar.f(i10);
        }
    }

    @Override
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        g2.e eVar = this.f16484a;
        if (eVar != null) {
            if (eVar.f6981c) {
                eVar.f6981c = false;
                return;
            }
            eVar.f6981c = true;
            eVar.a();
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f16486c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f16486c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((v6) getEmojiTextViewHelper().f16702b.f17533b).a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f16485b;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f16485b;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        g2.e eVar = this.f16484a;
        if (eVar != null) {
            eVar.f6982e = colorStateList;
            eVar.f6979a = true;
            eVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        g2.e eVar = this.f16484a;
        if (eVar != null) {
            eVar.f6983f = mode;
            eVar.f6980b = true;
            eVar.a();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f16486c;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f16486c;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override
    public void setButtonDrawable(int i10) {
        setButtonDrawable(s7.b(getContext(), i10));
    }
}
