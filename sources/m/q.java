package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import h7.s7;
import i7.d8;
public final class q extends CheckedTextView implements u0.k {
    public final g2.e f16647a;
    public final n f16648b;
    public final x0 f16649c;
    public u d;

    public q(android.content.Context r8, android.util.AttributeSet r9) {
        throw new UnsupportedOperationException("Method not decompiled: m.q.<init>(android.content.Context, android.util.AttributeSet):void");
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
        x0 x0Var = this.f16649c;
        if (x0Var != null) {
            x0Var.b();
        }
        n nVar = this.f16648b;
        if (nVar != null) {
            nVar.a();
        }
        g2.e eVar = this.f16647a;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return d8.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.f16648b;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.f16648b;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        g2.e eVar = this.f16647a;
        if (eVar != null) {
            return (ColorStateList) eVar.f6982e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        g2.e eVar = this.f16647a;
        if (eVar != null) {
            return (PorterDuff.Mode) eVar.f6983f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f16649c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f16649c.e();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        i7.u.a(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f16648b;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        n nVar = this.f16648b;
        if (nVar != null) {
            nVar.f(i10);
        }
    }

    @Override
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        g2.e eVar = this.f16647a;
        if (eVar != null) {
            if (eVar.f6981c) {
                eVar.f6981c = false;
                return;
            }
            eVar.f6981c = true;
            eVar.b();
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f16649c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f16649c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d8.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f16648b;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f16648b;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        g2.e eVar = this.f16647a;
        if (eVar != null) {
            eVar.f6982e = colorStateList;
            eVar.f6979a = true;
            eVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        g2.e eVar = this.f16647a;
        if (eVar != null) {
            eVar.f6983f = mode;
            eVar.f6980b = true;
            eVar.b();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f16649c;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f16649c;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        x0 x0Var = this.f16649c;
        if (x0Var != null) {
            x0Var.g(context, i10);
        }
    }

    @Override
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(s7.b(getContext(), i10));
    }
}
