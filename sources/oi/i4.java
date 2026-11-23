package oi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.cu;
import org.telegram.messenger.ev;
import org.telegram.messenger.i10;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.i6;
public final class i4 extends ReplacementSpan {
    public final TL_iv.textButton f22250a;
    public cu f22251b;
    public View f22252c;
    public int d = i10.f24637t0;
    public i6 f22253e;

    public i4(TL_iv.textButton textbutton) {
        this.f22250a = textbutton;
    }

    public static boolean c(TL_keyboard.InlineButtonType inlineButtonType) {
        if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile)) {
            return false;
        }
        return true;
    }

    public final void a(int i7, View view, i6 i6Var) {
        View view2;
        cu cuVar = this.f22251b;
        if (cuVar != null && (view2 = this.f22252c) != null) {
            cuVar.h = null;
            cuVar.f23534a.f23057a.f(view2);
        }
        this.f22252c = view;
        this.d = i7;
        this.f22253e = i6Var;
        this.f22251b = null;
        b();
    }

    public final cu b() {
        if (this.f22251b == null) {
            int i7 = this.d;
            int L = org.telegram.messenger.g0.L(240.0f);
            cu cuVar = new cu(new ev(i7, L, this.f22253e), L, this.f22250a, Boolean.FALSE);
            this.f22251b = cuVar;
            View view = this.f22252c;
            if (view != null) {
                cuVar.h = view;
                cuVar.f23534a.a(view);
            }
        }
        return this.f22251b;
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
