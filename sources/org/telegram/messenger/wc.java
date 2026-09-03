package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class wc implements Utilities.Callback {
    public final int f18880a;
    public final MessagesController f18881b;

    public wc(MessagesController messagesController, int i10) {
        this.f18880a = i10;
        this.f18881b = messagesController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18880a) {
            case 0:
                this.f18881b.lambda$loadAppConfig$33((TLRPC.TL_help_appConfig) obj);
                return;
            case 1:
                this.f18881b.lambda$loadWebBrowserConfig$511((TL_account.TL_webBrowserSettings) obj);
                return;
            default:
                this.f18881b.lambda$getAvailableEffects$496((TLRPC.messages_AvailableEffects) obj);
                return;
        }
    }
}
