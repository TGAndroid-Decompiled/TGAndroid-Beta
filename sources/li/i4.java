package li;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.iu;
import org.telegram.messenger.kv;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.h6;
public final class i4 extends ReplacementSpan {
    public final TL_iv.textButton f18644a;
    public iu f18645b;
    public View f18646c;
    public int d = p10.f24474s0;
    public h6 f18647e;

    public i4(TL_iv.textButton textbutton) {
        this.f18644a = textbutton;
    }

    public static boolean c(TL_keyboard.InlineButtonType inlineButtonType) {
        if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile)) {
            return false;
        }
        return true;
    }

    public final void a(int i7, View view, h6 h6Var) {
        View view2;
        iu iuVar = this.f18645b;
        if (iuVar != null && (view2 = this.f18646c) != null) {
            iuVar.b(view2);
        }
        this.f18646c = view;
        this.d = i7;
        this.f18647e = h6Var;
        this.f18645b = null;
        b();
    }

    public final iu b() {
        if (this.f18645b == null) {
            int i7 = this.d;
            int L = org.telegram.messenger.g0.L(240.0f);
            iu iuVar = new iu(new kv(i7, L, this.f18647e), L, this.f18644a, Boolean.FALSE);
            this.f18645b = iuVar;
            View view = this.f18646c;
            if (view != null) {
                iuVar.a(view);
            }
        }
        return this.f18645b;
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
