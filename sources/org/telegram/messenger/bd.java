package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class bd implements Utilities.Callback {
    public final int f17965a;
    public final MessagesController f17966b;

    public bd(MessagesController messagesController, int i10) {
        this.f17965a = i10;
        this.f17966b = messagesController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17965a) {
            case 0:
                this.f17966b.lambda$loadAppConfig$32((TLRPC.TL_help_appConfig) obj);
                return;
            case 1:
                this.f17966b.lambda$loadWebBrowserConfig$514((TL_account.TL_webBrowserSettings) obj);
                return;
            default:
                this.f17966b.lambda$getAvailableEffects$499((TLRPC.messages_AvailableEffects) obj);
                return;
        }
    }
}
