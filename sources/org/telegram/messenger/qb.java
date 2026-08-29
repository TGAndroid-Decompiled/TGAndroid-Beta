package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class qb implements Runnable {
    public final int f21333a;
    public final MessagesController f21334b;
    public final TL_account.TL_webBrowserSettings f21335c;

    public qb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f21333a = i10;
        this.f21334b = messagesController;
        this.f21335c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f21333a) {
            case 0:
                this.f21334b.lambda$loadWebBrowserConfig$510(this.f21335c);
                return;
            default:
                this.f21334b.lambda$loadWebBrowserConfig$508(this.f21335c);
                return;
        }
    }
}
