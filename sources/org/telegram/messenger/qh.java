package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class qh implements Runnable {
    public final int f21337a = 0;
    public final RichMessageLayout.Text f21338b;
    public final RichMessageLayout f21339c;
    public final View d;

    public qh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f21338b = text;
        this.d = view;
        this.f21339c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f21337a) {
            case 0:
                this.f21338b.lambda$revealSpoilers$4(this.d, this.f21339c);
                return;
            default:
                this.f21338b.lambda$revealSpoilers$3(this.f21339c, this.d);
                return;
        }
    }

    public qh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f21338b = text;
        this.f21339c = richMessageLayout;
        this.d = view;
    }
}
