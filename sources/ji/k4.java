package ji;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class k4 extends ReplacementSpan {
    public final TL_iv.textButton f14017a;
    public RichMessageLayout.RichButtonSpan f14018b;
    public View f14019c;
    public int d = UserConfig.selectedAccount;
    public org.telegram.ui.ActionBar.f6 f14020e;

    public k4(TL_iv.textButton textbutton) {
        this.f14017a = textbutton;
    }

    public static boolean c(TL_keyboard.InlineButtonType inlineButtonType) {
        if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile)) {
            return false;
        }
        return true;
    }

    public final void a(int i10, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        View view2;
        RichMessageLayout.RichButtonSpan richButtonSpan = this.f14018b;
        if (richButtonSpan != null && (view2 = this.f14019c) != null) {
            richButtonSpan.detach(view2);
        }
        this.f14019c = view;
        this.d = i10;
        this.f14020e = f6Var;
        this.f14018b = null;
        b();
    }

    public final RichMessageLayout.RichButtonSpan b() {
        if (this.f14018b == null) {
            RichMessageLayout.RichButtonSpan createEditorButtonSpan = RichMessageLayout.createEditorButtonSpan(this.d, AndroidUtilities.dp(240.0f), this.f14020e, this.f14017a);
            this.f14018b = createEditorButtonSpan;
            View view = this.f14019c;
            if (view != null) {
                createEditorButtonSpan.attach(view);
            }
        }
        return this.f14018b;
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
