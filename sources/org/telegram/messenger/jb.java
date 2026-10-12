package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class jb implements Runnable {
    public final int f17961a;
    public final MessagesController f17962b;
    public final TL_account.TL_webBrowserSettings f17963c;

    public jb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17961a = i10;
        this.f17962b = messagesController;
        this.f17963c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17961a) {
            case 0:
                this.f17962b.lambda$loadWebBrowserConfig$513(this.f17963c);
                return;
            default:
                this.f17962b.lambda$loadWebBrowserConfig$511(this.f17963c);
                return;
        }
    }
}
