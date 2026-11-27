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
public class tq extends TextView implements zsb {
    public final lo a;
    public final qq b;
    public final iq c;
    public jp d;
    public boolean e;
    public ri6 f;
    public Future h;

    public tq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        xsb.a(context);
        this.e = false;
        this.f = null;
        brb.a(getContext(), this);
        lo loVar = new lo(this);
        this.a = loVar;
        loVar.g(attributeSet, i);
        qq qqVar = new qq(this);
        this.b = qqVar;
        qqVar.f(attributeSet, i);
        qqVar.b();
        ?? obj = new Object();
        obj.a = this;
        this.c = obj;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private jp getEmojiTextViewHelper() {
        jp jpVar = this.d;
        if (jpVar == null) {
            jp jpVar2 = new jp(this);
            this.d = jpVar2;
            return jpVar2;
        }
        return jpVar;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        lo loVar = this.a;
        if (loVar != null) {
            loVar.b();
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (fjc.b) {
            return super.getAutoSizeMaxTextSize();
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            return Math.round(qqVar.i.e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (fjc.b) {
            return super.getAutoSizeMinTextSize();
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            return Math.round(qqVar.i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (fjc.b) {
            return super.getAutoSizeStepGranularity();
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            return Math.round(qqVar.i.c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (fjc.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            return qqVar.i.f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (fjc.b) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            return qqVar.i.a;
        }
        return 0;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c0f.d(super.getCustomSelectionActionModeCallback());
    }

    @Override
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public rq getSuperCaller() {
        ri6 ri6Var = this.f;
        if (ri6Var == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                sq sqVar = new sq(this);
                this.f = sqVar;
                return sqVar;
            } else if (i >= 26) {
                ri6 ri6Var2 = new ri6(this, (byte) 5);
                this.f = ri6Var2;
                return ri6Var2;
            } else {
                return ri6Var;
            }
        }
        return ri6Var;
    }

    public ColorStateList getSupportBackgroundTintList() {
        lo loVar = this.a;
        if (loVar != null) {
            return loVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        lo loVar = this.a;
        if (loVar != null) {
            return loVar.f();
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
                    c0f.a(this);
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
        iq iqVar;
        if (Build.VERSION.SDK_INT < 28 && (iqVar = this.c) != null) {
            TextClassifier textClassifier = iqVar.b;
            if (textClassifier == null) {
                return hq.a(iqVar.a);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public nj8 getTextMetricsParamsCompat() {
        return c0f.a(this);
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        qq.h(editorInfo, onCreateInputConnection, this);
        xqd.a(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        qq qqVar = this.b;
        if (qqVar != null && !fjc.b) {
            qqVar.i.a();
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
                    c0f.a(this);
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
        qq qqVar = this.b;
        if (qqVar != null) {
            ar arVar = qqVar.i;
            if (!fjc.b && arVar.f()) {
                arVar.a();
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
        if (fjc.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.i(i, i2, i3, i4);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (fjc.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.j(iArr, i);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (fjc.b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.k(i);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        lo loVar = this.a;
        if (loVar != null) {
            loVar.h();
        }
    }

    @Override
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        lo loVar = this.a;
        if (loVar != null) {
            loVar.i(i);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.b();
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
            drawable = yqd.a(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = yqd.a(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = yqd.a(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = yqd.a(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.b();
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
            drawable = yqd.a(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = yqd.a(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = yqd.a(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = yqd.a(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c0f.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((vje) getEmojiTextViewHelper().b.b).a(inputFilterArr));
    }

    @Override
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i);
        } else {
            c0f.b(this, i);
        }
    }

    @Override
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i);
        } else {
            c0f.c(this, i);
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
        iy8.d();
    }

    public void setPrecomputedText(oj8 oj8Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        c0f.a(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        lo loVar = this.a;
        if (loVar != null) {
            loVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        lo loVar = this.a;
        if (loVar != null) {
            loVar.n(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        qq qqVar = this.b;
        qqVar.l(colorStateList);
        qqVar.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        qq qqVar = this.b;
        qqVar.m(mode);
        qqVar.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.g(context, i);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        iq iqVar;
        if (Build.VERSION.SDK_INT < 28 && (iqVar = this.c) != null) {
            iqVar.b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<oj8> future) {
        this.h = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(nj8 nj8Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = nj8Var.b;
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
        getPaint().set(nj8Var.a);
        setBreakStrategy(nj8Var.c);
        setHyphenationFrequency(nj8Var.d);
    }

    @Override
    public final void setTextSize(int i, float f) {
        boolean z = fjc.b;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            ar arVar = qqVar.i;
            if (!z && !arVar.f()) {
                arVar.g(f, i);
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
            p1f p1fVar = r7c.a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i);
            } else {
                lq5.j("Context cannot be null");
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
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    public tq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }
}
