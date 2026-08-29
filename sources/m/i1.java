package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import i7.v6;
public final class i1 extends ToggleButton implements u0.k {
    public final n f16572a;
    public final x0 f16573b;
    public u f16574c;

    public i1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        d3.a(this, getContext());
        n nVar = new n(this);
        this.f16572a = nVar;
        nVar.d(attributeSet, 16842827);
        x0 x0Var = new x0(this);
        this.f16573b = x0Var;
        x0Var.f(attributeSet, 16842827);
        getEmojiTextViewHelper().a(attributeSet, 16842827);
    }

    private u getEmojiTextViewHelper() {
        if (this.f16574c == null) {
            this.f16574c = new u(this);
        }
        return this.f16574c;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.f16572a;
        if (nVar != null) {
            nVar.a();
        }
        x0 x0Var = this.f16573b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.f16572a;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.f16572a;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f16573b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f16573b.e();
    }

    @Override
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f16572a;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        n nVar = this.f16572a;
        if (nVar != null) {
            nVar.f(i10);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f16573b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f16573b;
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
        n nVar = this.f16572a;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f16572a;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f16573b;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f16573b;
        x0Var.m(mode);
        x0Var.b();
    }
}
