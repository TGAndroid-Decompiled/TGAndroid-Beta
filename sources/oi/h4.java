package oi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.cu;
import org.telegram.messenger.ev;
import org.telegram.messenger.j10;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.i6;
public final class h4 extends ReplacementSpan {
    public final TL_iv.textButton f22089a;
    public cu f22090b;
    public View f22091c;
    public int d = j10.f24770t0;
    public i6 f22092e;

    public h4(TL_iv.textButton textbutton) {
        this.f22089a = textbutton;
    }

    public static boolean c(TL_keyboard.InlineButtonType inlineButtonType) {
        if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile)) {
            return false;
        }
        return true;
    }

    public final void a(int i7, View view, i6 i6Var) {
        View view2;
        cu cuVar = this.f22090b;
        if (cuVar != null && (view2 = this.f22091c) != null) {
            cuVar.b(view2);
        }
        this.f22091c = view;
        this.d = i7;
        this.f22092e = i6Var;
        this.f22090b = null;
        b();
    }

    public final cu b() {
        if (this.f22090b == null) {
            int i7 = this.d;
            int L = org.telegram.messenger.g0.L(240.0f);
            cu cuVar = new cu(new ev(i7, L, this.f22092e), L, this.f22089a, Boolean.FALSE);
            this.f22090b = cuVar;
            View view = this.f22091c;
            if (view != null) {
                cuVar.a(view);
            }
        }
        return this.f22090b;
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
