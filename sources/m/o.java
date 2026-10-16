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
import w7.n6;
import w7.w7;
public final class o extends Button implements u0.k {
    public final e2.c f14905a;
    public final y0 f14906b;
    public v f14907c;

    public o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968648);
        e3.a(context);
        d3.a(this, getContext());
        e2.c cVar = new e2.c(this);
        this.f14905a = cVar;
        cVar.f(attributeSet, 2130968648);
        y0 y0Var = new y0(this);
        this.f14906b = y0Var;
        y0Var.f(attributeSet, 2130968648);
        y0Var.b();
        getEmojiTextViewHelper().a(attributeSet, 2130968648);
    }

    private v getEmojiTextViewHelper() {
        if (this.f14907c == null) {
            this.f14907c = new v(this);
        }
        return this.f14907c;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.f14905a;
        if (cVar != null) {
            cVar.b();
        }
        y0 y0Var = this.f14906b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (w3.f15008b) {
            return super.getAutoSizeMaxTextSize();
        }
        y0 y0Var = this.f14906b;
        if (y0Var != null) {
            return Math.round(y0Var.f15020i.e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (w3.f15008b) {
            return super.getAutoSizeMinTextSize();
        }
        y0 y0Var = this.f14906b;
        if (y0Var != null) {
            return Math.round(y0Var.f15020i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (w3.f15008b) {
            return super.getAutoSizeStepGranularity();
        }
        y0 y0Var = this.f14906b;
        if (y0Var != null) {
            return Math.round(y0Var.f15020i.f14866c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (w3.f15008b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y0 y0Var = this.f14906b;
        if (y0Var != null) {
            return y0Var.f15020i.f14867f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (w3.f15008b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        y0 y0Var = this.f14906b;
        if (y0Var == null) {
            return 0;
        }
        return y0Var.f15020i.f14864a;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return w7.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f14905a;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f14905a;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14906b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14906b.e();
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
        y0 y0Var = this.f14906b;
        if (y0Var != null && !w3.f15008b) {
            y0Var.f15020i.a();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        y0 y0Var = this.f14906b;
        if (y0Var != null) {
            i1 i1Var = y0Var.f15020i;
            if (!w3.f15008b && i1Var.f()) {
                i1Var.a();
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
        if (w3.f15008b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        y0 y0Var = this.f14906b;
        if (y0Var != null) {
            y0Var.i(i10, i11, i12, i13);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (w3.f15008b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        y0 y0Var = this.f14906b;
        if (y0Var != null) {
            y0Var.j(iArr, i10);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (w3.f15008b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        y0 y0Var = this.f14906b;
        if (y0Var != null) {
            y0Var.k(i10);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.f14905a;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f14905a;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(w7.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((n6) getEmojiTextViewHelper().f14995b.f14848b).a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        y0 y0Var = this.f14906b;
        if (y0Var != null) {
            y0Var.f15015a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f14905a;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f14905a;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        y0 y0Var = this.f14906b;
        y0Var.l(colorStateList);
        y0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        y0 y0Var = this.f14906b;
        y0Var.m(mode);
        y0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        y0 y0Var = this.f14906b;
        if (y0Var != null) {
            y0Var.g(context, i10);
        }
    }

    @Override
    public final void setTextSize(int i10, float f7) {
        boolean z10 = w3.f15008b;
        if (z10) {
            super.setTextSize(i10, f7);
            return;
        }
        y0 y0Var = this.f14906b;
        if (y0Var != null) {
            i1 i1Var = y0Var.f15020i;
            if (!z10 && !i1Var.f()) {
                i1Var.g(f7, i10);
            }
        }
    }
}
