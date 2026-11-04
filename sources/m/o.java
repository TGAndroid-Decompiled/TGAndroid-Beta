package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import b8.oc;
import b8.zd;
public final class o extends CheckedTextView implements u0.k {
    public final p f18673a;
    public final g2.d f18674b;
    public final w0 f18675c;
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
        w0 w0Var = this.f18675c;
        if (w0Var != null) {
            w0Var.b();
        }
        g2.d dVar = this.f18674b;
        if (dVar != null) {
            dVar.b();
        }
        p pVar = this.f18673a;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return x7.g0.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        g2.d dVar = this.f18674b;
        if (dVar != null) {
            return dVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        g2.d dVar = this.f18674b;
        if (dVar != null) {
            return dVar.w();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        p pVar = this.f18673a;
        if (pVar != null) {
            return (ColorStateList) pVar.f18688a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        p pVar = this.f18673a;
        if (pVar != null) {
            return (PorterDuff.Mode) pVar.f18689b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f18675c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f18675c.e();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        zd.a(editorInfo, onCreateInputConnection, this);
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
        g2.d dVar = this.f18674b;
        if (dVar != null) {
            dVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        g2.d dVar = this.f18674b;
        if (dVar != null) {
            dVar.z(i3);
        }
    }

    @Override
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        p pVar = this.f18673a;
        if (pVar != null) {
            if (pVar.f18691e) {
                pVar.f18691e = false;
                return;
            }
            pVar.f18691e = true;
            pVar.b();
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f18675c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f18675c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(x7.g0.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        g2.d dVar = this.f18674b;
        if (dVar != null) {
            dVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        g2.d dVar = this.f18674b;
        if (dVar != null) {
            dVar.E(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        p pVar = this.f18673a;
        if (pVar != null) {
            pVar.f18688a = colorStateList;
            pVar.f18690c = true;
            pVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        p pVar = this.f18673a;
        if (pVar != null) {
            pVar.f18689b = mode;
            pVar.d = true;
            pVar.b();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f18675c;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f18675c;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        w0 w0Var = this.f18675c;
        if (w0Var != null) {
            w0Var.g(context, i3);
        }
    }

    @Override
    public void setCheckMarkDrawable(int i3) {
        setCheckMarkDrawable(oc.b(getContext(), i3));
    }
}
