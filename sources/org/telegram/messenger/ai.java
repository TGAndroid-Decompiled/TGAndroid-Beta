package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ai implements Runnable {
    public final int f15687a;
    public final Object f15688b;
    public final Object f15689c;
    public final Object d;
    public final Object e;

    public ai(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f15687a = i10;
        this.f15689c = obj;
        this.f15688b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f15687a) {
            case 0:
                ((SavedMessagesController) this.f15689c).lambda$loadDialogs$2((TLObject) this.f15688b, (ArrayList) this.d, (TLRPC.TL_error) this.e);
                return;
            case 1:
                ((SendMessagesHelper) this.f15689c).lambda$performSendDelayedMessage$57((TLObject) this.f15688b, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e);
                return;
            case 2:
                ((SendMessagesHelper) this.f15689c).lambda$sendMessage$19((TLRPC.TL_messages_forwardMessages) this.f15688b, (ArrayList) this.d, (gj) this.e);
                return;
            case 3:
                ((SendMessagesHelper) this.f15689c).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.f15688b, (File) this.d, (MessageObject) this.e);
                return;
            case 4:
                ((TelegramMediaSession) this.f15689c).lambda$loadBrowseChildren$4((MessagesStorage) this.f15688b, (TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.e);
                return;
            case 5:
                ((UnconfirmedAuthController) this.f15689c).lambda$readCache$0((ArrayList) this.d, (HashSet) this.f15688b, (ArrayList) this.e);
                return;
            default:
                ((UserNameResolver) this.f15689c).lambda$resolve$0((String) this.d, (TLRPC.TL_error) this.e, (TLObject) this.f15688b);
                return;
        }
    }

    public ai(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f15687a = 6;
        this.f15689c = userNameResolver;
        this.d = str;
        this.e = tL_error;
        this.f15688b = tLObject;
    }

    public ai(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.f15687a = 5;
        this.f15689c = unconfirmedAuthController;
        this.d = arrayList;
        this.f15688b = hashSet;
        this.e = arrayList2;
    }
}
