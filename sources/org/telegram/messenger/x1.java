package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x1 implements RequestDelegate {
    public final int f21789a;
    public final Object f21790b;
    public final Object f21791c;

    public x1(int i10, Object obj, Object obj2) {
        this.f21789a = i10;
        this.f21790b = obj;
        this.f21791c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21789a) {
            case 0:
                ((ContactsController) this.f21790b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f21791c, tLObject, tL_error);
                return;
            case 1:
                ((ContactsController) this.f21790b).lambda$deleteAllContacts$9((Runnable) this.f21791c, tLObject, tL_error);
                return;
            case 2:
                ((ContactsController) this.f21790b).lambda$addContact$52((TLRPC.User) this.f21791c, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f21790b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f21791c, tLObject, tL_error);
                return;
            case 4:
                ((MediaDataController) this.f21790b).lambda$saveToRingtones$205((TLRPC.Document) this.f21791c, tLObject, tL_error);
                return;
            case 5:
                ((MediaDataController) this.f21790b).lambda$loadAttachMenuBots$4((Runnable) this.f21791c, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f21790b).lambda$requestIsUserContactBlocked$500((ArrayList) this.f21791c, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f21790b).lambda$changeChatTitle$318((Runnable) this.f21791c, tLObject, tL_error);
                return;
            case 8:
                ((SavedMessagesController) this.f21790b).lambda$loadDialogs$3((ArrayList) this.f21791c, tLObject, tL_error);
                return;
            case 9:
                ((SendMessagesHelper) this.f21790b).lambda$performSendDelayedMessage$53((SendMessagesHelper.DelayedMessage) this.f21791c, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f21790b).lambda$sendReaction$38((Runnable) this.f21791c, tLObject, tL_error);
                return;
            default:
                UserNameResolver.a((String) this.f21791c, (UserNameResolver) this.f21790b, tLObject, tL_error);
                return;
        }
    }
}
