package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class jb implements Runnable {
    public final int f17579a;
    public final MessagesController f17580b;
    public final TL_account.TL_webBrowserSettings f17581c;

    public jb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17579a = i10;
        this.f17580b = messagesController;
        this.f17581c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17579a) {
            case 0:
                this.f17580b.lambda$loadWebBrowserConfig$513(this.f17581c);
                return;
            default:
                this.f17580b.lambda$loadWebBrowserConfig$511(this.f17581c);
                return;
        }
    }
}
