package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class pb implements Runnable {
    public final int f18703a;
    public final MessagesController f18704b;
    public final TL_account.TL_webBrowserSettings f18705c;

    public pb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f18703a = i10;
        this.f18704b = messagesController;
        this.f18705c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f18703a) {
            case 0:
                this.f18704b.lambda$loadWebBrowserConfig$510(this.f18705c);
                return;
            default:
                this.f18704b.lambda$loadWebBrowserConfig$508(this.f18705c);
                return;
        }
    }
}
