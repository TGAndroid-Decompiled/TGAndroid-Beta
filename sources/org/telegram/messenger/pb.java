package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class pb implements Runnable {
    public final int f17028a;
    public final MessagesController f17029b;
    public final TL_account.TL_webBrowserSettings f17030c;

    public pb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17028a = i10;
        this.f17029b = messagesController;
        this.f17030c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17028a) {
            case 0:
                this.f17029b.lambda$loadWebBrowserConfig$510(this.f17030c);
                return;
            default:
                this.f17029b.lambda$loadWebBrowserConfig$508(this.f17030c);
                return;
        }
    }
}
