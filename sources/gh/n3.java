package gh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class n3 extends ClickableSpan {
    public final int f8600a;

    public n3(int i9) {
        this.f8600a = i9;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f8600a) {
            case 0:
                return;
            default:
                ve.e.s(view.getContext(), "https://t.me/BotFather");
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f8600a) {
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
