package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class tc implements Utilities.Callback {
    public final int f19103a;
    public final MessagesController f19104b;

    public tc(MessagesController messagesController, int i10) {
        this.f19103a = i10;
        this.f19104b = messagesController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19103a) {
            case 0:
                this.f19104b.lambda$loadAppConfig$33((TLRPC.TL_help_appConfig) obj);
                return;
            case 1:
                this.f19104b.lambda$loadWebBrowserConfig$511((TL_account.TL_webBrowserSettings) obj);
                return;
            default:
                this.f19104b.lambda$getAvailableEffects$496((TLRPC.messages_AvailableEffects) obj);
                return;
        }
    }
}
