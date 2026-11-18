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
import c8.i9;
import c8.lc;
import c8.pc;
import hi.w4;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
public class z0 extends TextView implements u0.k {
    public final h2.c f20272a;
    public final w0 f20273b;
    public final y f20274c;
    public t d;
    public boolean f20275e;
    public w4 f20276f;
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
        h2.c cVar = this.f20272a;
        if (cVar != null) {
            cVar.b();
        }
        w0 w0Var = this.f20273b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (r3.f20199b) {
            return super.getAutoSizeMaxTextSize();
        }
        w0 w0Var = this.f20273b;
        if (w0Var != null) {
            return Math.round(w0Var.f20232i.f20060e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (r3.f20199b) {
            return super.getAutoSizeMinTextSize();
        }
        w0 w0Var = this.f20273b;
        if (w0Var != null) {
            return Math.round(w0Var.f20232i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (r3.f20199b) {
            return super.getAutoSizeStepGranularity();
        }
        w0 w0Var = this.f20273b;
        if (w0Var != null) {
            return Math.round(w0Var.f20232i.f20059c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (r3.f20199b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        w0 w0Var = this.f20273b;
        if (w0Var != null) {
            return w0Var.f20232i.f20061f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (r3.f20199b) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        w0 w0Var = this.f20273b;
        if (w0Var != null) {
            return w0Var.f20232i.f20057a;
        }
        return 0;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return pc.d(super.getCustomSelectionActionModeCallback());
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
        if (this.f20276f == null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 28) {
                this.f20276f = new y0(this);
            } else if (i7 >= 26) {
                this.f20276f = new w4(this, 11);
            }
        }
        return this.f20276f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        h2.c cVar = this.f20272a;
        if (cVar != null) {
            return cVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h2.c cVar = this.f20272a;
        if (cVar != null) {
            return cVar.w();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f20273b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f20273b.e();
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
                    pc.a(this);
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
        if (Build.VERSION.SDK_INT < 28 && (yVar = this.f20274c) != null) {
            TextClassifier textClassifier = (TextClassifier) yVar.f20261c;
            if (textClassifier == null) {
                return q0.a((TextView) yVar.f20260b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public p0.c getTextMetricsParamsCompat() {
        return pc.a(this);
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f20273b.getClass();
        w0.h(editorInfo, onCreateInputConnection, this);
        i9.a(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        w0 w0Var = this.f20273b;
        if (w0Var != null && !r3.f20199b) {
            w0Var.f20232i.a();
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        Future future = this.h;
        if (future != null) {
            try {
                this.h = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    pc.a(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        w0 w0Var = this.f20273b;
        if (w0Var != null) {
            g1 g1Var = w0Var.f20232i;
            if (!r3.f20199b && g1Var.f()) {
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
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i10, int i11, int i12) {
        if (r3.f20199b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i7, i10, i11, i12);
            return;
        }
        w0 w0Var = this.f20273b;
        if (w0Var != null) {
            w0Var.i(i7, i10, i11, i12);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
        if (r3.f20199b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
            return;
        }
        w0 w0Var = this.f20273b;
        if (w0Var != null) {
            w0Var.j(iArr, i7);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (r3.f20199b) {
            super.setAutoSizeTextTypeWithDefaults(i7);
            return;
        }
        w0 w0Var = this.f20273b;
        if (w0Var != null) {
            w0Var.k(i7);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h2.c cVar = this.f20272a;
        if (cVar != null) {
            cVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        h2.c cVar = this.f20272a;
        if (cVar != null) {
            cVar.z(i7);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f20273b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f20273b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f20273b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f20273b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(pc.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((lc) getEmojiTextViewHelper().f20206b.f35933b).a(inputFilterArr));
    }

    @Override
    public void setFirstBaselineToTopHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().A1(i7);
        } else {
            pc.b(this, i7);
        }
    }

    @Override
    public void setLastBaselineToBottomHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().R0(i7);
        } else {
            pc.c(this, i7);
        }
    }

    @Override
    public void setLineHeight(int i7) {
        if (i7 >= 0) {
            int fontMetricsInt = getPaint().getFontMetricsInt(null);
            if (i7 != fontMetricsInt) {
                setLineSpacing(i7 - fontMetricsInt, 1.0f);
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
        pc.a(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h2.c cVar = this.f20272a;
        if (cVar != null) {
            cVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h2.c cVar = this.f20272a;
        if (cVar != null) {
            cVar.E(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f20273b;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f20273b;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        w0 w0Var = this.f20273b;
        if (w0Var != null) {
            w0Var.g(context, i7);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        y yVar;
        if (Build.VERSION.SDK_INT < 28 && (yVar = this.f20274c) != null) {
            yVar.f20261c = textClassifier;
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
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f55065b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i7 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i7 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i7 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i7 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i7 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i7 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i7 = 7;
            }
        }
        setTextDirection(i7);
        getPaint().set(cVar.f55064a);
        setBreakStrategy(cVar.f55066c);
        setHyphenationFrequency(cVar.d);
    }

    @Override
    public final void setTextSize(int i7, float f10) {
        boolean z10 = r3.f20199b;
        if (z10) {
            super.setTextSize(i7, f10);
            return;
        }
        w0 w0Var = this.f20273b;
        if (w0Var != null) {
            g1 g1Var = w0Var.f20232i;
            if (!z10 && !g1Var.f()) {
                g1Var.g(f10, i7);
            }
        }
    }

    @Override
    public final void setTypeface(Typeface typeface, int i7) {
        Typeface typeface2;
        if (this.f20275e) {
            return;
        }
        if (typeface != null && i7 > 0) {
            Context context = getContext();
            c8.m0 m0Var = i0.e.f15895a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i7);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.f20275e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i7);
        } finally {
            this.f20275e = false;
        }
    }

    public z0(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        a3.a(context);
        this.f20275e = false;
        this.f20276f = null;
        z2.a(this, getContext());
        h2.c cVar = new h2.c(this);
        this.f20272a = cVar;
        cVar.x(attributeSet, i7);
        w0 w0Var = new w0(this);
        this.f20273b = w0Var;
        w0Var.f(attributeSet, i7);
        w0Var.b();
        y yVar = new y();
        yVar.f20260b = this;
        this.f20274c = yVar;
        getEmojiTextViewHelper().a(attributeSet, i7);
    }

    @Override
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i7 != 0 ? c8.z.b(context, i7) : null, i10 != 0 ? c8.z.b(context, i10) : null, i11 != 0 ? c8.z.b(context, i11) : null, i12 != 0 ? c8.z.b(context, i12) : null);
        w0 w0Var = this.f20273b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(int i7, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i7 != 0 ? c8.z.b(context, i7) : null, i10 != 0 ? c8.z.b(context, i10) : null, i11 != 0 ? c8.z.b(context, i11) : null, i12 != 0 ? c8.z.b(context, i12) : null);
        w0 w0Var = this.f20273b;
        if (w0Var != null) {
            w0Var.b();
        }
    }
}
