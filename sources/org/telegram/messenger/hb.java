package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class hb implements Runnable {
    public final int f18525a;
    public final MessagesController f18526b;
    public final TL_account.TL_webBrowserSettings f18527c;

    public hb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f18525a = i10;
        this.f18526b = messagesController;
        this.f18527c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f18525a) {
            case 0:
                this.f18526b.lambda$loadWebBrowserConfig$513(this.f18527c);
                return;
            default:
                this.f18526b.lambda$loadWebBrowserConfig$511(this.f18527c);
                return;
        }
    }
}
