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
import f7.t7;
public final class q0 extends Spinner {
    public static final int[] f17053r = {16843505};
    public final n f17054a;
    public final Context f17055b;
    public final f0 f17056c;
    public SpinnerAdapter d;
    public final boolean f17057e;
    public final p0 f17058f;
    public int h;
    public final Rect f17059n;

    public q0(android.content.Context r13, android.util.AttributeSet r14) {
        throw new UnsupportedOperationException("Method not decompiled: m.q0.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i9 = 0;
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
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i10 = Math.max(i10, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.f17059n;
            drawable.getPadding(rect);
            return rect.left + rect.right + i10;
        }
        return i10;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.f17054a;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override
    public int getDropDownHorizontalOffset() {
        p0 p0Var = this.f17058f;
        if (p0Var != null) {
            return p0Var.b();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override
    public int getDropDownVerticalOffset() {
        p0 p0Var = this.f17058f;
        if (p0Var != null) {
            return p0Var.n();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override
    public int getDropDownWidth() {
        if (this.f17058f != null) {
            return this.h;
        }
        return super.getDropDownWidth();
    }

    public final p0 getInternalPopup() {
        return this.f17058f;
    }

    @Override
    public Drawable getPopupBackground() {
        p0 p0Var = this.f17058f;
        if (p0Var != null) {
            return p0Var.e();
        }
        return super.getPopupBackground();
    }

    @Override
    public Context getPopupContext() {
        return this.f17055b;
    }

    @Override
    public CharSequence getPrompt() {
        p0 p0Var = this.f17058f;
        if (p0Var != null) {
            return p0Var.d();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.f17054a;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.f17054a;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p0 p0Var = this.f17058f;
        if (p0Var != null && p0Var.a()) {
            p0Var.dismiss();
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.f17058f != null && View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i9)), getMeasuredHeight());
        }
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        o0 o0Var = (o0) parcelable;
        super.onRestoreInstanceState(o0Var.getSuperState());
        if (o0Var.f17022a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new androidx.mediarouter.app.k(this, 3));
        }
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        p0 p0Var = this.f17058f;
        if (p0Var != null && p0Var.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        baseSavedState.f17022a = z10;
        return baseSavedState;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var = this.f17056c;
        if (f0Var != null && f0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean performClick() {
        p0 p0Var = this.f17058f;
        if (p0Var != null) {
            if (!p0Var.a()) {
                p0Var.m(h0.b(this), h0.a(this));
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f17054a;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        n nVar = this.f17054a;
        if (nVar != null) {
            nVar.f(i9);
        }
    }

    @Override
    public void setDropDownHorizontalOffset(int i9) {
        p0 p0Var = this.f17058f;
        if (p0Var != null) {
            p0Var.l(i9);
            p0Var.c(i9);
            return;
        }
        super.setDropDownHorizontalOffset(i9);
    }

    @Override
    public void setDropDownVerticalOffset(int i9) {
        p0 p0Var = this.f17058f;
        if (p0Var != null) {
            p0Var.j(i9);
        } else {
            super.setDropDownVerticalOffset(i9);
        }
    }

    @Override
    public void setDropDownWidth(int i9) {
        if (this.f17058f != null) {
            this.h = i9;
        } else {
            super.setDropDownWidth(i9);
        }
    }

    @Override
    public void setPopupBackgroundDrawable(Drawable drawable) {
        p0 p0Var = this.f17058f;
        if (p0Var != null) {
            p0Var.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override
    public void setPopupBackgroundResource(int i9) {
        setPopupBackgroundDrawable(t7.b(getPopupContext(), i9));
    }

    @Override
    public void setPrompt(CharSequence charSequence) {
        p0 p0Var = this.f17058f;
        if (p0Var != null) {
            p0Var.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f17054a;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f17054a;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    @Override
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f17057e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        p0 p0Var = this.f17058f;
        if (p0Var != null) {
            Context context = this.f17055b;
            if (context == null) {
                context = getContext();
            }
            p0Var.o(new k0(spinnerAdapter, context.getTheme()));
        }
    }
}
