package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v7 implements RequestDelegate {
    public final int f18351a;
    public final BaseController f18352b;
    public final Object f18353c;
    public final Object d;

    public v7(BaseController baseController, Object obj, Object obj2, int i10) {
        this.f18351a = i10;
        this.f18352b = baseController;
        this.f18353c = obj;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18351a) {
            case 0:
                ((MediaDataController) this.f18352b).lambda$addRecentSticker$21(this.f18353c, (TLRPC.TL_messages_faveSticker) this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f18352b).lambda$addRecentSticker$22(this.f18353c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18352b).lambda$createChat$257((org.telegram.ui.ActionBar.m2) this.f18353c, (TLRPC.TL_messages_createChat) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f18352b).lambda$createChat$260((org.telegram.ui.ActionBar.m2) this.f18353c, (TLRPC.TL_channels_createChannel) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f18352b).lambda$saveGif$145(this.f18353c, (TLRPC.TL_messages_saveGif) this.d, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f18352b).lambda$unpinAllMessages$128((TLRPC.Chat) this.f18353c, (TLRPC.User) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f18352b).lambda$saveRecentSticker$146(this.f18353c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f18352b).lambda$toggleChatJoinToSend$279((Runnable) this.f18353c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f18352b).lambda$loadChannelParticipants$148((Long) this.f18353c, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            case 9:
                ((MessagesController) this.f18352b).lambda$updateChatAbout$289((TLRPC.ChatFull) this.f18353c, (String) this.d, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f18352b).lambda$performSendDelayedMessage$61((SendMessagesHelper.DelayedMessage) this.f18353c, (String) this.d, tLObject, tL_error);
                return;
            case 11:
                ((SendMessagesHelper) this.f18352b).lambda$sendNotificationCallback$32((String) this.f18353c, (List) this.d, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f18352b).lambda$editMessage$24((org.telegram.ui.ActionBar.m2) this.f18353c, (TLRPC.TL_messages_editMessage) this.d, tLObject, tL_error);
                return;
        }
    }
}
