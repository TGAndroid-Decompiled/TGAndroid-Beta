package org.telegram.messenger;

import java.util.List;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class v7 implements RequestDelegate {

    public final int f21776a;

    public final BaseController f21777b;

    public final Object f21778c;
    public final Object d;

    public v7(BaseController baseController, Object obj, Object obj2, int i10) {
        this.f21776a = i10;
        this.f21777b = baseController;
        this.f21778c = obj;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21776a) {
            case 0:
                ((MediaDataController) this.f21777b).lambda$addRecentSticker$21(this.f21778c, (TLRPC.TL_messages_faveSticker) this.d, tLObject, tL_error);
                break;
            case 1:
                ((MediaDataController) this.f21777b).lambda$addRecentSticker$22(this.f21778c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                break;
            case 2:
                ((MessagesController) this.f21777b).lambda$createChat$258((org.telegram.ui.ActionBar.n2) this.f21778c, (TLRPC.TL_messages_createChat) this.d, tLObject, tL_error);
                break;
            case 3:
                ((MessagesController) this.f21777b).lambda$createChat$261((org.telegram.ui.ActionBar.n2) this.f21778c, (TLRPC.TL_channels_createChannel) this.d, tLObject, tL_error);
                break;
            case 4:
                ((MessagesController) this.f21777b).lambda$saveGif$146(this.f21778c, (TLRPC.TL_messages_saveGif) this.d, tLObject, tL_error);
                break;
            case 5:
                ((MessagesController) this.f21777b).lambda$unpinAllMessages$129((TLRPC.Chat) this.f21778c, (TLRPC.User) this.d, tLObject, tL_error);
                break;
            case 6:
                ((MessagesController) this.f21777b).lambda$saveRecentSticker$147(this.f21778c, (TLRPC.TL_messages_saveRecentSticker) this.d, tLObject, tL_error);
                break;
            case 7:
                ((MessagesController) this.f21777b).lambda$toggleChatJoinToSend$280((Runnable) this.f21778c, (Runnable) this.d, tLObject, tL_error);
                break;
            case 8:
                ((MessagesController) this.f21777b).lambda$loadChannelParticipants$149((Long) this.f21778c, (Utilities.Callback) this.d, tLObject, tL_error);
                break;
            case 9:
                ((MessagesController) this.f21777b).lambda$updateChatAbout$290((TLRPC.ChatFull) this.f21778c, (String) this.d, tLObject, tL_error);
                break;
            case 10:
                ((SendMessagesHelper) this.f21777b).lambda$performSendDelayedMessage$58((SendMessagesHelper.DelayedMessage) this.f21778c, (String) this.d, tLObject, tL_error);
                break;
            case 11:
                ((SendMessagesHelper) this.f21777b).lambda$sendNotificationCallback$29((String) this.f21778c, (List) this.d, tLObject, tL_error);
                break;
            default:
                ((SendMessagesHelper) this.f21777b).lambda$editMessage$21((org.telegram.ui.ActionBar.n2) this.f21778c, (TLRPC.TL_messages_editMessage) this.d, tLObject, tL_error);
                break;
        }
    }
}
