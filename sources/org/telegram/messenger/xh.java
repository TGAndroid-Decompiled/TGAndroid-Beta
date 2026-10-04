package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class xh implements Runnable {
    public final int f19814a = 0;
    public final RichMessageLayout.Text f19815b;
    public final RichMessageLayout f19816c;
    public final View d;

    public xh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f19815b = text;
        this.d = view;
        this.f19816c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f19814a) {
            case 0:
                this.f19815b.lambda$revealSpoilers$4(this.d, this.f19816c);
                return;
            default:
                this.f19815b.lambda$revealSpoilers$3(this.f19816c, this.d);
                return;
        }
    }

    public xh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f19815b = text;
        this.f19816c = richMessageLayout;
        this.d = view;
    }
}
