package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class jb implements Runnable {
    public final int f18756a;
    public final MessagesController f18757b;
    public final TL_account.TL_webBrowserSettings f18758c;

    public jb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f18756a = i10;
        this.f18757b = messagesController;
        this.f18758c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f18756a) {
            case 0:
                this.f18757b.lambda$loadWebBrowserConfig$513(this.f18758c);
                return;
            default:
                this.f18757b.lambda$loadWebBrowserConfig$511(this.f18758c);
                return;
        }
    }
}
