package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import v7.q7;
import w7.w7;
public final class q extends CheckedTextView implements u0.k {
    public final r f14936a;
    public final e2.c f14937b;
    public final y0 f14938c;
    public v d;

    public q(android.content.Context r8, android.util.AttributeSet r9) {
        throw new UnsupportedOperationException("Method not decompiled: m.q.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private v getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new v(this);
        }
        return this.d;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y0 y0Var = this.f14938c;
        if (y0Var != null) {
            y0Var.b();
        }
        e2.c cVar = this.f14937b;
        if (cVar != null) {
            cVar.b();
        }
        r rVar = this.f14936a;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return w7.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f14937b;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f14937b;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        r rVar = this.f14936a;
        if (rVar != null) {
            return (ColorStateList) rVar.f14944a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        r rVar = this.f14936a;
        if (rVar != null) {
            return (PorterDuff.Mode) rVar.f14945b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14938c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14938c.e();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        w7.p.a(editorInfo, onCreateInputConnection, this);
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
        e2.c cVar = this.f14937b;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f14937b;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        r rVar = this.f14936a;
        if (rVar != null) {
            if (rVar.e) {
                rVar.e = false;
                return;
            }
            rVar.e = true;
            rVar.b();
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f14938c;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f14938c;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(w7.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f14937b;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f14937b;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        r rVar = this.f14936a;
        if (rVar != null) {
            rVar.f14944a = colorStateList;
            rVar.f14946c = true;
            rVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        r rVar = this.f14936a;
        if (rVar != null) {
            rVar.f14945b = mode;
            rVar.d = true;
            rVar.b();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        y0 y0Var = this.f14938c;
        y0Var.l(colorStateList);
        y0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        y0 y0Var = this.f14938c;
        y0Var.m(mode);
        y0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        y0 y0Var = this.f14938c;
        if (y0Var != null) {
            y0Var.g(context, i10);
        }
    }

    @Override
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(q7.b(getContext(), i10));
    }
}
