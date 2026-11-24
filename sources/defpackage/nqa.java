package defpackage;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class nqa implements View.OnClickListener {
    public final byte a;
    public final rqa b;

    public nqa(rqa rqaVar, byte b) {
        this.a = b;
        this.b = rqaVar;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        byte b = this.a;
        rqa rqaVar = this.b;
        switch (b) {
            case 0:
                CharSequence text = rqaVar.w.getText();
                if (text instanceof Spanned) {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    if (clickableSpanArr.length > 0) {
                        clickableSpanArr[0].onClick(view);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (rqaVar.P.getVisibility() == 0 && (onClickListener = rqaVar.a0) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
