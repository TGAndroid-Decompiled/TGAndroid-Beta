package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class sh implements Runnable {
    public final int f19504a = 0;
    public final RichMessageLayout.Text f19505b;
    public final RichMessageLayout f19506c;
    public final View d;

    public sh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f19505b = text;
        this.d = view;
        this.f19506c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f19504a) {
            case 0:
                this.f19505b.lambda$revealSpoilers$4(this.d, this.f19506c);
                return;
            default:
                this.f19505b.lambda$revealSpoilers$3(this.f19506c, this.d);
                return;
        }
    }

    public sh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f19505b = text;
        this.f19506c = richMessageLayout;
        this.d = view;
    }
}
