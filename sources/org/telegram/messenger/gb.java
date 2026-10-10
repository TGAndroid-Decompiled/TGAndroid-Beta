package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class gb implements Runnable {
    public final int f17937a;
    public final MessagesController f17938b;
    public final TL_account.TL_webBrowserSettings f17939c;

    public gb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17937a = i10;
        this.f17938b = messagesController;
        this.f17939c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17937a) {
            case 0:
                this.f17938b.lambda$loadWebBrowserConfig$513(this.f17939c);
                return;
            default:
                this.f17938b.lambda$loadWebBrowserConfig$511(this.f17939c);
                return;
        }
    }
}
