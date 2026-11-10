package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import c8.h9;
public final class x extends MultiAutoCompleteTextView implements u0.k {
    public static final int[] d = {16843126};
    public final h2.c f19284a;
    public final x0 f19285b;
    public final z f19286c;

    public x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968624);
        b3.a(context);
        a3.a(this, getContext());
        h6.m x10 = h6.m.x(getContext(), attributeSet, d, 2130968624);
        if (((TypedArray) x10.f14267c).hasValue(0)) {
            setDropDownBackgroundDrawable(x10.p(0));
        }
        x10.C();
        h2.c cVar = new h2.c(this);
        this.f19284a = cVar;
        cVar.x(attributeSet, 2130968624);
        x0 x0Var = new x0(this);
        this.f19285b = x0Var;
        x0Var.f(attributeSet, 2130968624);
        x0Var.b();
        z zVar = new z(this);
        this.f19286c = zVar;
        zVar.b(attributeSet, 2130968624);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener a10 = zVar.a(keyListener);
            if (a10 != keyListener) {
                super.setKeyListener(a10);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h2.c cVar = this.f19284a;
        if (cVar != null) {
            cVar.b();
        }
        x0 x0Var = this.f19285b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        h2.c cVar = this.f19284a;
        if (cVar != null) {
            return cVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h2.c cVar = this.f19284a;
        if (cVar != null) {
            return cVar.w();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f19285b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f19285b.e();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        h9.a(editorInfo, onCreateInputConnection, this);
        return this.f19286c.c(onCreateInputConnection, editorInfo);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h2.c cVar = this.f19284a;
        if (cVar != null) {
            cVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        h2.c cVar = this.f19284a;
        if (cVar != null) {
            cVar.z(i7);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f19285b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f19285b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public void setDropDownBackgroundResource(int i7) {
        setDropDownBackgroundDrawable(b5.a.b(getContext(), i7));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        this.f19286c.d(z9);
    }

    @Override
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f19286c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h2.c cVar = this.f19284a;
        if (cVar != null) {
            cVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h2.c cVar = this.f19284a;
        if (cVar != null) {
            cVar.E(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f19285b;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f19285b;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        x0 x0Var = this.f19285b;
        if (x0Var != null) {
            x0Var.g(context, i7);
        }
    }
}
