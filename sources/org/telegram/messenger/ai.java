package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class ai implements Runnable {
    public final int f16756a = 0;
    public final RichMessageLayout.Text f16757b;
    public final RichMessageLayout f16758c;
    public final View d;

    public ai(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f16757b = text;
        this.d = view;
        this.f16758c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f16756a) {
            case 0:
                RichMessageLayout.Text.c(this.f16757b, this.d, this.f16758c);
                return;
            default:
                RichMessageLayout richMessageLayout = this.f16758c;
                RichMessageLayout.Text.a(this.f16757b, this.d, richMessageLayout);
                return;
        }
    }

    public ai(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f16757b = text;
        this.f16758c = richMessageLayout;
        this.d = view;
    }
}
