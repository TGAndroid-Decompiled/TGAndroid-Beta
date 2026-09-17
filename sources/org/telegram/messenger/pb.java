package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class pb implements Runnable {
    public final int f17045a;
    public final MessagesController f17046b;
    public final TL_account.TL_webBrowserSettings f17047c;

    public pb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17045a = i10;
        this.f17046b = messagesController;
        this.f17047c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17045a) {
            case 0:
                this.f17046b.lambda$loadWebBrowserConfig$510(this.f17047c);
                return;
            default:
                this.f17046b.lambda$loadWebBrowserConfig$508(this.f17047c);
                return;
        }
    }
}
