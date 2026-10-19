package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class th implements Runnable {
    public final int f19590a = 0;
    public final RichMessageLayout.Text f19591b;
    public final RichMessageLayout f19592c;
    public final View d;

    public th(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f19591b = text;
        this.d = view;
        this.f19592c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f19590a) {
            case 0:
                this.f19591b.lambda$revealSpoilers$4(this.d, this.f19592c);
                return;
            default:
                this.f19591b.lambda$revealSpoilers$3(this.f19592c, this.d);
                return;
        }
    }

    public th(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f19591b = text;
        this.f19592c = richMessageLayout;
        this.d = view;
    }
}
