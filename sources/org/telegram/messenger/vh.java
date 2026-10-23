package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class vh implements Runnable {
    public final int f19773a = 0;
    public final RichMessageLayout.Text f19774b;
    public final RichMessageLayout f19775c;
    public final View d;

    public vh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f19774b = text;
        this.d = view;
        this.f19775c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f19773a) {
            case 0:
                this.f19774b.lambda$revealSpoilers$4(this.d, this.f19775c);
                return;
            default:
                this.f19774b.lambda$revealSpoilers$3(this.f19775c, this.d);
                return;
        }
    }

    public vh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f19774b = text;
        this.f19775c = richMessageLayout;
        this.d = view;
    }
}
