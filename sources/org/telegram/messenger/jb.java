package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class jb implements Runnable {
    public final int f18690a;
    public final MessagesController f18691b;
    public final TL_account.TL_webBrowserSettings f18692c;

    public jb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f18690a = i10;
        this.f18691b = messagesController;
        this.f18692c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f18690a) {
            case 0:
                this.f18691b.lambda$loadWebBrowserConfig$513(this.f18692c);
                return;
            default:
                this.f18691b.lambda$loadWebBrowserConfig$511(this.f18692c);
                return;
        }
    }
}
