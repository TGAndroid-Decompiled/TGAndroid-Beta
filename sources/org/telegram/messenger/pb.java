package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class pb implements Runnable {
    public final int f17299a;
    public final MessagesController f17300b;
    public final TL_account.TL_webBrowserSettings f17301c;

    public pb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17299a = i10;
        this.f17300b = messagesController;
        this.f17301c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17299a) {
            case 0:
                this.f17300b.lambda$loadWebBrowserConfig$510(this.f17301c);
                return;
            default:
                this.f17300b.lambda$loadWebBrowserConfig$508(this.f17301c);
                return;
        }
    }
}
