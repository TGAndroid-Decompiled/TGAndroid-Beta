package hh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

public final class m3 extends ClickableSpan {

    public final int f9713a;

    public m3(int i10) {
        this.f9713a = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9713a) {
            case 0:
                break;
            default:
                we.e.s(view.getContext(), "https://t.me/BotFather");
                break;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f9713a) {
            case 0:
                textPaint.setUnderlineText(false);
                textPaint.setColor(-1);
                break;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
        }
    }

    private final void a(View view) {
    }
}
