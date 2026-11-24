package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
public final class mp extends CheckBox implements arb {
    public final op a;
    public final kp b;
    public final pr c;
    public iq d;

    public mp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968716);
        yqb.a(context);
        dpb.a(getContext(), this);
        op opVar = new op(this);
        this.a = opVar;
        opVar.e(attributeSet, 2130968716);
        kp kpVar = new kp(this);
        this.b = kpVar;
        kpVar.g(attributeSet, 2130968716);
        pr prVar = new pr(this);
        this.c = prVar;
        prVar.f(attributeSet, 2130968716);
        getEmojiTextViewHelper().a(attributeSet, 2130968716);
    }

    private iq getEmojiTextViewHelper() {
        iq iqVar = this.d;
        if (iqVar == null) {
            iq iqVar2 = new iq(this);
            this.d = iqVar2;
            return iqVar2;
        }
        return iqVar;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.b();
        }
        pr prVar = this.c;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        op opVar = this.a;
        if (opVar != null) {
            opVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        kp kpVar = this.b;
        if (kpVar != null) {
            return kpVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        kp kpVar = this.b;
        if (kpVar != null) {
            return kpVar.f();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        op opVar = this.a;
        if (opVar != null) {
            return (ColorStateList) opVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        op opVar = this.a;
        if (opVar != null) {
            return (PorterDuff.Mode) opVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.h();
        }
    }

    @Override
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.i(i);
        }
    }

    @Override
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        op opVar = this.a;
        if (opVar != null) {
            if (opVar.e) {
                opVar.e = false;
                return;
            }
            opVar.e = true;
            opVar.a();
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        pr prVar = this.c;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        pr prVar = this.c;
        if (prVar != null) {
            prVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((fhe) getEmojiTextViewHelper().b.a).a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.n(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        op opVar = this.a;
        if (opVar != null) {
            opVar.a = colorStateList;
            opVar.c = true;
            opVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        op opVar = this.a;
        if (opVar != null) {
            opVar.b = mode;
            opVar.d = true;
            opVar.a();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        pr prVar = this.c;
        prVar.l(colorStateList);
        prVar.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        pr prVar = this.c;
        prVar.m(mode);
        prVar.b();
    }

    @Override
    public void setButtonDrawable(int i) {
        setButtonDrawable(kod.a(getContext(), i));
    }
}
