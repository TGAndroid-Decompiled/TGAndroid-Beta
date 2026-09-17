package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class ob implements Runnable {
    public final int f18619a;
    public final MessagesController f18620b;
    public final TL_account.TL_webBrowserSettings f18621c;

    public ob(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f18619a = i10;
        this.f18620b = messagesController;
        this.f18621c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f18619a) {
            case 0:
                this.f18620b.lambda$loadWebBrowserConfig$510(this.f18621c);
                return;
            default:
                this.f18620b.lambda$loadWebBrowserConfig$508(this.f18621c);
                return;
        }
    }
}
