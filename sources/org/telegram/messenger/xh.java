package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class xh implements Runnable {
    public final int f18143a = 0;
    public final RichMessageLayout.Text f18144b;
    public final RichMessageLayout f18145c;
    public final View d;

    public xh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f18144b = text;
        this.d = view;
        this.f18145c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f18143a) {
            case 0:
                this.f18144b.lambda$revealSpoilers$4(this.d, this.f18145c);
                return;
            default:
                this.f18144b.lambda$revealSpoilers$3(this.f18145c, this.d);
                return;
        }
    }

    public xh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f18144b = text;
        this.f18145c = richMessageLayout;
        this.d = view;
    }
}
