package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class xh implements Runnable {
    public final int f22183a = 0;
    public final RichMessageLayout.Text f22184b;
    public final RichMessageLayout f22185c;
    public final View d;

    public xh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f22184b = text;
        this.d = view;
        this.f22185c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f22183a) {
            case 0:
                this.f22184b.lambda$revealSpoilers$4(this.d, this.f22185c);
                return;
            default:
                this.f22184b.lambda$revealSpoilers$3(this.f22185c, this.d);
                return;
        }
    }

    public xh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f22184b = text;
        this.f22185c = richMessageLayout;
        this.d = view;
    }
}
