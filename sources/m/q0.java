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
public final class q0 extends Spinner {
    public static final int[] f19224r = {16843505};
    public final h2.c f19225a;
    public final Context f19226b;
    public final f0 f19227c;
    public SpinnerAdapter d;
    public final boolean f19228e;
    public final p0 f19229f;
    public int h;
    public final Rect f19230n;

    public q0(android.content.Context r13, android.util.AttributeSet r14) {
        throw new UnsupportedOperationException("Method not decompiled: m.q0.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i7 = 0;
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
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i10 = Math.max(i10, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.f19230n;
            drawable.getPadding(rect);
            return rect.left + rect.right + i10;
        }
        return i10;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h2.c cVar = this.f19225a;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override
    public int getDropDownHorizontalOffset() {
        p0 p0Var = this.f19229f;
        if (p0Var != null) {
            return p0Var.b();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override
    public int getDropDownVerticalOffset() {
        p0 p0Var = this.f19229f;
        if (p0Var != null) {
            return p0Var.m();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override
    public int getDropDownWidth() {
        if (this.f19229f != null) {
            return this.h;
        }
        return super.getDropDownWidth();
    }

    public final p0 getInternalPopup() {
        return this.f19229f;
    }

    @Override
    public Drawable getPopupBackground() {
        p0 p0Var = this.f19229f;
        if (p0Var != null) {
            return p0Var.e();
        }
        return super.getPopupBackground();
    }

    @Override
    public Context getPopupContext() {
        return this.f19226b;
    }

    @Override
    public CharSequence getPrompt() {
        p0 p0Var = this.f19229f;
        if (p0Var != null) {
            return p0Var.d();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        h2.c cVar = this.f19225a;
        if (cVar != null) {
            return cVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h2.c cVar = this.f19225a;
        if (cVar != null) {
            return cVar.w();
        }
        return null;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p0 p0Var = this.f19229f;
        if (p0Var != null && p0Var.a()) {
            p0Var.dismiss();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f19229f != null && View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i7)), getMeasuredHeight());
        }
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        o0 o0Var = (o0) parcelable;
        super.onRestoreInstanceState(o0Var.getSuperState());
        if (o0Var.f19194a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new androidx.mediarouter.app.i(this, 3));
        }
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        boolean z9;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        p0 p0Var = this.f19229f;
        if (p0Var != null && p0Var.a()) {
            z9 = true;
        } else {
            z9 = false;
        }
        baseSavedState.f19194a = z9;
        return baseSavedState;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var = this.f19227c;
        if (f0Var != null && f0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean performClick() {
        p0 p0Var = this.f19229f;
        if (p0Var != null) {
            if (!p0Var.a()) {
                p0Var.l(h0.b(this), h0.a(this));
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h2.c cVar = this.f19225a;
        if (cVar != null) {
            cVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        h2.c cVar = this.f19225a;
        if (cVar != null) {
            cVar.z(i7);
        }
    }

    @Override
    public void setDropDownHorizontalOffset(int i7) {
        p0 p0Var = this.f19229f;
        if (p0Var != null) {
            p0Var.k(i7);
            p0Var.c(i7);
            return;
        }
        super.setDropDownHorizontalOffset(i7);
    }

    @Override
    public void setDropDownVerticalOffset(int i7) {
        p0 p0Var = this.f19229f;
        if (p0Var != null) {
            p0Var.j(i7);
        } else {
            super.setDropDownVerticalOffset(i7);
        }
    }

    @Override
    public void setDropDownWidth(int i7) {
        if (this.f19229f != null) {
            this.h = i7;
        } else {
            super.setDropDownWidth(i7);
        }
    }

    @Override
    public void setPopupBackgroundDrawable(Drawable drawable) {
        p0 p0Var = this.f19229f;
        if (p0Var != null) {
            p0Var.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override
    public void setPopupBackgroundResource(int i7) {
        setPopupBackgroundDrawable(b5.a.b(getPopupContext(), i7));
    }

    @Override
    public void setPrompt(CharSequence charSequence) {
        p0 p0Var = this.f19229f;
        if (p0Var != null) {
            p0Var.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h2.c cVar = this.f19225a;
        if (cVar != null) {
            cVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h2.c cVar = this.f19225a;
        if (cVar != null) {
            cVar.E(mode);
        }
    }

    @Override
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f19228e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        p0 p0Var = this.f19229f;
        if (p0Var != 0) {
            Context context = this.f19226b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            obj.f19152a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.f19153b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                i0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            p0Var.n(obj);
        }
    }
}
