package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import v7.q7;
import w7.n6;
public final class p extends CheckBox implements u0.k {
    public final r f14917a;
    public final e2.c f14918b;
    public final y0 f14919c;
    public v d;

    public p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968716);
        e3.a(context);
        d3.a(this, getContext());
        r rVar = new r(this);
        this.f14917a = rVar;
        rVar.e(attributeSet, 2130968716);
        e2.c cVar = new e2.c(this);
        this.f14918b = cVar;
        cVar.f(attributeSet, 2130968716);
        y0 y0Var = new y0(this);
        this.f14919c = y0Var;
        y0Var.f(attributeSet, 2130968716);
        getEmojiTextViewHelper().a(attributeSet, 2130968716);
    }

    private v getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new v(this);
        }
        return this.d;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.f14918b;
        if (cVar != null) {
            cVar.b();
        }
        y0 y0Var = this.f14919c;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        r rVar = this.f14917a;
        if (rVar != null) {
            rVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f14918b;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f14918b;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        r rVar = this.f14917a;
        if (rVar != null) {
            return (ColorStateList) rVar.f14944a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        r rVar = this.f14917a;
        if (rVar != null) {
            return (PorterDuff.Mode) rVar.f14945b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14919c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14919c.e();
    }

    @Override
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.f14918b;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f14918b;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        r rVar = this.f14917a;
        if (rVar != null) {
            if (rVar.e) {
                rVar.e = false;
                return;
            }
            rVar.e = true;
            rVar.a();
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f14919c;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f14919c;
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
        e2.c cVar = this.f14918b;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f14918b;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        r rVar = this.f14917a;
        if (rVar != null) {
            rVar.f14944a = colorStateList;
            rVar.f14946c = true;
            rVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        r rVar = this.f14917a;
        if (rVar != null) {
            rVar.f14945b = mode;
            rVar.d = true;
            rVar.a();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        y0 y0Var = this.f14919c;
        y0Var.l(colorStateList);
        y0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        y0 y0Var = this.f14919c;
        y0Var.m(mode);
        y0Var.b();
    }

    @Override
    public void setButtonDrawable(int i10) {
        setButtonDrawable(q7.b(getContext(), i10));
    }
}
