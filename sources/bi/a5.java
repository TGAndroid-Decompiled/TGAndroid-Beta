package bi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a5 extends ClickableSpan {
    public final int f4259a;

    public a5(int i10) {
        this.f4259a = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f4259a) {
            case 0:
                return;
            default:
                qf.d.r(view.getContext(), "https://t.me/BotFather");
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f4259a) {
            case 0:
                textPaint.setUnderlineText(false);
                textPaint.setColor(-1);
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
        }
    }

    private final void a(View view) {
    }
}
