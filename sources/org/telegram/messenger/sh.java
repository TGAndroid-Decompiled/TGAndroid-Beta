package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class sh implements Runnable {
    public final int f19502a = 0;
    public final RichMessageLayout.Text f19503b;
    public final RichMessageLayout f19504c;
    public final View d;

    public sh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f19503b = text;
        this.d = view;
        this.f19504c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f19502a) {
            case 0:
                this.f19503b.lambda$revealSpoilers$4(this.d, this.f19504c);
                return;
            default:
                this.f19503b.lambda$revealSpoilers$3(this.f19504c, this.d);
                return;
        }
    }

    public sh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f19503b = text;
        this.f19504c = richMessageLayout;
        this.d = view;
    }
}
