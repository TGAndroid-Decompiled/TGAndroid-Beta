package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class uc implements Utilities.Callback {
    public final int f17695a;
    public final MessagesController f17696b;

    public uc(MessagesController messagesController, int i10) {
        this.f17695a = i10;
        this.f17696b = messagesController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17695a) {
            case 0:
                this.f17696b.lambda$loadAppConfig$33((TLRPC.TL_help_appConfig) obj);
                return;
            case 1:
                this.f17696b.lambda$loadWebBrowserConfig$511((TL_account.TL_webBrowserSettings) obj);
                return;
            default:
                this.f17696b.lambda$getAvailableEffects$496((TLRPC.messages_AvailableEffects) obj);
                return;
        }
    }
}
