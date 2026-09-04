package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v7 implements RequestDelegate {
    public final int f19210a;
    public final BaseController f19211b;
    public final Object f19212c;
    public final Object d;

    public v7(BaseController baseController, Object obj, Object obj2, int i10) {
        this.f19210a = i10;
        this.f19211b = baseController;
        this.f19212c = obj;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19210a) {
            case 0:
                ((MediaDataController) this.f19211b).lambda$addRecentSticker$21(this.f19212c, (TLRPC.TL_messages_faveSticker) this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f19211b).lambda$addRecentSticker$22(this.f19212c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f19211b).lambda$createChat$258((org.telegram.ui.ActionBar.n2) this.f19212c, (TLRPC.TL_messages_createChat) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f19211b).lambda$createChat$261((org.telegram.ui.ActionBar.n2) this.f19212c, (TLRPC.TL_channels_createChannel) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f19211b).lambda$saveGif$146(this.f19212c, (TLRPC.TL_messages_saveGif) this.d, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f19211b).lambda$unpinAllMessages$129((TLRPC.Chat) this.f19212c, (TLRPC.User) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f19211b).lambda$saveRecentSticker$147(this.f19212c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f19211b).lambda$toggleChatJoinToSend$280((Runnable) this.f19212c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f19211b).lambda$loadChannelParticipants$149((Long) this.f19212c, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            case 9:
                ((MessagesController) this.f19211b).lambda$updateChatAbout$290((TLRPC.ChatFull) this.f19212c, (String) this.d, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f19211b).lambda$performSendDelayedMessage$58((SendMessagesHelper.DelayedMessage) this.f19212c, (String) this.d, tLObject, tL_error);
                return;
            case 11:
                ((SendMessagesHelper) this.f19211b).lambda$sendNotificationCallback$29((String) this.f19212c, (List) this.d, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f19211b).lambda$editMessage$21((org.telegram.ui.ActionBar.n2) this.f19212c, (TLRPC.TL_messages_editMessage) this.d, tLObject, tL_error);
                return;
        }
    }
}
