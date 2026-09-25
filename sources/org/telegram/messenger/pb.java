package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class pb implements Runnable {
    public final int f17279a;
    public final MessagesController f17280b;
    public final TL_account.TL_webBrowserSettings f17281c;

    public pb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17279a = i10;
        this.f17280b = messagesController;
        this.f17281c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17279a) {
            case 0:
                this.f17280b.lambda$loadWebBrowserConfig$510(this.f17281c);
                return;
            default:
                this.f17280b.lambda$loadWebBrowserConfig$508(this.f17281c);
                return;
        }
    }
}
