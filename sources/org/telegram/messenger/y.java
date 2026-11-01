package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class y extends ClickableSpan {
    public final int f19508a;
    public final Runnable f19509b;

    public y(int i10, Runnable runnable) {
        this.f19508a = i10;
        this.f19509b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19508a) {
            case 0:
                Runnable runnable = this.f19509b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Runnable runnable2 = this.f19509b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                this.f19509b.run();
                return;
            case 3:
                Runnable runnable3 = this.f19509b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 4:
                Runnable runnable4 = this.f19509b;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            default:
                Runnable runnable5 = this.f19509b;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f19508a) {
            case 0:
                textPaint.setUnderlineText(false);
                textPaint.setColor(textPaint.linkColor);
                return;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 2:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 3:
                textPaint.setUnderlineText(false);
                return;
            case 4:
                textPaint.setUnderlineText(false);
                return;
            default:
                textPaint.setUnderlineText(false);
                return;
        }
    }
}
