package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class bd implements Utilities.Callback {
    public final int f18029a;
    public final MessagesController f18030b;

    public bd(MessagesController messagesController, int i10) {
        this.f18029a = i10;
        this.f18030b = messagesController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18029a) {
            case 0:
                this.f18030b.lambda$loadAppConfig$32((TLRPC.TL_help_appConfig) obj);
                return;
            case 1:
                this.f18030b.lambda$loadWebBrowserConfig$514((TL_account.TL_webBrowserSettings) obj);
                return;
            default:
                this.f18030b.lambda$getAvailableEffects$499((TLRPC.messages_AvailableEffects) obj);
                return;
        }
    }
}
