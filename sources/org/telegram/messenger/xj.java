package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xj implements Runnable {
    public final int f21854a;
    public final Object f21855b;
    public final Object f21856c;
    public final Object d;
    public final Object e;

    public xj(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f21854a = i10;
        this.f21855b = obj;
        this.f21856c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f21854a) {
            case 0:
                ((SendMessagesHelper) this.f21855b).lambda$sendMessage$22((TLRPC.TL_messages_forwardMessages) this.f21856c, (ArrayList) this.d, (sj) this.e);
                return;
            case 1:
                ((SendMessagesHelper) this.f21855b).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.f21856c, (File) this.d, (MessageObject) this.e);
                return;
            case 2:
                ((UnconfirmedAuthController) this.f21855b).lambda$readCache$0((ArrayList) this.d, (HashSet) this.f21856c, (ArrayList) this.e);
                return;
            default:
                ((UserNameResolver) this.f21855b).lambda$resolve$0((String) this.f21856c, (TLRPC.TL_error) this.d, (TLObject) this.e);
                return;
        }
    }

    public xj(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.f21854a = 2;
        this.f21855b = unconfirmedAuthController;
        this.d = arrayList;
        this.f21856c = hashSet;
        this.e = arrayList2;
    }
}
