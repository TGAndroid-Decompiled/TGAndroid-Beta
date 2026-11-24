package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class o82 extends ClickableSpan {
    public final byte a;

    public o82(byte b) {
        this.a = b;
    }

    @Override
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                d01.t(view.getContext(), "https://t.me/BotFather");
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            default:
                textPaint.setUnderlineText(false);
                textPaint.setColor(-1);
                return;
        }
    }

    private final void a(View view) {
    }
}
