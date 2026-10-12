package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class cd implements Utilities.Callback {
    public final int f17315a;
    public final MessagesController f17316b;

    public cd(MessagesController messagesController, int i10) {
        this.f17315a = i10;
        this.f17316b = messagesController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17315a) {
            case 0:
                this.f17316b.lambda$loadAppConfig$32((TLRPC.TL_help_appConfig) obj);
                return;
            case 1:
                this.f17316b.lambda$loadWebBrowserConfig$514((TL_account.TL_webBrowserSettings) obj);
                return;
            default:
                this.f17316b.lambda$getAvailableEffects$499((TLRPC.messages_AvailableEffects) obj);
                return;
        }
    }
}
