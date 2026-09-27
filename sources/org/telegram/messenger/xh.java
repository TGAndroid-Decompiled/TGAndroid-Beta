package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class xh implements Runnable {
    public final int f18133a = 0;
    public final RichMessageLayout.Text f18134b;
    public final RichMessageLayout f18135c;
    public final View d;

    public xh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f18134b = text;
        this.d = view;
        this.f18135c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f18133a) {
            case 0:
                this.f18134b.lambda$revealSpoilers$4(this.d, this.f18135c);
                return;
            default:
                this.f18134b.lambda$revealSpoilers$3(this.f18135c, this.d);
                return;
        }
    }

    public xh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f18134b = text;
        this.f18135c = richMessageLayout;
        this.d = view;
    }
}
