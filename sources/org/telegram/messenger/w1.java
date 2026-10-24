package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w1 implements RequestDelegate {
    public final int f20018a;
    public final Object f20019b;
    public final Object f20020c;

    public w1(int i10, Object obj, Object obj2) {
        this.f20018a = i10;
        this.f20019b = obj;
        this.f20020c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20018a) {
            case 0:
                ((ContactsController) this.f20019b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f20020c, tLObject, tL_error);
                return;
            case 1:
                ((ContactsController) this.f20019b).lambda$deleteAllContacts$9((Runnable) this.f20020c, tLObject, tL_error);
                return;
            case 2:
                ((ContactsController) this.f20019b).lambda$addContact$52((TLRPC.User) this.f20020c, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f20019b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f20020c, tLObject, tL_error);
                return;
            case 4:
                ((MediaDataController) this.f20019b).lambda$saveToRingtones$205((TLRPC.Document) this.f20020c, tLObject, tL_error);
                return;
            case 5:
                ((MediaDataController) this.f20019b).lambda$loadAttachMenuBots$4((Runnable) this.f20020c, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f20019b).lambda$requestIsUserContactBlocked$498((ArrayList) this.f20020c, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f20019b).lambda$changeChatTitle$316((Runnable) this.f20020c, tLObject, tL_error);
                return;
            case 8:
                ((SavedMessagesController) this.f20019b).lambda$loadDialogs$3((ArrayList) this.f20020c, tLObject, tL_error);
                return;
            case 9:
                ((SendMessagesHelper) this.f20019b).lambda$performSendDelayedMessage$53((SendMessagesHelper.DelayedMessage) this.f20020c, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f20019b).lambda$sendReaction$38((Runnable) this.f20020c, tLObject, tL_error);
                return;
            default:
                UserNameResolver.a((String) this.f20020c, (UserNameResolver) this.f20019b, tLObject, tL_error);
                return;
        }
    }
}
