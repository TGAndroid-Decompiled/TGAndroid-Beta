package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class uh implements Runnable {
    public final int f19674a = 0;
    public final RichMessageLayout.Text f19675b;
    public final RichMessageLayout f19676c;
    public final View d;

    public uh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f19675b = text;
        this.d = view;
        this.f19676c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f19674a) {
            case 0:
                this.f19675b.lambda$revealSpoilers$4(this.d, this.f19676c);
                return;
            default:
                this.f19675b.lambda$revealSpoilers$3(this.f19676c, this.d);
                return;
        }
    }

    public uh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f19675b = text;
        this.f19676c = richMessageLayout;
        this.d = view;
    }
}
