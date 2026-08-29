package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class vc implements Utilities.Callback {
    public final int f21815a;
    public final MessagesController f21816b;

    public vc(MessagesController messagesController, int i10) {
        this.f21815a = i10;
        this.f21816b = messagesController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f21815a) {
            case 0:
                this.f21816b.lambda$loadAppConfig$33((TLRPC.TL_help_appConfig) obj);
                return;
            case 1:
                this.f21816b.lambda$loadWebBrowserConfig$511((TL_account.TL_webBrowserSettings) obj);
                return;
            default:
                this.f21816b.lambda$getAvailableEffects$496((TLRPC.messages_AvailableEffects) obj);
                return;
        }
    }
}
