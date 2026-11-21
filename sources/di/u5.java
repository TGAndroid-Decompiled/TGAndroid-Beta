package di;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class u5 implements View.OnClickListener {
    public final int f9894a;
    public final z5 f9895b;

    public u5(z5 z5Var, int i7) {
        this.f9894a = i7;
        this.f9895b = z5Var;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.f9894a) {
            case 0:
                CharSequence text = this.f9895b.f10169w.getText();
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
                z5 z5Var = this.f9895b;
                if (z5Var.P.getVisibility() == 0 && (onClickListener = z5Var.f10141a0) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
