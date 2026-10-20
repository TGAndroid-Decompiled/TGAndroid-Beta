package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class hb implements Runnable {
    public final int f18528a;
    public final MessagesController f18529b;
    public final TL_account.TL_webBrowserSettings f18530c;

    public hb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f18528a = i10;
        this.f18529b = messagesController;
        this.f18530c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f18528a) {
            case 0:
                this.f18529b.lambda$loadWebBrowserConfig$513(this.f18530c);
                return;
            default:
                this.f18529b.lambda$loadWebBrowserConfig$511(this.f18530c);
                return;
        }
    }
}
