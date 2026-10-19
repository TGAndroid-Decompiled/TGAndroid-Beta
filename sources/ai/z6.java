package ai;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class z6 implements View.OnClickListener {
    public final int f2540a;
    public final f7 f2541b;

    public z6(f7 f7Var, int i10) {
        this.f2540a = i10;
        this.f2541b = f7Var;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.f2540a) {
            case 0:
                CharSequence text = this.f2541b.v.getText();
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
                f7 f7Var = this.f2541b;
                if (f7Var.O.getVisibility() == 0 && (onClickListener = f7Var.W) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
