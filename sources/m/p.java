package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import j7.r7;
import k7.x7;
public final class p extends CheckedTextView implements u0.k {
    public final g2.e f13594a;
    public final m f13595b;
    public final x0 f13596c;
    public t d;

    public p(android.content.Context r8, android.util.AttributeSet r9) {
        throw new UnsupportedOperationException("Method not decompiled: m.p.<init>(android.content.Context, android.util.AttributeSet):void");
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
        x0 x0Var = this.f13596c;
        if (x0Var != null) {
            x0Var.b();
        }
        m mVar = this.f13595b;
        if (mVar != null) {
            mVar.a();
        }
        g2.e eVar = this.f13594a;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return x7.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        m mVar = this.f13595b;
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m mVar = this.f13595b;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        g2.e eVar = this.f13594a;
        if (eVar != null) {
            return (ColorStateList) eVar.e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        g2.e eVar = this.f13594a;
        if (eVar != null) {
            return (PorterDuff.Mode) eVar.f6351f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13596c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13596c.e();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        k7.l.a(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().b(z4);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m mVar = this.f13595b;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        m mVar = this.f13595b;
        if (mVar != null) {
            mVar.f(i10);
        }
    }

    @Override
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        g2.e eVar = this.f13594a;
        if (eVar != null) {
            if (eVar.f6350c) {
                eVar.f6350c = false;
                return;
            }
            eVar.f6350c = true;
            eVar.b();
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f13596c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f13596c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(x7.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().c(z4);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m mVar = this.f13595b;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m mVar = this.f13595b;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        g2.e eVar = this.f13594a;
        if (eVar != null) {
            eVar.e = colorStateList;
            eVar.f6348a = true;
            eVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        g2.e eVar = this.f13594a;
        if (eVar != null) {
            eVar.f6351f = mode;
            eVar.f6349b = true;
            eVar.b();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f13596c;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f13596c;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        x0 x0Var = this.f13596c;
        if (x0Var != null) {
            x0Var.g(context, i10);
        }
    }

    @Override
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(r7.b(getContext(), i10));
    }
}
