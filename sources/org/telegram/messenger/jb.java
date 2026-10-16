package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class jb implements Runnable {
    public final int f17274a;
    public final MessagesController f17275b;
    public final TL_account.TL_webBrowserSettings f17276c;

    public jb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17274a = i10;
        this.f17275b = messagesController;
        this.f17276c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17274a) {
            case 0:
                this.f17275b.lambda$loadWebBrowserConfig$513(this.f17276c);
                return;
            default:
                this.f17275b.lambda$loadWebBrowserConfig$511(this.f17276c);
                return;
        }
    }
}
