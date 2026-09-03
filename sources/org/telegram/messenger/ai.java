package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class ai implements Runnable {
    public final int f18175a = 0;
    public final RichMessageLayout.Text f18176b;
    public final RichMessageLayout f18177c;
    public final View d;

    public ai(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f18176b = text;
        this.d = view;
        this.f18177c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f18175a) {
            case 0:
                RichMessageLayout.Text.c(this.f18176b, this.d, this.f18177c);
                return;
            default:
                RichMessageLayout richMessageLayout = this.f18177c;
                RichMessageLayout.Text.a(this.f18176b, this.d, richMessageLayout);
                return;
        }
    }

    public ai(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f18176b = text;
        this.f18177c = richMessageLayout;
        this.d = view;
    }
}
