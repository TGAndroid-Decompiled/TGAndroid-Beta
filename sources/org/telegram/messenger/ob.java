package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class ob implements Runnable {
    public final int f18592a;
    public final MessagesController f18593b;
    public final TL_account.TL_webBrowserSettings f18594c;

    public ob(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f18592a = i10;
        this.f18593b = messagesController;
        this.f18594c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f18592a) {
            case 0:
                this.f18593b.lambda$loadWebBrowserConfig$510(this.f18594c);
                return;
            default:
                this.f18593b.lambda$loadWebBrowserConfig$508(this.f18594c);
                return;
        }
    }
}
