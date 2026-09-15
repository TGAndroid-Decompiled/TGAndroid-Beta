package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r1 implements RequestDelegate {
    public final int f17188a;
    public final Object f17189b;
    public final Object f17190c;

    public r1(int i10, Object obj, Object obj2) {
        this.f17188a = i10;
        this.f17189b = obj;
        this.f17190c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17188a) {
            case 0:
                ((ContactsController) this.f17189b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f17190c, tLObject, tL_error);
                return;
            case 1:
                ((ContactsController) this.f17189b).lambda$deleteAllContacts$9((Runnable) this.f17190c, tLObject, tL_error);
                return;
            case 2:
                ((ContactsController) this.f17189b).lambda$addContact$52((TLRPC.User) this.f17190c, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f17189b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f17190c, tLObject, tL_error);
                return;
            case 4:
                ((MediaDataController) this.f17189b).lambda$saveToRingtones$204((TLRPC.Document) this.f17190c, tLObject, tL_error);
                return;
            case 5:
                ((MediaDataController) this.f17189b).lambda$loadAttachMenuBots$4((Runnable) this.f17190c, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f17189b).lambda$requestIsUserContactBlocked$495((ArrayList) this.f17190c, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f17189b).lambda$changeChatTitle$317((Runnable) this.f17190c, tLObject, tL_error);
                return;
            case 8:
                ((SavedMessagesController) this.f17189b).lambda$loadDialogs$3((ArrayList) this.f17190c, tLObject, tL_error);
                return;
            case 9:
                ((SendMessagesHelper) this.f17189b).lambda$sendReaction$35((Runnable) this.f17190c, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f17189b).lambda$performSendDelayedMessage$50((SendMessagesHelper.DelayedMessage) this.f17190c, tLObject, tL_error);
                return;
            default:
                UserNameResolver.a((String) this.f17190c, (UserNameResolver) this.f17189b, tLObject, tL_error);
                return;
        }
    }
}
