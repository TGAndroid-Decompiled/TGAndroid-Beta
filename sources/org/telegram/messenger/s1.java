package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s1 implements RequestDelegate {
    public final int f17504a;
    public final Object f17505b;
    public final Object f17506c;

    public s1(int i10, Object obj, Object obj2) {
        this.f17504a = i10;
        this.f17505b = obj;
        this.f17506c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17504a) {
            case 0:
                ((ContactsController) this.f17505b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f17506c, tLObject, tL_error);
                return;
            case 1:
                ((ContactsController) this.f17505b).lambda$deleteAllContacts$9((Runnable) this.f17506c, tLObject, tL_error);
                return;
            case 2:
                ((ContactsController) this.f17505b).lambda$addContact$52((TLRPC.User) this.f17506c, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f17505b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f17506c, tLObject, tL_error);
                return;
            case 4:
                ((MediaDataController) this.f17505b).lambda$saveToRingtones$204((TLRPC.Document) this.f17506c, tLObject, tL_error);
                return;
            case 5:
                ((MediaDataController) this.f17505b).lambda$loadAttachMenuBots$4((Runnable) this.f17506c, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f17505b).lambda$requestIsUserContactBlocked$495((ArrayList) this.f17506c, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f17505b).lambda$changeChatTitle$317((Runnable) this.f17506c, tLObject, tL_error);
                return;
            case 8:
                ((SavedMessagesController) this.f17505b).lambda$loadDialogs$3((ArrayList) this.f17506c, tLObject, tL_error);
                return;
            case 9:
                ((SendMessagesHelper) this.f17505b).lambda$sendReaction$35((Runnable) this.f17506c, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f17505b).lambda$performSendDelayedMessage$50((SendMessagesHelper.DelayedMessage) this.f17506c, tLObject, tL_error);
                return;
            default:
                UserNameResolver.a((String) this.f17506c, (UserNameResolver) this.f17505b, tLObject, tL_error);
                return;
        }
    }
}
