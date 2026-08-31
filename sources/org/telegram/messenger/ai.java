package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class ai implements Runnable {
    public final int f18173a = 0;
    public final RichMessageLayout.Text f18174b;
    public final RichMessageLayout f18175c;
    public final View d;

    public ai(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f18174b = text;
        this.d = view;
        this.f18175c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f18173a) {
            case 0:
                RichMessageLayout.Text.c(this.f18174b, this.d, this.f18175c);
                return;
            default:
                RichMessageLayout richMessageLayout = this.f18175c;
                RichMessageLayout.Text.a(this.f18174b, this.d, richMessageLayout);
                return;
        }
    }

    public ai(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f18174b = text;
        this.f18175c = richMessageLayout;
        this.d = view;
    }
}
