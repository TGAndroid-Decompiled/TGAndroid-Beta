package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class tc implements Utilities.Callback {

    public final int f21631a;

    public final MessagesController f21632b;

    public tc(MessagesController messagesController, int i10) {
        this.f21631a = i10;
        this.f21632b = messagesController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f21631a) {
            case 0:
                this.f21632b.lambda$loadAppConfig$33((TLRPC.TL_help_appConfig) obj);
                break;
            case 1:
                this.f21632b.lambda$loadWebBrowserConfig$511((TL_account.TL_webBrowserSettings) obj);
                break;
            default:
                this.f21632b.lambda$getAvailableEffects$496((TLRPC.messages_AvailableEffects) obj);
                break;
        }
    }
}
