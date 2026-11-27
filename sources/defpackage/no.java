package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
public final class no extends CheckBox implements zsb {
    public final po a;
    public final lo b;
    public final qq c;
    public jp d;

    public no(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968716);
        xsb.a(context);
        brb.a(getContext(), this);
        po poVar = new po(this);
        this.a = poVar;
        poVar.e(attributeSet, 2130968716);
        lo loVar = new lo(this);
        this.b = loVar;
        loVar.g(attributeSet, 2130968716);
        qq qqVar = new qq(this);
        this.c = qqVar;
        qqVar.f(attributeSet, 2130968716);
        getEmojiTextViewHelper().a(attributeSet, 2130968716);
    }

    private jp getEmojiTextViewHelper() {
        jp jpVar = this.d;
        if (jpVar == null) {
            jp jpVar2 = new jp(this);
            this.d = jpVar2;
            return jpVar2;
        }
        return jpVar;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        lo loVar = this.b;
        if (loVar != null) {
            loVar.b();
        }
        qq qqVar = this.c;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    @Override
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        po poVar = this.a;
        if (poVar != null) {
            poVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        lo loVar = this.b;
        if (loVar != null) {
            return loVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        lo loVar = this.b;
        if (loVar != null) {
            return loVar.f();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        po poVar = this.a;
        if (poVar != null) {
            return (ColorStateList) poVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        po poVar = this.a;
        if (poVar != null) {
            return (PorterDuff.Mode) poVar.b;
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
        lo loVar = this.b;
        if (loVar != null) {
            loVar.h();
        }
    }

    @Override
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        lo loVar = this.b;
        if (loVar != null) {
            loVar.i(i);
        }
    }

    @Override
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        po poVar = this.a;
        if (poVar != null) {
            if (poVar.e) {
                poVar.e = false;
                return;
            }
            poVar.e = true;
            poVar.a();
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        qq qqVar = this.c;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        qq qqVar = this.c;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((vje) getEmojiTextViewHelper().b.b).a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        lo loVar = this.b;
        if (loVar != null) {
            loVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        lo loVar = this.b;
        if (loVar != null) {
            loVar.n(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        po poVar = this.a;
        if (poVar != null) {
            poVar.a = colorStateList;
            poVar.c = true;
            poVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        po poVar = this.a;
        if (poVar != null) {
            poVar.b = mode;
            poVar.d = true;
            poVar.a();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        qq qqVar = this.c;
        qqVar.l(colorStateList);
        qqVar.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        qq qqVar = this.c;
        qqVar.m(mode);
        qqVar.b();
    }

    @Override
    public void setButtonDrawable(int i) {
        setButtonDrawable(yqd.a(getContext(), i));
    }
}
