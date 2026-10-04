package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class pb implements Runnable {
    public final int f18869a;
    public final MessagesController f18870b;
    public final TL_account.TL_webBrowserSettings f18871c;

    public pb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f18869a = i10;
        this.f18870b = messagesController;
        this.f18871c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f18869a) {
            case 0:
                this.f18870b.lambda$loadWebBrowserConfig$510(this.f18871c);
                return;
            default:
                this.f18870b.lambda$loadWebBrowserConfig$508(this.f18871c);
                return;
        }
    }
}
