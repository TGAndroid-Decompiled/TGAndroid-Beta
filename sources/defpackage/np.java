package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
public final class np extends CheckedTextView implements arb {
    public final op a;
    public final kp b;
    public final pr c;
    public iq d;

    public np(android.content.Context r8, android.util.AttributeSet r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private iq getEmojiTextViewHelper() {
        iq iqVar = this.d;
        if (iqVar == null) {
            iq iqVar2 = new iq(this);
            this.d = iqVar2;
            return iqVar2;
        }
        return iqVar;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        pr prVar = this.c;
        if (prVar != null) {
            prVar.b();
        }
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.b();
        }
        op opVar = this.a;
        if (opVar != null) {
            opVar.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return mxe.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        kp kpVar = this.b;
        if (kpVar != null) {
            return kpVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        kp kpVar = this.b;
        if (kpVar != null) {
            return kpVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        op opVar = this.a;
        if (opVar != null) {
            return (ColorStateList) opVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        op opVar = this.a;
        if (opVar != null) {
            return (PorterDuff.Mode) opVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        jod.a(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.h();
        }
    }

    @Override
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.i(i);
        }
    }

    @Override
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        op opVar = this.a;
        if (opVar != null) {
            if (opVar.e) {
                opVar.e = false;
                return;
            }
            opVar.e = true;
            opVar.b();
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        pr prVar = this.c;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        pr prVar = this.c;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(mxe.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.n(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        op opVar = this.a;
        if (opVar != null) {
            opVar.a = colorStateList;
            opVar.c = true;
            opVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        op opVar = this.a;
        if (opVar != null) {
            opVar.b = mode;
            opVar.d = true;
            opVar.b();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        pr prVar = this.c;
        prVar.l(colorStateList);
        prVar.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        pr prVar = this.c;
        prVar.m(mode);
        prVar.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        pr prVar = this.c;
        if (prVar != null) {
            prVar.g(context, i);
        }
    }

    @Override
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(kod.a(getContext(), i));
    }
}
