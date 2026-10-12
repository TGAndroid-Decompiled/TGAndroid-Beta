package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class jb implements Runnable {
    public final int f17962a;
    public final MessagesController f17963b;
    public final TL_account.TL_webBrowserSettings f17964c;

    public jb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17962a = i10;
        this.f17963b = messagesController;
        this.f17964c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17962a) {
            case 0:
                this.f17963b.lambda$loadWebBrowserConfig$513(this.f17964c);
                return;
            default:
                this.f17963b.lambda$loadWebBrowserConfig$511(this.f17964c);
                return;
        }
    }
}
