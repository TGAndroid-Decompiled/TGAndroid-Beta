package defpackage;

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
public final class np extends MultiAutoCompleteTextView implements zsb {
    public static final int[] d = {16843126};
    public final lo a;
    public final qq b;
    public final qx6 c;

    public np(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968624);
        xsb.a(context);
        brb.a(getContext(), this);
        ko9 v = ko9.v(getContext(), attributeSet, d, 2130968624);
        if (((TypedArray) v.c).hasValue(0)) {
            setDropDownBackgroundDrawable(v.n(0));
        }
        v.y();
        lo loVar = new lo(this);
        this.a = loVar;
        loVar.g(attributeSet, 2130968624);
        qq qqVar = new qq(this);
        this.b = qqVar;
        qqVar.f(attributeSet, 2130968624);
        qqVar.b();
        qx6 qx6Var = new qx6(this);
        this.c = qx6Var;
        qx6Var.y(attributeSet, 2130968624);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener u = qx6Var.u(keyListener);
            if (u != keyListener) {
                super.setKeyListener(u);
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
        lo loVar = this.a;
        if (loVar != null) {
            loVar.b();
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        lo loVar = this.a;
        if (loVar != null) {
            return loVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        lo loVar = this.a;
        if (loVar != null) {
            return loVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        xqd.a(editorInfo, onCreateInputConnection, this);
        return this.c.z(onCreateInputConnection, editorInfo);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        lo loVar = this.a;
        if (loVar != null) {
            loVar.h();
        }
    }

    @Override
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        lo loVar = this.a;
        if (loVar != null) {
            loVar.i(i);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    @Override
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(yqd.a(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.c.L(z);
    }

    @Override
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.u(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        lo loVar = this.a;
        if (loVar != null) {
            loVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        lo loVar = this.a;
        if (loVar != null) {
            loVar.n(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        qq qqVar = this.b;
        qqVar.l(colorStateList);
        qqVar.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        qq qqVar = this.b;
        qqVar.m(mode);
        qqVar.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.g(context, i);
        }
    }
}
