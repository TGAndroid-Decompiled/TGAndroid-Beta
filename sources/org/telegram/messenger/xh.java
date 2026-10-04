package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class xh implements Runnable {
    public final int f19822a = 0;
    public final RichMessageLayout.Text f19823b;
    public final RichMessageLayout f19824c;
    public final View d;

    public xh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f19823b = text;
        this.d = view;
        this.f19824c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f19822a) {
            case 0:
                this.f19823b.lambda$revealSpoilers$4(this.d, this.f19824c);
                return;
            default:
                this.f19823b.lambda$revealSpoilers$3(this.f19824c, this.d);
                return;
        }
    }

    public xh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f19823b = text;
        this.f19824c = richMessageLayout;
        this.d = view;
    }
}
