package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class pb implements Runnable {
    public final int f17283a;
    public final MessagesController f17284b;
    public final TL_account.TL_webBrowserSettings f17285c;

    public pb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17283a = i10;
        this.f17284b = messagesController;
        this.f17285c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17283a) {
            case 0:
                this.f17284b.lambda$loadWebBrowserConfig$510(this.f17285c);
                return;
            default:
                this.f17284b.lambda$loadWebBrowserConfig$508(this.f17285c);
                return;
        }
    }
}
