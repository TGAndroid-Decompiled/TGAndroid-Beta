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
public final class p0 extends Spinner {
    public static final int[] f19805r = {16843505};
    public final h2.c f19806a;
    public final Context f19807b;
    public final e0 f19808c;
    public SpinnerAdapter d;
    public final boolean f19809e;
    public final o0 f19810f;
    public int h;
    public final Rect f19811n;

    public p0(android.content.Context r13, android.util.AttributeSet r14) {
        throw new UnsupportedOperationException("Method not decompiled: m.p0.<init>(android.content.Context, android.util.AttributeSet):void");
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
            Rect rect = this.f19811n;
            drawable.getPadding(rect);
            return rect.left + rect.right + i10;
        }
        return i10;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h2.c cVar = this.f19806a;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override
    public int getDropDownHorizontalOffset() {
        o0 o0Var = this.f19810f;
        if (o0Var != null) {
            return o0Var.b();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override
    public int getDropDownVerticalOffset() {
        o0 o0Var = this.f19810f;
        if (o0Var != null) {
            return o0Var.n();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override
    public int getDropDownWidth() {
        if (this.f19810f != null) {
            return this.h;
        }
        return super.getDropDownWidth();
    }

    public final o0 getInternalPopup() {
        return this.f19810f;
    }

    @Override
    public Drawable getPopupBackground() {
        o0 o0Var = this.f19810f;
        if (o0Var != null) {
            return o0Var.e();
        }
        return super.getPopupBackground();
    }

    @Override
    public Context getPopupContext() {
        return this.f19807b;
    }

    @Override
    public CharSequence getPrompt() {
        o0 o0Var = this.f19810f;
        if (o0Var != null) {
            return o0Var.d();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        h2.c cVar = this.f19806a;
        if (cVar != null) {
            return cVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h2.c cVar = this.f19806a;
        if (cVar != null) {
            return cVar.w();
        }
        return null;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o0 o0Var = this.f19810f;
        if (o0Var != null && o0Var.a()) {
            o0Var.dismiss();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f19810f != null && View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i7)), getMeasuredHeight());
        }
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        n0 n0Var = (n0) parcelable;
        super.onRestoreInstanceState(n0Var.getSuperState());
        if (n0Var.f19771a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new androidx.mediarouter.app.i(this, 3));
        }
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        o0 o0Var = this.f19810f;
        if (o0Var != null && o0Var.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        baseSavedState.f19771a = z10;
        return baseSavedState;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var = this.f19808c;
        if (e0Var != null && e0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean performClick() {
        o0 o0Var = this.f19810f;
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
        h2.c cVar = this.f19806a;
        if (cVar != null) {
            cVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        h2.c cVar = this.f19806a;
        if (cVar != null) {
            cVar.z(i7);
        }
    }

    @Override
    public void setDropDownHorizontalOffset(int i7) {
        o0 o0Var = this.f19810f;
        if (o0Var != null) {
            o0Var.l(i7);
            o0Var.c(i7);
            return;
        }
        super.setDropDownHorizontalOffset(i7);
    }

    @Override
    public void setDropDownVerticalOffset(int i7) {
        o0 o0Var = this.f19810f;
        if (o0Var != null) {
            o0Var.k(i7);
        } else {
            super.setDropDownVerticalOffset(i7);
        }
    }

    @Override
    public void setDropDownWidth(int i7) {
        if (this.f19810f != null) {
            this.h = i7;
        } else {
            super.setDropDownWidth(i7);
        }
    }

    @Override
    public void setPopupBackgroundDrawable(Drawable drawable) {
        o0 o0Var = this.f19810f;
        if (o0Var != null) {
            o0Var.i(drawable);
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
        o0 o0Var = this.f19810f;
        if (o0Var != null) {
            o0Var.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h2.c cVar = this.f19806a;
        if (cVar != null) {
            cVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h2.c cVar = this.f19806a;
        if (cVar != null) {
            cVar.E(mode);
        }
    }

    @Override
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f19809e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        o0 o0Var = this.f19810f;
        if (o0Var != 0) {
            Context context = this.f19807b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            obj.f19728a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.f19729b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                h0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            o0Var.o(obj);
        }
    }
}
