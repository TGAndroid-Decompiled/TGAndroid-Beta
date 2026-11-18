package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import c8.lc;
public final class h1 extends ToggleButton implements u0.k {
    public final h2.c f20079a;
    public final w0 f20080b;
    public t f20081c;

    public h1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        z2.a(this, getContext());
        h2.c cVar = new h2.c(this);
        this.f20079a = cVar;
        cVar.x(attributeSet, 16842827);
        w0 w0Var = new w0(this);
        this.f20080b = w0Var;
        w0Var.f(attributeSet, 16842827);
        getEmojiTextViewHelper().a(attributeSet, 16842827);
    }

    private t getEmojiTextViewHelper() {
        if (this.f20081c == null) {
            this.f20081c = new t(this);
        }
        return this.f20081c;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h2.c cVar = this.f20079a;
        if (cVar != null) {
            cVar.b();
        }
        w0 w0Var = this.f20080b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        h2.c cVar = this.f20079a;
        if (cVar != null) {
            return cVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h2.c cVar = this.f20079a;
        if (cVar != null) {
            return cVar.w();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f20080b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f20080b.e();
    }

    @Override
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h2.c cVar = this.f20079a;
        if (cVar != null) {
            cVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        h2.c cVar = this.f20079a;
        if (cVar != null) {
            cVar.z(i7);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f20080b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f20080b;
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
        h2.c cVar = this.f20079a;
        if (cVar != null) {
            cVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h2.c cVar = this.f20079a;
        if (cVar != null) {
            cVar.E(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f20080b;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f20080b;
        w0Var.m(mode);
        w0Var.b();
    }
}
