package bi;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class y6 implements View.OnClickListener {
    public final int f5076a;
    public final e7 f5077b;

    public y6(e7 e7Var, int i7) {
        this.f5076a = i7;
        this.f5077b = e7Var;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.f5076a) {
            case 0:
                CharSequence text = this.f5077b.f3794w.getText();
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
                e7 e7Var = this.f5077b;
                if (e7Var.O.getVisibility() == 0 && (onClickListener = e7Var.W) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
