package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s7 implements RequestDelegate {
    public final int f19125a;
    public final BaseController f19126b;
    public final Object f19127c;
    public final Object d;

    public s7(BaseController baseController, Object obj, Object obj2, int i10) {
        this.f19125a = i10;
        this.f19126b = baseController;
        this.f19127c = obj;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19125a) {
            case 0:
                ((MediaDataController) this.f19126b).lambda$addRecentSticker$21(this.f19127c, (TLRPC.TL_messages_faveSticker) this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f19126b).lambda$addRecentSticker$22(this.f19127c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f19126b).lambda$createChat$257((org.telegram.ui.ActionBar.n2) this.f19127c, (TLRPC.TL_messages_createChat) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f19126b).lambda$createChat$260((org.telegram.ui.ActionBar.n2) this.f19127c, (TLRPC.TL_channels_createChannel) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f19126b).lambda$saveGif$145(this.f19127c, (TLRPC.TL_messages_saveGif) this.d, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f19126b).lambda$unpinAllMessages$128((TLRPC.Chat) this.f19127c, (TLRPC.User) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f19126b).lambda$saveRecentSticker$146(this.f19127c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f19126b).lambda$toggleChatJoinToSend$279((Runnable) this.f19127c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f19126b).lambda$loadChannelParticipants$148((Long) this.f19127c, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            case 9:
                ((MessagesController) this.f19126b).lambda$updateChatAbout$289((TLRPC.ChatFull) this.f19127c, (String) this.d, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f19126b).lambda$performSendDelayedMessage$61((SendMessagesHelper.DelayedMessage) this.f19127c, (String) this.d, tLObject, tL_error);
                return;
            case 11:
                ((SendMessagesHelper) this.f19126b).lambda$sendNotificationCallback$32((String) this.f19127c, (List) this.d, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f19126b).lambda$editMessage$24((org.telegram.ui.ActionBar.n2) this.f19127c, (TLRPC.TL_messages_editMessage) this.d, tLObject, tL_error);
                return;
        }
    }
}
