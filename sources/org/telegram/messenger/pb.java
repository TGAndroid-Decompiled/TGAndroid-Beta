package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class pb implements Runnable {
    public final int f17264a;
    public final MessagesController f17265b;
    public final TL_account.TL_webBrowserSettings f17266c;

    public pb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17264a = i10;
        this.f17265b = messagesController;
        this.f17266c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17264a) {
            case 0:
                this.f17265b.lambda$loadWebBrowserConfig$510(this.f17266c);
                return;
            default:
                this.f17265b.lambda$loadWebBrowserConfig$508(this.f17266c);
                return;
        }
    }
}
