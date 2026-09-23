package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class pb implements Runnable {
    public final int f17026a;
    public final MessagesController f17027b;
    public final TL_account.TL_webBrowserSettings f17028c;

    public pb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17026a = i10;
        this.f17027b = messagesController;
        this.f17028c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17026a) {
            case 0:
                this.f17027b.lambda$loadWebBrowserConfig$510(this.f17028c);
                return;
            default:
                this.f17027b.lambda$loadWebBrowserConfig$508(this.f17028c);
                return;
        }
    }
}
