package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class fb implements Runnable {
    public final int f18357a;
    public final MessagesController f18358b;
    public final TL_account.TL_webBrowserSettings f18359c;

    public fb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f18357a = i10;
        this.f18358b = messagesController;
        this.f18359c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f18357a) {
            case 0:
                this.f18358b.lambda$loadWebBrowserConfig$513(this.f18359c);
                return;
            default:
                this.f18358b.lambda$loadWebBrowserConfig$511(this.f18359c);
                return;
        }
    }
}
