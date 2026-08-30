package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class rb implements Runnable {
    public final int f18292a;
    public final MessagesController f18293b;
    public final TL_account.TL_webBrowserSettings f18294c;

    public rb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f18292a = i10;
        this.f18293b = messagesController;
        this.f18294c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f18292a) {
            case 0:
                this.f18293b.lambda$loadWebBrowserConfig$510(this.f18294c);
                return;
            default:
                this.f18293b.lambda$loadWebBrowserConfig$508(this.f18294c);
                return;
        }
    }
}
