package lh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class x4 implements View.OnClickListener {
    public final int f13346a;
    public final c5 f13347b;

    public x4(c5 c5Var, int i10) {
        this.f13346a = i10;
        this.f13347b = c5Var;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.f13346a) {
            case 0:
                CharSequence text = this.f13347b.v.getText();
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
                c5 c5Var = this.f13347b;
                if (c5Var.K.getVisibility() == 0 && (onClickListener = c5Var.Q) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
