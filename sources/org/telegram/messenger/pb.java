package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class pb implements Runnable {
    public final int f17036a;
    public final MessagesController f17037b;
    public final TL_account.TL_webBrowserSettings f17038c;

    public pb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17036a = i10;
        this.f17037b = messagesController;
        this.f17038c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17036a) {
            case 0:
                this.f17037b.lambda$loadWebBrowserConfig$510(this.f17038c);
                return;
            default:
                this.f17037b.lambda$loadWebBrowserConfig$508(this.f17038c);
                return;
        }
    }
}
