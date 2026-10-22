package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class wh implements Runnable {
    public final int f20003a = 0;
    public final RichMessageLayout.Text f20004b;
    public final RichMessageLayout f20005c;
    public final View d;

    public wh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f20004b = text;
        this.d = view;
        this.f20005c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f20003a) {
            case 0:
                this.f20004b.lambda$revealSpoilers$4(this.d, this.f20005c);
                return;
            default:
                this.f20004b.lambda$revealSpoilers$3(this.f20005c, this.d);
                return;
        }
    }

    public wh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f20004b = text;
        this.f20005c = richMessageLayout;
        this.d = view;
    }
}
