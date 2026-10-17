package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class xc implements Utilities.Callback {
    public final int f20076a;
    public final MessagesController f20077b;

    public xc(MessagesController messagesController, int i10) {
        this.f20076a = i10;
        this.f20077b = messagesController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20076a) {
            case 0:
                this.f20077b.lambda$loadAppConfig$32((TLRPC.TL_help_appConfig) obj);
                return;
            case 1:
                this.f20077b.lambda$loadWebBrowserConfig$514((TL_account.TL_webBrowserSettings) obj);
                return;
            default:
                this.f20077b.lambda$getAvailableEffects$499((TLRPC.messages_AvailableEffects) obj);
                return;
        }
    }
}
