package gh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class b5 implements View.OnClickListener {
    public final int f7853a;
    public final g5 f7854b;

    public b5(g5 g5Var, int i9) {
        this.f7853a = i9;
        this.f7854b = g5Var;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.f7853a) {
            case 0:
                CharSequence text = this.f7854b.v.getText();
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
                g5 g5Var = this.f7854b;
                if (g5Var.J.getVisibility() == 0 && (onClickListener = g5Var.P) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
