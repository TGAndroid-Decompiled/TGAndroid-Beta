package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vj implements Runnable {
    public final int f19832a;
    public final Object f19833b;
    public final Object f19834c;
    public final Object d;
    public final Object e;

    public vj(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19832a = i10;
        this.f19833b = obj;
        this.f19834c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f19832a) {
            case 0:
                ((SendMessagesHelper) this.f19833b).lambda$sendMessage$22((TLRPC.TL_messages_forwardMessages) this.f19834c, (ArrayList) this.d, (qj) this.e);
                return;
            case 1:
                ((SendMessagesHelper) this.f19833b).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.f19834c, (File) this.d, (MessageObject) this.e);
                return;
            case 2:
                ((UnconfirmedAuthController) this.f19833b).lambda$readCache$0((ArrayList) this.d, (HashSet) this.f19834c, (ArrayList) this.e);
                return;
            default:
                ((UserNameResolver) this.f19833b).lambda$resolve$0((String) this.f19834c, (TLRPC.TL_error) this.d, (TLObject) this.e);
                return;
        }
    }

    public vj(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.f19832a = 2;
        this.f19833b = unconfirmedAuthController;
        this.d = arrayList;
        this.f19834c = hashSet;
        this.e = arrayList2;
    }
}
