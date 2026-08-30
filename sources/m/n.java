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
import k7.k6;
import k7.x7;
public final class n extends Button implements u0.k {
    public final m f13563a;
    public final x0 f13564b;
    public t f13565c;

    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968648);
        e3.a(context);
        d3.a(this, getContext());
        m mVar = new m(this);
        this.f13563a = mVar;
        mVar.d(attributeSet, 2130968648);
        x0 x0Var = new x0(this);
        this.f13564b = x0Var;
        x0Var.f(attributeSet, 2130968648);
        x0Var.b();
        getEmojiTextViewHelper().a(attributeSet, 2130968648);
    }

    private t getEmojiTextViewHelper() {
        if (this.f13565c == null) {
            this.f13565c = new t(this);
        }
        return this.f13565c;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m mVar = this.f13563a;
        if (mVar != null) {
            mVar.a();
        }
        x0 x0Var = this.f13564b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (v3.f13667b) {
            return super.getAutoSizeMaxTextSize();
        }
        x0 x0Var = this.f13564b;
        if (x0Var != null) {
            return Math.round(x0Var.f13676i.e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (v3.f13667b) {
            return super.getAutoSizeMinTextSize();
        }
        x0 x0Var = this.f13564b;
        if (x0Var != null) {
            return Math.round(x0Var.f13676i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (v3.f13667b) {
            return super.getAutoSizeStepGranularity();
        }
        x0 x0Var = this.f13564b;
        if (x0Var != null) {
            return Math.round(x0Var.f13676i.f13520c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (v3.f13667b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x0 x0Var = this.f13564b;
        if (x0Var != null) {
            return x0Var.f13676i.f13521f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (v3.f13667b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        x0 x0Var = this.f13564b;
        if (x0Var == null) {
            return 0;
        }
        return x0Var.f13676i.f13518a;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return x7.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        m mVar = this.f13563a;
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m mVar = this.f13563a;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13564b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13564b.e();
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        x0 x0Var = this.f13564b;
        if (x0Var != null && !v3.f13667b) {
            x0Var.f13676i.a();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        x0 x0Var = this.f13564b;
        if (x0Var != null) {
            h1 h1Var = x0Var.f13676i;
            if (!v3.f13667b && h1Var.f()) {
                h1Var.a();
            }
        }
    }

    @Override
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().b(z4);
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (v3.f13667b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        x0 x0Var = this.f13564b;
        if (x0Var != null) {
            x0Var.i(i10, i11, i12, i13);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (v3.f13667b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        x0 x0Var = this.f13564b;
        if (x0Var != null) {
            x0Var.j(iArr, i10);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (v3.f13667b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        x0 x0Var = this.f13564b;
        if (x0Var != null) {
            x0Var.k(i10);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m mVar = this.f13563a;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        m mVar = this.f13563a;
        if (mVar != null) {
            mVar.f(i10);
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(x7.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().c(z4);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((k6) getEmojiTextViewHelper().f13646b.f21045b).a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z4) {
        x0 x0Var = this.f13564b;
        if (x0Var != null) {
            x0Var.f13671a.setAllCaps(z4);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m mVar = this.f13563a;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m mVar = this.f13563a;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f13564b;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f13564b;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        x0 x0Var = this.f13564b;
        if (x0Var != null) {
            x0Var.g(context, i10);
        }
    }

    @Override
    public final void setTextSize(int i10, float f10) {
        boolean z4 = v3.f13667b;
        if (z4) {
            super.setTextSize(i10, f10);
            return;
        }
        x0 x0Var = this.f13564b;
        if (x0Var != null) {
            h1 h1Var = x0Var.f13676i;
            if (!z4 && !h1Var.f()) {
                h1Var.g(f10, i10);
            }
        }
    }
}
