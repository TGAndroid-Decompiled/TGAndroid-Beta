package defpackage;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class osa implements View.OnClickListener {
    public final byte a;
    public final ssa b;

    public osa(ssa ssaVar, byte b) {
        this.a = b;
        this.b = ssaVar;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        byte b = this.a;
        ssa ssaVar = this.b;
        switch (b) {
            case 0:
                CharSequence text = ssaVar.w.getText();
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
                if (ssaVar.P.getVisibility() == 0 && (onClickListener = ssaVar.a0) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
