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
import j7.r7;
public final class q0 extends Spinner {
    public static final int[] f13605r = {16843505};
    public final m f13606a;
    public final Context f13607b;
    public final e0 f13608c;
    public SpinnerAdapter d;
    public final boolean e;
    public final p0 f13609f;
    public int h;
    public final Rect f13610n;

    public q0(android.content.Context r13, android.util.AttributeSet r14) {
        throw new UnsupportedOperationException("Method not decompiled: m.q0.<init>(android.content.Context, android.util.AttributeSet):void");
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
            Rect rect = this.f13610n;
            drawable.getPadding(rect);
            return rect.left + rect.right + i11;
        }
        return i11;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m mVar = this.f13606a;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override
    public int getDropDownHorizontalOffset() {
        p0 p0Var = this.f13609f;
        if (p0Var != null) {
            return p0Var.b();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override
    public int getDropDownVerticalOffset() {
        p0 p0Var = this.f13609f;
        if (p0Var != null) {
            return p0Var.n();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override
    public int getDropDownWidth() {
        if (this.f13609f != null) {
            return this.h;
        }
        return super.getDropDownWidth();
    }

    public final p0 getInternalPopup() {
        return this.f13609f;
    }

    @Override
    public Drawable getPopupBackground() {
        p0 p0Var = this.f13609f;
        if (p0Var != null) {
            return p0Var.h();
        }
        return super.getPopupBackground();
    }

    @Override
    public Context getPopupContext() {
        return this.f13607b;
    }

    @Override
    public CharSequence getPrompt() {
        p0 p0Var = this.f13609f;
        if (p0Var != null) {
            return p0Var.d();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        m mVar = this.f13606a;
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m mVar = this.f13606a;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p0 p0Var = this.f13609f;
        if (p0Var != null && p0Var.a()) {
            p0Var.dismiss();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f13609f != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        o0 o0Var = (o0) parcelable;
        super.onRestoreInstanceState(o0Var.getSuperState());
        if (o0Var.f13578a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new androidx.mediarouter.app.k(this, 3));
        }
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        boolean z4;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        p0 p0Var = this.f13609f;
        if (p0Var != null && p0Var.a()) {
            z4 = true;
        } else {
            z4 = false;
        }
        baseSavedState.f13578a = z4;
        return baseSavedState;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var = this.f13608c;
        if (e0Var != null && e0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean performClick() {
        p0 p0Var = this.f13609f;
        if (p0Var != null) {
            if (!p0Var.a()) {
                p0Var.m(g0.b(this), g0.a(this));
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m mVar = this.f13606a;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        m mVar = this.f13606a;
        if (mVar != null) {
            mVar.f(i10);
        }
    }

    @Override
    public void setDropDownHorizontalOffset(int i10) {
        p0 p0Var = this.f13609f;
        if (p0Var != null) {
            p0Var.l(i10);
            p0Var.c(i10);
            return;
        }
        super.setDropDownHorizontalOffset(i10);
    }

    @Override
    public void setDropDownVerticalOffset(int i10) {
        p0 p0Var = this.f13609f;
        if (p0Var != null) {
            p0Var.k(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override
    public void setDropDownWidth(int i10) {
        if (this.f13609f != null) {
            this.h = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override
    public void setPopupBackgroundDrawable(Drawable drawable) {
        p0 p0Var = this.f13609f;
        if (p0Var != null) {
            p0Var.j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(r7.b(getPopupContext(), i10));
    }

    @Override
    public void setPrompt(CharSequence charSequence) {
        p0 p0Var = this.f13609f;
        if (p0Var != null) {
            p0Var.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m mVar = this.f13606a;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m mVar = this.f13606a;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    @Override
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        p0 p0Var = this.f13609f;
        if (p0Var != null) {
            Context context = this.f13607b;
            if (context == null) {
                context = getContext();
            }
            p0Var.o(new k0(spinnerAdapter, context.getTheme()));
        }
    }
}
