package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ci implements Runnable {
    public final int f16985a;
    public final Object f16986b;
    public final Object f16987c;
    public final Object d;
    public final Object e;

    public ci(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f16985a = i10;
        this.f16987c = obj;
        this.f16986b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f16985a) {
            case 0:
                ((SavedMessagesController) this.f16987c).lambda$loadDialogs$2((TLObject) this.f16986b, (ArrayList) this.d, (TLRPC.TL_error) this.e);
                return;
            case 1:
                ((SendMessagesHelper) this.f16987c).lambda$performSendDelayedMessage$57((TLObject) this.f16986b, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e);
                return;
            case 2:
                ((SendMessagesHelper) this.f16987c).lambda$sendMessage$19((TLRPC.TL_messages_forwardMessages) this.f16986b, (ArrayList) this.d, (jj) this.e);
                return;
            case 3:
                ((SendMessagesHelper) this.f16987c).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.f16986b, (File) this.d, (MessageObject) this.e);
                return;
            case 4:
                ((TelegramMediaSession) this.f16987c).lambda$loadBrowseChildren$4((MessagesStorage) this.f16986b, (TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.e);
                return;
            case 5:
                ((UnconfirmedAuthController) this.f16987c).lambda$readCache$0((ArrayList) this.d, (HashSet) this.f16986b, (ArrayList) this.e);
                return;
            default:
                ((UserNameResolver) this.f16987c).lambda$resolve$0((String) this.d, (TLRPC.TL_error) this.e, (TLObject) this.f16986b);
                return;
        }
    }

    public ci(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f16985a = 6;
        this.f16987c = userNameResolver;
        this.d = str;
        this.e = tL_error;
        this.f16986b = tLObject;
    }

    public ci(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.f16985a = 5;
        this.f16987c = unconfirmedAuthController;
        this.d = arrayList;
        this.f16986b = hashSet;
        this.e = arrayList2;
    }
}
