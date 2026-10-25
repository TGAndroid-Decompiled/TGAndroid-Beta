package bi;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class v6 implements View.OnClickListener {
    public final int f5561a;
    public final b7 f5562b;

    public v6(b7 b7Var, int i10) {
        this.f5561a = i10;
        this.f5562b = b7Var;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.f5561a) {
            case 0:
                CharSequence text = this.f5562b.v.getText();
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
                b7 b7Var = this.f5562b;
                if (b7Var.O.getVisibility() == 0 && (onClickListener = b7Var.W) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
