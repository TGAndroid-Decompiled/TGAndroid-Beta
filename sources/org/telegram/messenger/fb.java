package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class fb implements Runnable {
    public final int f18362a;
    public final MessagesController f18363b;
    public final TL_account.TL_webBrowserSettings f18364c;

    public fb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f18362a = i10;
        this.f18363b = messagesController;
        this.f18364c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f18362a) {
            case 0:
                this.f18363b.lambda$loadWebBrowserConfig$513(this.f18364c);
                return;
            default:
                this.f18363b.lambda$loadWebBrowserConfig$511(this.f18364c);
                return;
        }
    }
}
