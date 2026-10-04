package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t1 implements RequestDelegate {
    public final int f19192a;
    public final Object f19193b;
    public final Object f19194c;

    public t1(int i10, Object obj, Object obj2) {
        this.f19192a = i10;
        this.f19193b = obj;
        this.f19194c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19192a) {
            case 0:
                ((ContactsController) this.f19193b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f19194c, tLObject, tL_error);
                return;
            case 1:
                ((ContactsController) this.f19193b).lambda$deleteAllContacts$9((Runnable) this.f19194c, tLObject, tL_error);
                return;
            case 2:
                ((ContactsController) this.f19193b).lambda$addContact$52((TLRPC.User) this.f19194c, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f19193b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f19194c, tLObject, tL_error);
                return;
            case 4:
                ((MediaDataController) this.f19193b).lambda$saveToRingtones$205((TLRPC.Document) this.f19194c, tLObject, tL_error);
                return;
            case 5:
                ((MediaDataController) this.f19193b).lambda$loadAttachMenuBots$4((Runnable) this.f19194c, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f19193b).lambda$requestIsUserContactBlocked$495((ArrayList) this.f19194c, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f19193b).lambda$changeChatTitle$317((Runnable) this.f19194c, tLObject, tL_error);
                return;
            case 8:
                ((SavedMessagesController) this.f19193b).lambda$loadDialogs$3((ArrayList) this.f19194c, tLObject, tL_error);
                return;
            case 9:
                ((SendMessagesHelper) this.f19193b).lambda$sendReaction$35((Runnable) this.f19194c, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f19193b).lambda$performSendDelayedMessage$50((SendMessagesHelper.DelayedMessage) this.f19194c, tLObject, tL_error);
                return;
            default:
                UserNameResolver.a((String) this.f19194c, (UserNameResolver) this.f19193b, tLObject, tL_error);
                return;
        }
    }
}
