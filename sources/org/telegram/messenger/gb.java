package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class gb implements Runnable {
    public final int f17933a;
    public final MessagesController f17934b;
    public final TL_account.TL_webBrowserSettings f17935c;

    public gb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17933a = i10;
        this.f17934b = messagesController;
        this.f17935c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17933a) {
            case 0:
                this.f17934b.lambda$loadWebBrowserConfig$513(this.f17935c);
                return;
            default:
                this.f17934b.lambda$loadWebBrowserConfig$511(this.f17935c);
                return;
        }
    }
}
