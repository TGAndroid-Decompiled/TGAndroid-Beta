package m;

import a8.kc;
import a8.nf;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
public final class n extends CheckBox implements u0.k {
    public final p f17778a;
    public final e2.c f17779b;
    public final w0 f17780c;
    public t d;

    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968716);
        c3.a(context);
        b3.a(this, getContext());
        p pVar = new p(this);
        this.f17778a = pVar;
        pVar.e(attributeSet, 2130968716);
        e2.c cVar = new e2.c(this);
        this.f17779b = cVar;
        cVar.f(attributeSet, 2130968716);
        w0 w0Var = new w0(this);
        this.f17780c = w0Var;
        w0Var.f(attributeSet, 2130968716);
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
        e2.c cVar = this.f17779b;
        if (cVar != null) {
            cVar.b();
        }
        w0 w0Var = this.f17780c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        p pVar = this.f17778a;
        if (pVar != null) {
            pVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f17779b;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f17779b;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        p pVar = this.f17778a;
        if (pVar != null) {
            return (ColorStateList) pVar.f17805a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        p pVar = this.f17778a;
        if (pVar != null) {
            return (PorterDuff.Mode) pVar.f17806b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f17780c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f17780c.e();
    }

    @Override
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.f17779b;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f17779b;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        p pVar = this.f17778a;
        if (pVar != null) {
            if (pVar.e) {
                pVar.e = false;
                return;
            }
            pVar.e = true;
            pVar.a();
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f17780c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f17780c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((nf) getEmojiTextViewHelper().f17856b.f17210b).a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f17779b;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f17779b;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        p pVar = this.f17778a;
        if (pVar != null) {
            pVar.f17805a = colorStateList;
            pVar.f17807c = true;
            pVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        p pVar = this.f17778a;
        if (pVar != null) {
            pVar.f17806b = mode;
            pVar.d = true;
            pVar.a();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f17780c;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f17780c;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override
    public void setButtonDrawable(int i10) {
        setButtonDrawable(kc.b(getContext(), i10));
    }
}
