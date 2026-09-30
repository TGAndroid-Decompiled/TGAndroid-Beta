package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class xh implements Runnable {
    public final int f18144a = 0;
    public final RichMessageLayout.Text f18145b;
    public final RichMessageLayout f18146c;
    public final View d;

    public xh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f18145b = text;
        this.d = view;
        this.f18146c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f18144a) {
            case 0:
                this.f18145b.lambda$revealSpoilers$4(this.d, this.f18146c);
                return;
            default:
                this.f18145b.lambda$revealSpoilers$3(this.f18146c, this.d);
                return;
        }
    }

    public xh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f18145b = text;
        this.f18146c = richMessageLayout;
        this.d = view;
    }
}
