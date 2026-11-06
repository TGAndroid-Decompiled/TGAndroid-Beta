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
import c8.fc;
import c8.h9;
import c8.lc;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
public class a1 extends TextView implements u0.k {
    public final h2.c f19054a;
    public final x0 f19055b;
    public final z f19056c;
    public u d;
    public boolean f19057e;
    public g6.d0 f19058f;
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
        h2.c cVar = this.f19054a;
        if (cVar != null) {
            cVar.b();
        }
        x0 x0Var = this.f19055b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (t3.f19257b) {
            return super.getAutoSizeMaxTextSize();
        }
        x0 x0Var = this.f19055b;
        if (x0Var != null) {
            return Math.round(x0Var.f19285i.f19110e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (t3.f19257b) {
            return super.getAutoSizeMinTextSize();
        }
        x0 x0Var = this.f19055b;
        if (x0Var != null) {
            return Math.round(x0Var.f19285i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (t3.f19257b) {
            return super.getAutoSizeStepGranularity();
        }
        x0 x0Var = this.f19055b;
        if (x0Var != null) {
            return Math.round(x0Var.f19285i.f19109c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (t3.f19257b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x0 x0Var = this.f19055b;
        if (x0Var != null) {
            return x0Var.f19285i.f19111f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (t3.f19257b) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        x0 x0Var = this.f19055b;
        if (x0Var != null) {
            return x0Var.f19285i.f19107a;
        }
        return 0;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return lc.d(super.getCustomSelectionActionModeCallback());
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
        if (this.f19058f == null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 28) {
                this.f19058f = new z0(this);
            } else if (i7 >= 26) {
                this.f19058f = new g6.d0(this, 16);
            }
        }
        return this.f19058f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        h2.c cVar = this.f19054a;
        if (cVar != null) {
            return cVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h2.c cVar = this.f19054a;
        if (cVar != null) {
            return cVar.w();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f19055b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f19055b.e();
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
                    lc.a(this);
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
        if (Build.VERSION.SDK_INT < 28 && (zVar = this.f19056c) != null) {
            TextClassifier textClassifier = (TextClassifier) zVar.f19314c;
            if (textClassifier == null) {
                return r0.a((TextView) zVar.f19313b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public p0.c getTextMetricsParamsCompat() {
        return lc.a(this);
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f19055b.getClass();
        x0.h(editorInfo, onCreateInputConnection, this);
        h9.a(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        x0 x0Var = this.f19055b;
        if (x0Var != null && !t3.f19257b) {
            x0Var.f19285i.a();
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
                    lc.a(this);
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
        x0 x0Var = this.f19055b;
        if (x0Var != null) {
            h1 h1Var = x0Var.f19285i;
            if (!t3.f19257b && h1Var.f()) {
                h1Var.a();
            }
        }
    }

    @Override
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().b(z9);
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i10, int i11, int i12) {
        if (t3.f19257b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i7, i10, i11, i12);
            return;
        }
        x0 x0Var = this.f19055b;
        if (x0Var != null) {
            x0Var.i(i7, i10, i11, i12);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
        if (t3.f19257b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
            return;
        }
        x0 x0Var = this.f19055b;
        if (x0Var != null) {
            x0Var.j(iArr, i7);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (t3.f19257b) {
            super.setAutoSizeTextTypeWithDefaults(i7);
            return;
        }
        x0 x0Var = this.f19055b;
        if (x0Var != null) {
            x0Var.k(i7);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h2.c cVar = this.f19054a;
        if (cVar != null) {
            cVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        h2.c cVar = this.f19054a;
        if (cVar != null) {
            cVar.z(i7);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f19055b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f19055b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f19055b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f19055b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(lc.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().c(z9);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((fc) getEmojiTextViewHelper().f19259b.f38766b).a(inputFilterArr));
    }

    @Override
    public void setFirstBaselineToTopHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().P(i7);
        } else {
            lc.b(this, i7);
        }
    }

    @Override
    public void setLastBaselineToBottomHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().B(i7);
        } else {
            lc.c(this, i7);
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
        lc.a(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h2.c cVar = this.f19054a;
        if (cVar != null) {
            cVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h2.c cVar = this.f19054a;
        if (cVar != null) {
            cVar.E(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f19055b;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f19055b;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        x0 x0Var = this.f19055b;
        if (x0Var != null) {
            x0Var.g(context, i7);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        z zVar;
        if (Build.VERSION.SDK_INT < 28 && (zVar = this.f19056c) != null) {
            zVar.f19314c = textClassifier;
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
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f52961b;
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
        getPaint().set(cVar.f52960a);
        setBreakStrategy(cVar.f52962c);
        setHyphenationFrequency(cVar.d);
    }

    @Override
    public final void setTextSize(int i7, float f10) {
        boolean z9 = t3.f19257b;
        if (z9) {
            super.setTextSize(i7, f10);
            return;
        }
        x0 x0Var = this.f19055b;
        if (x0Var != null) {
            h1 h1Var = x0Var.f19285i;
            if (!z9 && !h1Var.f()) {
                h1Var.g(f10, i7);
            }
        }
    }

    @Override
    public final void setTypeface(Typeface typeface, int i7) {
        Typeface typeface2;
        if (this.f19057e) {
            return;
        }
        if (typeface != null && i7 > 0) {
            Context context = getContext();
            c8.j0 j0Var = i0.e.f15123a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i7);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.f19057e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i7);
        } finally {
            this.f19057e = false;
        }
    }

    public a1(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        b3.a(context);
        this.f19057e = false;
        this.f19058f = null;
        a3.a(this, getContext());
        h2.c cVar = new h2.c(this);
        this.f19054a = cVar;
        cVar.x(attributeSet, i7);
        x0 x0Var = new x0(this);
        this.f19055b = x0Var;
        x0Var.f(attributeSet, i7);
        x0Var.b();
        z zVar = new z();
        zVar.f19313b = this;
        this.f19056c = zVar;
        getEmojiTextViewHelper().a(attributeSet, i7);
    }

    @Override
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i7 != 0 ? b5.a.b(context, i7) : null, i10 != 0 ? b5.a.b(context, i10) : null, i11 != 0 ? b5.a.b(context, i11) : null, i12 != 0 ? b5.a.b(context, i12) : null);
        x0 x0Var = this.f19055b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(int i7, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i7 != 0 ? b5.a.b(context, i7) : null, i10 != 0 ? b5.a.b(context, i10) : null, i11 != 0 ? b5.a.b(context, i11) : null, i12 != 0 ? b5.a.b(context, i12) : null);
        x0 x0Var = this.f19055b;
        if (x0Var != null) {
            x0Var.b();
        }
    }
}
