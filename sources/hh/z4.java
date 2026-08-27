package hh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;

public final class z4 implements View.OnClickListener {

    public final int f10421a;

    public final e5 f10422b;

    public z4(e5 e5Var, int i10) {
        this.f10421a = i10;
        this.f10422b = e5Var;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.f10421a) {
            case 0:
                CharSequence text = this.f10422b.v.getText();
                if (text instanceof Spanned) {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    if (clickableSpanArr.length > 0) {
                        clickableSpanArr[0].onClick(view);
                    }
                    break;
                }
                break;
            default:
                e5 e5Var = this.f10422b;
                if (e5Var.J.getVisibility() == 0 && (onClickListener = e5Var.P) != null) {
                    onClickListener.onClick(view);
                }
                break;
        }
    }
}
