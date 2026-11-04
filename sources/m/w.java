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
import b8.oc;
import b8.zd;
public final class w extends MultiAutoCompleteTextView implements u0.k {
    public static final int[] d = {16843126};
    public final g2.d f18747a;
    public final w0 f18748b;
    public final y f18749c;

    public w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968624);
        a3.a(context);
        z2.a(this, getContext());
        k4.j F = k4.j.F(getContext(), attributeSet, d, 2130968624);
        if (((TypedArray) F.f16870b).hasValue(0)) {
            setDropDownBackgroundDrawable(F.A(0));
        }
        F.H();
        g2.d dVar = new g2.d(this);
        this.f18747a = dVar;
        dVar.x(attributeSet, 2130968624);
        w0 w0Var = new w0(this);
        this.f18748b = w0Var;
        w0Var.f(attributeSet, 2130968624);
        w0Var.b();
        y yVar = new y(this);
        this.f18749c = yVar;
        yVar.b(attributeSet, 2130968624);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener a10 = yVar.a(keyListener);
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
        g2.d dVar = this.f18747a;
        if (dVar != null) {
            dVar.b();
        }
        w0 w0Var = this.f18748b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        g2.d dVar = this.f18747a;
        if (dVar != null) {
            return dVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        g2.d dVar = this.f18747a;
        if (dVar != null) {
            return dVar.w();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f18748b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f18748b.e();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        zd.a(editorInfo, onCreateInputConnection, this);
        return this.f18749c.c(onCreateInputConnection, editorInfo);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        g2.d dVar = this.f18747a;
        if (dVar != null) {
            dVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        g2.d dVar = this.f18747a;
        if (dVar != null) {
            dVar.z(i3);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f18748b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f18748b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public void setDropDownBackgroundResource(int i3) {
        setDropDownBackgroundDrawable(oc.b(getContext(), i3));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f18749c.d(z10);
    }

    @Override
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f18749c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        g2.d dVar = this.f18747a;
        if (dVar != null) {
            dVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        g2.d dVar = this.f18747a;
        if (dVar != null) {
            dVar.E(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f18748b;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f18748b;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        w0 w0Var = this.f18748b;
        if (w0Var != null) {
            w0Var.g(context, i3);
        }
    }
}
