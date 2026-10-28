package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class dd implements Runnable {
    public final int f19906a;
    public final MessagesController f19907b;
    public final TL_account.TL_webBrowserSettings f19908c;

    public dd(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f19906a = i10;
        this.f19907b = messagesController;
        this.f19908c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f19906a) {
            case 0:
                this.f19907b.lambda$loadWebBrowserConfig$514(this.f19908c);
                return;
            default:
                this.f19907b.lambda$loadWebBrowserConfig$516(this.f19908c);
                return;
        }
    }
}
