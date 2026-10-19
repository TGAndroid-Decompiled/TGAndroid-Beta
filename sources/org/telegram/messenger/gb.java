package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class gb implements Runnable {
    public final int f18441a;
    public final MessagesController f18442b;
    public final TL_account.TL_webBrowserSettings f18443c;

    public gb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f18441a = i10;
        this.f18442b = messagesController;
        this.f18443c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f18441a) {
            case 0:
                this.f18442b.lambda$loadWebBrowserConfig$513(this.f18443c);
                return;
            default:
                this.f18442b.lambda$loadWebBrowserConfig$511(this.f18443c);
                return;
        }
    }
}
