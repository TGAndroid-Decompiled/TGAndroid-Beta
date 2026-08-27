package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;

public final class ob implements Runnable {

    public final int f21149a;

    public final MessagesController f21150b;

    public final TL_account.TL_webBrowserSettings f21151c;

    public ob(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f21149a = i10;
        this.f21150b = messagesController;
        this.f21151c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f21149a) {
            case 0:
                this.f21150b.lambda$loadWebBrowserConfig$510(this.f21151c);
                break;
            default:
                this.f21150b.lambda$loadWebBrowserConfig$508(this.f21151c);
                break;
        }
    }
}
