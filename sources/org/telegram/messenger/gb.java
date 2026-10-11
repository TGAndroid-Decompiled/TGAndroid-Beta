package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class gb implements Runnable {
    public final int f17972a;
    public final MessagesController f17973b;
    public final TL_account.TL_webBrowserSettings f17974c;

    public gb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17972a = i10;
        this.f17973b = messagesController;
        this.f17974c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17972a) {
            case 0:
                this.f17973b.lambda$loadWebBrowserConfig$513(this.f17974c);
                return;
            default:
                this.f17973b.lambda$loadWebBrowserConfig$511(this.f17974c);
                return;
        }
    }
}
