package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class bi implements Runnable {
    public final int f16888a = 0;
    public final RichMessageLayout.Text f16889b;
    public final RichMessageLayout f16890c;
    public final View d;

    public bi(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f16889b = text;
        this.d = view;
        this.f16890c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f16888a) {
            case 0:
                RichMessageLayout.Text.c(this.f16889b, this.d, this.f16890c);
                return;
            default:
                RichMessageLayout richMessageLayout = this.f16890c;
                RichMessageLayout.Text.a(this.f16889b, this.d, richMessageLayout);
                return;
        }
    }

    public bi(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f16889b = text;
        this.f16890c = richMessageLayout;
        this.d = view;
    }
}
