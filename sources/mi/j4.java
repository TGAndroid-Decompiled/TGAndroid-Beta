package mi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.au;
import org.telegram.messenger.cv;
import org.telegram.messenger.h10;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class j4 extends ReplacementSpan {
    public final TL_iv.textButton f19703a;
    public au f19704b;
    public View f19705c;
    public int d = h10.f22829t0;
    public org.telegram.ui.ActionBar.e6 f19706e;

    public j4(TL_iv.textButton textbutton) {
        this.f19703a = textbutton;
    }

    public static boolean c(TL_keyboard.InlineButtonType inlineButtonType) {
        if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile)) {
            return false;
        }
        return true;
    }

    public final void a(int i3, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        View view2;
        au auVar = this.f19704b;
        if (auVar != null && (view2 = this.f19705c) != null) {
            auVar.h = null;
            auVar.f21585a.f26633a.f(view2);
        }
        this.f19705c = view;
        this.d = i3;
        this.f19706e = e6Var;
        this.f19704b = null;
        b();
    }

    public final au b() {
        if (this.f19704b == null) {
            int i3 = this.d;
            int L = org.telegram.messenger.g0.L(240.0f);
            au auVar = new au(new cv(i3, L, this.f19706e), L, this.f19703a, Boolean.FALSE);
            this.f19704b = auVar;
            View view = this.f19705c;
            if (view != null) {
                auVar.a(view);
            }
        }
        return this.f19704b;
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
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        b().draw(canvas, charSequence, i3, i10, f10, i11, i12, i13, paint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return b().getSize(paint, charSequence, i3, i10, fontMetricsInt);
    }
}
