package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class gb implements Runnable {
    public final int f18438a;
    public final MessagesController f18439b;
    public final TL_account.TL_webBrowserSettings f18440c;

    public gb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f18438a = i10;
        this.f18439b = messagesController;
        this.f18440c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f18438a) {
            case 0:
                this.f18439b.lambda$loadWebBrowserConfig$513(this.f18440c);
                return;
            default:
                this.f18439b.lambda$loadWebBrowserConfig$511(this.f18440c);
                return;
        }
    }
}
