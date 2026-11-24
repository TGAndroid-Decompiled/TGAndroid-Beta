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
public final class mq extends MultiAutoCompleteTextView implements arb {
    public static final int[] d = {16843126};
    public final kp a;
    public final pr b;
    public final hi2 c;

    public mq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968624);
        yqb.a(context);
        dpb.a(getContext(), this);
        wm9 v = wm9.v(getContext(), attributeSet, d, 2130968624);
        if (((TypedArray) v.c).hasValue(0)) {
            setDropDownBackgroundDrawable(v.j(0));
        }
        v.y();
        kp kpVar = new kp(this);
        this.a = kpVar;
        kpVar.g(attributeSet, 2130968624);
        pr prVar = new pr(this);
        this.b = prVar;
        prVar.f(attributeSet, 2130968624);
        prVar.b();
        hi2 hi2Var = new hi2(this);
        this.c = hi2Var;
        hi2Var.E(attributeSet, 2130968624);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener w = hi2Var.w(keyListener);
            if (w != keyListener) {
                super.setKeyListener(w);
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
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.b();
        }
        pr prVar = this.b;
        if (prVar != null) {
            prVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        kp kpVar = this.a;
        if (kpVar != null) {
            return kpVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        kp kpVar = this.a;
        if (kpVar != null) {
            return kpVar.f();
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
        jod.a(editorInfo, onCreateInputConnection, this);
        return this.c.F(onCreateInputConnection, editorInfo);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.h();
        }
    }

    @Override
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.i(i);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        pr prVar = this.b;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        pr prVar = this.b;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(kod.a(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.c.S(z);
    }

    @Override
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.w(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.n(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        pr prVar = this.b;
        prVar.l(colorStateList);
        prVar.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        pr prVar = this.b;
        prVar.m(mode);
        prVar.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        pr prVar = this.b;
        if (prVar != null) {
            prVar.g(context, i);
        }
    }
}
