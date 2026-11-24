package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
public final class fr extends Spinner {
    public static final int[] r = {16843505};
    public final kp a;
    public final Context b;
    public final tq c;
    public SpinnerAdapter d;
    public final boolean e;
    public final er f;
    public int h;
    public final Rect n;

    public fr(android.content.Context r13, android.util.AttributeSet r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.n;
            drawable.getPadding(rect);
            return rect.left + rect.right + i2;
        }
        return i2;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.b();
        }
    }

    @Override
    public int getDropDownHorizontalOffset() {
        er erVar = this.f;
        if (erVar != null) {
            return erVar.b();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override
    public int getDropDownVerticalOffset() {
        er erVar = this.f;
        if (erVar != null) {
            return erVar.m();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override
    public int getDropDownWidth() {
        if (this.f != null) {
            return this.h;
        }
        return super.getDropDownWidth();
    }

    public final er getInternalPopup() {
        return this.f;
    }

    @Override
    public Drawable getPopupBackground() {
        er erVar = this.f;
        if (erVar != null) {
            return erVar.g();
        }
        return super.getPopupBackground();
    }

    @Override
    public Context getPopupContext() {
        return this.b;
    }

    @Override
    public CharSequence getPrompt() {
        er erVar = this.f;
        if (erVar != null) {
            return erVar.d();
        }
        return super.getPrompt();
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

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        er erVar = this.f;
        if (erVar != null && erVar.a()) {
            erVar.dismiss();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        dr drVar = (dr) parcelable;
        super.onRestoreInstanceState(drVar.getSuperState());
        if (drVar.a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new uq(this, (byte) 0));
        }
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        boolean z;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        er erVar = this.f;
        if (erVar != null && erVar.a()) {
            z = true;
        } else {
            z = false;
        }
        baseSavedState.a = z;
        return baseSavedState;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tq tqVar = this.c;
        if (tqVar != null && tqVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean performClick() {
        er erVar = this.f;
        if (erVar != null) {
            if (!erVar.a()) {
                erVar.l(wq.b(this), wq.a(this));
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        er erVar = this.f;
        if (erVar != 0) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            obj.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                xq.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            erVar.n(obj);
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
    public void setDropDownHorizontalOffset(int i) {
        er erVar = this.f;
        if (erVar != null) {
            erVar.k(i);
            erVar.c(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    @Override
    public void setDropDownVerticalOffset(int i) {
        er erVar = this.f;
        if (erVar != null) {
            erVar.j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override
    public void setDropDownWidth(int i) {
        if (this.f != null) {
            this.h = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override
    public void setPopupBackgroundDrawable(Drawable drawable) {
        er erVar = this.f;
        if (erVar != null) {
            erVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(kod.a(getPopupContext(), i));
    }

    @Override
    public void setPrompt(CharSequence charSequence) {
        er erVar = this.f;
        if (erVar != null) {
            erVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
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
}
