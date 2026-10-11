package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class gb implements Runnable {
    public final int f17936a;
    public final MessagesController f17937b;
    public final TL_account.TL_webBrowserSettings f17938c;

    public gb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17936a = i10;
        this.f17937b = messagesController;
        this.f17938c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17936a) {
            case 0:
                this.f17937b.lambda$loadWebBrowserConfig$513(this.f17938c);
                return;
            default:
                this.f17937b.lambda$loadWebBrowserConfig$511(this.f17938c);
                return;
        }
    }
}
