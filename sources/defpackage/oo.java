package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
public final class oo extends CheckedTextView implements zsb {
    public final po a;
    public final lo b;
    public final qq c;
    public jp d;

    public oo(android.content.Context r8, android.util.AttributeSet r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private jp getEmojiTextViewHelper() {
        jp jpVar = this.d;
        if (jpVar == null) {
            jp jpVar2 = new jp(this);
            this.d = jpVar2;
            return jpVar2;
        }
        return jpVar;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        qq qqVar = this.c;
        if (qqVar != null) {
            qqVar.b();
        }
        lo loVar = this.b;
        if (loVar != null) {
            loVar.b();
        }
        po poVar = this.a;
        if (poVar != null) {
            poVar.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c0f.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        lo loVar = this.b;
        if (loVar != null) {
            return loVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        lo loVar = this.b;
        if (loVar != null) {
            return loVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        po poVar = this.a;
        if (poVar != null) {
            return (ColorStateList) poVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        po poVar = this.a;
        if (poVar != null) {
            return (PorterDuff.Mode) poVar.b;
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
        xqd.a(editorInfo, onCreateInputConnection, this);
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
        lo loVar = this.b;
        if (loVar != null) {
            loVar.h();
        }
    }

    @Override
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        lo loVar = this.b;
        if (loVar != null) {
            loVar.i(i);
        }
    }

    @Override
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        po poVar = this.a;
        if (poVar != null) {
            if (poVar.e) {
                poVar.e = false;
                return;
            }
            poVar.e = true;
            poVar.b();
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        qq qqVar = this.c;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        qq qqVar = this.c;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c0f.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        lo loVar = this.b;
        if (loVar != null) {
            loVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        lo loVar = this.b;
        if (loVar != null) {
            loVar.n(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        po poVar = this.a;
        if (poVar != null) {
            poVar.a = colorStateList;
            poVar.c = true;
            poVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        po poVar = this.a;
        if (poVar != null) {
            poVar.b = mode;
            poVar.d = true;
            poVar.b();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        qq qqVar = this.c;
        qqVar.l(colorStateList);
        qqVar.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        qq qqVar = this.c;
        qqVar.m(mode);
        qqVar.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        qq qqVar = this.c;
        if (qqVar != null) {
            qqVar.g(context, i);
        }
    }

    @Override
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(yqd.a(getContext(), i));
    }
}
