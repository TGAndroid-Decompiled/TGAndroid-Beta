package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class fb implements Runnable {
    public final int f18365a;
    public final MessagesController f18366b;
    public final TL_account.TL_webBrowserSettings f18367c;

    public fb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f18365a = i10;
        this.f18366b = messagesController;
        this.f18367c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f18365a) {
            case 0:
                this.f18366b.lambda$loadWebBrowserConfig$513(this.f18367c);
                return;
            default:
                this.f18366b.lambda$loadWebBrowserConfig$511(this.f18367c);
                return;
        }
    }
}
