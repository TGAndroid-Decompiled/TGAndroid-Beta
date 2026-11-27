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
public final class mo extends Button implements zsb {
    public final lo a;
    public final qq b;
    public jp c;

    public mo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968648);
        xsb.a(context);
        brb.a(getContext(), this);
        lo loVar = new lo(this);
        this.a = loVar;
        loVar.g(attributeSet, 2130968648);
        qq qqVar = new qq(this);
        this.b = qqVar;
        qqVar.f(attributeSet, 2130968648);
        qqVar.b();
        getEmojiTextViewHelper().a(attributeSet, 2130968648);
    }

    private jp getEmojiTextViewHelper() {
        jp jpVar = this.c;
        if (jpVar == null) {
            jp jpVar2 = new jp(this);
            this.c = jpVar2;
            return jpVar2;
        }
        return jpVar;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        lo loVar = this.a;
        if (loVar != null) {
            loVar.b();
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (fjc.b) {
            return super.getAutoSizeMaxTextSize();
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            return Math.round(qqVar.i.e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (fjc.b) {
            return super.getAutoSizeMinTextSize();
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            return Math.round(qqVar.i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (fjc.b) {
            return super.getAutoSizeStepGranularity();
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            return Math.round(qqVar.i.c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (fjc.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            return qqVar.i.f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (fjc.b) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            return qqVar.i.a;
        }
        return 0;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c0f.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        lo loVar = this.a;
        if (loVar != null) {
            return loVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        lo loVar = this.a;
        if (loVar != null) {
            return loVar.f();
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
        qq qqVar = this.b;
        if (qqVar != null && !fjc.b) {
            qqVar.i.a();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        qq qqVar = this.b;
        if (qqVar != null) {
            ar arVar = qqVar.i;
            if (!fjc.b && arVar.f()) {
                arVar.a();
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
        if (fjc.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.i(i, i2, i3, i4);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (fjc.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.j(iArr, i);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (fjc.b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.k(i);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        lo loVar = this.a;
        if (loVar != null) {
            loVar.h();
        }
    }

    @Override
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        lo loVar = this.a;
        if (loVar != null) {
            loVar.i(i);
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c0f.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((vje) getEmojiTextViewHelper().b.b).a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        lo loVar = this.a;
        if (loVar != null) {
            loVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        lo loVar = this.a;
        if (loVar != null) {
            loVar.n(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        qq qqVar = this.b;
        qqVar.l(colorStateList);
        qqVar.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        qq qqVar = this.b;
        qqVar.m(mode);
        qqVar.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.g(context, i);
        }
    }

    @Override
    public final void setTextSize(int i, float f) {
        boolean z = fjc.b;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            ar arVar = qqVar.i;
            if (!z && !arVar.f()) {
                arVar.g(f, i);
            }
        }
    }
}
