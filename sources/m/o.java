package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import v7.r7;
import w7.y7;
public final class o extends CheckedTextView implements u0.l {
    public final p f12489a;
    public final e2.c f12490b;
    public final w0 f12491c;
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
        w0 w0Var = this.f12491c;
        if (w0Var != null) {
            w0Var.b();
        }
        e2.c cVar = this.f12490b;
        if (cVar != null) {
            cVar.b();
        }
        p pVar = this.f12489a;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return y7.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f12490b;
        if (cVar != null) {
            return cVar.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f12490b;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        p pVar = this.f12489a;
        if (pVar != null) {
            return (ColorStateList) pVar.f12506a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        p pVar = this.f12489a;
        if (pVar != null) {
            return (PorterDuff.Mode) pVar.f12507b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f12491c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f12491c.e();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        w7.s.a(editorInfo, onCreateInputConnection, this);
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
        e2.c cVar = this.f12490b;
        if (cVar != null) {
            cVar.l();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f12490b;
        if (cVar != null) {
            cVar.m(i10);
        }
    }

    @Override
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        p pVar = this.f12489a;
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
        w0 w0Var = this.f12491c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f12491c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(y7.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f12490b;
        if (cVar != null) {
            cVar.q(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f12490b;
        if (cVar != null) {
            cVar.r(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        p pVar = this.f12489a;
        if (pVar != null) {
            pVar.f12506a = colorStateList;
            pVar.f12508c = true;
            pVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        p pVar = this.f12489a;
        if (pVar != null) {
            pVar.f12507b = mode;
            pVar.d = true;
            pVar.b();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f12491c;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f12491c;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        w0 w0Var = this.f12491c;
        if (w0Var != null) {
            w0Var.g(context, i10);
        }
    }

    @Override
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(r7.b(getContext(), i10));
    }
}
