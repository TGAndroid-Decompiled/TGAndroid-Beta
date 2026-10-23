package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w1 implements RequestDelegate {
    public final int f19958a;
    public final Object f19959b;
    public final Object f19960c;

    public w1(int i10, Object obj, Object obj2) {
        this.f19958a = i10;
        this.f19959b = obj;
        this.f19960c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19958a) {
            case 0:
                ((ContactsController) this.f19959b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f19960c, tLObject, tL_error);
                return;
            case 1:
                ((ContactsController) this.f19959b).lambda$deleteAllContacts$9((Runnable) this.f19960c, tLObject, tL_error);
                return;
            case 2:
                ((ContactsController) this.f19959b).lambda$addContact$52((TLRPC.User) this.f19960c, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f19959b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f19960c, tLObject, tL_error);
                return;
            case 4:
                ((MediaDataController) this.f19959b).lambda$saveToRingtones$205((TLRPC.Document) this.f19960c, tLObject, tL_error);
                return;
            case 5:
                ((MediaDataController) this.f19959b).lambda$loadAttachMenuBots$4((Runnable) this.f19960c, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f19959b).lambda$requestIsUserContactBlocked$498((ArrayList) this.f19960c, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f19959b).lambda$changeChatTitle$316((Runnable) this.f19960c, tLObject, tL_error);
                return;
            case 8:
                ((SavedMessagesController) this.f19959b).lambda$loadDialogs$3((ArrayList) this.f19960c, tLObject, tL_error);
                return;
            case 9:
                ((SendMessagesHelper) this.f19959b).lambda$performSendDelayedMessage$53((SendMessagesHelper.DelayedMessage) this.f19960c, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f19959b).lambda$sendReaction$38((Runnable) this.f19960c, tLObject, tL_error);
                return;
            default:
                UserNameResolver.a((String) this.f19960c, (UserNameResolver) this.f19959b, tLObject, tL_error);
                return;
        }
    }
}
