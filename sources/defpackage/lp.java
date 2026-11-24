package defpackage;

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
public final class lp extends Button implements arb {
    public final kp a;
    public final pr b;
    public iq c;

    public lp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968648);
        yqb.a(context);
        dpb.a(getContext(), this);
        kp kpVar = new kp(this);
        this.a = kpVar;
        kpVar.g(attributeSet, 2130968648);
        pr prVar = new pr(this);
        this.b = prVar;
        prVar.f(attributeSet, 2130968648);
        prVar.b();
        getEmojiTextViewHelper().a(attributeSet, 2130968648);
    }

    private iq getEmojiTextViewHelper() {
        iq iqVar = this.c;
        if (iqVar == null) {
            iq iqVar2 = new iq(this);
            this.c = iqVar2;
            return iqVar2;
        }
        return iqVar;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.b();
        }
        pr prVar = this.b;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (ghc.b) {
            return super.getAutoSizeMaxTextSize();
        }
        pr prVar = this.b;
        if (prVar != null) {
            return Math.round(prVar.i.e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (ghc.b) {
            return super.getAutoSizeMinTextSize();
        }
        pr prVar = this.b;
        if (prVar != null) {
            return Math.round(prVar.i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (ghc.b) {
            return super.getAutoSizeStepGranularity();
        }
        pr prVar = this.b;
        if (prVar != null) {
            return Math.round(prVar.i.c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (ghc.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        pr prVar = this.b;
        if (prVar != null) {
            return prVar.i.f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (ghc.b) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        pr prVar = this.b;
        if (prVar != null) {
            return prVar.i.a;
        }
        return 0;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return mxe.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        kp kpVar = this.a;
        if (kpVar != null) {
            return kpVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        kp kpVar = this.a;
        if (kpVar != null) {
            return kpVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        pr prVar = this.b;
        if (prVar != null && !ghc.b) {
            prVar.i.a();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        pr prVar = this.b;
        if (prVar != null) {
            zr zrVar = prVar.i;
            if (!ghc.b && zrVar.f()) {
                zrVar.a();
            }
        }
    }

    @Override
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (ghc.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        pr prVar = this.b;
        if (prVar != null) {
            prVar.i(i, i2, i3, i4);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (ghc.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        pr prVar = this.b;
        if (prVar != null) {
            prVar.j(iArr, i);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (ghc.b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        pr prVar = this.b;
        if (prVar != null) {
            prVar.k(i);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.h();
        }
    }

    @Override
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.i(i);
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(mxe.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((fhe) getEmojiTextViewHelper().b.a).a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        pr prVar = this.b;
        if (prVar != null) {
            prVar.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.n(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        pr prVar = this.b;
        prVar.l(colorStateList);
        prVar.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        pr prVar = this.b;
        prVar.m(mode);
        prVar.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        pr prVar = this.b;
        if (prVar != null) {
            prVar.g(context, i);
        }
    }

    @Override
    public final void setTextSize(int i, float f) {
        boolean z = ghc.b;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        pr prVar = this.b;
        if (prVar != null) {
            zr zrVar = prVar.i;
            if (!z && !zrVar.f()) {
                zrVar.g(f, i);
            }
        }
    }
}
