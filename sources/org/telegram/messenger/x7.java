package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x7 implements RequestDelegate {
    public final int f20056a;
    public final BaseController f20057b;
    public final Object f20058c;
    public final Object d;

    public x7(BaseController baseController, Object obj, Object obj2, int i10) {
        this.f20056a = i10;
        this.f20057b = baseController;
        this.f20058c = obj;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20056a) {
            case 0:
                ((MediaDataController) this.f20057b).lambda$addRecentSticker$21(this.f20058c, (TLRPC.TL_messages_faveSticker) this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f20057b).lambda$addRecentSticker$22(this.f20058c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f20057b).lambda$createChat$257((org.telegram.ui.ActionBar.n2) this.f20058c, (TLRPC.TL_messages_createChat) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f20057b).lambda$createChat$260((org.telegram.ui.ActionBar.n2) this.f20058c, (TLRPC.TL_channels_createChannel) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f20057b).lambda$saveGif$145(this.f20058c, (TLRPC.TL_messages_saveGif) this.d, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f20057b).lambda$unpinAllMessages$128((TLRPC.Chat) this.f20058c, (TLRPC.User) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f20057b).lambda$saveRecentSticker$146(this.f20058c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f20057b).lambda$toggleChatJoinToSend$279((Runnable) this.f20058c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f20057b).lambda$loadChannelParticipants$148((Long) this.f20058c, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            case 9:
                ((MessagesController) this.f20057b).lambda$updateChatAbout$289((TLRPC.ChatFull) this.f20058c, (String) this.d, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f20057b).lambda$performSendDelayedMessage$61((SendMessagesHelper.DelayedMessage) this.f20058c, (String) this.d, tLObject, tL_error);
                return;
            case 11:
                ((SendMessagesHelper) this.f20057b).lambda$sendNotificationCallback$32((String) this.f20058c, (List) this.d, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f20057b).lambda$editMessage$24((org.telegram.ui.ActionBar.n2) this.f20058c, (TLRPC.TL_messages_editMessage) this.d, tLObject, tL_error);
                return;
        }
    }
}
