package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import v7.q7;
import w7.l6;
public final class o extends CheckBox implements u0.k {
    public final q f16270a;
    public final e2.c f16271b;
    public final x0 f16272c;
    public u d;

    public o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968716);
        d3.a(context);
        c3.a(this, getContext());
        q qVar = new q(this);
        this.f16270a = qVar;
        qVar.e(attributeSet, 2130968716);
        e2.c cVar = new e2.c(this);
        this.f16271b = cVar;
        cVar.f(attributeSet, 2130968716);
        x0 x0Var = new x0(this);
        this.f16272c = x0Var;
        x0Var.f(attributeSet, 2130968716);
        getEmojiTextViewHelper().a(attributeSet, 2130968716);
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
        e2.c cVar = this.f16271b;
        if (cVar != null) {
            cVar.b();
        }
        x0 x0Var = this.f16272c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        q qVar = this.f16270a;
        if (qVar != null) {
            qVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f16271b;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f16271b;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        q qVar = this.f16270a;
        if (qVar != null) {
            return (ColorStateList) qVar.f16297a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        q qVar = this.f16270a;
        if (qVar != null) {
            return (PorterDuff.Mode) qVar.f16298b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f16272c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f16272c.e();
    }

    @Override
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.f16271b;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f16271b;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        q qVar = this.f16270a;
        if (qVar != null) {
            if (qVar.e) {
                qVar.e = false;
                return;
            }
            qVar.e = true;
            qVar.a();
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f16272c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f16272c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((l6) getEmojiTextViewHelper().f16348b.f14832b).a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f16271b;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f16271b;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        q qVar = this.f16270a;
        if (qVar != null) {
            qVar.f16297a = colorStateList;
            qVar.f16299c = true;
            qVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        q qVar = this.f16270a;
        if (qVar != null) {
            qVar.f16298b = mode;
            qVar.d = true;
            qVar.a();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f16272c;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f16272c;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override
    public void setButtonDrawable(int i10) {
        setButtonDrawable(q7.b(getContext(), i10));
    }
}
