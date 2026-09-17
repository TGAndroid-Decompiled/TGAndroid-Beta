package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import v7.u7;
public final class p0 extends Spinner {
    public static final int[] f15652r = {16843505};
    public final e2.c f15653a;
    public final Context f15654b;
    public final e0 f15655c;
    public SpinnerAdapter d;
    public final boolean f15656e;
    public final o0 f15657f;
    public int h;
    public final Rect f15658n;

    public p0(android.content.Context r13, android.util.AttributeSet r14) {
        throw new UnsupportedOperationException("Method not decompiled: m.p0.<init>(android.content.Context, android.util.AttributeSet):void");
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
            Rect rect = this.f15658n;
            drawable.getPadding(rect);
            return rect.left + rect.right + i11;
        }
        return i11;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.f15653a;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override
    public int getDropDownHorizontalOffset() {
        o0 o0Var = this.f15657f;
        if (o0Var != null) {
            return o0Var.b();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override
    public int getDropDownVerticalOffset() {
        o0 o0Var = this.f15657f;
        if (o0Var != null) {
            return o0Var.n();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override
    public int getDropDownWidth() {
        if (this.f15657f != null) {
            return this.h;
        }
        return super.getDropDownWidth();
    }

    public final o0 getInternalPopup() {
        return this.f15657f;
    }

    @Override
    public Drawable getPopupBackground() {
        o0 o0Var = this.f15657f;
        if (o0Var != null) {
            return o0Var.h();
        }
        return super.getPopupBackground();
    }

    @Override
    public Context getPopupContext() {
        return this.f15654b;
    }

    @Override
    public CharSequence getPrompt() {
        o0 o0Var = this.f15657f;
        if (o0Var != null) {
            return o0Var.e();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f15653a;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f15653a;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o0 o0Var = this.f15657f;
        if (o0Var != null && o0Var.a()) {
            o0Var.dismiss();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f15657f != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        n0 n0Var = (n0) parcelable;
        super.onRestoreInstanceState(n0Var.getSuperState());
        if (n0Var.f15623a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new androidx.mediarouter.app.j(this, 3));
        }
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        o0 o0Var = this.f15657f;
        if (o0Var != null && o0Var.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        baseSavedState.f15623a = z10;
        return baseSavedState;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var = this.f15655c;
        if (e0Var != null && e0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean performClick() {
        o0 o0Var = this.f15657f;
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
        e2.c cVar = this.f15653a;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f15653a;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override
    public void setDropDownHorizontalOffset(int i10) {
        o0 o0Var = this.f15657f;
        if (o0Var != null) {
            o0Var.l(i10);
            o0Var.c(i10);
            return;
        }
        super.setDropDownHorizontalOffset(i10);
    }

    @Override
    public void setDropDownVerticalOffset(int i10) {
        o0 o0Var = this.f15657f;
        if (o0Var != null) {
            o0Var.k(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override
    public void setDropDownWidth(int i10) {
        if (this.f15657f != null) {
            this.h = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override
    public void setPopupBackgroundDrawable(Drawable drawable) {
        o0 o0Var = this.f15657f;
        if (o0Var != null) {
            o0Var.j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(u7.b(getPopupContext(), i10));
    }

    @Override
    public void setPrompt(CharSequence charSequence) {
        o0 o0Var = this.f15657f;
        if (o0Var != null) {
            o0Var.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f15653a;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f15653a;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    @Override
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f15656e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        o0 o0Var = this.f15657f;
        if (o0Var != null) {
            Context context = this.f15654b;
            if (context == null) {
                context = getContext();
            }
            o0Var.p(new j0(spinnerAdapter, context.getTheme()));
        }
    }
}
