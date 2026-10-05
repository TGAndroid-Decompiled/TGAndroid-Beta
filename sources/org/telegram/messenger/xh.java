package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class xh implements Runnable {
    public final int f19819a = 0;
    public final RichMessageLayout.Text f19820b;
    public final RichMessageLayout f19821c;
    public final View d;

    public xh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f19820b = text;
        this.d = view;
        this.f19821c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f19819a) {
            case 0:
                this.f19820b.lambda$revealSpoilers$4(this.d, this.f19821c);
                return;
            default:
                this.f19820b.lambda$revealSpoilers$3(this.f19821c, this.d);
                return;
        }
    }

    public xh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f19820b = text;
        this.f19821c = richMessageLayout;
        this.d = view;
    }
}
