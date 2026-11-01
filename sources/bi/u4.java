package bi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.e20;
import org.telegram.messenger.uu;
import org.telegram.messenger.wv;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class u4 extends ReplacementSpan {
    public final TL_iv.textButton f3385a;
    public uu f3386b;
    public View f3387c;
    public int d = e20.f15506s0;
    public org.telegram.ui.ActionBar.p6 e;

    public u4(TL_iv.textButton textbutton) {
        this.f3385a = textbutton;
    }

    public static boolean c(TL_keyboard.InlineButtonType inlineButtonType) {
        if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile)) {
            return false;
        }
        return true;
    }

    public final void a(int i10, View view, org.telegram.ui.ActionBar.p6 p6Var) {
        View view2;
        uu uuVar = this.f3386b;
        if (uuVar != null && (view2 = this.f3387c) != null) {
            uuVar.h = null;
            uuVar.f18476a.f18144a.f(view2);
        }
        this.f3387c = view;
        this.d = i10;
        this.e = p6Var;
        this.f3386b = null;
        b();
    }

    public final uu b() {
        if (this.f3386b == null) {
            int i10 = this.d;
            int L = org.telegram.messenger.i0.L(240.0f);
            uu uuVar = new uu(new wv(i10, L, this.e), L, this.f3385a, Boolean.FALSE);
            this.f3386b = uuVar;
            View view = this.f3387c;
            if (view != null) {
                uuVar.a(view);
            }
        }
        return this.f3386b;
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
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        b().draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return b().getSize(paint, charSequence, i10, i11, fontMetricsInt);
    }
}
