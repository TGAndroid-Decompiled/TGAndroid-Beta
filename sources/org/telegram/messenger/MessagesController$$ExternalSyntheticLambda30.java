package org.telegram.messenger;

import java.util.List;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;

public final class MessagesController$$ExternalSyntheticLambda30 implements RequestDelegate {
    public final int $r8$classId;
    public final BaseController f$0;
    public final Object f$1;
    public final Object f$2;

    public MessagesController$$ExternalSyntheticLambda30(BaseController baseController, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = baseController;
        this.f$1 = obj;
        this.f$2 = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesController) this.f$0).lambda$toggleChatJoinToSend$280((Runnable) this.f$1, (Runnable) this.f$2, tLObject, tL_error);
                break;
            case 1:
                ((MediaDataController) this.f$0).lambda$addRecentSticker$21(this.f$1, (TLRPC.TL_messages_faveSticker) this.f$2, tLObject, tL_error);
                break;
            case 2:
                ((MediaDataController) this.f$0).lambda$addRecentSticker$22(this.f$1, (TLRPC.TL_messages_saveRecentSticker) this.f$2, tLObject, tL_error);
                break;
            case 3:
                ((MessagesController) this.f$0).lambda$createChat$258((BaseFragment) this.f$1, (TLRPC.TL_messages_createChat) this.f$2, tLObject, tL_error);
                break;
            case 4:
                ((MessagesController) this.f$0).lambda$createChat$261((BaseFragment) this.f$1, (TLRPC.TL_channels_createChannel) this.f$2, tLObject, tL_error);
                break;
            case 5:
                ((MessagesController) this.f$0).lambda$saveGif$146(this.f$1, (TLRPC.TL_messages_saveGif) this.f$2, tLObject, tL_error);
                break;
            case 6:
                ((MessagesController) this.f$0).lambda$unpinAllMessages$129((TLRPC.Chat) this.f$1, (TLRPC.User) this.f$2, tLObject, tL_error);
                break;
            case 7:
                ((MessagesController) this.f$0).lambda$saveRecentSticker$147(this.f$1, (TLRPC.TL_messages_saveRecentSticker) this.f$2, tLObject, tL_error);
                break;
            case 8:
                ((MessagesController) this.f$0).lambda$loadChannelParticipants$149((Long) this.f$1, (Utilities.Callback) this.f$2, tLObject, tL_error);
                break;
            case 9:
                ((MessagesController) this.f$0).lambda$updateChatAbout$290((TLRPC.ChatFull) this.f$1, (String) this.f$2, tLObject, tL_error);
                break;
            case 10:
                ((SendMessagesHelper) this.f$0).lambda$performSendDelayedMessage$58((SendMessagesHelper.DelayedMessage) this.f$1, (String) this.f$2, tLObject, tL_error);
                break;
            case 11:
                ((SendMessagesHelper) this.f$0).lambda$sendNotificationCallback$29((String) this.f$1, (List) this.f$2, tLObject, tL_error);
                break;
            default:
                ((SendMessagesHelper) this.f$0).lambda$editMessage$21((BaseFragment) this.f$1, (TLRPC.TL_messages_editMessage) this.f$2, tLObject, tL_error);
                break;
        }
    }
}
