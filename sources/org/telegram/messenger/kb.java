package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class kb implements Runnable {
    public final int f18766a;
    public final MessagesController f18767b;
    public final TL_account.TL_webBrowserSettings f18768c;

    public kb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f18766a = i10;
        this.f18767b = messagesController;
        this.f18768c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f18766a) {
            case 0:
                this.f18767b.lambda$loadWebBrowserConfig$513(this.f18768c);
                return;
            default:
                this.f18767b.lambda$loadWebBrowserConfig$511(this.f18768c);
                return;
        }
    }
}
