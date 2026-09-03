package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import j7.r7;
import k7.k6;
public final class o extends CheckBox implements u0.k {
    public final g2.e f13559a;
    public final m f13560b;
    public final x0 f13561c;
    public t d;

    public o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968716);
        e3.a(context);
        d3.a(this, getContext());
        g2.e eVar = new g2.e(this);
        this.f13559a = eVar;
        eVar.e(attributeSet, 2130968716);
        m mVar = new m(this);
        this.f13560b = mVar;
        mVar.d(attributeSet, 2130968716);
        x0 x0Var = new x0(this);
        this.f13561c = x0Var;
        x0Var.f(attributeSet, 2130968716);
        getEmojiTextViewHelper().a(attributeSet, 2130968716);
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
        m mVar = this.f13560b;
        if (mVar != null) {
            mVar.a();
        }
        x0 x0Var = this.f13561c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        g2.e eVar = this.f13559a;
        if (eVar != null) {
            eVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        m mVar = this.f13560b;
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m mVar = this.f13560b;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        g2.e eVar = this.f13559a;
        if (eVar != null) {
            return (ColorStateList) eVar.e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        g2.e eVar = this.f13559a;
        if (eVar != null) {
            return (PorterDuff.Mode) eVar.f6351f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13561c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13561c.e();
    }

    @Override
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().b(z4);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m mVar = this.f13560b;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        m mVar = this.f13560b;
        if (mVar != null) {
            mVar.f(i10);
        }
    }

    @Override
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        g2.e eVar = this.f13559a;
        if (eVar != null) {
            if (eVar.f6350c) {
                eVar.f6350c = false;
                return;
            }
            eVar.f6350c = true;
            eVar.a();
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f13561c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f13561c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().c(z4);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((k6) getEmojiTextViewHelper().f13630b.f31508b).a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m mVar = this.f13560b;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m mVar = this.f13560b;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        g2.e eVar = this.f13559a;
        if (eVar != null) {
            eVar.e = colorStateList;
            eVar.f6348a = true;
            eVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        g2.e eVar = this.f13559a;
        if (eVar != null) {
            eVar.f6351f = mode;
            eVar.f6349b = true;
            eVar.a();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f13561c;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f13561c;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override
    public void setButtonDrawable(int i10) {
        setButtonDrawable(r7.b(getContext(), i10));
    }
}
