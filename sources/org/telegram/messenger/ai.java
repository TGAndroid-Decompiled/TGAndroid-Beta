package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ai implements Runnable {
    public final int f15700a;
    public final Object f15701b;
    public final Object f15702c;
    public final Object d;
    public final Object e;

    public ai(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f15700a = i10;
        this.f15702c = obj;
        this.f15701b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f15700a) {
            case 0:
                ((SavedMessagesController) this.f15702c).lambda$loadDialogs$2((TLObject) this.f15701b, (ArrayList) this.d, (TLRPC.TL_error) this.e);
                return;
            case 1:
                ((SendMessagesHelper) this.f15702c).lambda$performSendDelayedMessage$57((TLObject) this.f15701b, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e);
                return;
            case 2:
                ((SendMessagesHelper) this.f15702c).lambda$sendMessage$19((TLRPC.TL_messages_forwardMessages) this.f15701b, (ArrayList) this.d, (gj) this.e);
                return;
            case 3:
                ((SendMessagesHelper) this.f15702c).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.f15701b, (File) this.d, (MessageObject) this.e);
                return;
            case 4:
                ((TelegramMediaSession) this.f15702c).lambda$loadBrowseChildren$4((MessagesStorage) this.f15701b, (TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.e);
                return;
            case 5:
                ((UnconfirmedAuthController) this.f15702c).lambda$readCache$0((ArrayList) this.d, (HashSet) this.f15701b, (ArrayList) this.e);
                return;
            default:
                ((UserNameResolver) this.f15702c).lambda$resolve$0((String) this.d, (TLRPC.TL_error) this.e, (TLObject) this.f15701b);
                return;
        }
    }

    public ai(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f15700a = 6;
        this.f15702c = userNameResolver;
        this.d = str;
        this.e = tL_error;
        this.f15701b = tLObject;
    }

    public ai(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.f15700a = 5;
        this.f15702c = unconfirmedAuthController;
        this.d = arrayList;
        this.f15701b = hashSet;
        this.e = arrayList2;
    }
}
