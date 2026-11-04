package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
public final class h1 extends ToggleButton implements u0.k {
    public final g2.d f18603a;
    public final w0 f18604b;
    public t f18605c;

    public h1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        z2.a(this, getContext());
        g2.d dVar = new g2.d(this);
        this.f18603a = dVar;
        dVar.x(attributeSet, 16842827);
        w0 w0Var = new w0(this);
        this.f18604b = w0Var;
        w0Var.f(attributeSet, 16842827);
        getEmojiTextViewHelper().a(attributeSet, 16842827);
    }

    private t getEmojiTextViewHelper() {
        if (this.f18605c == null) {
            this.f18605c = new t(this);
        }
        return this.f18605c;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        g2.d dVar = this.f18603a;
        if (dVar != null) {
            dVar.b();
        }
        w0 w0Var = this.f18604b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        g2.d dVar = this.f18603a;
        if (dVar != null) {
            return dVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        g2.d dVar = this.f18603a;
        if (dVar != null) {
            return dVar.w();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f18604b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f18604b.e();
    }

    @Override
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        g2.d dVar = this.f18603a;
        if (dVar != null) {
            dVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        g2.d dVar = this.f18603a;
        if (dVar != null) {
            dVar.z(i3);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f18604b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f18604b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((x7.p) getEmojiTextViewHelper().f18730b.f40562a).a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        g2.d dVar = this.f18603a;
        if (dVar != null) {
            dVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        g2.d dVar = this.f18603a;
        if (dVar != null) {
            dVar.E(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f18604b;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f18604b;
        w0Var.m(mode);
        w0Var.b();
    }
}
