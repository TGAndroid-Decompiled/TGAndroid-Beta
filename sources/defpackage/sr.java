package defpackage;

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
public class sr extends TextView implements arb {
    public final kp a;
    public final pr b;
    public final hr c;
    public iq d;
    public boolean e;
    public ni6 f;
    public Future h;

    public sr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yqb.a(context);
        this.e = false;
        this.f = null;
        dpb.a(getContext(), this);
        kp kpVar = new kp(this);
        this.a = kpVar;
        kpVar.g(attributeSet, i);
        pr prVar = new pr(this);
        this.b = prVar;
        prVar.f(attributeSet, i);
        prVar.b();
        ?? obj = new Object();
        obj.a = this;
        this.c = obj;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private iq getEmojiTextViewHelper() {
        iq iqVar = this.d;
        if (iqVar == null) {
            iq iqVar2 = new iq(this);
            this.d = iqVar2;
            return iqVar2;
        }
        return iqVar;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.b();
        }
        pr prVar = this.b;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (ghc.b) {
            return super.getAutoSizeMaxTextSize();
        }
        pr prVar = this.b;
        if (prVar != null) {
            return Math.round(prVar.i.e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (ghc.b) {
            return super.getAutoSizeMinTextSize();
        }
        pr prVar = this.b;
        if (prVar != null) {
            return Math.round(prVar.i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (ghc.b) {
            return super.getAutoSizeStepGranularity();
        }
        pr prVar = this.b;
        if (prVar != null) {
            return Math.round(prVar.i.c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (ghc.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        pr prVar = this.b;
        if (prVar != null) {
            return prVar.i.f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (ghc.b) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        pr prVar = this.b;
        if (prVar != null) {
            return prVar.i.a;
        }
        return 0;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return mxe.d(super.getCustomSelectionActionModeCallback());
    }

    @Override
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public qr getSuperCaller() {
        ni6 ni6Var = this.f;
        if (ni6Var == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                rr rrVar = new rr(this);
                this.f = rrVar;
                return rrVar;
            } else if (i >= 26) {
                ni6 ni6Var2 = new ni6(this, (byte) 5);
                this.f = ni6Var2;
                return ni6Var2;
            } else {
                return ni6Var;
            }
        }
        return ni6Var;
    }

    public ColorStateList getSupportBackgroundTintList() {
        kp kpVar = this.a;
        if (kpVar != null) {
            return kpVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        kp kpVar = this.a;
        if (kpVar != null) {
            return kpVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
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
                    mxe.a(this);
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
        hr hrVar;
        if (Build.VERSION.SDK_INT < 28 && (hrVar = this.c) != null) {
            TextClassifier textClassifier = hrVar.b;
            if (textClassifier == null) {
                return gr.a(hrVar.a);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public bi8 getTextMetricsParamsCompat() {
        return mxe.a(this);
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        pr.h(editorInfo, onCreateInputConnection, this);
        jod.a(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        pr prVar = this.b;
        if (prVar != null && !ghc.b) {
            prVar.i.a();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        Future future = this.h;
        if (future != null) {
            try {
                this.h = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    mxe.a(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        pr prVar = this.b;
        if (prVar != null) {
            zr zrVar = prVar.i;
            if (!ghc.b && zrVar.f()) {
                zrVar.a();
            }
        }
    }

    @Override
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (ghc.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        pr prVar = this.b;
        if (prVar != null) {
            prVar.i(i, i2, i3, i4);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (ghc.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        pr prVar = this.b;
        if (prVar != null) {
            prVar.j(iArr, i);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (ghc.b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        pr prVar = this.b;
        if (prVar != null) {
            prVar.k(i);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.h();
        }
    }

    @Override
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.i(i);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        pr prVar = this.b;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        pr prVar = this.b;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = kod.a(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = kod.a(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = kod.a(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = kod.a(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        pr prVar = this.b;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = kod.a(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = kod.a(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = kod.a(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = kod.a(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        pr prVar = this.b;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(mxe.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((fhe) getEmojiTextViewHelper().b.a).a(inputFilterArr));
    }

    @Override
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i);
        } else {
            mxe.b(this, i);
        }
    }

    @Override
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i);
        } else {
            mxe.c(this, i);
        }
    }

    @Override
    public void setLineHeight(int i) {
        if (i >= 0) {
            int fontMetricsInt = getPaint().getFontMetricsInt(null);
            if (i != fontMetricsInt) {
                setLineSpacing(i - fontMetricsInt, 1.0f);
                return;
            }
            return;
        }
        i98.g();
    }

    public void setPrecomputedText(ci8 ci8Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        mxe.a(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.n(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        pr prVar = this.b;
        prVar.l(colorStateList);
        prVar.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        pr prVar = this.b;
        prVar.m(mode);
        prVar.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        pr prVar = this.b;
        if (prVar != null) {
            prVar.g(context, i);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        hr hrVar;
        if (Build.VERSION.SDK_INT < 28 && (hrVar = this.c) != null) {
            hrVar.b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<ci8> future) {
        this.h = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(bi8 bi8Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = bi8Var.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(bi8Var.a);
        setBreakStrategy(bi8Var.c);
        setHyphenationFrequency(bi8Var.d);
    }

    @Override
    public final void setTextSize(int i, float f) {
        boolean z = ghc.b;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        pr prVar = this.b;
        if (prVar != null) {
            zr zrVar = prVar.i;
            if (!z && !zrVar.f()) {
                zrVar.g(f, i);
            }
        }
    }

    @Override
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.e) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            xye xyeVar = s5c.a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i);
            } else {
                u36.j("Context cannot be null");
                return;
            }
        } else {
            typeface2 = null;
        }
        this.e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.e = false;
        }
    }

    @Override
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        pr prVar = this.b;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        pr prVar = this.b;
        if (prVar != null) {
            prVar.b();
        }
    }

    public sr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }
}
