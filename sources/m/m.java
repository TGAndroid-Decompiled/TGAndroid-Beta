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
public final class m extends Button implements u0.k {
    public final g2.d f18643a;
    public final w0 f18644b;
    public t f18645c;

    public m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968648);
        a3.a(context);
        z2.a(this, getContext());
        g2.d dVar = new g2.d(this);
        this.f18643a = dVar;
        dVar.x(attributeSet, 2130968648);
        w0 w0Var = new w0(this);
        this.f18644b = w0Var;
        w0Var.f(attributeSet, 2130968648);
        w0Var.b();
        getEmojiTextViewHelper().a(attributeSet, 2130968648);
    }

    private t getEmojiTextViewHelper() {
        if (this.f18645c == null) {
            this.f18645c = new t(this);
        }
        return this.f18645c;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        g2.d dVar = this.f18643a;
        if (dVar != null) {
            dVar.b();
        }
        w0 w0Var = this.f18644b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (r3.f18723b) {
            return super.getAutoSizeMaxTextSize();
        }
        w0 w0Var = this.f18644b;
        if (w0Var != null) {
            return Math.round(w0Var.f18756i.f18584e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (r3.f18723b) {
            return super.getAutoSizeMinTextSize();
        }
        w0 w0Var = this.f18644b;
        if (w0Var != null) {
            return Math.round(w0Var.f18756i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (r3.f18723b) {
            return super.getAutoSizeStepGranularity();
        }
        w0 w0Var = this.f18644b;
        if (w0Var != null) {
            return Math.round(w0Var.f18756i.f18583c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (r3.f18723b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        w0 w0Var = this.f18644b;
        if (w0Var != null) {
            return w0Var.f18756i.f18585f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (r3.f18723b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        w0 w0Var = this.f18644b;
        if (w0Var == null) {
            return 0;
        }
        return w0Var.f18756i.f18581a;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return x7.g0.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        g2.d dVar = this.f18643a;
        if (dVar != null) {
            return dVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        g2.d dVar = this.f18643a;
        if (dVar != null) {
            return dVar.w();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f18644b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f18644b.e();
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        w0 w0Var = this.f18644b;
        if (w0Var != null && !r3.f18723b) {
            w0Var.f18756i.a();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        super.onTextChanged(charSequence, i3, i10, i11);
        w0 w0Var = this.f18644b;
        if (w0Var != null) {
            g1 g1Var = w0Var.f18756i;
            if (!r3.f18723b && g1Var.f()) {
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
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i3, int i10, int i11, int i12) {
        if (r3.f18723b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i3, i10, i11, i12);
            return;
        }
        w0 w0Var = this.f18644b;
        if (w0Var != null) {
            w0Var.i(i3, i10, i11, i12);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) {
        if (r3.f18723b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
            return;
        }
        w0 w0Var = this.f18644b;
        if (w0Var != null) {
            w0Var.j(iArr, i3);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i3) {
        if (r3.f18723b) {
            super.setAutoSizeTextTypeWithDefaults(i3);
            return;
        }
        w0 w0Var = this.f18644b;
        if (w0Var != null) {
            w0Var.k(i3);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        g2.d dVar = this.f18643a;
        if (dVar != null) {
            dVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        g2.d dVar = this.f18643a;
        if (dVar != null) {
            dVar.z(i3);
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(x7.g0.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((x7.p) getEmojiTextViewHelper().f18730b.f40562a).a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        w0 w0Var = this.f18644b;
        if (w0Var != null) {
            w0Var.f18750a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        g2.d dVar = this.f18643a;
        if (dVar != null) {
            dVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        g2.d dVar = this.f18643a;
        if (dVar != null) {
            dVar.E(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f18644b;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f18644b;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        w0 w0Var = this.f18644b;
        if (w0Var != null) {
            w0Var.g(context, i3);
        }
    }

    @Override
    public final void setTextSize(int i3, float f10) {
        boolean z10 = r3.f18723b;
        if (z10) {
            super.setTextSize(i3, f10);
            return;
        }
        w0 w0Var = this.f18644b;
        if (w0Var != null) {
            g1 g1Var = w0Var.f18756i;
            if (!z10 && !g1Var.f()) {
                g1Var.g(f10, i3);
            }
        }
    }
}
