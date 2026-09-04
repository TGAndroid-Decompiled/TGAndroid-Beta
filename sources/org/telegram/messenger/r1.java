package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r1 implements RequestDelegate {
    public final int f18841a;
    public final Object f18842b;
    public final Object f18843c;

    public r1(int i10, Object obj, Object obj2) {
        this.f18841a = i10;
        this.f18842b = obj;
        this.f18843c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18841a) {
            case 0:
                ((ContactsController) this.f18842b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f18843c, tLObject, tL_error);
                return;
            case 1:
                ((ContactsController) this.f18842b).lambda$deleteAllContacts$9((Runnable) this.f18843c, tLObject, tL_error);
                return;
            case 2:
                ((ContactsController) this.f18842b).lambda$addContact$52((TLRPC.User) this.f18843c, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f18842b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f18843c, tLObject, tL_error);
                return;
            case 4:
                ((MediaDataController) this.f18842b).lambda$saveToRingtones$204((TLRPC.Document) this.f18843c, tLObject, tL_error);
                return;
            case 5:
                ((MediaDataController) this.f18842b).lambda$loadAttachMenuBots$4((Runnable) this.f18843c, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f18842b).lambda$requestIsUserContactBlocked$495((ArrayList) this.f18843c, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f18842b).lambda$changeChatTitle$317((Runnable) this.f18843c, tLObject, tL_error);
                return;
            case 8:
                ((SavedMessagesController) this.f18842b).lambda$loadDialogs$3((ArrayList) this.f18843c, tLObject, tL_error);
                return;
            case 9:
                ((SendMessagesHelper) this.f18842b).lambda$sendReaction$35((Runnable) this.f18843c, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f18842b).lambda$performSendDelayedMessage$50((SendMessagesHelper.DelayedMessage) this.f18843c, tLObject, tL_error);
                return;
            default:
                UserNameResolver.a((String) this.f18843c, (UserNameResolver) this.f18842b, tLObject, tL_error);
                return;
        }
    }
}
