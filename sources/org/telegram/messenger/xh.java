package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class xh implements Runnable {
    public final int f18139a = 0;
    public final RichMessageLayout.Text f18140b;
    public final RichMessageLayout f18141c;
    public final View d;

    public xh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f18140b = text;
        this.d = view;
        this.f18141c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f18139a) {
            case 0:
                this.f18140b.lambda$revealSpoilers$4(this.d, this.f18141c);
                return;
            default:
                this.f18140b.lambda$revealSpoilers$3(this.f18141c, this.d);
                return;
        }
    }

    public xh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f18140b = text;
        this.f18141c = richMessageLayout;
        this.d = view;
    }
}
