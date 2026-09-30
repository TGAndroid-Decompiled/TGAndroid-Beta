package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t1 implements RequestDelegate {
    public final int f17590a;
    public final Object f17591b;
    public final Object f17592c;

    public t1(int i10, Object obj, Object obj2) {
        this.f17590a = i10;
        this.f17591b = obj;
        this.f17592c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17590a) {
            case 0:
                ((ContactsController) this.f17591b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f17592c, tLObject, tL_error);
                return;
            case 1:
                ((ContactsController) this.f17591b).lambda$deleteAllContacts$9((Runnable) this.f17592c, tLObject, tL_error);
                return;
            case 2:
                ((ContactsController) this.f17591b).lambda$addContact$52((TLRPC.User) this.f17592c, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f17591b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f17592c, tLObject, tL_error);
                return;
            case 4:
                ((MediaDataController) this.f17591b).lambda$saveToRingtones$205((TLRPC.Document) this.f17592c, tLObject, tL_error);
                return;
            case 5:
                ((MediaDataController) this.f17591b).lambda$loadAttachMenuBots$4((Runnable) this.f17592c, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f17591b).lambda$requestIsUserContactBlocked$495((ArrayList) this.f17592c, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f17591b).lambda$changeChatTitle$317((Runnable) this.f17592c, tLObject, tL_error);
                return;
            case 8:
                ((SavedMessagesController) this.f17591b).lambda$loadDialogs$3((ArrayList) this.f17592c, tLObject, tL_error);
                return;
            case 9:
                ((SendMessagesHelper) this.f17591b).lambda$sendReaction$35((Runnable) this.f17592c, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f17591b).lambda$performSendDelayedMessage$50((SendMessagesHelper.DelayedMessage) this.f17592c, tLObject, tL_error);
                return;
            default:
                UserNameResolver.a((String) this.f17592c, (UserNameResolver) this.f17591b, tLObject, tL_error);
                return;
        }
    }
}
