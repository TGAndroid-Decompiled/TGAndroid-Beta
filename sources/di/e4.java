package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class e4 extends ClickableSpan {
    public final int f8701a;

    public e4(int i7) {
        this.f8701a = i7;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f8701a) {
            case 0:
                return;
            default:
                vf.c.t(view.getContext(), "https://t.me/BotFather");
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f8701a) {
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
