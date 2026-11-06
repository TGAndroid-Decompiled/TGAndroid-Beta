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
import c8.fc;
import c8.lc;
public final class n extends Button implements u0.k {
    public final h2.c f19172a;
    public final x0 f19173b;
    public u f19174c;

    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968648);
        b3.a(context);
        a3.a(this, getContext());
        h2.c cVar = new h2.c(this);
        this.f19172a = cVar;
        cVar.x(attributeSet, 2130968648);
        x0 x0Var = new x0(this);
        this.f19173b = x0Var;
        x0Var.f(attributeSet, 2130968648);
        x0Var.b();
        getEmojiTextViewHelper().a(attributeSet, 2130968648);
    }

    private u getEmojiTextViewHelper() {
        if (this.f19174c == null) {
            this.f19174c = new u(this);
        }
        return this.f19174c;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h2.c cVar = this.f19172a;
        if (cVar != null) {
            cVar.b();
        }
        x0 x0Var = this.f19173b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (t3.f19257b) {
            return super.getAutoSizeMaxTextSize();
        }
        x0 x0Var = this.f19173b;
        if (x0Var != null) {
            return Math.round(x0Var.f19285i.f19110e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (t3.f19257b) {
            return super.getAutoSizeMinTextSize();
        }
        x0 x0Var = this.f19173b;
        if (x0Var != null) {
            return Math.round(x0Var.f19285i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (t3.f19257b) {
            return super.getAutoSizeStepGranularity();
        }
        x0 x0Var = this.f19173b;
        if (x0Var != null) {
            return Math.round(x0Var.f19285i.f19109c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (t3.f19257b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x0 x0Var = this.f19173b;
        if (x0Var != null) {
            return x0Var.f19285i.f19111f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (t3.f19257b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        x0 x0Var = this.f19173b;
        if (x0Var == null) {
            return 0;
        }
        return x0Var.f19285i.f19107a;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return lc.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        h2.c cVar = this.f19172a;
        if (cVar != null) {
            return cVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h2.c cVar = this.f19172a;
        if (cVar != null) {
            return cVar.w();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f19173b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f19173b.e();
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        x0 x0Var = this.f19173b;
        if (x0Var != null && !t3.f19257b) {
            x0Var.f19285i.a();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        x0 x0Var = this.f19173b;
        if (x0Var != null) {
            h1 h1Var = x0Var.f19285i;
            if (!t3.f19257b && h1Var.f()) {
                h1Var.a();
            }
        }
    }

    @Override
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().b(z9);
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i10, int i11, int i12) {
        if (t3.f19257b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i7, i10, i11, i12);
            return;
        }
        x0 x0Var = this.f19173b;
        if (x0Var != null) {
            x0Var.i(i7, i10, i11, i12);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
        if (t3.f19257b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
            return;
        }
        x0 x0Var = this.f19173b;
        if (x0Var != null) {
            x0Var.j(iArr, i7);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (t3.f19257b) {
            super.setAutoSizeTextTypeWithDefaults(i7);
            return;
        }
        x0 x0Var = this.f19173b;
        if (x0Var != null) {
            x0Var.k(i7);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h2.c cVar = this.f19172a;
        if (cVar != null) {
            cVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        h2.c cVar = this.f19172a;
        if (cVar != null) {
            cVar.z(i7);
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(lc.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().c(z9);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((fc) getEmojiTextViewHelper().f19259b.f38757b).a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z9) {
        x0 x0Var = this.f19173b;
        if (x0Var != null) {
            x0Var.f19279a.setAllCaps(z9);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h2.c cVar = this.f19172a;
        if (cVar != null) {
            cVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h2.c cVar = this.f19172a;
        if (cVar != null) {
            cVar.E(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f19173b;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f19173b;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        x0 x0Var = this.f19173b;
        if (x0Var != null) {
            x0Var.g(context, i7);
        }
    }

    @Override
    public final void setTextSize(int i7, float f10) {
        boolean z9 = t3.f19257b;
        if (z9) {
            super.setTextSize(i7, f10);
            return;
        }
        x0 x0Var = this.f19173b;
        if (x0Var != null) {
            h1 h1Var = x0Var.f19285i;
            if (!z9 && !h1Var.f()) {
                h1Var.g(f10, i7);
            }
        }
    }
}
