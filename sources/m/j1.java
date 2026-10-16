package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import w7.n6;
public final class j1 extends ToggleButton implements u0.k {
    public final e2.c f14874a;
    public final y0 f14875b;
    public v f14876c;

    public j1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        d3.a(this, getContext());
        e2.c cVar = new e2.c(this);
        this.f14874a = cVar;
        cVar.f(attributeSet, 16842827);
        y0 y0Var = new y0(this);
        this.f14875b = y0Var;
        y0Var.f(attributeSet, 16842827);
        getEmojiTextViewHelper().a(attributeSet, 16842827);
    }

    private v getEmojiTextViewHelper() {
        if (this.f14876c == null) {
            this.f14876c = new v(this);
        }
        return this.f14876c;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.f14874a;
        if (cVar != null) {
            cVar.b();
        }
        y0 y0Var = this.f14875b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f14874a;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f14874a;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14875b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14875b.e();
    }

    @Override
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.f14874a;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f14874a;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f14875b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f14875b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((n6) getEmojiTextViewHelper().f14995b.f14848b).a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f14874a;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f14874a;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        y0 y0Var = this.f14875b;
        y0Var.l(colorStateList);
        y0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        y0 y0Var = this.f14875b;
        y0Var.m(mode);
        y0Var.b();
    }
}
