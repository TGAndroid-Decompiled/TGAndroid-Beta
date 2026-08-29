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
import i7.d8;
import i7.v6;
public final class o extends Button implements u0.k {
    public final n f16618a;
    public final x0 f16619b;
    public u f16620c;

    public o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968648);
        e3.a(context);
        d3.a(this, getContext());
        n nVar = new n(this);
        this.f16618a = nVar;
        nVar.d(attributeSet, 2130968648);
        x0 x0Var = new x0(this);
        this.f16619b = x0Var;
        x0Var.f(attributeSet, 2130968648);
        x0Var.b();
        getEmojiTextViewHelper().a(attributeSet, 2130968648);
    }

    private u getEmojiTextViewHelper() {
        if (this.f16620c == null) {
            this.f16620c = new u(this);
        }
        return this.f16620c;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.f16618a;
        if (nVar != null) {
            nVar.a();
        }
        x0 x0Var = this.f16619b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (v3.f16718b) {
            return super.getAutoSizeMaxTextSize();
        }
        x0 x0Var = this.f16619b;
        if (x0Var != null) {
            return Math.round(x0Var.f16731i.f16553e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (v3.f16718b) {
            return super.getAutoSizeMinTextSize();
        }
        x0 x0Var = this.f16619b;
        if (x0Var != null) {
            return Math.round(x0Var.f16731i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (v3.f16718b) {
            return super.getAutoSizeStepGranularity();
        }
        x0 x0Var = this.f16619b;
        if (x0Var != null) {
            return Math.round(x0Var.f16731i.f16552c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (v3.f16718b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x0 x0Var = this.f16619b;
        if (x0Var != null) {
            return x0Var.f16731i.f16554f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (v3.f16718b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        x0 x0Var = this.f16619b;
        if (x0Var == null) {
            return 0;
        }
        return x0Var.f16731i.f16550a;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return d8.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.f16618a;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.f16618a;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f16619b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f16619b.e();
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        x0 x0Var = this.f16619b;
        if (x0Var != null && !v3.f16718b) {
            x0Var.f16731i.a();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        x0 x0Var = this.f16619b;
        if (x0Var != null) {
            h1 h1Var = x0Var.f16731i;
            if (!v3.f16718b && h1Var.f()) {
                h1Var.a();
            }
        }
    }

    @Override
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (v3.f16718b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        x0 x0Var = this.f16619b;
        if (x0Var != null) {
            x0Var.i(i10, i11, i12, i13);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (v3.f16718b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        x0 x0Var = this.f16619b;
        if (x0Var != null) {
            x0Var.j(iArr, i10);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (v3.f16718b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        x0 x0Var = this.f16619b;
        if (x0Var != null) {
            x0Var.k(i10);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f16618a;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        n nVar = this.f16618a;
        if (nVar != null) {
            nVar.f(i10);
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d8.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((v6) getEmojiTextViewHelper().f16702b.f17533b).a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        x0 x0Var = this.f16619b;
        if (x0Var != null) {
            x0Var.f16725a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f16618a;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f16618a;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f16619b;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f16619b;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        x0 x0Var = this.f16619b;
        if (x0Var != null) {
            x0Var.g(context, i10);
        }
    }

    @Override
    public final void setTextSize(int i10, float f9) {
        boolean z10 = v3.f16718b;
        if (z10) {
            super.setTextSize(i10, f9);
            return;
        }
        x0 x0Var = this.f16619b;
        if (x0Var != null) {
            h1 h1Var = x0Var.f16731i;
            if (!z10 && !h1Var.f()) {
                h1Var.g(f9, i10);
            }
        }
    }
}
