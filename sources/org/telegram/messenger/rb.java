package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class rb implements Runnable {
    public final int f19861a;
    public final MessagesController f19862b;
    public final TL_account.TL_webBrowserSettings f19863c;

    public rb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f19861a = i10;
        this.f19862b = messagesController;
        this.f19863c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f19861a) {
            case 0:
                this.f19862b.lambda$loadWebBrowserConfig$510(this.f19863c);
                return;
            default:
                this.f19862b.lambda$loadWebBrowserConfig$508(this.f19863c);
                return;
        }
    }
}
