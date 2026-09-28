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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import v7.i8;
import v7.w7;
import w7.p6;
import w7.r7;
public class z0 extends TextView implements u0.k {
    public final e2.c f14609a;
    public final w0 f14610b;
    public final y f14611c;
    public t d;
    public boolean e;
    public a4.m f14612f;
    public Future h;

    public z0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private t getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new t(this);
        }
        return this.d;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.f14609a;
        if (cVar != null) {
            cVar.b();
        }
        w0 w0Var = this.f14610b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (s3.f14552b) {
            return super.getAutoSizeMaxTextSize();
        }
        w0 w0Var = this.f14610b;
        if (w0Var != null) {
            return Math.round(w0Var.f14577i.e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (s3.f14552b) {
            return super.getAutoSizeMinTextSize();
        }
        w0 w0Var = this.f14610b;
        if (w0Var != null) {
            return Math.round(w0Var.f14577i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (s3.f14552b) {
            return super.getAutoSizeStepGranularity();
        }
        w0 w0Var = this.f14610b;
        if (w0Var != null) {
            return Math.round(w0Var.f14577i.f14416c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (s3.f14552b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        w0 w0Var = this.f14610b;
        if (w0Var != null) {
            return w0Var.f14577i.f14417f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (s3.f14552b) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        w0 w0Var = this.f14610b;
        if (w0Var != null) {
            return w0Var.f14577i.f14414a;
        }
        return 0;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return r7.d(super.getCustomSelectionActionModeCallback());
    }

    @Override
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public x0 getSuperCaller() {
        if (this.f14612f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                this.f14612f = new y0(this);
            } else if (i10 >= 26) {
                this.f14612f = new a4.m(this, 28);
            }
        }
        return this.f14612f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.f14609a;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.f14609a;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14610b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14610b.e();
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
                    r7.a(this);
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
        y yVar;
        if (Build.VERSION.SDK_INT < 28 && (yVar = this.f14611c) != null) {
            TextClassifier textClassifier = (TextClassifier) yVar.f14601c;
            if (textClassifier == null) {
                return q0.a((TextView) yVar.f14600b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public p0.c getTextMetricsParamsCompat() {
        return r7.a(this);
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f14610b.getClass();
        w0.h(editorInfo, onCreateInputConnection, this);
        w7.o.a(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        w0 w0Var = this.f14610b;
        if (w0Var != null && !s3.f14552b) {
            w0Var.f14577i.a();
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
                    r7.a(this);
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
        w0 w0Var = this.f14610b;
        if (w0Var != null) {
            g1 g1Var = w0Var.f14577i;
            if (!s3.f14552b && g1Var.f()) {
                g1Var.a();
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
        if (s3.f14552b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        w0 w0Var = this.f14610b;
        if (w0Var != null) {
            w0Var.i(i10, i11, i12, i13);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (s3.f14552b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        w0 w0Var = this.f14610b;
        if (w0Var != null) {
            w0Var.j(iArr, i10);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (s3.f14552b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        w0 w0Var = this.f14610b;
        if (w0Var != null) {
            w0Var.k(i10);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.f14609a;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.f14609a;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f14610b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f14610b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f14610b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f14610b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(r7.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((p6) getEmojiTextViewHelper().f14554b.f13369b).a(inputFilterArr));
    }

    @Override
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d0(i10);
        } else {
            r7.b(i10, this);
        }
    }

    @Override
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().H(i10);
        } else {
            r7.c(i10, this);
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
        r7.a(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.f14609a;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.f14609a;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f14610b;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f14610b;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        w0 w0Var = this.f14610b;
        if (w0Var != null) {
            w0Var.g(context, i10);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        y yVar;
        if (Build.VERSION.SDK_INT < 28 && (yVar = this.f14611c) != null) {
            yVar.f14601c = textClassifier;
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
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f40656b;
        TextPaint textPaint = cVar.f40655a;
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
        e0.b.y(this, cVar.f40657c);
        e0.b.B(this, cVar.d);
    }

    @Override
    public final void setTextSize(int i10, float f7) {
        boolean z10 = s3.f14552b;
        if (z10) {
            super.setTextSize(i10, f7);
            return;
        }
        w0 w0Var = this.f14610b;
        if (w0Var != null) {
            g1 g1Var = w0Var.f14577i;
            if (!z10 && !g1Var.f()) {
                g1Var.g(f7, i10);
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
            i8 i8Var = i0.e.f10582a;
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

    public z0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b3.a(context);
        this.e = false;
        this.f14612f = null;
        a3.a(this, getContext());
        e2.c cVar = new e2.c(this);
        this.f14609a = cVar;
        cVar.f(attributeSet, i10);
        w0 w0Var = new w0(this);
        this.f14610b = w0Var;
        w0Var.f(attributeSet, i10);
        w0Var.b();
        y yVar = new y();
        yVar.f14600b = this;
        this.f14611c = yVar;
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    @Override
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? w7.b(context, i10) : null, i11 != 0 ? w7.b(context, i11) : null, i12 != 0 ? w7.b(context, i12) : null, i13 != 0 ? w7.b(context, i13) : null);
        w0 w0Var = this.f14610b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? w7.b(context, i10) : null, i11 != 0 ? w7.b(context, i11) : null, i12 != 0 ? w7.b(context, i12) : null, i13 != 0 ? w7.b(context, i13) : null);
        w0 w0Var = this.f14610b;
        if (w0Var != null) {
            w0Var.b();
        }
    }
}
