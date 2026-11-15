package oi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.fu;
import org.telegram.messenger.iv;
import org.telegram.messenger.m10;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e6;
public final class f4 extends ReplacementSpan {
    public final TL_iv.textButton f21697a;
    public fu f21698b;
    public View f21699c;
    public int d = m10.f24934t0;
    public e6 f21700e;

    public f4(TL_iv.textButton textbutton) {
        this.f21697a = textbutton;
    }

    public static boolean c(TL_keyboard.InlineButtonType inlineButtonType) {
        if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile)) {
            return false;
        }
        return true;
    }

    public final void a(int i7, View view, e6 e6Var) {
        View view2;
        fu fuVar = this.f21698b;
        if (fuVar != null && (view2 = this.f21699c) != null) {
            fuVar.b(view2);
        }
        this.f21699c = view;
        this.d = i7;
        this.f21700e = e6Var;
        this.f21698b = null;
        b();
    }

    public final fu b() {
        if (this.f21698b == null) {
            int i7 = this.d;
            int L = org.telegram.messenger.g0.L(240.0f);
            fu fuVar = new fu(new iv(i7, L, this.f21700e), L, this.f21697a, Boolean.FALSE);
            this.f21698b = fuVar;
            View view = this.f21699c;
            if (view != null) {
                fuVar.a(view);
            }
        }
        return this.f21698b;
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
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        b().draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return b().getSize(paint, charSequence, i7, i10, fontMetricsInt);
    }
}
