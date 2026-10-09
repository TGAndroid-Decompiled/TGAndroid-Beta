package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class id implements RequestDelegate {
    public final int f18157a = 0;
    public final long f18158b;
    public final int f18159c;
    public final Object d;
    public final Object f18160e;
    public final Object f18161f;

    public id(MessagesController messagesController, long j3, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f18158b = j3;
        this.f18160e = callback;
        this.f18161f = user;
        this.f18159c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18157a) {
            case 0:
                int i10 = this.f18159c;
                ((MessagesController) this.d).lambda$loadFullUser$71(this.f18158b, (Utilities.Callback) this.f18160e, (TLRPC.User) this.f18161f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ei.p3((org.telegram.ui.Cells.g6) this.d, tLObject, (MessagesStorage) this.f18160e, this.f18158b, this.f18159c, (ArrayList) this.f18161f, 2));
                return;
        }
    }

    public id(org.telegram.ui.Cells.g6 g6Var, MessagesStorage messagesStorage, long j3, int i10, ArrayList arrayList) {
        this.d = g6Var;
        this.f18160e = messagesStorage;
        this.f18158b = j3;
        this.f18159c = i10;
        this.f18161f = arrayList;
    }
}
