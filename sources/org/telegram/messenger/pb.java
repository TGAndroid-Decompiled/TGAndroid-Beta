package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class pb implements Runnable {
    public final int f18676a;
    public final MessagesController f18677b;
    public final TL_account.TL_webBrowserSettings f18678c;

    public pb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f18676a = i10;
        this.f18677b = messagesController;
        this.f18678c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f18676a) {
            case 0:
                this.f18677b.lambda$loadWebBrowserConfig$510(this.f18678c);
                return;
            default:
                this.f18677b.lambda$loadWebBrowserConfig$508(this.f18678c);
                return;
        }
    }
}
