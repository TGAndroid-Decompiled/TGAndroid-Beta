package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
public final class no extends CheckedTextView implements zob {
    public final oo a;
    public final ko b;
    public final pq c;
    public ip d;

    public no(android.content.Context r8, android.util.AttributeSet r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private ip getEmojiTextViewHelper() {
        ip ipVar = this.d;
        if (ipVar == null) {
            ip ipVar2 = new ip(this);
            this.d = ipVar2;
            return ipVar2;
        }
        return ipVar;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        pq pqVar = this.c;
        if (pqVar != null) {
            pqVar.b();
        }
        ko koVar = this.b;
        if (koVar != null) {
            koVar.b();
        }
        oo ooVar = this.a;
        if (ooVar != null) {
            ooVar.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return kve.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        ko koVar = this.b;
        if (koVar != null) {
            return koVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ko koVar = this.b;
        if (koVar != null) {
            return koVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        oo ooVar = this.a;
        if (ooVar != null) {
            return (ColorStateList) ooVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        oo ooVar = this.a;
        if (ooVar != null) {
            return (PorterDuff.Mode) ooVar.b;
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
        gmd.a(editorInfo, onCreateInputConnection, this);
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
        ko koVar = this.b;
        if (koVar != null) {
            koVar.h();
        }
    }

    @Override
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ko koVar = this.b;
        if (koVar != null) {
            koVar.i(i);
        }
    }

    @Override
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        oo ooVar = this.a;
        if (ooVar != null) {
            if (ooVar.e) {
                ooVar.e = false;
                return;
            }
            ooVar.e = true;
            ooVar.b();
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        pq pqVar = this.c;
        if (pqVar != null) {
            pqVar.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        pq pqVar = this.c;
        if (pqVar != null) {
            pqVar.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(kve.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ko koVar = this.b;
        if (koVar != null) {
            koVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ko koVar = this.b;
        if (koVar != null) {
            koVar.n(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        oo ooVar = this.a;
        if (ooVar != null) {
            ooVar.a = colorStateList;
            ooVar.c = true;
            ooVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        oo ooVar = this.a;
        if (ooVar != null) {
            ooVar.b = mode;
            ooVar.d = true;
            ooVar.b();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        pq pqVar = this.c;
        pqVar.l(colorStateList);
        pqVar.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        pq pqVar = this.c;
        pqVar.m(mode);
        pqVar.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        pq pqVar = this.c;
        if (pqVar != null) {
            pqVar.g(context, i);
        }
    }

    @Override
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(hmd.a(getContext(), i));
    }
}
