package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class di implements Runnable {
    public final int f17430a = 0;
    public final RichMessageLayout.Text f17431b;
    public final RichMessageLayout f17432c;
    public final View d;

    public di(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f17431b = text;
        this.d = view;
        this.f17432c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f17430a) {
            case 0:
                RichMessageLayout.Text.c(this.f17431b, this.d, this.f17432c);
                return;
            default:
                RichMessageLayout richMessageLayout = this.f17432c;
                RichMessageLayout.Text.a(this.f17431b, this.d, richMessageLayout);
                return;
        }
    }

    public di(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f17431b = text;
        this.f17432c = richMessageLayout;
        this.d = view;
    }
}
