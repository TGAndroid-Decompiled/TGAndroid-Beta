package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class xh implements Runnable {
    public final int f19831a = 0;
    public final RichMessageLayout.Text f19832b;
    public final RichMessageLayout f19833c;
    public final View d;

    public xh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f19832b = text;
        this.d = view;
        this.f19833c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f19831a) {
            case 0:
                this.f19832b.lambda$revealSpoilers$4(this.d, this.f19833c);
                return;
            default:
                this.f19832b.lambda$revealSpoilers$3(this.f19833c, this.d);
                return;
        }
    }

    public xh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f19832b = text;
        this.f19833c = richMessageLayout;
        this.d = view;
    }
}
