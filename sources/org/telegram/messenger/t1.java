package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t1 implements RequestDelegate {
    public final int f19240a;
    public final Object f19241b;
    public final Object f19242c;

    public t1(int i10, Object obj, Object obj2) {
        this.f19240a = i10;
        this.f19241b = obj;
        this.f19242c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19240a) {
            case 0:
                ((ContactsController) this.f19241b).lambda$reloadContactsStatuses$59((SharedPreferences.Editor) this.f19242c, tLObject, tL_error);
                return;
            case 1:
                ((ContactsController) this.f19241b).lambda$deleteAllContacts$9((Runnable) this.f19242c, tLObject, tL_error);
                return;
            case 2:
                ((ContactsController) this.f19241b).lambda$addContact$52((TLRPC.User) this.f19242c, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f19241b).lambda$removeRecentGif$24((TLRPC.TL_messages_saveGif) this.f19242c, tLObject, tL_error);
                return;
            case 4:
                ((MediaDataController) this.f19241b).lambda$saveToRingtones$205((TLRPC.Document) this.f19242c, tLObject, tL_error);
                return;
            case 5:
                ((MediaDataController) this.f19241b).lambda$loadAttachMenuBots$4((Runnable) this.f19242c, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f19241b).lambda$requestIsUserContactBlocked$498((ArrayList) this.f19242c, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f19241b).lambda$changeChatTitle$316((Runnable) this.f19242c, tLObject, tL_error);
                return;
            case 8:
                ((SavedMessagesController) this.f19241b).lambda$loadDialogs$3((ArrayList) this.f19242c, tLObject, tL_error);
                return;
            case 9:
                ((SendMessagesHelper) this.f19241b).lambda$performSendDelayedMessage$53((SendMessagesHelper.DelayedMessage) this.f19242c, tLObject, tL_error);
                return;
            case 10:
                ((SendMessagesHelper) this.f19241b).lambda$sendReaction$38((Runnable) this.f19242c, tLObject, tL_error);
                return;
            default:
                UserNameResolver.a((String) this.f19242c, (UserNameResolver) this.f19241b, tLObject, tL_error);
                return;
        }
    }
}
