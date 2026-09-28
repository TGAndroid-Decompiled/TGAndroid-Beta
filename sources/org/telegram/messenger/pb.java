package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class pb implements Runnable {
    public final int f17282a;
    public final MessagesController f17283b;
    public final TL_account.TL_webBrowserSettings f17284c;

    public pb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17282a = i10;
        this.f17283b = messagesController;
        this.f17284c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17282a) {
            case 0:
                this.f17283b.lambda$loadWebBrowserConfig$510(this.f17284c);
                return;
            default:
                this.f17283b.lambda$loadWebBrowserConfig$508(this.f17284c);
                return;
        }
    }
}
