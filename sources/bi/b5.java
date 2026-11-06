package bi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class b5 extends ClickableSpan {
    public final int f3510a;

    public b5(int i7) {
        this.f3510a = i7;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3510a) {
            case 0:
                return;
            default:
                vf.c.t(view.getContext(), "https://t.me/BotFather");
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f3510a) {
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
