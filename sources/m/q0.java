package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import g7.o7;

public final class q0 extends Spinner {

    public static final int[] f17428r = {16843505};

    public final n f17429a;

    public final Context f17430b;

    public final f0 f17431c;
    public SpinnerAdapter d;

    public final boolean f17432e;

    public final p0 f17433f;
    public int h;

    public final Rect f17434n;

    public q0(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, 2130968938);
        this.f17434n = new Rect();
        d3.a(this, getContext());
        int[] iArr = f.a.v;
        j9.a aVarG = j9.a.G(context, attributeSet, iArr, 2130968938);
        TypedArray typedArray = (TypedArray) aVarG.f12864c;
        this.f17429a = new n(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f17430b = new k.c(context, resourceId);
        } else {
            this.f17430b = context;
        }
        int i10 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f17428r, 2130968938, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i10 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e9) {
                    e = e9;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i10 != 0) {
                        j0 j0Var = new j0(this);
                        this.f17433f = j0Var;
                        j0Var.f17355c = typedArray.getString(2);
                    } else if (i10 == 1) {
                        n0 n0Var = new n0(this, this.f17430b, attributeSet);
                        j9.a aVarG2 = j9.a.G(this.f17430b, attributeSet, iArr, 2130968938);
                        this.h = ((TypedArray) aVarG2.f12864c).getLayoutDimension(3, -2);
                        n0Var.i(aVarG2.y(1));
                        n0Var.O = typedArray.getString(2);
                        aVarG2.I();
                        this.f17433f = n0Var;
                        this.f17431c = new f0(this, this, n0Var);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367048, textArray);
                        arrayAdapter.setDropDownViewResource(2131492955);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    aVarG.I();
                    this.f17432e = true;
                    spinnerAdapter = this.d;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.d = null;
                    }
                    this.f17429a.d(attributeSet, 2130968938);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e10) {
            e = e10;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i10 != 0) {
            j0 j0Var2 = new j0(this);
            this.f17433f = j0Var2;
            j0Var2.f17355c = typedArray.getString(2);
        } else if (i10 == 1) {
            n0 n0Var2 = new n0(this, this.f17430b, attributeSet);
            j9.a aVarG3 = j9.a.G(this.f17430b, attributeSet, iArr, 2130968938);
            this.h = ((TypedArray) aVarG3.f12864c).getLayoutDimension(3, -2);
            n0Var2.i(aVarG3.y(1));
            n0Var2.O = typedArray.getString(2);
            aVarG3.I();
            this.f17433f = n0Var2;
            this.f17431c = new f0(this, this, n0Var2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, 17367048, textArray);
            arrayAdapter2.setDropDownViewResource(2131492955);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        aVarG.I();
        this.f17432e = true;
        spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.f17429a.d(attributeSet, 2130968938);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f17434n;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.f17429a;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override
    public int getDropDownHorizontalOffset() {
        p0 p0Var = this.f17433f;
        return p0Var != null ? p0Var.b() : super.getDropDownHorizontalOffset();
    }

    @Override
    public int getDropDownVerticalOffset() {
        p0 p0Var = this.f17433f;
        return p0Var != null ? p0Var.n() : super.getDropDownVerticalOffset();
    }

    @Override
    public int getDropDownWidth() {
        return this.f17433f != null ? this.h : super.getDropDownWidth();
    }

    public final p0 getInternalPopup() {
        return this.f17433f;
    }

    @Override
    public Drawable getPopupBackground() {
        p0 p0Var = this.f17433f;
        return p0Var != null ? p0Var.e() : super.getPopupBackground();
    }

    @Override
    public Context getPopupContext() {
        return this.f17430b;
    }

    @Override
    public CharSequence getPrompt() {
        p0 p0Var = this.f17433f;
        return p0Var != null ? p0Var.d() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.f17429a;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.f17429a;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p0 p0Var = this.f17433f;
        if (p0Var == null || !p0Var.a()) {
            return;
        }
        p0Var.dismiss();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f17433f == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        o0 o0Var = (o0) parcelable;
        super.onRestoreInstanceState(o0Var.getSuperState());
        if (!o0Var.f17397a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new l.d(this, 2));
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        o0 o0Var = new o0(super.onSaveInstanceState());
        p0 p0Var = this.f17433f;
        o0Var.f17397a = p0Var != null && p0Var.a();
        return o0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var = this.f17431c;
        if (f0Var == null || !f0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public final boolean performClick() {
        p0 p0Var = this.f17433f;
        if (p0Var == null) {
            return super.performClick();
        }
        if (p0Var.a()) {
            return true;
        }
        p0Var.m(h0.b(this), h0.a(this));
        return true;
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f17429a;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        n nVar = this.f17429a;
        if (nVar != null) {
            nVar.f(i10);
        }
    }

    @Override
    public void setDropDownHorizontalOffset(int i10) {
        p0 p0Var = this.f17433f;
        if (p0Var == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            p0Var.l(i10);
            p0Var.c(i10);
        }
    }

    @Override
    public void setDropDownVerticalOffset(int i10) {
        p0 p0Var = this.f17433f;
        if (p0Var != null) {
            p0Var.k(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override
    public void setDropDownWidth(int i10) {
        if (this.f17433f != null) {
            this.h = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override
    public void setPopupBackgroundDrawable(Drawable drawable) {
        p0 p0Var = this.f17433f;
        if (p0Var != null) {
            p0Var.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(o7.b(getPopupContext(), i10));
    }

    @Override
    public void setPrompt(CharSequence charSequence) {
        p0 p0Var = this.f17433f;
        if (p0Var != null) {
            p0Var.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f17429a;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f17429a;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    @Override
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f17432e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        p0 p0Var = this.f17433f;
        if (p0Var != null) {
            Context context = this.f17430b;
            if (context == null) {
                context = getContext();
            }
            p0Var.o(new k0(spinnerAdapter, context.getTheme()));
        }
    }
}
