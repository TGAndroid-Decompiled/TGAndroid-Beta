package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class tc implements Utilities.Callback {
    public final int f19076a;
    public final MessagesController f19077b;

    public tc(MessagesController messagesController, int i10) {
        this.f19076a = i10;
        this.f19077b = messagesController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19076a) {
            case 0:
                this.f19077b.lambda$loadAppConfig$33((TLRPC.TL_help_appConfig) obj);
                return;
            case 1:
                this.f19077b.lambda$loadWebBrowserConfig$511((TL_account.TL_webBrowserSettings) obj);
                return;
            default:
                this.f19077b.lambda$getAvailableEffects$496((TLRPC.messages_AvailableEffects) obj);
                return;
        }
    }
}
