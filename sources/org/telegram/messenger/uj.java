package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uj implements Runnable {
    public final int f19713a;
    public final Object f19714b;
    public final Object f19715c;
    public final Object d;
    public final Object e;

    public uj(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19713a = i10;
        this.f19714b = obj;
        this.f19715c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f19713a) {
            case 0:
                ((SendMessagesHelper) this.f19714b).lambda$sendMessage$22((TLRPC.TL_messages_forwardMessages) this.f19715c, (ArrayList) this.d, (pj) this.e);
                return;
            case 1:
                ((SendMessagesHelper) this.f19714b).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.f19715c, (File) this.d, (MessageObject) this.e);
                return;
            case 2:
                ((UnconfirmedAuthController) this.f19714b).lambda$readCache$0((ArrayList) this.d, (HashSet) this.f19715c, (ArrayList) this.e);
                return;
            default:
                ((UserNameResolver) this.f19714b).lambda$resolve$0((String) this.f19715c, (TLRPC.TL_error) this.d, (TLObject) this.e);
                return;
        }
    }

    public uj(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.f19713a = 2;
        this.f19714b = unconfirmedAuthController;
        this.d = arrayList;
        this.f19715c = hashSet;
        this.e = arrayList2;
    }
}
