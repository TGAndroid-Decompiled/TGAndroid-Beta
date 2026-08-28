package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s7 implements RequestDelegate {
    public final int f21462a;
    public final BaseController f21463b;
    public final Object f21464c;
    public final Object d;

    public s7(BaseController baseController, Object obj, Object obj2, int i9) {
        this.f21462a = i9;
        this.f21463b = baseController;
        this.f21464c = obj;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21462a) {
            case 0:
                ((MediaDataController) this.f21463b).lambda$addRecentSticker$21(this.f21464c, (TLRPC.TL_messages_faveSticker) this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f21463b).lambda$addRecentSticker$22(this.f21464c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f21463b).lambda$createChat$258((org.telegram.ui.ActionBar.o2) this.f21464c, (TLRPC.TL_messages_createChat) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f21463b).lambda$createChat$261((org.telegram.ui.ActionBar.o2) this.f21464c, (TLRPC.TL_channels_createChannel) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f21463b).lambda$saveGif$146(this.f21464c, (TLRPC.TL_messages_saveGif) this.d, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f21463b).lambda$unpinAllMessages$129((TLRPC.Chat) this.f21464c, (TLRPC.User) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f21463b).lambda$saveRecentSticker$147(this.f21464c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f21463b).lambda$toggleChatJoinToSend$280((Runnable) this.f21464c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f21463b).lambda$loadChannelParticipants$149((Long) this.f21464c, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            case 9:
                ((MessagesController) this.f21463b).lambda$updateChatAbout$290((TLRPC.ChatFull) this.f21464c, (String) this.d, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f21463b).lambda$performSendDelayedMessage$58((SendMessagesHelper.DelayedMessage) this.f21464c, (String) this.d, tLObject, tL_error);
                return;
            case 11:
                ((SendMessagesHelper) this.f21463b).lambda$sendNotificationCallback$29((String) this.f21464c, (List) this.d, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f21463b).lambda$editMessage$21((org.telegram.ui.ActionBar.o2) this.f21464c, (TLRPC.TL_messages_editMessage) this.d, tLObject, tL_error);
                return;
        }
    }
}
