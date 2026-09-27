package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class pb implements Runnable {
    public final int f17276a;
    public final MessagesController f17277b;
    public final TL_account.TL_webBrowserSettings f17278c;

    public pb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17276a = i10;
        this.f17277b = messagesController;
        this.f17278c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17276a) {
            case 0:
                this.f17277b.lambda$loadWebBrowserConfig$510(this.f17278c);
                return;
            default:
                this.f17277b.lambda$loadWebBrowserConfig$508(this.f17278c);
                return;
        }
    }
}
