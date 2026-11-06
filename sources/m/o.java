package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import c8.fc;
public final class o extends CheckBox implements u0.k {
    public final q f19183a;
    public final h2.c f19184b;
    public final x0 f19185c;
    public u d;

    public o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968716);
        b3.a(context);
        a3.a(this, getContext());
        q qVar = new q(this);
        this.f19183a = qVar;
        qVar.e(attributeSet, 2130968716);
        h2.c cVar = new h2.c(this);
        this.f19184b = cVar;
        cVar.x(attributeSet, 2130968716);
        x0 x0Var = new x0(this);
        this.f19185c = x0Var;
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
        h2.c cVar = this.f19184b;
        if (cVar != null) {
            cVar.b();
        }
        x0 x0Var = this.f19185c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        q qVar = this.f19183a;
        if (qVar != null) {
            qVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        h2.c cVar = this.f19184b;
        if (cVar != null) {
            return cVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h2.c cVar = this.f19184b;
        if (cVar != null) {
            return cVar.w();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        q qVar = this.f19183a;
        if (qVar != null) {
            return (ColorStateList) qVar.f19211a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        q qVar = this.f19183a;
        if (qVar != null) {
            return (PorterDuff.Mode) qVar.f19212b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f19185c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f19185c.e();
    }

    @Override
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().b(z9);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h2.c cVar = this.f19184b;
        if (cVar != null) {
            cVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        h2.c cVar = this.f19184b;
        if (cVar != null) {
            cVar.z(i7);
        }
    }

    @Override
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        q qVar = this.f19183a;
        if (qVar != null) {
            if (qVar.f19214e) {
                qVar.f19214e = false;
                return;
            }
            qVar.f19214e = true;
            qVar.a();
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f19185c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f19185c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().c(z9);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((fc) getEmojiTextViewHelper().f19259b.f38757b).a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h2.c cVar = this.f19184b;
        if (cVar != null) {
            cVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h2.c cVar = this.f19184b;
        if (cVar != null) {
            cVar.E(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        q qVar = this.f19183a;
        if (qVar != null) {
            qVar.f19211a = colorStateList;
            qVar.f19213c = true;
            qVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        q qVar = this.f19183a;
        if (qVar != null) {
            qVar.f19212b = mode;
            qVar.d = true;
            qVar.a();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f19185c;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f19185c;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override
    public void setButtonDrawable(int i7) {
        setButtonDrawable(b5.a.b(getContext(), i7));
    }
}
