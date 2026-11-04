package ci;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class k4 extends ClickableSpan {
    public final int f5379a;

    public k4(int i3) {
        this.f5379a = i3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5379a) {
            case 0:
                return;
            default:
                sf.c.t(view.getContext(), "https://t.me/BotFather");
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f5379a) {
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
