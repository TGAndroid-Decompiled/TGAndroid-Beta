package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class gi implements Runnable {
    public final int f15296a = 0;
    public final RichMessageLayout.Text f15297b;
    public final RichMessageLayout f15298c;
    public final View d;

    public gi(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f15297b = text;
        this.d = view;
        this.f15298c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f15296a) {
            case 0:
                RichMessageLayout.Text.c(this.f15297b, this.d, this.f15298c);
                return;
            default:
                RichMessageLayout richMessageLayout = this.f15298c;
                RichMessageLayout.Text.a(this.f15297b, this.d, richMessageLayout);
                return;
        }
    }

    public gi(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f15297b = text;
        this.f15298c = richMessageLayout;
        this.d = view;
    }
}
