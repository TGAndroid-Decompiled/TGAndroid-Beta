package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class w extends ClickableSpan {
    public final int f26143a;
    public final Runnable f26144b;

    public w(int i3, Runnable runnable) {
        this.f26143a = i3;
        this.f26144b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26143a) {
            case 0:
                Runnable runnable = this.f26144b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Runnable runnable2 = this.f26144b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                this.f26144b.run();
                return;
            case 3:
                Runnable runnable3 = this.f26144b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 4:
                Runnable runnable4 = this.f26144b;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            default:
                Runnable runnable5 = this.f26144b;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f26143a) {
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
