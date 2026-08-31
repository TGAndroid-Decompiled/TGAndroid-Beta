package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class rb implements Runnable {
    public final int f19859a;
    public final MessagesController f19860b;
    public final TL_account.TL_webBrowserSettings f19861c;

    public rb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f19859a = i10;
        this.f19860b = messagesController;
        this.f19861c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f19859a) {
            case 0:
                this.f19860b.lambda$loadWebBrowserConfig$510(this.f19861c);
                return;
            default:
                this.f19860b.lambda$loadWebBrowserConfig$508(this.f19861c);
                return;
        }
    }
}
