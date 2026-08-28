package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class pc implements Utilities.Callback {
    public final int f21234a;
    public final MessagesController f21235b;

    public pc(MessagesController messagesController, int i9) {
        this.f21234a = i9;
        this.f21235b = messagesController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f21234a) {
            case 0:
                this.f21235b.lambda$loadAppConfig$33((TLRPC.TL_help_appConfig) obj);
                return;
            case 1:
                this.f21235b.lambda$loadWebBrowserConfig$511((TL_account.TL_webBrowserSettings) obj);
                return;
            default:
                this.f21235b.lambda$getAvailableEffects$496((TLRPC.messages_AvailableEffects) obj);
                return;
        }
    }
}
