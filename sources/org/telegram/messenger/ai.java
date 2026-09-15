package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ai implements Runnable {
    public final int f15691a;
    public final Object f15692b;
    public final Object f15693c;
    public final Object d;
    public final Object e;

    public ai(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f15691a = i10;
        this.f15693c = obj;
        this.f15692b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f15691a) {
            case 0:
                ((SavedMessagesController) this.f15693c).lambda$loadDialogs$2((TLObject) this.f15692b, (ArrayList) this.d, (TLRPC.TL_error) this.e);
                return;
            case 1:
                ((SendMessagesHelper) this.f15693c).lambda$performSendDelayedMessage$57((TLObject) this.f15692b, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e);
                return;
            case 2:
                ((SendMessagesHelper) this.f15693c).lambda$sendMessage$19((TLRPC.TL_messages_forwardMessages) this.f15692b, (ArrayList) this.d, (gj) this.e);
                return;
            case 3:
                ((SendMessagesHelper) this.f15693c).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.f15692b, (File) this.d, (MessageObject) this.e);
                return;
            case 4:
                ((TelegramMediaSession) this.f15693c).lambda$loadBrowseChildren$4((MessagesStorage) this.f15692b, (TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.e);
                return;
            case 5:
                ((UnconfirmedAuthController) this.f15693c).lambda$readCache$0((ArrayList) this.d, (HashSet) this.f15692b, (ArrayList) this.e);
                return;
            default:
                ((UserNameResolver) this.f15693c).lambda$resolve$0((String) this.d, (TLRPC.TL_error) this.e, (TLObject) this.f15692b);
                return;
        }
    }

    public ai(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f15691a = 6;
        this.f15693c = userNameResolver;
        this.d = str;
        this.e = tL_error;
        this.f15692b = tLObject;
    }

    public ai(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.f15691a = 5;
        this.f15693c = unconfirmedAuthController;
        this.d = arrayList;
        this.f15692b = hashSet;
        this.e = arrayList2;
    }
}
