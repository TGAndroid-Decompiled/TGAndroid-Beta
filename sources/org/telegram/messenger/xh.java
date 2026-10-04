package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class xh implements Runnable {
    public final int f19821a = 0;
    public final RichMessageLayout.Text f19822b;
    public final RichMessageLayout f19823c;
    public final View d;

    public xh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f19822b = text;
        this.d = view;
        this.f19823c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f19821a) {
            case 0:
                this.f19822b.lambda$revealSpoilers$4(this.d, this.f19823c);
                return;
            default:
                this.f19822b.lambda$revealSpoilers$3(this.f19823c, this.d);
                return;
        }
    }

    public xh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f19822b = text;
        this.f19823c = richMessageLayout;
        this.d = view;
    }
}
