package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w1 implements RequestDelegate {
    public final int f20023a;
    public final Object f20024b;
    public final Object f20025c;

    public w1(int i10, Object obj, Object obj2) {
        this.f20023a = i10;
        this.f20024b = obj;
        this.f20025c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20023a) {
            case 0:
                ((ContactsController) this.f20024b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f20025c, tLObject, tL_error);
                return;
            case 1:
                ((ContactsController) this.f20024b).lambda$deleteAllContacts$9((Runnable) this.f20025c, tLObject, tL_error);
                return;
            case 2:
                ((ContactsController) this.f20024b).lambda$addContact$52((TLRPC.User) this.f20025c, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f20024b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f20025c, tLObject, tL_error);
                return;
            case 4:
                ((MediaDataController) this.f20024b).lambda$saveToRingtones$205((TLRPC.Document) this.f20025c, tLObject, tL_error);
                return;
            case 5:
                ((MediaDataController) this.f20024b).lambda$loadAttachMenuBots$4((Runnable) this.f20025c, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f20024b).lambda$requestIsUserContactBlocked$498((ArrayList) this.f20025c, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f20024b).lambda$changeChatTitle$316((Runnable) this.f20025c, tLObject, tL_error);
                return;
            case 8:
                ((SavedMessagesController) this.f20024b).lambda$loadDialogs$3((ArrayList) this.f20025c, tLObject, tL_error);
                return;
            case 9:
                ((SendMessagesHelper) this.f20024b).lambda$performSendDelayedMessage$53((SendMessagesHelper.DelayedMessage) this.f20025c, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f20024b).lambda$sendReaction$38((Runnable) this.f20025c, tLObject, tL_error);
                return;
            default:
                UserNameResolver.a((String) this.f20025c, (UserNameResolver) this.f20024b, tLObject, tL_error);
                return;
        }
    }
}
