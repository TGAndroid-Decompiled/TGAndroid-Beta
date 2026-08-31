package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u1 implements RequestDelegate {
    public final int f20148a;
    public final Object f20149b;
    public final Object f20150c;

    public u1(int i10, Object obj, Object obj2) {
        this.f20148a = i10;
        this.f20149b = obj;
        this.f20150c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20148a) {
            case 0:
                ((ContactsController) this.f20149b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f20150c, tLObject, tL_error);
                return;
            case 1:
                ((ContactsController) this.f20149b).lambda$deleteAllContacts$9((Runnable) this.f20150c, tLObject, tL_error);
                return;
            case 2:
                ((ContactsController) this.f20149b).lambda$addContact$52((TLRPC.User) this.f20150c, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f20149b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f20150c, tLObject, tL_error);
                return;
            case 4:
                ((MediaDataController) this.f20149b).lambda$saveToRingtones$204((TLRPC.Document) this.f20150c, tLObject, tL_error);
                return;
            case 5:
                ((MediaDataController) this.f20149b).lambda$loadAttachMenuBots$4((Runnable) this.f20150c, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f20149b).lambda$requestIsUserContactBlocked$495((ArrayList) this.f20150c, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f20149b).lambda$changeChatTitle$317((Runnable) this.f20150c, tLObject, tL_error);
                return;
            case 8:
                ((SavedMessagesController) this.f20149b).lambda$loadDialogs$3((ArrayList) this.f20150c, tLObject, tL_error);
                return;
            case 9:
                ((SendMessagesHelper) this.f20149b).lambda$sendReaction$35((Runnable) this.f20150c, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f20149b).lambda$performSendDelayedMessage$50((SendMessagesHelper.DelayedMessage) this.f20150c, tLObject, tL_error);
                return;
            default:
                UserNameResolver.a((String) this.f20150c, (UserNameResolver) this.f20149b, tLObject, tL_error);
                return;
        }
    }
}
