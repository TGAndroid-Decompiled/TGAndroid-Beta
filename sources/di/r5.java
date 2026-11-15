package di;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class r5 implements View.OnClickListener {
    public final int f9325a;
    public final w5 f9326b;

    public r5(w5 w5Var, int i7) {
        this.f9325a = i7;
        this.f9326b = w5Var;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.f9325a) {
            case 0:
                CharSequence text = this.f9326b.f9675w.getText();
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
                w5 w5Var = this.f9326b;
                if (w5Var.P.getVisibility() == 0 && (onClickListener = w5Var.f9647a0) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
