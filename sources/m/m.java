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
import h7.s7;
import i7.d8;
public class m extends AutoCompleteTextView implements u0.k {
    public static final int[] d = {16843126};
    public final n f16594a;
    public final x0 f16595b;
    public final z f16596c;

    public m(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e3.a(context);
        d3.a(this, getContext());
        l3.g0 z10 = l3.g0.z(getContext(), attributeSet, d, i10);
        if (((TypedArray) z10.f14097c).hasValue(0)) {
            setDropDownBackgroundDrawable(z10.q(0));
        }
        z10.B();
        n nVar = new n(this);
        this.f16594a = nVar;
        nVar.d(attributeSet, i10);
        x0 x0Var = new x0(this);
        this.f16595b = x0Var;
        x0Var.f(attributeSet, i10);
        x0Var.b();
        z zVar = new z(this);
        this.f16596c = zVar;
        zVar.b(attributeSet, i10);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a2 = zVar.a(keyListener);
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
        n nVar = this.f16594a;
        if (nVar != null) {
            nVar.a();
        }
        x0 x0Var = this.f16595b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return d8.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.f16594a;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.f16594a;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f16595b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f16595b.e();
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        i7.u.a(editorInfo, onCreateInputConnection, this);
        return this.f16596c.c(onCreateInputConnection, editorInfo);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f16594a;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        n nVar = this.f16594a;
        if (nVar != null) {
            nVar.f(i10);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f16595b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f16595b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d8.e(callback, this));
    }

    @Override
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(s7.b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f16596c.d(z10);
    }

    @Override
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f16596c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f16594a;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f16594a;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f16595b;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f16595b;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        x0 x0Var = this.f16595b;
        if (x0Var != null) {
            x0Var.g(context, i10);
        }
    }
}
