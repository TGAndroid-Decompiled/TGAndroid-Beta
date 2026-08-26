package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class UserNameResolver$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public UserNameResolver$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((UserNameResolver) this.f$0).lambda$resolve$1((String) this.f$1, tLObject, tL_error);
                break;
            case 1:
                ((ContactsController) this.f$0).lambda$addContact$52((TLRPC.User) this.f$1, tLObject, tL_error);
                break;
            case 2:
                ((ContactsController) this.f$0).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f$1, tLObject, tL_error);
                break;
            case 3:
                ((ContactsController) this.f$0).lambda$deleteAllContacts$9((Runnable) this.f$1, tLObject, tL_error);
                break;
            case 4:
                ((MediaDataController) this.f$0).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f$1, tLObject, tL_error);
                break;
            case 5:
                ((MediaDataController) this.f$0).lambda$saveToRingtones$204((TLRPC.Document) this.f$1, tLObject, tL_error);
                break;
            case 6:
                ((MediaDataController) this.f$0).lambda$loadAttachMenuBots$4((Runnable) this.f$1, tLObject, tL_error);
                break;
            case 7:
                ((MessagesController) this.f$0).lambda$requestIsUserContactBlocked$495((ArrayList) this.f$1, tLObject, tL_error);
                break;
            case 8:
                ((MessagesController) this.f$0).lambda$changeChatTitle$317((Runnable) this.f$1, tLObject, tL_error);
                break;
            case 9:
                ((SavedMessagesController) this.f$0).lambda$loadDialogs$3((ArrayList) this.f$1, tLObject, tL_error);
                break;
            case 10:
                ((SendMessagesHelper) this.f$0).lambda$sendReaction$35((Runnable) this.f$1, tLObject, tL_error);
                break;
            default:
                ((SendMessagesHelper) this.f$0).lambda$performSendDelayedMessage$50((SendMessagesHelper.DelayedMessage) this.f$1, tLObject, tL_error);
                break;
        }
    }
}
