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
import k7.l6;
import k7.x7;
public final class n extends Button implements u0.k {
    public final m f13257a;
    public final w0 f13258b;
    public t f13259c;

    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968648);
        d3.a(context);
        c3.a(this, getContext());
        m mVar = new m(this);
        this.f13257a = mVar;
        mVar.d(attributeSet, 2130968648);
        w0 w0Var = new w0(this);
        this.f13258b = w0Var;
        w0Var.f(attributeSet, 2130968648);
        w0Var.b();
        getEmojiTextViewHelper().a(attributeSet, 2130968648);
    }

    private t getEmojiTextViewHelper() {
        if (this.f13259c == null) {
            this.f13259c = new t(this);
        }
        return this.f13259c;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m mVar = this.f13257a;
        if (mVar != null) {
            mVar.a();
        }
        w0 w0Var = this.f13258b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (u3.f13357b) {
            return super.getAutoSizeMaxTextSize();
        }
        w0 w0Var = this.f13258b;
        if (w0Var != null) {
            return Math.round(w0Var.f13370i.f13192e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (u3.f13357b) {
            return super.getAutoSizeMinTextSize();
        }
        w0 w0Var = this.f13258b;
        if (w0Var != null) {
            return Math.round(w0Var.f13370i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (u3.f13357b) {
            return super.getAutoSizeStepGranularity();
        }
        w0 w0Var = this.f13258b;
        if (w0Var != null) {
            return Math.round(w0Var.f13370i.f13191c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (u3.f13357b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        w0 w0Var = this.f13258b;
        if (w0Var != null) {
            return w0Var.f13370i.f13193f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (u3.f13357b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        w0 w0Var = this.f13258b;
        if (w0Var == null) {
            return 0;
        }
        return w0Var.f13370i.f13189a;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return x7.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        m mVar = this.f13257a;
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m mVar = this.f13257a;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13258b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13258b.e();
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
        w0 w0Var = this.f13258b;
        if (w0Var != null && !u3.f13357b) {
            w0Var.f13370i.a();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        w0 w0Var = this.f13258b;
        if (w0Var != null) {
            g1 g1Var = w0Var.f13370i;
            if (!u3.f13357b && g1Var.f()) {
                g1Var.a();
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
        if (u3.f13357b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        w0 w0Var = this.f13258b;
        if (w0Var != null) {
            w0Var.i(i10, i11, i12, i13);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (u3.f13357b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        w0 w0Var = this.f13258b;
        if (w0Var != null) {
            w0Var.j(iArr, i10);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (u3.f13357b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        w0 w0Var = this.f13258b;
        if (w0Var != null) {
            w0Var.k(i10);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m mVar = this.f13257a;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        m mVar = this.f13257a;
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
        super.setFilters(((l6) getEmojiTextViewHelper().f13341b.f25265b).a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z4) {
        w0 w0Var = this.f13258b;
        if (w0Var != null) {
            w0Var.f13364a.setAllCaps(z4);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m mVar = this.f13257a;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m mVar = this.f13257a;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f13258b;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f13258b;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        w0 w0Var = this.f13258b;
        if (w0Var != null) {
            w0Var.g(context, i10);
        }
    }

    @Override
    public final void setTextSize(int i10, float f10) {
        boolean z4 = u3.f13357b;
        if (z4) {
            super.setTextSize(i10, f10);
            return;
        }
        w0 w0Var = this.f13258b;
        if (w0Var != null) {
            g1 g1Var = w0Var.f13370i;
            if (!z4 && !g1Var.f()) {
                g1Var.g(f10, i10);
            }
        }
    }
}
