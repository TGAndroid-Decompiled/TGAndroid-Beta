package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class pb implements Runnable {
    public final int f18870a;
    public final MessagesController f18871b;
    public final TL_account.TL_webBrowserSettings f18872c;

    public pb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f18870a = i10;
        this.f18871b = messagesController;
        this.f18872c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f18870a) {
            case 0:
                this.f18871b.lambda$loadWebBrowserConfig$510(this.f18872c);
                return;
            default:
                this.f18871b.lambda$loadWebBrowserConfig$508(this.f18872c);
                return;
        }
    }
}
