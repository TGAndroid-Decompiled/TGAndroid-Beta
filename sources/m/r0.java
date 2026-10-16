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
import v7.q7;
public final class r0 extends Spinner {
    public static final int[] f14948r = {16843505};
    public final e2.c f14949a;
    public final Context f14950b;
    public final g0 f14951c;
    public SpinnerAdapter d;
    public final boolean e;
    public final q0 f14952f;
    public int h;
    public final Rect f14953n;

    public r0(android.content.Context r13, android.util.AttributeSet r14) {
        throw new UnsupportedOperationException("Method not decompiled: m.r0.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.f14953n;
            drawable.getPadding(rect);
            return rect.left + rect.right + i11;
        }
        return i11;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.f14949a;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override
    public int getDropDownHorizontalOffset() {
        q0 q0Var = this.f14952f;
        if (q0Var != null) {
            return q0Var.b();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override
    public int getDropDownVerticalOffset() {
        q0 q0Var = this.f14952f;
        if (q0Var != null) {
            return q0Var.m();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override
    public int getDropDownWidth() {
        if (this.f14952f != null) {
            return this.h;
        }
        return super.getDropDownWidth();
    }

    public final q0 getInternalPopup() {
        return this.f14952f;
    }

    @Override
    public Drawable getPopupBackground() {
        q0 q0Var = this.f14952f;
        if (q0Var != null) {
            return q0Var.e();
        }
        return super.getPopupBackground();
    }

    @Override
    public Context getPopupContext() {
        return this.f14950b;
    }

    @Override
    public CharSequence getPrompt() {
        q0 q0Var = this.f14952f;
        if (q0Var != null) {
            return q0Var.d();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f14949a;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f14949a;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q0 q0Var = this.f14952f;
        if (q0Var != null && q0Var.a()) {
            q0Var.dismiss();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f14952f != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        p0 p0Var = (p0) parcelable;
        super.onRestoreInstanceState(p0Var.getSuperState());
        if (p0Var.f14920a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new androidx.mediarouter.app.i(this, 3));
        }
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        q0 q0Var = this.f14952f;
        if (q0Var != null && q0Var.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        baseSavedState.f14920a = z10;
        return baseSavedState;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        g0 g0Var = this.f14951c;
        if (g0Var != null && g0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean performClick() {
        q0 q0Var = this.f14952f;
        if (q0Var != null) {
            if (!q0Var.a()) {
                q0Var.l(i0.b(this), i0.a(this));
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.f14949a;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f14949a;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override
    public void setDropDownHorizontalOffset(int i10) {
        q0 q0Var = this.f14952f;
        if (q0Var != null) {
            q0Var.k(i10);
            q0Var.c(i10);
            return;
        }
        super.setDropDownHorizontalOffset(i10);
    }

    @Override
    public void setDropDownVerticalOffset(int i10) {
        q0 q0Var = this.f14952f;
        if (q0Var != null) {
            q0Var.j(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override
    public void setDropDownWidth(int i10) {
        if (this.f14952f != null) {
            this.h = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override
    public void setPopupBackgroundDrawable(Drawable drawable) {
        q0 q0Var = this.f14952f;
        if (q0Var != null) {
            q0Var.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(q7.b(getPopupContext(), i10));
    }

    @Override
    public void setPrompt(CharSequence charSequence) {
        q0 q0Var = this.f14952f;
        if (q0Var != null) {
            q0Var.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f14949a;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f14949a;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    @Override
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        q0 q0Var = this.f14952f;
        if (q0Var != 0) {
            Context context = this.f14950b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            obj.f14890a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.f14891b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                j0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            q0Var.n(obj);
        }
    }
}
