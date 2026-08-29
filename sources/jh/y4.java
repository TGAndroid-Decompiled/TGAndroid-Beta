package jh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class y4 implements View.OnClickListener {
    public final int f13124a;
    public final d5 f13125b;

    public y4(d5 d5Var, int i10) {
        this.f13124a = i10;
        this.f13125b = d5Var;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.f13124a) {
            case 0:
                CharSequence text = this.f13125b.v.getText();
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
                d5 d5Var = this.f13125b;
                if (d5Var.J.getVisibility() == 0 && (onClickListener = d5Var.P) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
