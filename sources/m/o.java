package m;

import a8.ce;
import a8.kc;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
public final class o extends CheckedTextView implements u0.k {
    public final p f17797a;
    public final e2.c f17798b;
    public final w0 f17799c;
    public t d;

    public o(android.content.Context r8, android.util.AttributeSet r9) {
        throw new UnsupportedOperationException("Method not decompiled: m.o.<init>(android.content.Context, android.util.AttributeSet):void");
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
        w0 w0Var = this.f17799c;
        if (w0Var != null) {
            w0Var.b();
        }
        e2.c cVar = this.f17798b;
        if (cVar != null) {
            cVar.b();
        }
        p pVar = this.f17797a;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return w7.k.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f17798b;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f17798b;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        p pVar = this.f17797a;
        if (pVar != null) {
            return (ColorStateList) pVar.f17805a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        p pVar = this.f17797a;
        if (pVar != null) {
            return (PorterDuff.Mode) pVar.f17806b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f17799c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f17799c.e();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ce.a(editorInfo, onCreateInputConnection, this);
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
        e2.c cVar = this.f17798b;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f17798b;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        p pVar = this.f17797a;
        if (pVar != null) {
            if (pVar.e) {
                pVar.e = false;
                return;
            }
            pVar.e = true;
            pVar.b();
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f17799c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f17799c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(w7.k.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f17798b;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f17798b;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        p pVar = this.f17797a;
        if (pVar != null) {
            pVar.f17805a = colorStateList;
            pVar.f17807c = true;
            pVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        p pVar = this.f17797a;
        if (pVar != null) {
            pVar.f17806b = mode;
            pVar.d = true;
            pVar.b();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f17799c;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f17799c;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        w0 w0Var = this.f17799c;
        if (w0Var != null) {
            w0Var.g(context, i10);
        }
    }

    @Override
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(kc.b(getContext(), i10));
    }
}
