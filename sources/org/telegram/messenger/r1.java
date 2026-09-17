package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r1 implements RequestDelegate {
    public final int f18860a;
    public final Object f18861b;
    public final Object f18862c;

    public r1(int i10, Object obj, Object obj2) {
        this.f18860a = i10;
        this.f18861b = obj;
        this.f18862c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18860a) {
            case 0:
                ((ContactsController) this.f18861b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f18862c, tLObject, tL_error);
                return;
            case 1:
                ((ContactsController) this.f18861b).lambda$deleteAllContacts$9((Runnable) this.f18862c, tLObject, tL_error);
                return;
            case 2:
                ((ContactsController) this.f18861b).lambda$addContact$52((TLRPC.User) this.f18862c, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f18861b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f18862c, tLObject, tL_error);
                return;
            case 4:
                ((MediaDataController) this.f18861b).lambda$saveToRingtones$204((TLRPC.Document) this.f18862c, tLObject, tL_error);
                return;
            case 5:
                ((MediaDataController) this.f18861b).lambda$loadAttachMenuBots$4((Runnable) this.f18862c, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f18861b).lambda$requestIsUserContactBlocked$495((ArrayList) this.f18862c, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f18861b).lambda$changeChatTitle$317((Runnable) this.f18862c, tLObject, tL_error);
                return;
            case 8:
                ((SavedMessagesController) this.f18861b).lambda$loadDialogs$3((ArrayList) this.f18862c, tLObject, tL_error);
                return;
            case 9:
                ((SendMessagesHelper) this.f18861b).lambda$sendReaction$35((Runnable) this.f18862c, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f18861b).lambda$performSendDelayedMessage$50((SendMessagesHelper.DelayedMessage) this.f18862c, tLObject, tL_error);
                return;
            default:
                UserNameResolver.a((String) this.f18862c, (UserNameResolver) this.f18861b, tLObject, tL_error);
                return;
        }
    }
}
