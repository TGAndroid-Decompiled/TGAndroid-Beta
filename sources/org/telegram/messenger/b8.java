package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b8 implements RequestDelegate {
    public final int f14763a;
    public final BaseController f14764b;
    public final Object f14765c;
    public final Object d;

    public b8(BaseController baseController, Object obj, Object obj2, int i10) {
        this.f14763a = i10;
        this.f14764b = baseController;
        this.f14765c = obj;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14763a) {
            case 0:
                ((MediaDataController) this.f14764b).lambda$addRecentSticker$21(this.f14765c, (TLRPC.TL_messages_faveSticker) this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f14764b).lambda$addRecentSticker$22(this.f14765c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f14764b).lambda$createChat$258((org.telegram.ui.ActionBar.p2) this.f14765c, (TLRPC.TL_messages_createChat) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f14764b).lambda$createChat$261((org.telegram.ui.ActionBar.p2) this.f14765c, (TLRPC.TL_channels_createChannel) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f14764b).lambda$saveGif$146(this.f14765c, (TLRPC.TL_messages_saveGif) this.d, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f14764b).lambda$unpinAllMessages$129((TLRPC.Chat) this.f14765c, (TLRPC.User) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f14764b).lambda$saveRecentSticker$147(this.f14765c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f14764b).lambda$toggleChatJoinToSend$280((Runnable) this.f14765c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f14764b).lambda$loadChannelParticipants$149((Long) this.f14765c, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            case 9:
                ((MessagesController) this.f14764b).lambda$updateChatAbout$290((TLRPC.ChatFull) this.f14765c, (String) this.d, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f14764b).lambda$performSendDelayedMessage$58((SendMessagesHelper.DelayedMessage) this.f14765c, (String) this.d, tLObject, tL_error);
                return;
            case 11:
                ((SendMessagesHelper) this.f14764b).lambda$sendNotificationCallback$29((String) this.f14765c, (List) this.d, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f14764b).lambda$editMessage$21((org.telegram.ui.ActionBar.p2) this.f14765c, (TLRPC.TL_messages_editMessage) this.d, tLObject, tL_error);
                return;
        }
    }
}
