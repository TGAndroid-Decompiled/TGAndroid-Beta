package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t1 implements RequestDelegate {
    public final int f19197a;
    public final Object f19198b;
    public final Object f19199c;

    public t1(int i10, Object obj, Object obj2) {
        this.f19197a = i10;
        this.f19198b = obj;
        this.f19199c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19197a) {
            case 0:
                ((ContactsController) this.f19198b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f19199c, tLObject, tL_error);
                return;
            case 1:
                ((ContactsController) this.f19198b).lambda$deleteAllContacts$9((Runnable) this.f19199c, tLObject, tL_error);
                return;
            case 2:
                ((ContactsController) this.f19198b).lambda$addContact$52((TLRPC.User) this.f19199c, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f19198b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f19199c, tLObject, tL_error);
                return;
            case 4:
                ((MediaDataController) this.f19198b).lambda$saveToRingtones$205((TLRPC.Document) this.f19199c, tLObject, tL_error);
                return;
            case 5:
                ((MediaDataController) this.f19198b).lambda$loadAttachMenuBots$4((Runnable) this.f19199c, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f19198b).lambda$requestIsUserContactBlocked$495((ArrayList) this.f19199c, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f19198b).lambda$changeChatTitle$317((Runnable) this.f19199c, tLObject, tL_error);
                return;
            case 8:
                ((SavedMessagesController) this.f19198b).lambda$loadDialogs$3((ArrayList) this.f19199c, tLObject, tL_error);
                return;
            case 9:
                ((SendMessagesHelper) this.f19198b).lambda$sendReaction$35((Runnable) this.f19199c, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f19198b).lambda$performSendDelayedMessage$50((SendMessagesHelper.DelayedMessage) this.f19199c, tLObject, tL_error);
                return;
            default:
                UserNameResolver.a((String) this.f19199c, (UserNameResolver) this.f19198b, tLObject, tL_error);
                return;
        }
    }
}
