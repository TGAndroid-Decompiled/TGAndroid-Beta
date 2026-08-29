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
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import h7.f8;
import h7.s7;
import i7.d8;
import i7.v6;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
public class a1 extends TextView implements u0.k {
    public final n f16487a;
    public final x0 f16488b;
    public final z f16489c;
    public u d;
    public boolean f16490e;
    public za.c f16491f;
    public Future h;

    public a1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private u getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new u(this);
        }
        return this.d;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.f16487a;
        if (nVar != null) {
            nVar.a();
        }
        x0 x0Var = this.f16488b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (v3.f16718b) {
            return super.getAutoSizeMaxTextSize();
        }
        x0 x0Var = this.f16488b;
        if (x0Var != null) {
            return Math.round(x0Var.f16731i.f16553e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (v3.f16718b) {
            return super.getAutoSizeMinTextSize();
        }
        x0 x0Var = this.f16488b;
        if (x0Var != null) {
            return Math.round(x0Var.f16731i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (v3.f16718b) {
            return super.getAutoSizeStepGranularity();
        }
        x0 x0Var = this.f16488b;
        if (x0Var != null) {
            return Math.round(x0Var.f16731i.f16552c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (v3.f16718b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x0 x0Var = this.f16488b;
        if (x0Var != null) {
            return x0Var.f16731i.f16554f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (v3.f16718b) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        x0 x0Var = this.f16488b;
        if (x0Var != null) {
            return x0Var.f16731i.f16550a;
        }
        return 0;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return d8.d(super.getCustomSelectionActionModeCallback());
    }

    @Override
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public y0 getSuperCaller() {
        if (this.f16491f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                this.f16491f = new z0(this);
            } else if (i10 >= 26) {
                this.f16491f = new za.c(this, 25);
            }
        }
        return this.f16491f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.f16487a;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.f16487a;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f16488b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f16488b.e();
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
                    d8.a(this);
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
        z zVar;
        if (Build.VERSION.SDK_INT < 28 && (zVar = this.f16489c) != null) {
            TextClassifier textClassifier = (TextClassifier) zVar.f16754c;
            if (textClassifier == null) {
                return r0.a((TextView) zVar.f16753b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public p0.c getTextMetricsParamsCompat() {
        return d8.a(this);
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f16488b.getClass();
        x0.h(editorInfo, onCreateInputConnection, this);
        i7.u.a(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        x0 x0Var = this.f16488b;
        if (x0Var != null && !v3.f16718b) {
            x0Var.f16731i.a();
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
                    d8.a(this);
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
        x0 x0Var = this.f16488b;
        if (x0Var != null) {
            h1 h1Var = x0Var.f16731i;
            if (!v3.f16718b && h1Var.f()) {
                h1Var.a();
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
        if (v3.f16718b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        x0 x0Var = this.f16488b;
        if (x0Var != null) {
            x0Var.i(i10, i11, i12, i13);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (v3.f16718b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        x0 x0Var = this.f16488b;
        if (x0Var != null) {
            x0Var.j(iArr, i10);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (v3.f16718b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        x0 x0Var = this.f16488b;
        if (x0Var != null) {
            x0Var.k(i10);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f16487a;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        n nVar = this.f16487a;
        if (nVar != null) {
            nVar.f(i10);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f16488b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f16488b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f16488b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f16488b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d8.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((v6) getEmojiTextViewHelper().f16702b.f17533b).a(inputFilterArr));
    }

    @Override
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().g(i10);
        } else {
            d8.b(i10, this);
        }
    }

    @Override
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().e(i10);
        } else {
            d8.c(i10, this);
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
        d8.a(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f16487a;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f16487a;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f16488b;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f16488b;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        x0 x0Var = this.f16488b;
        if (x0Var != null) {
            x0Var.g(context, i10);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        z zVar;
        if (Build.VERSION.SDK_INT < 28 && (zVar = this.f16489c) != null) {
            zVar.f16754c = textClassifier;
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
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f45409b;
        TextPaint textPaint = cVar.f45408a;
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
        if (Build.VERSION.SDK_INT < 23) {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(textPaint);
        e0.b.r(this, cVar.f45410c);
        e0.b.u(this, cVar.d);
    }

    @Override
    public final void setTextSize(int i10, float f9) {
        boolean z10 = v3.f16718b;
        if (z10) {
            super.setTextSize(i10, f9);
            return;
        }
        x0 x0Var = this.f16488b;
        if (x0Var != null) {
            h1 h1Var = x0Var.f16731i;
            if (!z10 && !h1Var.f()) {
                h1Var.g(f9, i10);
            }
        }
    }

    @Override
    public final void setTypeface(Typeface typeface, int i10) {
        Typeface typeface2;
        if (this.f16490e) {
            return;
        }
        if (typeface != null && i10 > 0) {
            Context context = getContext();
            f8 f8Var = i0.e.f8192a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i10);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.f16490e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f16490e = false;
        }
    }

    public a1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e3.a(context);
        this.f16490e = false;
        this.f16491f = null;
        d3.a(this, getContext());
        n nVar = new n(this);
        this.f16487a = nVar;
        nVar.d(attributeSet, i10);
        x0 x0Var = new x0(this);
        this.f16488b = x0Var;
        x0Var.f(attributeSet, i10);
        x0Var.b();
        z zVar = new z();
        zVar.f16753b = this;
        this.f16489c = zVar;
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    @Override
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? s7.b(context, i10) : null, i11 != 0 ? s7.b(context, i11) : null, i12 != 0 ? s7.b(context, i12) : null, i13 != 0 ? s7.b(context, i13) : null);
        x0 x0Var = this.f16488b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? s7.b(context, i10) : null, i11 != 0 ? s7.b(context, i11) : null, i12 != 0 ? s7.b(context, i12) : null, i13 != 0 ? s7.b(context, i13) : null);
        x0 x0Var = this.f16488b;
        if (x0Var != null) {
            x0Var.b();
        }
    }
}
