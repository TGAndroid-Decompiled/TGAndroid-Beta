package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ad implements Utilities.Callback {
    public final int f19625a;
    public final MessagesController f19626b;

    public ad(MessagesController messagesController, int i10) {
        this.f19625a = i10;
        this.f19626b = messagesController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19625a) {
            case 0:
                this.f19626b.lambda$loadAppConfig$32((TLRPC.TL_help_appConfig) obj);
                return;
            case 1:
                this.f19626b.lambda$loadWebBrowserConfig$516((TL_account.TL_webBrowserSettings) obj);
                return;
            default:
                this.f19626b.lambda$getAvailableEffects$501((TLRPC.messages_AvailableEffects) obj);
                return;
        }
    }
}
