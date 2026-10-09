package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s7 implements RequestDelegate {
    public final int f19121a;
    public final BaseController f19122b;
    public final Object f19123c;
    public final Object d;

    public s7(BaseController baseController, Object obj, Object obj2, int i10) {
        this.f19121a = i10;
        this.f19122b = baseController;
        this.f19123c = obj;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19121a) {
            case 0:
                ((MediaDataController) this.f19122b).lambda$addRecentSticker$21(this.f19123c, (TLRPC.TL_messages_faveSticker) this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f19122b).lambda$addRecentSticker$22(this.f19123c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f19122b).lambda$createChat$257((org.telegram.ui.ActionBar.n2) this.f19123c, (TLRPC.TL_messages_createChat) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f19122b).lambda$createChat$260((org.telegram.ui.ActionBar.n2) this.f19123c, (TLRPC.TL_channels_createChannel) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f19122b).lambda$saveGif$145(this.f19123c, (TLRPC.TL_messages_saveGif) this.d, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f19122b).lambda$unpinAllMessages$128((TLRPC.Chat) this.f19123c, (TLRPC.User) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f19122b).lambda$saveRecentSticker$146(this.f19123c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f19122b).lambda$toggleChatJoinToSend$279((Runnable) this.f19123c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f19122b).lambda$loadChannelParticipants$148((Long) this.f19123c, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            case 9:
                ((MessagesController) this.f19122b).lambda$updateChatAbout$289((TLRPC.ChatFull) this.f19123c, (String) this.d, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f19122b).lambda$performSendDelayedMessage$61((SendMessagesHelper.DelayedMessage) this.f19123c, (String) this.d, tLObject, tL_error);
                return;
            case 11:
                ((SendMessagesHelper) this.f19122b).lambda$sendNotificationCallback$32((String) this.f19123c, (List) this.d, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f19122b).lambda$editMessage$24((org.telegram.ui.ActionBar.n2) this.f19123c, (TLRPC.TL_messages_editMessage) this.d, tLObject, tL_error);
                return;
        }
    }
}
