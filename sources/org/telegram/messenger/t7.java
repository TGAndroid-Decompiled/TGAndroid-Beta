package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t7 implements RequestDelegate {
    public final int f19553a;
    public final BaseController f19554b;
    public final Object f19555c;
    public final Object d;

    public t7(BaseController baseController, Object obj, Object obj2, int i10) {
        this.f19553a = i10;
        this.f19554b = baseController;
        this.f19555c = obj;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19553a) {
            case 0:
                ((MediaDataController) this.f19554b).lambda$addRecentSticker$21(this.f19555c, (TLRPC.TL_messages_faveSticker) this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f19554b).lambda$addRecentSticker$22(this.f19555c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f19554b).lambda$createChat$257((org.telegram.ui.ActionBar.n2) this.f19555c, (TLRPC.TL_messages_createChat) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f19554b).lambda$createChat$260((org.telegram.ui.ActionBar.n2) this.f19555c, (TLRPC.TL_channels_createChannel) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f19554b).lambda$saveGif$145(this.f19555c, (TLRPC.TL_messages_saveGif) this.d, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f19554b).lambda$unpinAllMessages$128((TLRPC.Chat) this.f19555c, (TLRPC.User) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f19554b).lambda$saveRecentSticker$146(this.f19555c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f19554b).lambda$toggleChatJoinToSend$279((Runnable) this.f19555c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f19554b).lambda$loadChannelParticipants$148((Long) this.f19555c, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            case 9:
                ((MessagesController) this.f19554b).lambda$updateChatAbout$289((TLRPC.ChatFull) this.f19555c, (String) this.d, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f19554b).lambda$performSendDelayedMessage$61((SendMessagesHelper.DelayedMessage) this.f19555c, (String) this.d, tLObject, tL_error);
                return;
            case 11:
                ((SendMessagesHelper) this.f19554b).lambda$sendNotificationCallback$32((String) this.f19555c, (List) this.d, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f19554b).lambda$editMessage$24((org.telegram.ui.ActionBar.n2) this.f19555c, (TLRPC.TL_messages_editMessage) this.d, tLObject, tL_error);
                return;
        }
    }
}
