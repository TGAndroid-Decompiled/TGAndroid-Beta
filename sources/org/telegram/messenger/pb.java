package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class pb implements Runnable {
    public final int f17249a;
    public final MessagesController f17250b;
    public final TL_account.TL_webBrowserSettings f17251c;

    public pb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17249a = i10;
        this.f17250b = messagesController;
        this.f17251c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17249a) {
            case 0:
                this.f17250b.lambda$loadWebBrowserConfig$510(this.f17251c);
                return;
            default:
                this.f17250b.lambda$loadWebBrowserConfig$508(this.f17251c);
                return;
        }
    }
}
