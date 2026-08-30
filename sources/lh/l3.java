package lh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class l3 extends ClickableSpan {
    public final int f12748a;

    public l3(int i10) {
        this.f12748a = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f12748a) {
            case 0:
                return;
            default:
                af.g.s(view.getContext(), "https://t.me/BotFather");
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f12748a) {
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
