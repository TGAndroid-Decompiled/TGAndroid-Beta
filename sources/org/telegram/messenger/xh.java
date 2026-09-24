package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class xh implements Runnable {
    public final int f18124a = 0;
    public final RichMessageLayout.Text f18125b;
    public final RichMessageLayout f18126c;
    public final View d;

    public xh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f18125b = text;
        this.d = view;
        this.f18126c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f18124a) {
            case 0:
                this.f18125b.lambda$revealSpoilers$4(this.d, this.f18126c);
                return;
            default:
                this.f18125b.lambda$revealSpoilers$3(this.f18126c, this.d);
                return;
        }
    }

    public xh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f18125b = text;
        this.f18126c = richMessageLayout;
        this.d = view;
    }
}
