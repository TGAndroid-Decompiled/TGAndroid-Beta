package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class xh implements Runnable {
    public final int f19858a = 0;
    public final RichMessageLayout.Text f19859b;
    public final RichMessageLayout f19860c;
    public final View d;

    public xh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f19859b = text;
        this.d = view;
        this.f19860c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f19858a) {
            case 0:
                this.f19859b.lambda$revealSpoilers$4(this.d, this.f19860c);
                return;
            default:
                this.f19859b.lambda$revealSpoilers$3(this.f19860c, this.d);
                return;
        }
    }

    public xh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f19859b = text;
        this.f19860c = richMessageLayout;
        this.d = view;
    }
}
