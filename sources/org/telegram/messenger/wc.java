package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class wc implements Utilities.Callback {
    public final int f18897a;
    public final MessagesController f18898b;

    public wc(MessagesController messagesController, int i10) {
        this.f18897a = i10;
        this.f18898b = messagesController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18897a) {
            case 0:
                this.f18898b.lambda$loadAppConfig$33((TLRPC.TL_help_appConfig) obj);
                return;
            case 1:
                this.f18898b.lambda$loadWebBrowserConfig$511((TL_account.TL_webBrowserSettings) obj);
                return;
            default:
                this.f18898b.lambda$getAvailableEffects$496((TLRPC.messages_AvailableEffects) obj);
                return;
        }
    }
}
