package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class wc implements Utilities.Callback {
    public final int f20538a;
    public final MessagesController f20539b;

    public wc(MessagesController messagesController, int i10) {
        this.f20538a = i10;
        this.f20539b = messagesController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20538a) {
            case 0:
                this.f20539b.lambda$loadAppConfig$33((TLRPC.TL_help_appConfig) obj);
                return;
            case 1:
                this.f20539b.lambda$loadWebBrowserConfig$511((TL_account.TL_webBrowserSettings) obj);
                return;
            default:
                this.f20539b.lambda$getAvailableEffects$496((TLRPC.messages_AvailableEffects) obj);
                return;
        }
    }
}
