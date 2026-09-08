package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ai implements Runnable {
    public final int f17202a;
    public final Object f17203b;
    public final Object f17204c;
    public final Object d;
    public final Object f17205e;

    public ai(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17202a = i10;
        this.f17204c = obj;
        this.f17203b = obj2;
        this.d = obj3;
        this.f17205e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f17202a) {
            case 0:
                ((SavedMessagesController) this.f17204c).lambda$loadDialogs$2((TLObject) this.f17203b, (ArrayList) this.d, (TLRPC.TL_error) this.f17205e);
                return;
            case 1:
                ((SendMessagesHelper) this.f17204c).lambda$performSendDelayedMessage$57((TLObject) this.f17203b, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f17205e);
                return;
            case 2:
                ((SendMessagesHelper) this.f17204c).lambda$sendMessage$19((TLRPC.TL_messages_forwardMessages) this.f17203b, (ArrayList) this.d, (gj) this.f17205e);
                return;
            case 3:
                ((SendMessagesHelper) this.f17204c).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.f17203b, (File) this.d, (MessageObject) this.f17205e);
                return;
            case 4:
                ((TelegramMediaSession) this.f17204c).lambda$loadBrowseChildren$4((MessagesStorage) this.f17203b, (TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.f17205e);
                return;
            case 5:
                ((UnconfirmedAuthController) this.f17204c).lambda$readCache$0((ArrayList) this.d, (HashSet) this.f17203b, (ArrayList) this.f17205e);
                return;
            default:
                ((UserNameResolver) this.f17204c).lambda$resolve$0((String) this.d, (TLRPC.TL_error) this.f17205e, (TLObject) this.f17203b);
                return;
        }
    }

    public ai(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17202a = 6;
        this.f17204c = userNameResolver;
        this.d = str;
        this.f17205e = tL_error;
        this.f17203b = tLObject;
    }

    public ai(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.f17202a = 5;
        this.f17204c = unconfirmedAuthController;
        this.d = arrayList;
        this.f17203b = hashSet;
        this.f17205e = arrayList2;
    }
}
