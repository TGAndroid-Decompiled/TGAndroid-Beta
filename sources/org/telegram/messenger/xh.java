package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class xh implements Runnable {
    public final int f18159a = 0;
    public final RichMessageLayout.Text f18160b;
    public final RichMessageLayout f18161c;
    public final View d;

    public xh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f18160b = text;
        this.d = view;
        this.f18161c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f18159a) {
            case 0:
                this.f18160b.lambda$revealSpoilers$4(this.d, this.f18161c);
                return;
            default:
                this.f18160b.lambda$revealSpoilers$3(this.f18161c, this.d);
                return;
        }
    }

    public xh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f18160b = text;
        this.f18161c = richMessageLayout;
        this.d = view;
    }
}
