package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import j7.s7;
import k7.l6;
public final class z extends RadioButton implements u0.k {
    public final g2.e f13398a;
    public final m f13399b;
    public final w0 f13400c;
    public t d;

    public z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968907);
        d3.a(context);
        c3.a(this, getContext());
        g2.e eVar = new g2.e(this);
        this.f13398a = eVar;
        eVar.e(attributeSet, 2130968907);
        m mVar = new m(this);
        this.f13399b = mVar;
        mVar.d(attributeSet, 2130968907);
        w0 w0Var = new w0(this);
        this.f13400c = w0Var;
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
        m mVar = this.f13399b;
        if (mVar != null) {
            mVar.a();
        }
        w0 w0Var = this.f13400c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        g2.e eVar = this.f13398a;
        if (eVar != null) {
            eVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        m mVar = this.f13399b;
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m mVar = this.f13399b;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        g2.e eVar = this.f13398a;
        if (eVar != null) {
            return (ColorStateList) eVar.f6826e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        g2.e eVar = this.f13398a;
        if (eVar != null) {
            return (PorterDuff.Mode) eVar.f6827f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13400c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13400c.e();
    }

    @Override
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().b(z4);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m mVar = this.f13399b;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        m mVar = this.f13399b;
        if (mVar != null) {
            mVar.f(i10);
        }
    }

    @Override
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        g2.e eVar = this.f13398a;
        if (eVar != null) {
            if (eVar.f6825c) {
                eVar.f6825c = false;
                return;
            }
            eVar.f6825c = true;
            eVar.a();
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f13400c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f13400c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().c(z4);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((l6) getEmojiTextViewHelper().f13343b.f25257b).a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m mVar = this.f13399b;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m mVar = this.f13399b;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        g2.e eVar = this.f13398a;
        if (eVar != null) {
            eVar.f6826e = colorStateList;
            eVar.f6823a = true;
            eVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        g2.e eVar = this.f13398a;
        if (eVar != null) {
            eVar.f6827f = mode;
            eVar.f6824b = true;
            eVar.a();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f13400c;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f13400c;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override
    public void setButtonDrawable(int i10) {
        setButtonDrawable(s7.b(getContext(), i10));
    }
}
