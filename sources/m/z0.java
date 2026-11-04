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
import b8.oc;
import b8.sc;
import b8.zd;
import gi.w5;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
public class z0 extends TextView implements u0.k {
    public final g2.d f18796a;
    public final w0 f18797b;
    public final y f18798c;
    public t d;
    public boolean f18799e;
    public w5 f18800f;
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
        g2.d dVar = this.f18796a;
        if (dVar != null) {
            dVar.b();
        }
        w0 w0Var = this.f18797b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (r3.f18723b) {
            return super.getAutoSizeMaxTextSize();
        }
        w0 w0Var = this.f18797b;
        if (w0Var != null) {
            return Math.round(w0Var.f18756i.f18584e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (r3.f18723b) {
            return super.getAutoSizeMinTextSize();
        }
        w0 w0Var = this.f18797b;
        if (w0Var != null) {
            return Math.round(w0Var.f18756i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (r3.f18723b) {
            return super.getAutoSizeStepGranularity();
        }
        w0 w0Var = this.f18797b;
        if (w0Var != null) {
            return Math.round(w0Var.f18756i.f18583c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (r3.f18723b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        w0 w0Var = this.f18797b;
        if (w0Var != null) {
            return w0Var.f18756i.f18585f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (r3.f18723b) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        w0 w0Var = this.f18797b;
        if (w0Var != null) {
            return w0Var.f18756i.f18581a;
        }
        return 0;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return x7.g0.d(super.getCustomSelectionActionModeCallback());
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
        if (this.f18800f == null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                this.f18800f = new y0(this);
            } else if (i3 >= 26) {
                this.f18800f = new w5(this, 11);
            }
        }
        return this.f18800f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        g2.d dVar = this.f18796a;
        if (dVar != null) {
            return dVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        g2.d dVar = this.f18796a;
        if (dVar != null) {
            return dVar.w();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f18797b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f18797b.e();
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
                    x7.g0.a(this);
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
        if (Build.VERSION.SDK_INT < 28 && (yVar = this.f18798c) != null) {
            TextClassifier textClassifier = (TextClassifier) yVar.f18785c;
            if (textClassifier == null) {
                return q0.a((TextView) yVar.f18784b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public p0.c getTextMetricsParamsCompat() {
        return x7.g0.a(this);
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f18797b.getClass();
        w0.h(editorInfo, onCreateInputConnection, this);
        zd.a(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        w0 w0Var = this.f18797b;
        if (w0Var != null && !r3.f18723b) {
            w0Var.f18756i.a();
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        Future future = this.h;
        if (future != null) {
            try {
                this.h = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    x7.g0.a(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i3, i10);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        super.onTextChanged(charSequence, i3, i10, i11);
        w0 w0Var = this.f18797b;
        if (w0Var != null) {
            g1 g1Var = w0Var.f18756i;
            if (!r3.f18723b && g1Var.f()) {
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
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i3, int i10, int i11, int i12) {
        if (r3.f18723b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i3, i10, i11, i12);
            return;
        }
        w0 w0Var = this.f18797b;
        if (w0Var != null) {
            w0Var.i(i3, i10, i11, i12);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) {
        if (r3.f18723b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
            return;
        }
        w0 w0Var = this.f18797b;
        if (w0Var != null) {
            w0Var.j(iArr, i3);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i3) {
        if (r3.f18723b) {
            super.setAutoSizeTextTypeWithDefaults(i3);
            return;
        }
        w0 w0Var = this.f18797b;
        if (w0Var != null) {
            w0Var.k(i3);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        g2.d dVar = this.f18796a;
        if (dVar != null) {
            dVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        g2.d dVar = this.f18796a;
        if (dVar != null) {
            dVar.z(i3);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f18797b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f18797b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f18797b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f18797b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(x7.g0.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((x7.p) getEmojiTextViewHelper().f18730b.f40562a).a(inputFilterArr));
    }

    @Override
    public void setFirstBaselineToTopHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().E(i3);
        } else {
            x7.g0.b(this, i3);
        }
    }

    @Override
    public void setLastBaselineToBottomHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().t(i3);
        } else {
            x7.g0.c(this, i3);
        }
    }

    @Override
    public void setLineHeight(int i3) {
        if (i3 >= 0) {
            int fontMetricsInt = getPaint().getFontMetricsInt(null);
            if (i3 != fontMetricsInt) {
                setLineSpacing(i3 - fontMetricsInt, 1.0f);
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
        x7.g0.a(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        g2.d dVar = this.f18796a;
        if (dVar != null) {
            dVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        g2.d dVar = this.f18796a;
        if (dVar != null) {
            dVar.E(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f18797b;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f18797b;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        w0 w0Var = this.f18797b;
        if (w0Var != null) {
            w0Var.g(context, i3);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        y yVar;
        if (Build.VERSION.SDK_INT < 28 && (yVar = this.f18798c) != null) {
            yVar.f18785c = textClassifier;
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
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f53052b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i3 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i3 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i3 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i3 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i3 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i3 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i3 = 7;
            }
        }
        setTextDirection(i3);
        getPaint().set(cVar.f53051a);
        setBreakStrategy(cVar.f53053c);
        setHyphenationFrequency(cVar.d);
    }

    @Override
    public final void setTextSize(int i3, float f10) {
        boolean z10 = r3.f18723b;
        if (z10) {
            super.setTextSize(i3, f10);
            return;
        }
        w0 w0Var = this.f18797b;
        if (w0Var != null) {
            g1 g1Var = w0Var.f18756i;
            if (!z10 && !g1Var.f()) {
                g1Var.g(f10, i3);
            }
        }
    }

    @Override
    public final void setTypeface(Typeface typeface, int i3) {
        Typeface typeface2;
        if (this.f18799e) {
            return;
        }
        if (typeface != null && i3 > 0) {
            Context context = getContext();
            sc scVar = i0.e.f14501a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i3);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.f18799e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i3);
        } finally {
            this.f18799e = false;
        }
    }

    public z0(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        a3.a(context);
        this.f18799e = false;
        this.f18800f = null;
        z2.a(this, getContext());
        g2.d dVar = new g2.d(this);
        this.f18796a = dVar;
        dVar.x(attributeSet, i3);
        w0 w0Var = new w0(this);
        this.f18797b = w0Var;
        w0Var.f(attributeSet, i3);
        w0Var.b();
        y yVar = new y();
        yVar.f18784b = this;
        this.f18798c = yVar;
        getEmojiTextViewHelper().a(attributeSet, i3);
    }

    @Override
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i3 != 0 ? oc.b(context, i3) : null, i10 != 0 ? oc.b(context, i10) : null, i11 != 0 ? oc.b(context, i11) : null, i12 != 0 ? oc.b(context, i12) : null);
        w0 w0Var = this.f18797b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(int i3, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i3 != 0 ? oc.b(context, i3) : null, i10 != 0 ? oc.b(context, i10) : null, i11 != 0 ? oc.b(context, i11) : null, i12 != 0 ? oc.b(context, i12) : null);
        w0 w0Var = this.f18797b;
        if (w0Var != null) {
            w0Var.b();
        }
    }
}
