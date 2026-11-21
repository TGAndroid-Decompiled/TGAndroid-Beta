package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import c8.lc;
import c8.pc;
public final class m extends Button implements u0.k {
    public final h2.c f20147a;
    public final w0 f20148b;
    public t f20149c;

    public m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968648);
        a3.a(context);
        z2.a(this, getContext());
        h2.c cVar = new h2.c(this);
        this.f20147a = cVar;
        cVar.x(attributeSet, 2130968648);
        w0 w0Var = new w0(this);
        this.f20148b = w0Var;
        w0Var.f(attributeSet, 2130968648);
        w0Var.b();
        getEmojiTextViewHelper().a(attributeSet, 2130968648);
    }

    private t getEmojiTextViewHelper() {
        if (this.f20149c == null) {
            this.f20149c = new t(this);
        }
        return this.f20149c;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h2.c cVar = this.f20147a;
        if (cVar != null) {
            cVar.b();
        }
        w0 w0Var = this.f20148b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (r3.f20227b) {
            return super.getAutoSizeMaxTextSize();
        }
        w0 w0Var = this.f20148b;
        if (w0Var != null) {
            return Math.round(w0Var.f20260i.f20088e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (r3.f20227b) {
            return super.getAutoSizeMinTextSize();
        }
        w0 w0Var = this.f20148b;
        if (w0Var != null) {
            return Math.round(w0Var.f20260i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (r3.f20227b) {
            return super.getAutoSizeStepGranularity();
        }
        w0 w0Var = this.f20148b;
        if (w0Var != null) {
            return Math.round(w0Var.f20260i.f20087c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (r3.f20227b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        w0 w0Var = this.f20148b;
        if (w0Var != null) {
            return w0Var.f20260i.f20089f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (r3.f20227b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        w0 w0Var = this.f20148b;
        if (w0Var == null) {
            return 0;
        }
        return w0Var.f20260i.f20085a;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return pc.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        h2.c cVar = this.f20147a;
        if (cVar != null) {
            return cVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h2.c cVar = this.f20147a;
        if (cVar != null) {
            return cVar.w();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f20148b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f20148b.e();
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        w0 w0Var = this.f20148b;
        if (w0Var != null && !r3.f20227b) {
            w0Var.f20260i.a();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        w0 w0Var = this.f20148b;
        if (w0Var != null) {
            g1 g1Var = w0Var.f20260i;
            if (!r3.f20227b && g1Var.f()) {
                g1Var.a();
            }
        }
    }

    @Override
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i10, int i11, int i12) {
        if (r3.f20227b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i7, i10, i11, i12);
            return;
        }
        w0 w0Var = this.f20148b;
        if (w0Var != null) {
            w0Var.i(i7, i10, i11, i12);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
        if (r3.f20227b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
            return;
        }
        w0 w0Var = this.f20148b;
        if (w0Var != null) {
            w0Var.j(iArr, i7);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (r3.f20227b) {
            super.setAutoSizeTextTypeWithDefaults(i7);
            return;
        }
        w0 w0Var = this.f20148b;
        if (w0Var != null) {
            w0Var.k(i7);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h2.c cVar = this.f20147a;
        if (cVar != null) {
            cVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        h2.c cVar = this.f20147a;
        if (cVar != null) {
            cVar.z(i7);
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(pc.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((lc) getEmojiTextViewHelper().f20234b.f36572b).a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        w0 w0Var = this.f20148b;
        if (w0Var != null) {
            w0Var.f20254a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h2.c cVar = this.f20147a;
        if (cVar != null) {
            cVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h2.c cVar = this.f20147a;
        if (cVar != null) {
            cVar.E(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f20148b;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f20148b;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        w0 w0Var = this.f20148b;
        if (w0Var != null) {
            w0Var.g(context, i7);
        }
    }

    @Override
    public final void setTextSize(int i7, float f10) {
        boolean z10 = r3.f20227b;
        if (z10) {
            super.setTextSize(i7, f10);
            return;
        }
        w0 w0Var = this.f20148b;
        if (w0Var != null) {
            g1 g1Var = w0Var.f20260i;
            if (!z10 && !g1Var.f()) {
                g1Var.g(f10, i7);
            }
        }
    }
}
