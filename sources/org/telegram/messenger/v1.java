package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v1 implements RequestDelegate {
    public final int f18630a;
    public final Object f18631b;
    public final Object f18632c;

    public v1(int i10, Object obj, Object obj2) {
        this.f18630a = i10;
        this.f18631b = obj;
        this.f18632c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18630a) {
            case 0:
                ((ContactsController) this.f18631b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f18632c, tLObject, tL_error);
                return;
            case 1:
                ((ContactsController) this.f18631b).lambda$deleteAllContacts$9((Runnable) this.f18632c, tLObject, tL_error);
                return;
            case 2:
                ((ContactsController) this.f18631b).lambda$addContact$52((TLRPC.User) this.f18632c, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f18631b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f18632c, tLObject, tL_error);
                return;
            case 4:
                ((MediaDataController) this.f18631b).lambda$saveToRingtones$205((TLRPC.Document) this.f18632c, tLObject, tL_error);
                return;
            case 5:
                ((MediaDataController) this.f18631b).lambda$loadAttachMenuBots$4((Runnable) this.f18632c, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f18631b).lambda$requestIsUserContactBlocked$498((ArrayList) this.f18632c, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f18631b).lambda$changeChatTitle$316((Runnable) this.f18632c, tLObject, tL_error);
                return;
            case 8:
                ((SavedMessagesController) this.f18631b).lambda$loadDialogs$3((ArrayList) this.f18632c, tLObject, tL_error);
                return;
            case 9:
                ((SendMessagesHelper) this.f18631b).lambda$performSendDelayedMessage$53((SendMessagesHelper.DelayedMessage) this.f18632c, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f18631b).lambda$sendReaction$38((Runnable) this.f18632c, tLObject, tL_error);
                return;
            default:
                UserNameResolver.a((String) this.f18632c, (UserNameResolver) this.f18631b, tLObject, tL_error);
                return;
        }
    }
}
