package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class wh implements Runnable {
    public final int f20066a = 0;
    public final RichMessageLayout.Text f20067b;
    public final RichMessageLayout f20068c;
    public final View d;

    public wh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f20067b = text;
        this.d = view;
        this.f20068c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f20066a) {
            case 0:
                this.f20067b.lambda$revealSpoilers$4(this.d, this.f20068c);
                return;
            default:
                this.f20067b.lambda$revealSpoilers$3(this.f20068c, this.d);
                return;
        }
    }

    public wh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f20067b = text;
        this.f20068c = richMessageLayout;
        this.d = view;
    }
}
