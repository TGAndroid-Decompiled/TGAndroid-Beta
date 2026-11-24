package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class mf9 extends ReplacementSpan {
    public final TL_iv.textButton a;
    public qg9 b;
    public View c;
    public int d = y6c.t0;
    public wjb e;

    public mf9(TL_iv.textButton textbutton) {
        this.a = textbutton;
    }

    public static boolean c(TL_keyboard.InlineButtonType inlineButtonType) {
        if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile)) {
            return false;
        }
        return true;
    }

    public final void a(int i, wjb wjbVar, View view) {
        View view2;
        qg9 qg9Var = this.b;
        if (qg9Var != null && (view2 = this.c) != null) {
            qg9Var.h = null;
            qg9Var.a.a.f(view2);
        }
        this.c = view;
        this.d = i;
        this.e = wjbVar;
        this.b = null;
        b();
    }

    public final qg9 b() {
        if (this.b == null) {
            int i = this.d;
            int L = gl.L(240.0f);
            qg9 qg9Var = new qg9(new rh9(i, L, this.e), L, this.a, Boolean.FALSE);
            this.b = qg9Var;
            View view = this.c;
            if (view != null) {
                qg9Var.a(view);
            }
        }
        return this.b;
    }

    public final void d(Editable editable) {
        ReplacementSpan[] replacementSpanArr;
        int spanStart = editable.getSpanStart(this);
        int spanEnd = editable.getSpanEnd(this);
        if (spanStart >= 0 && spanEnd > spanStart) {
            for (ReplacementSpan replacementSpan : (ReplacementSpan[]) editable.getSpans(spanStart, spanEnd, ReplacementSpan.class)) {
                if (replacementSpan != this) {
                    int spanStart2 = editable.getSpanStart(replacementSpan);
                    int spanEnd2 = editable.getSpanEnd(replacementSpan);
                    if (spanStart2 < spanEnd && spanEnd2 > spanStart) {
                        editable.removeSpan(replacementSpan);
                    }
                }
            }
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        b().draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return b().getSize(paint, charSequence, i, i2, fontMetricsInt);
    }
}
