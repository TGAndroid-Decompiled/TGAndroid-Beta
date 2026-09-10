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
import w7.o6;
import w7.q7;
public final class m extends Button implements u0.k {
    public final e2.c f13059a;
    public final w0 f13060b;
    public t f13061c;

    public m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968648);
        b3.a(context);
        a3.a(this, getContext());
        e2.c cVar = new e2.c(this);
        this.f13059a = cVar;
        cVar.f(attributeSet, 2130968648);
        w0 w0Var = new w0(this);
        this.f13060b = w0Var;
        w0Var.f(attributeSet, 2130968648);
        w0Var.b();
        getEmojiTextViewHelper().a(attributeSet, 2130968648);
    }

    private t getEmojiTextViewHelper() {
        if (this.f13061c == null) {
            this.f13061c = new t(this);
        }
        return this.f13061c;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.f13059a;
        if (cVar != null) {
            cVar.b();
        }
        w0 w0Var = this.f13060b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (u3.f13162b) {
            return super.getAutoSizeMaxTextSize();
        }
        w0 w0Var = this.f13060b;
        if (w0Var != null) {
            return Math.round(w0Var.f13174i.e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (u3.f13162b) {
            return super.getAutoSizeMinTextSize();
        }
        w0 w0Var = this.f13060b;
        if (w0Var != null) {
            return Math.round(w0Var.f13174i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (u3.f13162b) {
            return super.getAutoSizeStepGranularity();
        }
        w0 w0Var = this.f13060b;
        if (w0Var != null) {
            return Math.round(w0Var.f13174i.f13011c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (u3.f13162b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        w0 w0Var = this.f13060b;
        if (w0Var != null) {
            return w0Var.f13174i.f13012f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (u3.f13162b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        w0 w0Var = this.f13060b;
        if (w0Var == null) {
            return 0;
        }
        return w0Var.f13174i.f13009a;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return q7.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f13059a;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f13059a;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13060b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13060b.e();
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
        w0 w0Var = this.f13060b;
        if (w0Var != null && !u3.f13162b) {
            w0Var.f13174i.a();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        w0 w0Var = this.f13060b;
        if (w0Var != null) {
            g1 g1Var = w0Var.f13174i;
            if (!u3.f13162b && g1Var.f()) {
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
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (u3.f13162b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        w0 w0Var = this.f13060b;
        if (w0Var != null) {
            w0Var.i(i10, i11, i12, i13);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (u3.f13162b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        w0 w0Var = this.f13060b;
        if (w0Var != null) {
            w0Var.j(iArr, i10);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (u3.f13162b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        w0 w0Var = this.f13060b;
        if (w0Var != null) {
            w0Var.k(i10);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.f13059a;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f13059a;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(q7.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((o6) getEmojiTextViewHelper().f13149b.f13018b).a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        w0 w0Var = this.f13060b;
        if (w0Var != null) {
            w0Var.f13169a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f13059a;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f13059a;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f13060b;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f13060b;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        w0 w0Var = this.f13060b;
        if (w0Var != null) {
            w0Var.g(context, i10);
        }
    }

    @Override
    public final void setTextSize(int i10, float f7) {
        boolean z10 = u3.f13162b;
        if (z10) {
            super.setTextSize(i10, f7);
            return;
        }
        w0 w0Var = this.f13060b;
        if (w0Var != null) {
            g1 g1Var = w0Var.f13174i;
            if (!z10 && !g1Var.f()) {
                g1Var.g(f7, i10);
            }
        }
    }
}
