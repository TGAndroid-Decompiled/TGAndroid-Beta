package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class uh implements Runnable {
    public final int f19677a = 0;
    public final RichMessageLayout.Text f19678b;
    public final RichMessageLayout f19679c;
    public final View d;

    public uh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f19678b = text;
        this.d = view;
        this.f19679c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f19677a) {
            case 0:
                this.f19678b.lambda$revealSpoilers$4(this.d, this.f19679c);
                return;
            default:
                this.f19678b.lambda$revealSpoilers$3(this.f19679c, this.d);
                return;
        }
    }

    public uh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f19678b = text;
        this.f19679c = richMessageLayout;
        this.d = view;
    }
}
