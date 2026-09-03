package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y7 implements RequestDelegate {
    public final int f19010a;
    public final BaseController f19011b;
    public final Object f19012c;
    public final Object d;

    public y7(BaseController baseController, Object obj, Object obj2, int i10) {
        this.f19010a = i10;
        this.f19011b = baseController;
        this.f19012c = obj;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19010a) {
            case 0:
                ((MediaDataController) this.f19011b).lambda$addRecentSticker$21(this.f19012c, (TLRPC.TL_messages_faveSticker) this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f19011b).lambda$addRecentSticker$22(this.f19012c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f19011b).lambda$createChat$258((org.telegram.ui.ActionBar.p2) this.f19012c, (TLRPC.TL_messages_createChat) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f19011b).lambda$createChat$261((org.telegram.ui.ActionBar.p2) this.f19012c, (TLRPC.TL_channels_createChannel) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f19011b).lambda$saveGif$146(this.f19012c, (TLRPC.TL_messages_saveGif) this.d, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f19011b).lambda$unpinAllMessages$129((TLRPC.Chat) this.f19012c, (TLRPC.User) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f19011b).lambda$saveRecentSticker$147(this.f19012c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f19011b).lambda$toggleChatJoinToSend$280((Runnable) this.f19012c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f19011b).lambda$loadChannelParticipants$149((Long) this.f19012c, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            case 9:
                ((MessagesController) this.f19011b).lambda$updateChatAbout$290((TLRPC.ChatFull) this.f19012c, (String) this.d, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f19011b).lambda$performSendDelayedMessage$58((SendMessagesHelper.DelayedMessage) this.f19012c, (String) this.d, tLObject, tL_error);
                return;
            case 11:
                ((SendMessagesHelper) this.f19011b).lambda$sendNotificationCallback$29((String) this.f19012c, (List) this.d, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f19011b).lambda$editMessage$21((org.telegram.ui.ActionBar.p2) this.f19012c, (TLRPC.TL_messages_editMessage) this.d, tLObject, tL_error);
                return;
        }
    }
}
