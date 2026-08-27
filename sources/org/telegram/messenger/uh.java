package org.telegram.messenger;

import android.view.View;

public final class uh implements Runnable {

    public final int f21737a = 0;

    public final RichMessageLayout.Text f21738b;

    public final RichMessageLayout f21739c;
    public final View d;

    public uh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f21738b = text;
        this.d = view;
        this.f21739c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f21737a) {
            case 0:
                this.f21738b.lambda$revealSpoilers$4(this.d, this.f21739c);
                break;
            default:
                this.f21738b.lambda$revealSpoilers$3(this.f21739c, this.d);
                break;
        }
    }

    public uh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f21738b = text;
        this.f21739c = richMessageLayout;
        this.d = view;
    }
}
