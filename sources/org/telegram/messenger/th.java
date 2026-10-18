package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class th implements Runnable {
    public final int f19587a = 0;
    public final RichMessageLayout.Text f19588b;
    public final RichMessageLayout f19589c;
    public final View d;

    public th(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f19588b = text;
        this.d = view;
        this.f19589c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f19587a) {
            case 0:
                this.f19588b.lambda$revealSpoilers$4(this.d, this.f19589c);
                return;
            default:
                this.f19588b.lambda$revealSpoilers$3(this.f19589c, this.d);
                return;
        }
    }

    public th(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f19588b = text;
        this.f19589c = richMessageLayout;
        this.d = view;
    }
}
