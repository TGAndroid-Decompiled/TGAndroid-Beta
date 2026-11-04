package ci;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a6 implements View.OnClickListener {
    public final int f4826a;
    public final f6 f4827b;

    public a6(f6 f6Var, int i3) {
        this.f4826a = i3;
        this.f4827b = f6Var;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.f4826a) {
            case 0:
                CharSequence text = this.f4827b.f5112w.getText();
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
                f6 f6Var = this.f4827b;
                if (f6Var.P.getVisibility() == 0 && (onClickListener = f6Var.f5084a0) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
