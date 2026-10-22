package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class cd implements Utilities.Callback {
    public final int f18085a;
    public final MessagesController f18086b;

    public cd(MessagesController messagesController, int i10) {
        this.f18085a = i10;
        this.f18086b = messagesController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18085a) {
            case 0:
                this.f18086b.lambda$loadAppConfig$32((TLRPC.TL_help_appConfig) obj);
                return;
            case 1:
                this.f18086b.lambda$loadWebBrowserConfig$514((TL_account.TL_webBrowserSettings) obj);
                return;
            default:
                this.f18086b.lambda$getAvailableEffects$499((TLRPC.messages_AvailableEffects) obj);
                return;
        }
    }
}
