package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import v7.q7;
import w7.w7;
public class n extends AutoCompleteTextView implements u0.k {
    public static final int[] d = {16843126};
    public final e2.c f14896a;
    public final y0 f14897b;
    public final a0 f14898c;

    public n(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e3.a(context);
        d3.a(this, getContext());
        h3 P = h3.P(getContext(), attributeSet, d, i10);
        if (((TypedArray) P.f14851c).hasValue(0)) {
            setDropDownBackgroundDrawable(P.F(0));
        }
        P.Q();
        e2.c cVar = new e2.c(this);
        this.f14896a = cVar;
        cVar.f(attributeSet, i10);
        y0 y0Var = new y0(this);
        this.f14897b = y0Var;
        y0Var.f(attributeSet, i10);
        y0Var.b();
        a0 a0Var = new a0(this);
        this.f14898c = a0Var;
        a0Var.b(attributeSet, i10);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a2 = a0Var.a(keyListener);
            if (a2 != keyListener) {
                super.setKeyListener(a2);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.f14896a;
        if (cVar != null) {
            cVar.b();
        }
        y0 y0Var = this.f14897b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return w7.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f14896a;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f14896a;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14897b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14897b.e();
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        w7.p.a(editorInfo, onCreateInputConnection, this);
        return this.f14898c.c(onCreateInputConnection, editorInfo);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.f14896a;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f14896a;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f14897b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f14897b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(w7.e(callback, this));
    }

    @Override
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(q7.b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f14898c.d(z10);
    }

    @Override
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f14898c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f14896a;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f14896a;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        y0 y0Var = this.f14897b;
        y0Var.l(colorStateList);
        y0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        y0 y0Var = this.f14897b;
        y0Var.m(mode);
        y0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        y0 y0Var = this.f14897b;
        if (y0Var != null) {
            y0Var.g(context, i10);
        }
    }
}
