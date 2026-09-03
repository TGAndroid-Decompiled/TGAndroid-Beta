package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u1 implements RequestDelegate {
    public final int f18527a;
    public final Object f18528b;
    public final Object f18529c;

    public u1(int i10, Object obj, Object obj2) {
        this.f18527a = i10;
        this.f18528b = obj;
        this.f18529c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18527a) {
            case 0:
                ((ContactsController) this.f18528b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f18529c, tLObject, tL_error);
                return;
            case 1:
                ((ContactsController) this.f18528b).lambda$deleteAllContacts$9((Runnable) this.f18529c, tLObject, tL_error);
                return;
            case 2:
                ((ContactsController) this.f18528b).lambda$addContact$52((TLRPC.User) this.f18529c, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f18528b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f18529c, tLObject, tL_error);
                return;
            case 4:
                ((MediaDataController) this.f18528b).lambda$saveToRingtones$204((TLRPC.Document) this.f18529c, tLObject, tL_error);
                return;
            case 5:
                ((MediaDataController) this.f18528b).lambda$loadAttachMenuBots$4((Runnable) this.f18529c, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f18528b).lambda$requestIsUserContactBlocked$495((ArrayList) this.f18529c, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f18528b).lambda$changeChatTitle$317((Runnable) this.f18529c, tLObject, tL_error);
                return;
            case 8:
                ((SavedMessagesController) this.f18528b).lambda$loadDialogs$3((ArrayList) this.f18529c, tLObject, tL_error);
                return;
            case 9:
                ((SendMessagesHelper) this.f18528b).lambda$sendReaction$35((Runnable) this.f18529c, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f18528b).lambda$performSendDelayedMessage$50((SendMessagesHelper.DelayedMessage) this.f18529c, tLObject, tL_error);
                return;
            default:
                UserNameResolver.a((String) this.f18529c, (UserNameResolver) this.f18528b, tLObject, tL_error);
                return;
        }
    }
}
