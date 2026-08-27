package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import g7.o7;
import h7.p7;

public final class q extends CheckedTextView implements u0.k {

    public final g2.e f17425a;

    public final n f17426b;

    public final x0 f17427c;
    public u d;

    public q(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, 2130968717);
        e3.a(context);
        d3.a(this, getContext());
        x0 x0Var = new x0(this);
        this.f17427c = x0Var;
        x0Var.f(attributeSet, 2130968717);
        x0Var.b();
        n nVar = new n(this);
        this.f17426b = nVar;
        nVar.d(attributeSet, 2130968717);
        this.f17425a = new g2.e(this);
        Context context2 = getContext();
        int[] iArr = f.a.f5583l;
        j9.a aVarG = j9.a.G(context2, attributeSet, iArr, 2130968717);
        TypedArray typedArray = (TypedArray) aVarG.f12864c;
        r0.j0.j(this, getContext(), iArr, attributeSet, (TypedArray) aVarG.f12864c, 2130968717);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(o7.b(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(o7.b(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(o7.b(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(aVarG.x(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(m1.b(typedArray.getInt(3, -1), null));
            }
            aVarG.I();
            getEmojiTextViewHelper().a(attributeSet, 2130968717);
        } catch (Throwable th) {
            aVarG.I();
            throw th;
        }
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
        x0 x0Var = this.f17427c;
        if (x0Var != null) {
            x0Var.b();
        }
        n nVar = this.f17426b;
        if (nVar != null) {
            nVar.a();
        }
        g2.e eVar = this.f17425a;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return p7.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.f17426b;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.f17426b;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        g2.e eVar = this.f17425a;
        if (eVar != null) {
            return (ColorStateList) eVar.f6350e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        g2.e eVar = this.f17425a;
        if (eVar != null) {
            return (PorterDuff.Mode) eVar.f6351f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f17427c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f17427c.e();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        h7.l.a(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f17426b;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        n nVar = this.f17426b;
        if (nVar != null) {
            nVar.f(i10);
        }
    }

    @Override
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        g2.e eVar = this.f17425a;
        if (eVar != null) {
            if (eVar.f6349c) {
                eVar.f6349c = false;
            } else {
                eVar.f6349c = true;
                eVar.b();
            }
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f17427c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f17427c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(p7.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f17426b;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f17426b;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        g2.e eVar = this.f17425a;
        if (eVar != null) {
            eVar.f6350e = colorStateList;
            eVar.f6347a = true;
            eVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        g2.e eVar = this.f17425a;
        if (eVar != null) {
            eVar.f6351f = mode;
            eVar.f6348b = true;
            eVar.b();
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f17427c;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f17427c;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        x0 x0Var = this.f17427c;
        if (x0Var != null) {
            x0Var.g(context, i10);
        }
    }

    @Override
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(o7.b(getContext(), i10));
    }
}
