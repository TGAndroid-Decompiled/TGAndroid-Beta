package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class vh implements Runnable {
    public final int f19836a = 0;
    public final RichMessageLayout.Text f19837b;
    public final RichMessageLayout f19838c;
    public final View d;

    public vh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f19837b = text;
        this.d = view;
        this.f19838c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f19836a) {
            case 0:
                this.f19837b.lambda$revealSpoilers$4(this.d, this.f19838c);
                return;
            default:
                this.f19837b.lambda$revealSpoilers$3(this.f19838c, this.d);
                return;
        }
    }

    public vh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f19837b = text;
        this.f19838c = richMessageLayout;
        this.d = view;
    }
}
