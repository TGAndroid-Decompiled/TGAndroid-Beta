package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class ai implements Runnable {
    public final int f16491a = 0;
    public final RichMessageLayout.Text f16492b;
    public final RichMessageLayout f16493c;
    public final View d;

    public ai(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f16492b = text;
        this.d = view;
        this.f16493c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f16491a) {
            case 0:
                RichMessageLayout.Text.c(this.f16492b, this.d, this.f16493c);
                return;
            default:
                RichMessageLayout richMessageLayout = this.f16493c;
                RichMessageLayout.Text.a(this.f16492b, this.d, richMessageLayout);
                return;
        }
    }

    public ai(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f16492b = text;
        this.f16493c = richMessageLayout;
        this.d = view;
    }
}
