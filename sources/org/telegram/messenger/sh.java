package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class sh implements Runnable {
    public final int f19505a = 0;
    public final RichMessageLayout.Text f19506b;
    public final RichMessageLayout f19507c;
    public final View d;

    public sh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f19506b = text;
        this.d = view;
        this.f19507c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f19505a) {
            case 0:
                this.f19506b.lambda$revealSpoilers$4(this.d, this.f19507c);
                return;
            default:
                this.f19506b.lambda$revealSpoilers$3(this.f19507c, this.d);
                return;
        }
    }

    public sh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f19506b = text;
        this.f19507c = richMessageLayout;
        this.d = view;
    }
}
