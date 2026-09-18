package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s1 implements RequestDelegate {
    public final int f17455a;
    public final Object f17456b;
    public final Object f17457c;

    public s1(int i10, Object obj, Object obj2) {
        this.f17455a = i10;
        this.f17456b = obj;
        this.f17457c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17455a) {
            case 0:
                ((ContactsController) this.f17456b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f17457c, tLObject, tL_error);
                return;
            case 1:
                ((ContactsController) this.f17456b).lambda$deleteAllContacts$9((Runnable) this.f17457c, tLObject, tL_error);
                return;
            case 2:
                ((ContactsController) this.f17456b).lambda$addContact$52((TLRPC.User) this.f17457c, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f17456b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f17457c, tLObject, tL_error);
                return;
            case 4:
                ((MediaDataController) this.f17456b).lambda$saveToRingtones$204((TLRPC.Document) this.f17457c, tLObject, tL_error);
                return;
            case 5:
                ((MediaDataController) this.f17456b).lambda$loadAttachMenuBots$4((Runnable) this.f17457c, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f17456b).lambda$requestIsUserContactBlocked$495((ArrayList) this.f17457c, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f17456b).lambda$changeChatTitle$317((Runnable) this.f17457c, tLObject, tL_error);
                return;
            case 8:
                ((SavedMessagesController) this.f17456b).lambda$loadDialogs$3((ArrayList) this.f17457c, tLObject, tL_error);
                return;
            case 9:
                ((SendMessagesHelper) this.f17456b).lambda$sendReaction$35((Runnable) this.f17457c, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f17456b).lambda$performSendDelayedMessage$50((SendMessagesHelper.DelayedMessage) this.f17457c, tLObject, tL_error);
                return;
            default:
                UserNameResolver.a((String) this.f17457c, (UserNameResolver) this.f17456b, tLObject, tL_error);
                return;
        }
    }
}
