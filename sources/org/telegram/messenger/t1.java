package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t1 implements RequestDelegate {
    public final int f17317a;
    public final Object f17318b;
    public final Object f17319c;

    public t1(int i10, Object obj, Object obj2) {
        this.f17317a = i10;
        this.f17318b = obj;
        this.f17319c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17317a) {
            case 0:
                ((ContactsController) this.f17318b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f17319c, tLObject, tL_error);
                return;
            case 1:
                ((ContactsController) this.f17318b).lambda$deleteAllContacts$9((Runnable) this.f17319c, tLObject, tL_error);
                return;
            case 2:
                ((ContactsController) this.f17318b).lambda$addContact$52((TLRPC.User) this.f17319c, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f17318b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f17319c, tLObject, tL_error);
                return;
            case 4:
                ((MediaDataController) this.f17318b).lambda$saveToRingtones$204((TLRPC.Document) this.f17319c, tLObject, tL_error);
                return;
            case 5:
                ((MediaDataController) this.f17318b).lambda$loadAttachMenuBots$4((Runnable) this.f17319c, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f17318b).lambda$requestIsUserContactBlocked$495((ArrayList) this.f17319c, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f17318b).lambda$changeChatTitle$317((Runnable) this.f17319c, tLObject, tL_error);
                return;
            case 8:
                ((SavedMessagesController) this.f17318b).lambda$loadDialogs$3((ArrayList) this.f17319c, tLObject, tL_error);
                return;
            case 9:
                ((SendMessagesHelper) this.f17318b).lambda$sendReaction$35((Runnable) this.f17319c, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f17318b).lambda$performSendDelayedMessage$50((SendMessagesHelper.DelayedMessage) this.f17319c, tLObject, tL_error);
                return;
            default:
                UserNameResolver.a((String) this.f17319c, (UserNameResolver) this.f17318b, tLObject, tL_error);
                return;
        }
    }
}
