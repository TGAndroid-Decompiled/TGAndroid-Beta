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
import g7.q6;
import g7.r7;
public final class o extends Button implements u0.k {
    public final n f17019a;
    public final x0 f17020b;
    public u f17021c;

    public o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968648);
        e3.a(context);
        d3.a(this, getContext());
        n nVar = new n(this);
        this.f17019a = nVar;
        nVar.d(attributeSet, 2130968648);
        x0 x0Var = new x0(this);
        this.f17020b = x0Var;
        x0Var.f(attributeSet, 2130968648);
        x0Var.b();
        getEmojiTextViewHelper().a(attributeSet, 2130968648);
    }

    private u getEmojiTextViewHelper() {
        if (this.f17021c == null) {
            this.f17021c = new u(this);
        }
        return this.f17021c;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.f17019a;
        if (nVar != null) {
            nVar.a();
        }
        x0 x0Var = this.f17020b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (w3.f17124b) {
            return super.getAutoSizeMaxTextSize();
        }
        x0 x0Var = this.f17020b;
        if (x0Var != null) {
            return Math.round(x0Var.f17134i.f16954e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (w3.f17124b) {
            return super.getAutoSizeMinTextSize();
        }
        x0 x0Var = this.f17020b;
        if (x0Var != null) {
            return Math.round(x0Var.f17134i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (w3.f17124b) {
            return super.getAutoSizeStepGranularity();
        }
        x0 x0Var = this.f17020b;
        if (x0Var != null) {
            return Math.round(x0Var.f17134i.f16953c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (w3.f17124b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x0 x0Var = this.f17020b;
        if (x0Var != null) {
            return x0Var.f17134i.f16955f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (w3.f17124b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        x0 x0Var = this.f17020b;
        if (x0Var == null) {
            return 0;
        }
        return x0Var.f17134i.f16951a;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return r7.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.f17019a;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.f17019a;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f17020b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f17020b.e();
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        x0 x0Var = this.f17020b;
        if (x0Var != null && !w3.f17124b) {
            x0Var.f17134i.a();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        x0 x0Var = this.f17020b;
        if (x0Var != null) {
            h1 h1Var = x0Var.f17134i;
            if (!w3.f17124b && h1Var.f()) {
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
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i9, int i10, int i11, int i12) {
        if (w3.f17124b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i9, i10, i11, i12);
            return;
        }
        x0 x0Var = this.f17020b;
        if (x0Var != null) {
            x0Var.i(i9, i10, i11, i12);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i9) {
        if (w3.f17124b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i9);
            return;
        }
        x0 x0Var = this.f17020b;
        if (x0Var != null) {
            x0Var.j(iArr, i9);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i9) {
        if (w3.f17124b) {
            super.setAutoSizeTextTypeWithDefaults(i9);
            return;
        }
        x0 x0Var = this.f17020b;
        if (x0Var != null) {
            x0Var.k(i9);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f17019a;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        n nVar = this.f17019a;
        if (nVar != null) {
            nVar.f(i9);
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(r7.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((q6) getEmojiTextViewHelper().f17104b.f18488b).a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        x0 x0Var = this.f17020b;
        if (x0Var != null) {
            x0Var.f17128a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f17019a;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f17019a;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f17020b;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f17020b;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        x0 x0Var = this.f17020b;
        if (x0Var != null) {
            x0Var.g(context, i9);
        }
    }

    @Override
    public final void setTextSize(int i9, float f10) {
        boolean z10 = w3.f17124b;
        if (z10) {
            super.setTextSize(i9, f10);
            return;
        }
        x0 x0Var = this.f17020b;
        if (x0Var != null) {
            h1 h1Var = x0Var.f17134i;
            if (!z10 && !h1Var.f()) {
                h1Var.g(f10, i9);
            }
        }
    }
}
