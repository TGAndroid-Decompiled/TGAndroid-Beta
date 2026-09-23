package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class xh implements Runnable {
    public final int f17878a = 0;
    public final RichMessageLayout.Text f17879b;
    public final RichMessageLayout f17880c;
    public final View d;

    public xh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f17879b = text;
        this.d = view;
        this.f17880c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f17878a) {
            case 0:
                this.f17879b.lambda$revealSpoilers$4(this.d, this.f17880c);
                return;
            default:
                this.f17879b.lambda$revealSpoilers$3(this.f17880c, this.d);
                return;
        }
    }

    public xh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f17879b = text;
        this.f17880c = richMessageLayout;
        this.d = view;
    }
}
