package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class ai implements Runnable {
    public final int f16775a = 0;
    public final RichMessageLayout.Text f16776b;
    public final RichMessageLayout f16777c;
    public final View d;

    public ai(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f16776b = text;
        this.d = view;
        this.f16777c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f16775a) {
            case 0:
                RichMessageLayout.Text.c(this.f16776b, this.d, this.f16777c);
                return;
            default:
                RichMessageLayout richMessageLayout = this.f16777c;
                RichMessageLayout.Text.a(this.f16776b, this.d, richMessageLayout);
                return;
        }
    }

    public ai(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f16776b = text;
        this.f16777c = richMessageLayout;
        this.d = view;
    }
}
