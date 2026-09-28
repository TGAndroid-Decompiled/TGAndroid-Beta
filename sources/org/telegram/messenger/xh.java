package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class xh implements Runnable {
    public final int f18142a = 0;
    public final RichMessageLayout.Text f18143b;
    public final RichMessageLayout f18144c;
    public final View d;

    public xh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f18143b = text;
        this.d = view;
        this.f18144c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f18142a) {
            case 0:
                this.f18143b.lambda$revealSpoilers$4(this.d, this.f18144c);
                return;
            default:
                this.f18143b.lambda$revealSpoilers$3(this.f18144c, this.d);
                return;
        }
    }

    public xh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f18143b = text;
        this.f18144c = richMessageLayout;
        this.d = view;
    }
}
