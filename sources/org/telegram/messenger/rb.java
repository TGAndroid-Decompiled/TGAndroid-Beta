package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class rb implements Runnable {
    public final int f18266a;
    public final MessagesController f18267b;
    public final TL_account.TL_webBrowserSettings f18268c;

    public rb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f18266a = i10;
        this.f18267b = messagesController;
        this.f18268c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f18266a) {
            case 0:
                this.f18267b.lambda$loadWebBrowserConfig$510(this.f18268c);
                return;
            default:
                this.f18267b.lambda$loadWebBrowserConfig$508(this.f18268c);
                return;
        }
    }
}
