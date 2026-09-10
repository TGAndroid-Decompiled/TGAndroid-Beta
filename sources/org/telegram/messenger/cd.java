package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class cd implements Utilities.Callback {
    public final int f14913a;
    public final MessagesController f14914b;

    public cd(MessagesController messagesController, int i10) {
        this.f14913a = i10;
        this.f14914b = messagesController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f14913a) {
            case 0:
                this.f14914b.lambda$loadAppConfig$33((TLRPC.TL_help_appConfig) obj);
                return;
            case 1:
                this.f14914b.lambda$loadWebBrowserConfig$511((TL_account.TL_webBrowserSettings) obj);
                return;
            default:
                this.f14914b.lambda$getAvailableEffects$496((TLRPC.messages_AvailableEffects) obj);
                return;
        }
    }
}
