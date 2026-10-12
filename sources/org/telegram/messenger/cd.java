package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class cd implements Utilities.Callback {
    public final int f17001a;
    public final MessagesController f17002b;

    public cd(MessagesController messagesController, int i10) {
        this.f17001a = i10;
        this.f17002b = messagesController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17001a) {
            case 0:
                this.f17002b.lambda$loadAppConfig$32((TLRPC.TL_help_appConfig) obj);
                return;
            case 1:
                this.f17002b.lambda$loadWebBrowserConfig$514((TL_account.TL_webBrowserSettings) obj);
                return;
            default:
                this.f17002b.lambda$getAvailableEffects$499((TLRPC.messages_AvailableEffects) obj);
                return;
        }
    }
}
