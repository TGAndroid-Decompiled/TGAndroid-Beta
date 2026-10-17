package ai;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class y6 implements View.OnClickListener {
    public final int f2489a;
    public final e7 f2490b;

    public y6(e7 e7Var, int i10) {
        this.f2489a = i10;
        this.f2490b = e7Var;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.f2489a) {
            case 0:
                CharSequence text = this.f2490b.v.getText();
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
                e7 e7Var = this.f2490b;
                if (e7Var.O.getVisibility() == 0 && (onClickListener = e7Var.U) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
