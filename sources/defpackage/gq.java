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
public final class gq extends Spinner {
    public static final int[] r = {16843505};
    public final lo a;
    public final Context b;
    public final up c;
    public SpinnerAdapter d;
    public final boolean e;
    public final fq f;
    public int h;
    public final Rect n;

    public gq(android.content.Context r13, android.util.AttributeSet r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq.<init>(android.content.Context, android.util.AttributeSet):void");
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
        lo loVar = this.a;
        if (loVar != null) {
            loVar.b();
        }
    }

    @Override
    public int getDropDownHorizontalOffset() {
        fq fqVar = this.f;
        if (fqVar != null) {
            return fqVar.b();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override
    public int getDropDownVerticalOffset() {
        fq fqVar = this.f;
        if (fqVar != null) {
            return fqVar.m();
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

    public final fq getInternalPopup() {
        return this.f;
    }

    @Override
    public Drawable getPopupBackground() {
        fq fqVar = this.f;
        if (fqVar != null) {
            return fqVar.f();
        }
        return super.getPopupBackground();
    }

    @Override
    public Context getPopupContext() {
        return this.b;
    }

    @Override
    public CharSequence getPrompt() {
        fq fqVar = this.f;
        if (fqVar != null) {
            return fqVar.e();
        }
        return super.getPrompt();
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

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fq fqVar = this.f;
        if (fqVar != null && fqVar.a()) {
            fqVar.dismiss();
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
        eq eqVar = (eq) parcelable;
        super.onRestoreInstanceState(eqVar.getSuperState());
        if (eqVar.a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new vp(this, (byte) 0));
        }
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        boolean z;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        fq fqVar = this.f;
        if (fqVar != null && fqVar.a()) {
            z = true;
        } else {
            z = false;
        }
        baseSavedState.a = z;
        return baseSavedState;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        up upVar = this.c;
        if (upVar != null && upVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean performClick() {
        fq fqVar = this.f;
        if (fqVar != null) {
            if (!fqVar.a()) {
                fqVar.l(xp.b(this), xp.a(this));
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
        fq fqVar = this.f;
        if (fqVar != 0) {
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
                yp.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            fqVar.n(obj);
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
    public void setDropDownHorizontalOffset(int i) {
        fq fqVar = this.f;
        if (fqVar != null) {
            fqVar.k(i);
            fqVar.c(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    @Override
    public void setDropDownVerticalOffset(int i) {
        fq fqVar = this.f;
        if (fqVar != null) {
            fqVar.j(i);
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
        fq fqVar = this.f;
        if (fqVar != null) {
            fqVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(yqd.a(getPopupContext(), i));
    }

    @Override
    public void setPrompt(CharSequence charSequence) {
        fq fqVar = this.f;
        if (fqVar != null) {
            fqVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
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
}
