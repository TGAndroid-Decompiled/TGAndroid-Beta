package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w1 implements RequestDelegate {
    public final int f19934a;
    public final Object f19935b;
    public final Object f19936c;

    public w1(int i10, Object obj, Object obj2) {
        this.f19934a = i10;
        this.f19935b = obj;
        this.f19936c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19934a) {
            case 0:
                ((ContactsController) this.f19935b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f19936c, tLObject, tL_error);
                return;
            case 1:
                ((ContactsController) this.f19935b).lambda$deleteAllContacts$9((Runnable) this.f19936c, tLObject, tL_error);
                return;
            case 2:
                ((ContactsController) this.f19935b).lambda$addContact$52((TLRPC.User) this.f19936c, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f19935b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f19936c, tLObject, tL_error);
                return;
            case 4:
                ((MediaDataController) this.f19935b).lambda$saveToRingtones$205((TLRPC.Document) this.f19936c, tLObject, tL_error);
                return;
            case 5:
                ((MediaDataController) this.f19935b).lambda$loadAttachMenuBots$4((Runnable) this.f19936c, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f19935b).lambda$requestIsUserContactBlocked$498((ArrayList) this.f19936c, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f19935b).lambda$changeChatTitle$316((Runnable) this.f19936c, tLObject, tL_error);
                return;
            case 8:
                ((SavedMessagesController) this.f19935b).lambda$loadDialogs$3((ArrayList) this.f19936c, tLObject, tL_error);
                return;
            case 9:
                ((SendMessagesHelper) this.f19935b).lambda$performSendDelayedMessage$53((SendMessagesHelper.DelayedMessage) this.f19936c, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f19935b).lambda$sendReaction$38((Runnable) this.f19936c, tLObject, tL_error);
                return;
            default:
                UserNameResolver.a((String) this.f19936c, (UserNameResolver) this.f19935b, tLObject, tL_error);
                return;
        }
    }
}
