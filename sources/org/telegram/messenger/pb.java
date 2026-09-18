package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class pb implements Runnable {
    public final int f17208a;
    public final MessagesController f17209b;
    public final TL_account.TL_webBrowserSettings f17210c;

    public pb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17208a = i10;
        this.f17209b = messagesController;
        this.f17210c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17208a) {
            case 0:
                this.f17209b.lambda$loadWebBrowserConfig$510(this.f17210c);
                return;
            default:
                this.f17209b.lambda$loadWebBrowserConfig$508(this.f17210c);
                return;
        }
    }
}
