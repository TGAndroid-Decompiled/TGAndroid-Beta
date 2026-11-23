package oi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.du;
import org.telegram.messenger.fv;
import org.telegram.messenger.k10;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.h6;
public final class h4 extends ReplacementSpan {
    public final TL_iv.textButton f22119a;
    public du f22120b;
    public View f22121c;
    public int d = k10.f24932t0;
    public h6 f22122e;

    public h4(TL_iv.textButton textbutton) {
        this.f22119a = textbutton;
    }

    public static boolean c(TL_keyboard.InlineButtonType inlineButtonType) {
        if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile)) {
            return false;
        }
        return true;
    }

    public final void a(int i7, View view, h6 h6Var) {
        View view2;
        du duVar = this.f22120b;
        if (duVar != null && (view2 = this.f22121c) != null) {
            duVar.b(view2);
        }
        this.f22121c = view;
        this.d = i7;
        this.f22122e = h6Var;
        this.f22120b = null;
        b();
    }

    public final du b() {
        if (this.f22120b == null) {
            int i7 = this.d;
            int L = org.telegram.messenger.g0.L(240.0f);
            du duVar = new du(new fv(i7, L, this.f22122e), L, this.f22119a, Boolean.FALSE);
            this.f22120b = duVar;
            View view = this.f22121c;
            if (view != null) {
                duVar.a(view);
            }
        }
        return this.f22120b;
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
