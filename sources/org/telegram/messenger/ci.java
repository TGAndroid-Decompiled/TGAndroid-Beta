package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ci implements Runnable {
    public final int f18430a;
    public final Object f18431b;
    public final Object f18432c;
    public final Object d;
    public final Object f18433e;

    public ci(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18430a = i10;
        this.f18432c = obj;
        this.f18431b = obj2;
        this.d = obj3;
        this.f18433e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f18430a) {
            case 0:
                ((SavedMessagesController) this.f18432c).lambda$loadDialogs$2((TLObject) this.f18431b, (ArrayList) this.d, (TLRPC.TL_error) this.f18433e);
                return;
            case 1:
                ((SendMessagesHelper) this.f18432c).lambda$performSendDelayedMessage$57((TLObject) this.f18431b, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f18433e);
                return;
            case 2:
                ((SendMessagesHelper) this.f18432c).lambda$sendMessage$19((TLRPC.TL_messages_forwardMessages) this.f18431b, (ArrayList) this.d, (jj) this.f18433e);
                return;
            case 3:
                ((SendMessagesHelper) this.f18432c).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.f18431b, (File) this.d, (MessageObject) this.f18433e);
                return;
            case 4:
                ((TelegramMediaSession) this.f18432c).lambda$loadBrowseChildren$4((MessagesStorage) this.f18431b, (TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.f18433e);
                return;
            case 5:
                ((UnconfirmedAuthController) this.f18432c).lambda$readCache$0((ArrayList) this.d, (HashSet) this.f18431b, (ArrayList) this.f18433e);
                return;
            default:
                ((UserNameResolver) this.f18432c).lambda$resolve$0((String) this.d, (TLRPC.TL_error) this.f18433e, (TLObject) this.f18431b);
                return;
        }
    }

    public ci(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18430a = 6;
        this.f18432c = userNameResolver;
        this.d = str;
        this.f18433e = tL_error;
        this.f18431b = tLObject;
    }

    public ci(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.f18430a = 5;
        this.f18432c = unconfirmedAuthController;
        this.d = arrayList;
        this.f18431b = hashSet;
        this.f18433e = arrayList2;
    }
}
