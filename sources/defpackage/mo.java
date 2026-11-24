package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
public final class mo extends CheckBox implements zob {
    public final oo a;
    public final ko b;
    public final pq c;
    public ip d;

    public mo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968716);
        xob.a(context);
        cnb.a(getContext(), this);
        oo ooVar = new oo(this);
        this.a = ooVar;
        ooVar.e(attributeSet, 2130968716);
        ko koVar = new ko(this);
        this.b = koVar;
        koVar.g(attributeSet, 2130968716);
        pq pqVar = new pq(this);
        this.c = pqVar;
        pqVar.f(attributeSet, 2130968716);
        getEmojiTextViewHelper().a(attributeSet, 2130968716);
    }

    private ip getEmojiTextViewHelper() {
        ip ipVar = this.d;
        if (ipVar == null) {
            ip ipVar2 = new ip(this);
            this.d = ipVar2;
            return ipVar2;
        }
        return ipVar;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ko koVar = this.b;
        if (koVar != null) {
            koVar.b();
        }
        pq pqVar = this.c;
        if (pqVar != null) {
            pqVar.b();
        }
    }

    @Override
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        oo ooVar = this.a;
        if (ooVar != null) {
            ooVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        ko koVar = this.b;
        if (koVar != null) {
            return koVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ko koVar = this.b;
        if (koVar != null) {
            return koVar.f();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        oo ooVar = this.a;
        if (ooVar != null) {
            return (ColorStateList) ooVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        oo ooVar = this.a;
        if (ooVar != null) {
            return (PorterDuff.Mode) ooVar.b;
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
        ko koVar = this.b;
        if (koVar != null) {
            koVar.h();
        }
    }

    @Override
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ko koVar = this.b;
        if (koVar != null) {
            koVar.i(i);
        }
    }

    @Override
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        oo ooVar = this.a;
        if (ooVar != null) {
            if (ooVar.e) {
                ooVar.e = false;
                return;
            }
            ooVar.e = true;
            ooVar.a();
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        pq pqVar = this.c;
        if (pqVar != null) {
            pqVar.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        pq pqVar = this.c;
        if (pqVar != null) {
            pqVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((efe) getEmojiTextViewHelper().b.a).a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ko koVar = this.b;
        if (koVar != null) {
            koVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ko koVar = this.b;
        if (koVar != null) {
            koVar.n(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        oo ooVar = this.a;
        if (ooVar != null) {
            ooVar.a = colorStateList;
            ooVar.c = true;
            ooVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        oo ooVar = this.a;
        if (ooVar != null) {
            ooVar.b = mode;
            ooVar.d = true;
            ooVar.a();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        pq pqVar = this.c;
        pqVar.l(colorStateList);
        pqVar.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        pq pqVar = this.c;
        pqVar.m(mode);
        pqVar.b();
    }

    @Override
    public void setButtonDrawable(int i) {
        setButtonDrawable(hmd.a(getContext(), i));
    }
}
