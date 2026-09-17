package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class xh implements Runnable {
    public final int f19686a = 0;
    public final RichMessageLayout.Text f19687b;
    public final RichMessageLayout f19688c;
    public final View d;

    public xh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f19687b = text;
        this.d = view;
        this.f19688c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f19686a) {
            case 0:
                this.f19687b.lambda$revealSpoilers$4(this.d, this.f19688c);
                return;
            default:
                this.f19687b.lambda$revealSpoilers$3(this.f19688c, this.d);
                return;
        }
    }

    public xh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f19687b = text;
        this.f19688c = richMessageLayout;
        this.d = view;
    }
}
