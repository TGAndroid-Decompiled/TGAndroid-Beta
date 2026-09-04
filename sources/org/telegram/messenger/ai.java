package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ai implements Runnable {
    public final int f17175a;
    public final Object f17176b;
    public final Object f17177c;
    public final Object d;
    public final Object f17178e;

    public ai(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17175a = i10;
        this.f17177c = obj;
        this.f17176b = obj2;
        this.d = obj3;
        this.f17178e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f17175a) {
            case 0:
                ((SavedMessagesController) this.f17177c).lambda$loadDialogs$2((TLObject) this.f17176b, (ArrayList) this.d, (TLRPC.TL_error) this.f17178e);
                return;
            case 1:
                ((SendMessagesHelper) this.f17177c).lambda$performSendDelayedMessage$57((TLObject) this.f17176b, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f17178e);
                return;
            case 2:
                ((SendMessagesHelper) this.f17177c).lambda$sendMessage$19((TLRPC.TL_messages_forwardMessages) this.f17176b, (ArrayList) this.d, (gj) this.f17178e);
                return;
            case 3:
                ((SendMessagesHelper) this.f17177c).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.f17176b, (File) this.d, (MessageObject) this.f17178e);
                return;
            case 4:
                ((TelegramMediaSession) this.f17177c).lambda$loadBrowseChildren$4((MessagesStorage) this.f17176b, (TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.f17178e);
                return;
            case 5:
                ((UnconfirmedAuthController) this.f17177c).lambda$readCache$0((ArrayList) this.d, (HashSet) this.f17176b, (ArrayList) this.f17178e);
                return;
            default:
                ((UserNameResolver) this.f17177c).lambda$resolve$0((String) this.d, (TLRPC.TL_error) this.f17178e, (TLObject) this.f17176b);
                return;
        }
    }

    public ai(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17175a = 6;
        this.f17177c = userNameResolver;
        this.d = str;
        this.f17178e = tL_error;
        this.f17176b = tLObject;
    }

    public ai(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.f17175a = 5;
        this.f17177c = unconfirmedAuthController;
        this.d = arrayList;
        this.f17176b = hashSet;
        this.f17178e = arrayList2;
    }
}
