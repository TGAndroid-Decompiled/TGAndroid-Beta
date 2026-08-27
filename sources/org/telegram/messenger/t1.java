package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class t1 implements RequestDelegate {

    public final int f21595a;

    public final Object f21596b;

    public final Object f21597c;

    public t1(int i10, Object obj, Object obj2) {
        this.f21595a = i10;
        this.f21596b = obj;
        this.f21597c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21595a) {
            case 0:
                ((ContactsController) this.f21596b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f21597c, tLObject, tL_error);
                break;
            case 1:
                ((ContactsController) this.f21596b).lambda$deleteAllContacts$9((Runnable) this.f21597c, tLObject, tL_error);
                break;
            case 2:
                ((ContactsController) this.f21596b).lambda$addContact$52((TLRPC.User) this.f21597c, tLObject, tL_error);
                break;
            case 3:
                ((MediaDataController) this.f21596b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f21597c, tLObject, tL_error);
                break;
            case 4:
                ((MediaDataController) this.f21596b).lambda$saveToRingtones$204((TLRPC.Document) this.f21597c, tLObject, tL_error);
                break;
            case 5:
                ((MediaDataController) this.f21596b).lambda$loadAttachMenuBots$4((Runnable) this.f21597c, tLObject, tL_error);
                break;
            case 6:
                ((MessagesController) this.f21596b).lambda$requestIsUserContactBlocked$495((ArrayList) this.f21597c, tLObject, tL_error);
                break;
            case 7:
                ((MessagesController) this.f21596b).lambda$changeChatTitle$317((Runnable) this.f21597c, tLObject, tL_error);
                break;
            case 8:
                ((SavedMessagesController) this.f21596b).lambda$loadDialogs$3((ArrayList) this.f21597c, tLObject, tL_error);
                break;
            case 9:
                ((SendMessagesHelper) this.f21596b).lambda$sendReaction$35((Runnable) this.f21597c, tLObject, tL_error);
                break;
            case 10:
                ((SendMessagesHelper) this.f21596b).lambda$performSendDelayedMessage$50((SendMessagesHelper.DelayedMessage) this.f21597c, tLObject, tL_error);
                break;
            default:
                ((UserNameResolver) this.f21596b).lambda$resolve$1((String) this.f21597c, tLObject, tL_error);
                break;
        }
    }
}
