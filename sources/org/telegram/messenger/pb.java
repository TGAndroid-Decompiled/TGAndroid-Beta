package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class pb implements Runnable {
    public final int f18874a;
    public final MessagesController f18875b;
    public final TL_account.TL_webBrowserSettings f18876c;

    public pb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f18874a = i10;
        this.f18875b = messagesController;
        this.f18876c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f18874a) {
            case 0:
                this.f18875b.lambda$loadWebBrowserConfig$510(this.f18876c);
                return;
            default:
                this.f18875b.lambda$loadWebBrowserConfig$508(this.f18876c);
                return;
        }
    }
}
