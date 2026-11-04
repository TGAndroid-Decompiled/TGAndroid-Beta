package m;

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
import b8.oc;
public final class p0 extends Spinner {
    public static final int[] f18693r = {16843505};
    public final g2.d f18694a;
    public final Context f18695b;
    public final e0 f18696c;
    public SpinnerAdapter d;
    public final boolean f18697e;
    public final o0 f18698f;
    public int h;
    public final Rect f18699n;

    public p0(android.content.Context r13, android.util.AttributeSet r14) {
        throw new UnsupportedOperationException("Method not decompiled: m.p0.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i3 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i10 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i10 = Math.max(i10, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.f18699n;
            drawable.getPadding(rect);
            return rect.left + rect.right + i10;
        }
        return i10;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        g2.d dVar = this.f18694a;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override
    public int getDropDownHorizontalOffset() {
        o0 o0Var = this.f18698f;
        if (o0Var != null) {
            return o0Var.b();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override
    public int getDropDownVerticalOffset() {
        o0 o0Var = this.f18698f;
        if (o0Var != null) {
            return o0Var.n();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override
    public int getDropDownWidth() {
        if (this.f18698f != null) {
            return this.h;
        }
        return super.getDropDownWidth();
    }

    public final o0 getInternalPopup() {
        return this.f18698f;
    }

    @Override
    public Drawable getPopupBackground() {
        o0 o0Var = this.f18698f;
        if (o0Var != null) {
            return o0Var.h();
        }
        return super.getPopupBackground();
    }

    @Override
    public Context getPopupContext() {
        return this.f18695b;
    }

    @Override
    public CharSequence getPrompt() {
        o0 o0Var = this.f18698f;
        if (o0Var != null) {
            return o0Var.e();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        g2.d dVar = this.f18694a;
        if (dVar != null) {
            return dVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        g2.d dVar = this.f18694a;
        if (dVar != null) {
            return dVar.w();
        }
        return null;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o0 o0Var = this.f18698f;
        if (o0Var != null && o0Var.a()) {
            o0Var.dismiss();
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        if (this.f18698f != null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i3)), getMeasuredHeight());
        }
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        n0 n0Var = (n0) parcelable;
        super.onRestoreInstanceState(n0Var.getSuperState());
        if (n0Var.f18659a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new androidx.mediarouter.app.i(this, 3));
        }
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        o0 o0Var = this.f18698f;
        if (o0Var != null && o0Var.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        baseSavedState.f18659a = z10;
        return baseSavedState;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var = this.f18696c;
        if (e0Var != null && e0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean performClick() {
        o0 o0Var = this.f18698f;
        if (o0Var != null) {
            if (!o0Var.a()) {
                o0Var.m(g0.b(this), g0.a(this));
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        g2.d dVar = this.f18694a;
        if (dVar != null) {
            dVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        g2.d dVar = this.f18694a;
        if (dVar != null) {
            dVar.z(i3);
        }
    }

    @Override
    public void setDropDownHorizontalOffset(int i3) {
        o0 o0Var = this.f18698f;
        if (o0Var != null) {
            o0Var.l(i3);
            o0Var.c(i3);
            return;
        }
        super.setDropDownHorizontalOffset(i3);
    }

    @Override
    public void setDropDownVerticalOffset(int i3) {
        o0 o0Var = this.f18698f;
        if (o0Var != null) {
            o0Var.k(i3);
        } else {
            super.setDropDownVerticalOffset(i3);
        }
    }

    @Override
    public void setDropDownWidth(int i3) {
        if (this.f18698f != null) {
            this.h = i3;
        } else {
            super.setDropDownWidth(i3);
        }
    }

    @Override
    public void setPopupBackgroundDrawable(Drawable drawable) {
        o0 o0Var = this.f18698f;
        if (o0Var != null) {
            o0Var.j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override
    public void setPopupBackgroundResource(int i3) {
        setPopupBackgroundDrawable(oc.b(getPopupContext(), i3));
    }

    @Override
    public void setPrompt(CharSequence charSequence) {
        o0 o0Var = this.f18698f;
        if (o0Var != null) {
            o0Var.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        g2.d dVar = this.f18694a;
        if (dVar != null) {
            dVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        g2.d dVar = this.f18694a;
        if (dVar != null) {
            dVar.E(mode);
        }
    }

    @Override
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f18697e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        o0 o0Var = this.f18698f;
        if (o0Var != 0) {
            Context context = this.f18695b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            obj.f18616a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.f18617b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                h0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            o0Var.o(obj);
        }
    }
}
