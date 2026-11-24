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
public class sq extends TextView implements zob {
    public final ko a;
    public final pq b;
    public final hq c;
    public ip d;
    public boolean e;
    public l69 f;
    public Future h;

    public sq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        xob.a(context);
        this.e = false;
        this.f = null;
        cnb.a(getContext(), this);
        ko koVar = new ko(this);
        this.a = koVar;
        koVar.g(attributeSet, i);
        pq pqVar = new pq(this);
        this.b = pqVar;
        pqVar.f(attributeSet, i);
        pqVar.b();
        ?? obj = new Object();
        obj.a = this;
        this.c = obj;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private ip getEmojiTextViewHelper() {
        ip ipVar = this.d;
        if (ipVar == null) {
            ip ipVar2 = new ip(this);
            this.d = ipVar2;
            return ipVar2;
        }
        return ipVar;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ko koVar = this.a;
        if (koVar != null) {
            koVar.b();
        }
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (gfc.b) {
            return super.getAutoSizeMaxTextSize();
        }
        pq pqVar = this.b;
        if (pqVar != null) {
            return Math.round(pqVar.i.e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (gfc.b) {
            return super.getAutoSizeMinTextSize();
        }
        pq pqVar = this.b;
        if (pqVar != null) {
            return Math.round(pqVar.i.d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (gfc.b) {
            return super.getAutoSizeStepGranularity();
        }
        pq pqVar = this.b;
        if (pqVar != null) {
            return Math.round(pqVar.i.c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (gfc.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        pq pqVar = this.b;
        if (pqVar != null) {
            return pqVar.i.f;
        }
        return new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (gfc.b) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        pq pqVar = this.b;
        if (pqVar != null) {
            return pqVar.i.a;
        }
        return 0;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return kve.d(super.getCustomSelectionActionModeCallback());
    }

    @Override
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public qq getSuperCaller() {
        l69 l69Var = this.f;
        if (l69Var == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                rq rqVar = new rq(this);
                this.f = rqVar;
                return rqVar;
            } else if (i >= 26) {
                l69 l69Var2 = new l69(this, (byte) 6);
                this.f = l69Var2;
                return l69Var2;
            } else {
                return l69Var;
            }
        }
        return l69Var;
    }

    public ColorStateList getSupportBackgroundTintList() {
        ko koVar = this.a;
        if (koVar != null) {
            return koVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ko koVar = this.a;
        if (koVar != null) {
            return koVar.f();
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
                    kve.a(this);
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
        hq hqVar;
        if (Build.VERSION.SDK_INT < 28 && (hqVar = this.c) != null) {
            TextClassifier textClassifier = hqVar.b;
            if (textClassifier == null) {
                return gq.a(hqVar.a);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public zf8 getTextMetricsParamsCompat() {
        return kve.a(this);
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        pq.h(editorInfo, onCreateInputConnection, this);
        gmd.a(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        pq pqVar = this.b;
        if (pqVar != null && !gfc.b) {
            pqVar.i.a();
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
                    kve.a(this);
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
        pq pqVar = this.b;
        if (pqVar != null) {
            zq zqVar = pqVar.i;
            if (!gfc.b && zqVar.f()) {
                zqVar.a();
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
        if (gfc.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.i(i, i2, i3, i4);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (gfc.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.j(iArr, i);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (gfc.b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.k(i);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ko koVar = this.a;
        if (koVar != null) {
            koVar.h();
        }
    }

    @Override
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ko koVar = this.a;
        if (koVar != null) {
            koVar.i(i);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.b();
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
            drawable = hmd.a(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = hmd.a(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = hmd.a(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = hmd.a(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.b();
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
            drawable = hmd.a(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = hmd.a(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = hmd.a(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = hmd.a(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(kve.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((efe) getEmojiTextViewHelper().b.a).a(inputFilterArr));
    }

    @Override
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().i(i);
        } else {
            kve.b(this, i);
        }
    }

    @Override
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i);
        } else {
            kve.c(this, i);
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
        sc8.e();
    }

    public void setPrecomputedText(ag8 ag8Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        kve.a(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ko koVar = this.a;
        if (koVar != null) {
            koVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ko koVar = this.a;
        if (koVar != null) {
            koVar.n(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        pq pqVar = this.b;
        pqVar.l(colorStateList);
        pqVar.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        pq pqVar = this.b;
        pqVar.m(mode);
        pqVar.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.g(context, i);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        hq hqVar;
        if (Build.VERSION.SDK_INT < 28 && (hqVar = this.c) != null) {
            hqVar.b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<ag8> future) {
        this.h = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(zf8 zf8Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = zf8Var.b;
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
        getPaint().set(zf8Var.a);
        setBreakStrategy(zf8Var.c);
        setHyphenationFrequency(zf8Var.d);
    }

    @Override
    public final void setTextSize(int i, float f) {
        boolean z = gfc.b;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        pq pqVar = this.b;
        if (pqVar != null) {
            zq zqVar = pqVar.i;
            if (!z && !zqVar.f()) {
                zqVar.g(f, i);
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
            vwe vweVar = s3c.a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i);
            } else {
                w26.j("Context cannot be null");
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
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.b();
        }
    }

    public sq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }
}
