package ai;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class e5 extends ClickableSpan {
    public final int f1206a;

    public e5(int i10) {
        this.f1206a = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1206a) {
            case 0:
                return;
            default:
                pf.d.r(view.getContext(), "https://t.me/BotFather");
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f1206a) {
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
