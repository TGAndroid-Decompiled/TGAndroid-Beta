package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class wb implements Runnable {
    public final int f16860a;
    public final MessagesController f16861b;
    public final TL_account.TL_webBrowserSettings f16862c;

    public wb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f16860a = i10;
        this.f16861b = messagesController;
        this.f16862c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f16860a) {
            case 0:
                this.f16861b.lambda$loadWebBrowserConfig$510(this.f16862c);
                return;
            default:
                this.f16861b.lambda$loadWebBrowserConfig$508(this.f16862c);
                return;
        }
    }
}
