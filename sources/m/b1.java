package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import ji.w4;
import v7.q7;
import v7.y7;
import w7.n6;
import w7.w7;
public class b1 extends TextView implements u0.k {
    public final e2.c f14798a;
    public final y0 f14799b;
    public final a0 f14800c;
    public v d;
    public boolean e;
    public w4 f14801f;
    public Future h;

    public b1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private v getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new v(this);
        }
        return this.d;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.f14798a;
        if (cVar != null) {
            cVar.b();
        }
        y0 y0Var = this.f14799b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (w3.f15008b) {
            return super.getAutoSizeMaxTextSize();
        }
        y0 y0Var = this.f14799b;
        if (y0Var != null) {
            return Math.round(y0Var.f15020i.e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (w3.f15008b) {
            return super.getAutoSizeMinTextSize();
        }
        y0 y0Var = this.f14799b;
        if (y0Var != null) {
            return Math.round(y0Var.f15020i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (w3.f15008b) {
            return super.getAutoSizeStepGranularity();
        }
        y0 y0Var = this.f14799b;
        if (y0Var != null) {
            return Math.round(y0Var.f15020i.f14866c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (w3.f15008b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y0 y0Var = this.f14799b;
        if (y0Var != null) {
            return y0Var.f15020i.f14867f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (w3.f15008b) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        y0 y0Var = this.f14799b;
        if (y0Var != null) {
            return y0Var.f15020i.f14864a;
        }
        return 0;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return w7.d(super.getCustomSelectionActionModeCallback());
    }

    @Override
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public z0 getSuperCaller() {
        if (this.f14801f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                this.f14801f = new a1(this);
            } else if (i10 >= 26) {
                this.f14801f = new w4(this, 5);
            }
        }
        return this.f14801f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f14798a;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f14798a;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14799b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14799b.e();
    }

    @Override
    public CharSequence getText() {
        Future future = this.h;
        if (future != null) {
            try {
                this.h = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    w7.a(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override
    public TextClassifier getTextClassifier() {
        a0 a0Var;
        if (Build.VERSION.SDK_INT < 28 && (a0Var = this.f14800c) != null) {
            TextClassifier textClassifier = (TextClassifier) a0Var.f14789c;
            if (textClassifier == null) {
                return s0.a((TextView) a0Var.f14788b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public p0.c getTextMetricsParamsCompat() {
        return w7.a(this);
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f14799b.getClass();
        y0.h(editorInfo, onCreateInputConnection, this);
        w7.p.a(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        y0 y0Var = this.f14799b;
        if (y0Var != null && !w3.f15008b) {
            y0Var.f15020i.a();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        Future future = this.h;
        if (future != null) {
            try {
                this.h = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    w7.a(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        y0 y0Var = this.f14799b;
        if (y0Var != null) {
            i1 i1Var = y0Var.f15020i;
            if (!w3.f15008b && i1Var.f()) {
                i1Var.a();
            }
        }
    }

    @Override
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (w3.f15008b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        y0 y0Var = this.f14799b;
        if (y0Var != null) {
            y0Var.i(i10, i11, i12, i13);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (w3.f15008b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        y0 y0Var = this.f14799b;
        if (y0Var != null) {
            y0Var.j(iArr, i10);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (w3.f15008b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        y0 y0Var = this.f14799b;
        if (y0Var != null) {
            y0Var.k(i10);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.f14798a;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f14798a;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f14799b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f14799b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f14799b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f14799b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(w7.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((n6) getEmojiTextViewHelper().f14995b.f14848b).a(inputFilterArr));
    }

    @Override
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().I0(i10);
        } else {
            w7.b(i10, this);
        }
    }

    @Override
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().J(i10);
        } else {
            w7.c(i10, this);
        }
    }

    @Override
    public void setLineHeight(int i10) {
        if (i10 >= 0) {
            int fontMetricsInt = getPaint().getFontMetricsInt(null);
            if (i10 != fontMetricsInt) {
                setLineSpacing(i10 - fontMetricsInt, 1.0f);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setPrecomputedText(p0.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        w7.a(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f14798a;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f14798a;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        y0 y0Var = this.f14799b;
        y0Var.l(colorStateList);
        y0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        y0 y0Var = this.f14799b;
        y0Var.m(mode);
        y0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        y0 y0Var = this.f14799b;
        if (y0Var != null) {
            y0Var.g(context, i10);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        a0 a0Var;
        if (Build.VERSION.SDK_INT < 28 && (a0Var = this.f14800c) != null) {
            a0Var.f14789c = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<p0.d> future) {
        this.h = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(p0.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f42524b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i10 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i10 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i10 = 7;
            }
        }
        setTextDirection(i10);
        getPaint().set(cVar.f42523a);
        setBreakStrategy(cVar.f42525c);
        setHyphenationFrequency(cVar.d);
    }

    @Override
    public final void setTextSize(int i10, float f7) {
        boolean z10 = w3.f15008b;
        if (z10) {
            super.setTextSize(i10, f7);
            return;
        }
        y0 y0Var = this.f14799b;
        if (y0Var != null) {
            i1 i1Var = y0Var.f15020i;
            if (!z10 && !i1Var.f()) {
                i1Var.g(f7, i10);
            }
        }
    }

    @Override
    public final void setTypeface(Typeface typeface, int i10) {
        Typeface typeface2;
        if (this.e) {
            return;
        }
        if (typeface != null && i10 > 0) {
            Context context = getContext();
            y7 y7Var = i0.e.f10898a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i10);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.e = false;
        }
    }

    public b1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e3.a(context);
        this.e = false;
        this.f14801f = null;
        d3.a(this, getContext());
        e2.c cVar = new e2.c(this);
        this.f14798a = cVar;
        cVar.f(attributeSet, i10);
        y0 y0Var = new y0(this);
        this.f14799b = y0Var;
        y0Var.f(attributeSet, i10);
        y0Var.b();
        a0 a0Var = new a0();
        a0Var.f14788b = this;
        this.f14800c = a0Var;
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    @Override
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? q7.b(context, i10) : null, i11 != 0 ? q7.b(context, i11) : null, i12 != 0 ? q7.b(context, i12) : null, i13 != 0 ? q7.b(context, i13) : null);
        y0 y0Var = this.f14799b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? q7.b(context, i10) : null, i11 != 0 ? q7.b(context, i11) : null, i12 != 0 ? q7.b(context, i12) : null, i13 != 0 ? q7.b(context, i13) : null);
        y0 y0Var = this.f14799b;
        if (y0Var != null) {
            y0Var.b();
        }
    }
}
