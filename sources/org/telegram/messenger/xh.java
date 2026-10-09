package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class xh implements Runnable {
    public final int f19827a = 0;
    public final RichMessageLayout.Text f19828b;
    public final RichMessageLayout f19829c;
    public final View d;

    public xh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f19828b = text;
        this.d = view;
        this.f19829c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f19827a) {
            case 0:
                this.f19828b.lambda$revealSpoilers$4(this.d, this.f19829c);
                return;
            default:
                this.f19828b.lambda$revealSpoilers$3(this.f19829c, this.d);
                return;
        }
    }

    public xh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f19828b = text;
        this.f19829c = richMessageLayout;
        this.d = view;
    }
}
