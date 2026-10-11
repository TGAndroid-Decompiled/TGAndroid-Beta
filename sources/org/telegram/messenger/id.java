package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class id implements RequestDelegate {
    public final int f18198a = 0;
    public final long f18199b;
    public final int f18200c;
    public final Object d;
    public final Object f18201e;
    public final Object f18202f;

    public id(MessagesController messagesController, long j3, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f18199b = j3;
        this.f18201e = callback;
        this.f18202f = user;
        this.f18200c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18198a) {
            case 0:
                int i10 = this.f18200c;
                ((MessagesController) this.d).lambda$loadFullUser$71(this.f18199b, (Utilities.Callback) this.f18201e, (TLRPC.User) this.f18202f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ei.p3((org.telegram.ui.Cells.g6) this.d, tLObject, (MessagesStorage) this.f18201e, this.f18199b, this.f18200c, (ArrayList) this.f18202f, 2));
                return;
        }
    }

    public id(org.telegram.ui.Cells.g6 g6Var, MessagesStorage messagesStorage, long j3, int i10, ArrayList arrayList) {
        this.d = g6Var;
        this.f18201e = messagesStorage;
        this.f18199b = j3;
        this.f18200c = i10;
        this.f18202f = arrayList;
    }
}
