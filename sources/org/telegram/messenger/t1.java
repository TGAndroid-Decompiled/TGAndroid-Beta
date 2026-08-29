package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t1 implements RequestDelegate {
    public final int f21599a;
    public final Object f21600b;
    public final Object f21601c;

    public t1(int i10, Object obj, Object obj2) {
        this.f21599a = i10;
        this.f21600b = obj;
        this.f21601c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21599a) {
            case 0:
                ((ContactsController) this.f21600b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f21601c, tLObject, tL_error);
                return;
            case 1:
                ((ContactsController) this.f21600b).lambda$deleteAllContacts$9((Runnable) this.f21601c, tLObject, tL_error);
                return;
            case 2:
                ((ContactsController) this.f21600b).lambda$addContact$52((TLRPC.User) this.f21601c, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f21600b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f21601c, tLObject, tL_error);
                return;
            case 4:
                ((MediaDataController) this.f21600b).lambda$saveToRingtones$204((TLRPC.Document) this.f21601c, tLObject, tL_error);
                return;
            case 5:
                ((MediaDataController) this.f21600b).lambda$loadAttachMenuBots$4((Runnable) this.f21601c, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f21600b).lambda$requestIsUserContactBlocked$495((ArrayList) this.f21601c, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f21600b).lambda$changeChatTitle$317((Runnable) this.f21601c, tLObject, tL_error);
                return;
            case 8:
                ((SavedMessagesController) this.f21600b).lambda$loadDialogs$3((ArrayList) this.f21601c, tLObject, tL_error);
                return;
            case 9:
                ((SendMessagesHelper) this.f21600b).lambda$sendReaction$35((Runnable) this.f21601c, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f21600b).lambda$performSendDelayedMessage$50((SendMessagesHelper.DelayedMessage) this.f21601c, tLObject, tL_error);
                return;
            default:
                UserNameResolver.a((String) this.f21601c, (UserNameResolver) this.f21600b, tLObject, tL_error);
                return;
        }
    }
}
