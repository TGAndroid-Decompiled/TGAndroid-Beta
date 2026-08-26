package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;

public final class MessagesController$$ExternalSyntheticLambda246 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final TL_account.TL_webBrowserSettings f$1;

    public MessagesController$$ExternalSyntheticLambda246(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadWebBrowserConfig$510(this.f$1);
                break;
            default:
                this.f$0.lambda$loadWebBrowserConfig$508(this.f$1);
                break;
        }
    }
}
