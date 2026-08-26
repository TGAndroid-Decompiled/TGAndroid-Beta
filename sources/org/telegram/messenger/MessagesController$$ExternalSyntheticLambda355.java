package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class MessagesController$$ExternalSyntheticLambda355 implements Utilities.Callback {
    public final int $r8$classId;
    public final MessagesController f$0;

    public MessagesController$$ExternalSyntheticLambda355(MessagesController messagesController, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadAppConfig$33((TLRPC.TL_help_appConfig) obj);
                break;
            case 1:
                this.f$0.lambda$loadWebBrowserConfig$511((TL_account.TL_webBrowserSettings) obj);
                break;
            default:
                this.f$0.lambda$getAvailableEffects$496((TLRPC.messages_AvailableEffects) obj);
                break;
        }
    }
}
