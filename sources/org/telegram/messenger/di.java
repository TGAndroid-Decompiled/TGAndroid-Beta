package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class di implements Runnable {
    public final int f17429a = 0;
    public final RichMessageLayout.Text f17430b;
    public final RichMessageLayout f17431c;
    public final View d;

    public di(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f17430b = text;
        this.d = view;
        this.f17431c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f17429a) {
            case 0:
                RichMessageLayout.Text.c(this.f17430b, this.d, this.f17431c);
                return;
            default:
                RichMessageLayout richMessageLayout = this.f17431c;
                RichMessageLayout.Text.a(this.f17430b, this.d, richMessageLayout);
                return;
        }
    }

    public di(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f17430b = text;
        this.f17431c = richMessageLayout;
        this.d = view;
    }
}
