package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class kb implements Runnable {
    public final int f18832a;
    public final MessagesController f18833b;
    public final TL_account.TL_webBrowserSettings f18834c;

    public kb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f18832a = i10;
        this.f18833b = messagesController;
        this.f18834c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f18832a) {
            case 0:
                this.f18833b.lambda$loadWebBrowserConfig$513(this.f18834c);
                return;
            default:
                this.f18833b.lambda$loadWebBrowserConfig$511(this.f18834c);
                return;
        }
    }
}
