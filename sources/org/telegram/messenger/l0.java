package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l0 implements Utilities.Callback2 {
    public final int f17698a;

    public l0(int i10) {
        this.f17698a = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17698a) {
            case 0:
                BotForumHelper.lambda$stopStreaming$2((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                MessagesController.lambda$revertWelcomeEphemeralMessage$126((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                MessagesController.lambda$toggleCommunityCollapsedInDialogs$254((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                MessagesController.lambda$deleteEphemeralMessage$127((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 4:
                MessagesController.lambda$deleteEphemeralMessage$128((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                MessagesController.lambda$deleteAllReactionsFrom$131((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
