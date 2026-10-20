package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tj implements Runnable {
    public final int f19614a;
    public final Object f19615b;
    public final Object f19616c;
    public final Object d;
    public final Object e;

    public tj(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19614a = i10;
        this.f19615b = obj;
        this.f19616c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f19614a) {
            case 0:
                ((SendMessagesHelper) this.f19615b).lambda$sendMessage$22((TLRPC.TL_messages_forwardMessages) this.f19616c, (ArrayList) this.d, (oj) this.e);
                return;
            case 1:
                ((SendMessagesHelper) this.f19615b).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.f19616c, (File) this.d, (MessageObject) this.e);
                return;
            case 2:
                ((UnconfirmedAuthController) this.f19615b).lambda$readCache$0((ArrayList) this.d, (HashSet) this.f19616c, (ArrayList) this.e);
                return;
            default:
                ((UserNameResolver) this.f19615b).lambda$resolve$0((String) this.f19616c, (TLRPC.TL_error) this.d, (TLObject) this.e);
                return;
        }
    }

    public tj(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.f19614a = 2;
        this.f19615b = unconfirmedAuthController;
        this.d = arrayList;
        this.f19616c = hashSet;
        this.e = arrayList2;
    }
}
