package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v1 implements RequestDelegate {
    public final int f16551a;
    public final Object f16552b;
    public final Object f16553c;

    public v1(int i10, Object obj, Object obj2) {
        this.f16551a = i10;
        this.f16552b = obj;
        this.f16553c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16551a) {
            case 0:
                ((ContactsController) this.f16552b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f16553c, tLObject, tL_error);
                return;
            case 1:
                ((ContactsController) this.f16552b).lambda$deleteAllContacts$9((Runnable) this.f16553c, tLObject, tL_error);
                return;
            case 2:
                ((ContactsController) this.f16552b).lambda$addContact$52((TLRPC.User) this.f16553c, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f16552b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f16553c, tLObject, tL_error);
                return;
            case 4:
                ((MediaDataController) this.f16552b).lambda$saveToRingtones$204((TLRPC.Document) this.f16553c, tLObject, tL_error);
                return;
            case 5:
                ((MediaDataController) this.f16552b).lambda$loadAttachMenuBots$4((Runnable) this.f16553c, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f16552b).lambda$requestIsUserContactBlocked$495((ArrayList) this.f16553c, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f16552b).lambda$changeChatTitle$317((Runnable) this.f16553c, tLObject, tL_error);
                return;
            case 8:
                ((SavedMessagesController) this.f16552b).lambda$loadDialogs$3((ArrayList) this.f16553c, tLObject, tL_error);
                return;
            case 9:
                ((SendMessagesHelper) this.f16552b).lambda$sendReaction$35((Runnable) this.f16553c, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f16552b).lambda$performSendDelayedMessage$50((SendMessagesHelper.DelayedMessage) this.f16553c, tLObject, tL_error);
                return;
            default:
                UserNameResolver.a((String) this.f16553c, (UserNameResolver) this.f16552b, tLObject, tL_error);
                return;
        }
    }
}
