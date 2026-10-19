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
import w7.l6;
import w7.w7;
public final class n extends Button implements u0.k {
    public final e2.c f16256a;
    public final x0 f16257b;
    public u f16258c;

    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968648);
        d3.a(context);
        c3.a(this, getContext());
        e2.c cVar = new e2.c(this);
        this.f16256a = cVar;
        cVar.f(attributeSet, 2130968648);
        x0 x0Var = new x0(this);
        this.f16257b = x0Var;
        x0Var.f(attributeSet, 2130968648);
        x0Var.b();
        getEmojiTextViewHelper().a(attributeSet, 2130968648);
    }

    private u getEmojiTextViewHelper() {
        if (this.f16258c == null) {
            this.f16258c = new u(this);
        }
        return this.f16258c;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.f16256a;
        if (cVar != null) {
            cVar.b();
        }
        x0 x0Var = this.f16257b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (v3.f16359b) {
            return super.getAutoSizeMaxTextSize();
        }
        x0 x0Var = this.f16257b;
        if (x0Var != null) {
            return Math.round(x0Var.f16371i.e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (v3.f16359b) {
            return super.getAutoSizeMinTextSize();
        }
        x0 x0Var = this.f16257b;
        if (x0Var != null) {
            return Math.round(x0Var.f16371i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (v3.f16359b) {
            return super.getAutoSizeStepGranularity();
        }
        x0 x0Var = this.f16257b;
        if (x0Var != null) {
            return Math.round(x0Var.f16371i.f16208c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (v3.f16359b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x0 x0Var = this.f16257b;
        if (x0Var != null) {
            return x0Var.f16371i.f16209f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (v3.f16359b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        x0 x0Var = this.f16257b;
        if (x0Var == null) {
            return 0;
        }
        return x0Var.f16371i.f16206a;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return w7.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f16256a;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f16256a;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f16257b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f16257b.e();
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
        x0 x0Var = this.f16257b;
        if (x0Var != null && !v3.f16359b) {
            x0Var.f16371i.a();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        x0 x0Var = this.f16257b;
        if (x0Var != null) {
            h1 h1Var = x0Var.f16371i;
            if (!v3.f16359b && h1Var.f()) {
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
        if (v3.f16359b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        x0 x0Var = this.f16257b;
        if (x0Var != null) {
            x0Var.i(i10, i11, i12, i13);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (v3.f16359b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        x0 x0Var = this.f16257b;
        if (x0Var != null) {
            x0Var.j(iArr, i10);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (v3.f16359b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        x0 x0Var = this.f16257b;
        if (x0Var != null) {
            x0Var.k(i10);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.f16256a;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f16256a;
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
        super.setFilters(((l6) getEmojiTextViewHelper().f16346b.f14830b).a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        x0 x0Var = this.f16257b;
        if (x0Var != null) {
            x0Var.f16366a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f16256a;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f16256a;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f16257b;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f16257b;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        x0 x0Var = this.f16257b;
        if (x0Var != null) {
            x0Var.g(context, i10);
        }
    }

    @Override
    public final void setTextSize(int i10, float f7) {
        boolean z10 = v3.f16359b;
        if (z10) {
            super.setTextSize(i10, f7);
            return;
        }
        x0 x0Var = this.f16257b;
        if (x0Var != null) {
            h1 h1Var = x0Var.f16371i;
            if (!z10 && !h1Var.f()) {
                h1Var.g(f7, i10);
            }
        }
    }
}
