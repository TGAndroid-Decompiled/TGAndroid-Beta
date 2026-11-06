package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import c8.h9;
import c8.lc;
public final class p extends CheckedTextView implements u0.k {
    public final q f19192a;
    public final h2.c f19193b;
    public final x0 f19194c;
    public u d;

    public p(android.content.Context r8, android.util.AttributeSet r9) {
        throw new UnsupportedOperationException("Method not decompiled: m.p.<init>(android.content.Context, android.util.AttributeSet):void");
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
        x0 x0Var = this.f19194c;
        if (x0Var != null) {
            x0Var.b();
        }
        h2.c cVar = this.f19193b;
        if (cVar != null) {
            cVar.b();
        }
        q qVar = this.f19192a;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return lc.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        h2.c cVar = this.f19193b;
        if (cVar != null) {
            return cVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h2.c cVar = this.f19193b;
        if (cVar != null) {
            return cVar.w();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        q qVar = this.f19192a;
        if (qVar != null) {
            return (ColorStateList) qVar.f19211a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        q qVar = this.f19192a;
        if (qVar != null) {
            return (PorterDuff.Mode) qVar.f19212b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f19194c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f19194c.e();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        h9.a(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().b(z9);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h2.c cVar = this.f19193b;
        if (cVar != null) {
            cVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        h2.c cVar = this.f19193b;
        if (cVar != null) {
            cVar.z(i7);
        }
    }

    @Override
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        q qVar = this.f19192a;
        if (qVar != null) {
            if (qVar.f19214e) {
                qVar.f19214e = false;
                return;
            }
            qVar.f19214e = true;
            qVar.b();
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f19194c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f19194c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(lc.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().c(z9);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h2.c cVar = this.f19193b;
        if (cVar != null) {
            cVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h2.c cVar = this.f19193b;
        if (cVar != null) {
            cVar.E(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        q qVar = this.f19192a;
        if (qVar != null) {
            qVar.f19211a = colorStateList;
            qVar.f19213c = true;
            qVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        q qVar = this.f19192a;
        if (qVar != null) {
            qVar.f19212b = mode;
            qVar.d = true;
            qVar.b();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f19194c;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f19194c;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        x0 x0Var = this.f19194c;
        if (x0Var != null) {
            x0Var.g(context, i7);
        }
    }

    @Override
    public void setCheckMarkDrawable(int i7) {
        setCheckMarkDrawable(b5.a.b(getContext(), i7));
    }
}
