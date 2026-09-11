package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class xh implements Runnable {
    public final int f19659a = 0;
    public final RichMessageLayout.Text f19660b;
    public final RichMessageLayout f19661c;
    public final View d;

    public xh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f19660b = text;
        this.d = view;
        this.f19661c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f19659a) {
            case 0:
                this.f19660b.lambda$revealSpoilers$4(this.d, this.f19661c);
                return;
            default:
                this.f19660b.lambda$revealSpoilers$3(this.f19661c, this.d);
                return;
        }
    }

    public xh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f19660b = text;
        this.f19661c = richMessageLayout;
        this.d = view;
    }
}
