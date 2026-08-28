package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class kb implements Runnable {
    public final int f20775a;
    public final MessagesController f20776b;
    public final TL_account.TL_webBrowserSettings f20777c;

    public kb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i9) {
        this.f20775a = i9;
        this.f20776b = messagesController;
        this.f20777c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f20775a) {
            case 0:
                this.f20776b.lambda$loadWebBrowserConfig$510(this.f20777c);
                return;
            default:
                this.f20776b.lambda$loadWebBrowserConfig$508(this.f20777c);
                return;
        }
    }
}
