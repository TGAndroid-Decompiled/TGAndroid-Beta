package defpackage;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class oua implements View.OnClickListener {
    public final byte a;
    public final sua b;

    public oua(sua suaVar, byte b) {
        this.a = b;
        this.b = suaVar;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        byte b = this.a;
        sua suaVar = this.b;
        switch (b) {
            case 0:
                CharSequence text = suaVar.w.getText();
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
                if (suaVar.P.getVisibility() == 0 && (onClickListener = suaVar.a0) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
