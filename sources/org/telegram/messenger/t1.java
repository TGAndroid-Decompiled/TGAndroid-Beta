package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t1 implements RequestDelegate {
    public final int f21525a;
    public final Object f21526b;
    public final Object f21527c;

    public t1(int i9, Object obj, Object obj2) {
        this.f21525a = i9;
        this.f21526b = obj;
        this.f21527c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21525a) {
            case 0:
                ((ContactsController) this.f21526b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f21527c, tLObject, tL_error);
                return;
            case 1:
                ((ContactsController) this.f21526b).lambda$deleteAllContacts$9((Runnable) this.f21527c, tLObject, tL_error);
                return;
            case 2:
                ((ContactsController) this.f21526b).lambda$addContact$52((TLRPC.User) this.f21527c, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f21526b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f21527c, tLObject, tL_error);
                return;
            case 4:
                ((MediaDataController) this.f21526b).lambda$saveToRingtones$204((TLRPC.Document) this.f21527c, tLObject, tL_error);
                return;
            case 5:
                ((MediaDataController) this.f21526b).lambda$loadAttachMenuBots$4((Runnable) this.f21527c, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f21526b).lambda$requestIsUserContactBlocked$495((ArrayList) this.f21527c, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f21526b).lambda$changeChatTitle$317((Runnable) this.f21527c, tLObject, tL_error);
                return;
            case 8:
                ((SavedMessagesController) this.f21526b).lambda$loadDialogs$3((ArrayList) this.f21527c, tLObject, tL_error);
                return;
            case 9:
                ((SendMessagesHelper) this.f21526b).lambda$sendReaction$35((Runnable) this.f21527c, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f21526b).lambda$performSendDelayedMessage$50((SendMessagesHelper.DelayedMessage) this.f21527c, tLObject, tL_error);
                return;
            default:
                UserNameResolver.a((String) this.f21527c, (UserNameResolver) this.f21526b, tLObject, tL_error);
                return;
        }
    }
}
