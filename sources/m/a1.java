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
import f7.j8;
import f7.t7;
import g7.q6;
import g7.r7;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
public class a1 extends TextView implements u0.k {
    public final n f16888a;
    public final x0 f16889b;
    public final z f16890c;
    public u d;
    public boolean f16891e;
    public fa.c f16892f;
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
        n nVar = this.f16888a;
        if (nVar != null) {
            nVar.a();
        }
        x0 x0Var = this.f16889b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (w3.f17124b) {
            return super.getAutoSizeMaxTextSize();
        }
        x0 x0Var = this.f16889b;
        if (x0Var != null) {
            return Math.round(x0Var.f17134i.f16954e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (w3.f17124b) {
            return super.getAutoSizeMinTextSize();
        }
        x0 x0Var = this.f16889b;
        if (x0Var != null) {
            return Math.round(x0Var.f17134i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (w3.f17124b) {
            return super.getAutoSizeStepGranularity();
        }
        x0 x0Var = this.f16889b;
        if (x0Var != null) {
            return Math.round(x0Var.f17134i.f16953c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (w3.f17124b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x0 x0Var = this.f16889b;
        if (x0Var != null) {
            return x0Var.f17134i.f16955f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (w3.f17124b) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        x0 x0Var = this.f16889b;
        if (x0Var != null) {
            return x0Var.f17134i.f16951a;
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

    public y0 getSuperCaller() {
        if (this.f16892f == null) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 28) {
                this.f16892f = new z0(this);
            } else if (i9 >= 26) {
                this.f16892f = new fa.c(this, 28);
            }
        }
        return this.f16892f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.f16888a;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.f16888a;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f16889b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f16889b.e();
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
        z zVar;
        if (Build.VERSION.SDK_INT < 28 && (zVar = this.f16890c) != null) {
            TextClassifier textClassifier = (TextClassifier) zVar.f17157c;
            if (textClassifier == null) {
                return r0.a((TextView) zVar.f17156b);
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
        this.f16889b.getClass();
        x0.h(editorInfo, onCreateInputConnection, this);
        g7.l.a(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        x0 x0Var = this.f16889b;
        if (x0Var != null && !w3.f17124b) {
            x0Var.f17134i.a();
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
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
        super.onMeasure(i9, i10);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        x0 x0Var = this.f16889b;
        if (x0Var != null) {
            h1 h1Var = x0Var.f17134i;
            if (!w3.f17124b && h1Var.f()) {
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
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i9, int i10, int i11, int i12) {
        if (w3.f17124b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i9, i10, i11, i12);
            return;
        }
        x0 x0Var = this.f16889b;
        if (x0Var != null) {
            x0Var.i(i9, i10, i11, i12);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i9) {
        if (w3.f17124b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i9);
            return;
        }
        x0 x0Var = this.f16889b;
        if (x0Var != null) {
            x0Var.j(iArr, i9);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i9) {
        if (w3.f17124b) {
            super.setAutoSizeTextTypeWithDefaults(i9);
            return;
        }
        x0 x0Var = this.f16889b;
        if (x0Var != null) {
            x0Var.k(i9);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f16888a;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        n nVar = this.f16888a;
        if (nVar != null) {
            nVar.f(i9);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f16889b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f16889b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f16889b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f16889b;
        if (x0Var != null) {
            x0Var.b();
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
        super.setFilters(((q6) getEmojiTextViewHelper().f17104b.f18488b).a(inputFilterArr));
    }

    @Override
    public void setFirstBaselineToTopHeight(int i9) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().o(i9);
        } else {
            r7.b(i9, this);
        }
    }

    @Override
    public void setLastBaselineToBottomHeight(int i9) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i9);
        } else {
            r7.c(i9, this);
        }
    }

    @Override
    public void setLineHeight(int i9) {
        if (i9 >= 0) {
            int fontMetricsInt = getPaint().getFontMetricsInt(null);
            if (i9 != fontMetricsInt) {
                setLineSpacing(i9 - fontMetricsInt, 1.0f);
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
        n nVar = this.f16888a;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f16888a;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f16889b;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f16889b;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        x0 x0Var = this.f16889b;
        if (x0Var != null) {
            x0Var.g(context, i9);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        z zVar;
        if (Build.VERSION.SDK_INT < 28 && (zVar = this.f16890c) != null) {
            zVar.f17157c = textClassifier;
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
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f45329b;
        TextPaint textPaint = cVar.f45328a;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i9 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i9 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i9 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i9 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i9 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i9 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i9 = 7;
            }
        }
        setTextDirection(i9);
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
        e0.b.r(this, cVar.f45330c);
        e0.b.u(this, cVar.d);
    }

    @Override
    public final void setTextSize(int i9, float f10) {
        boolean z10 = w3.f17124b;
        if (z10) {
            super.setTextSize(i9, f10);
            return;
        }
        x0 x0Var = this.f16889b;
        if (x0Var != null) {
            h1 h1Var = x0Var.f17134i;
            if (!z10 && !h1Var.f()) {
                h1Var.g(f10, i9);
            }
        }
    }

    @Override
    public final void setTypeface(Typeface typeface, int i9) {
        Typeface typeface2;
        if (this.f16891e) {
            return;
        }
        if (typeface != null && i9 > 0) {
            Context context = getContext();
            j8 j8Var = i0.e.f10854a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i9);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.f16891e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i9);
        } finally {
            this.f16891e = false;
        }
    }

    public a1(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        e3.a(context);
        this.f16891e = false;
        this.f16892f = null;
        d3.a(this, getContext());
        n nVar = new n(this);
        this.f16888a = nVar;
        nVar.d(attributeSet, i9);
        x0 x0Var = new x0(this);
        this.f16889b = x0Var;
        x0Var.f(attributeSet, i9);
        x0Var.b();
        z zVar = new z();
        zVar.f17156b = this;
        this.f16890c = zVar;
        getEmojiTextViewHelper().a(attributeSet, i9);
    }

    @Override
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i9, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i9 != 0 ? t7.b(context, i9) : null, i10 != 0 ? t7.b(context, i10) : null, i11 != 0 ? t7.b(context, i11) : null, i12 != 0 ? t7.b(context, i12) : null);
        x0 x0Var = this.f16889b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(int i9, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i9 != 0 ? t7.b(context, i9) : null, i10 != 0 ? t7.b(context, i10) : null, i11 != 0 ? t7.b(context, i11) : null, i12 != 0 ? t7.b(context, i12) : null);
        x0 x0Var = this.f16889b;
        if (x0Var != null) {
            x0Var.b();
        }
    }
}
