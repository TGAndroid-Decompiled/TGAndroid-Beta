package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class id implements RequestDelegate {
    public final int f20558a = 0;
    public final long f20559b;
    public final int f20560c;
    public final Object d;
    public final Object f20561e;
    public final Object f20562f;

    public id(MessagesController messagesController, long j10, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f20559b = j10;
        this.f20561e = callback;
        this.f20562f = user;
        this.f20560c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20558a) {
            case 0:
                int i10 = this.f20560c;
                ((MessagesController) this.d).lambda$loadFullUser$72(this.f20559b, (Utilities.Callback) this.f20561e, (TLRPC.User) this.f20562f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new jh.t6((org.telegram.ui.Cells.d6) this.d, tLObject, (MessagesStorage) this.f20561e, this.f20559b, this.f20560c, (ArrayList) this.f20562f));
                return;
        }
    }

    public id(org.telegram.ui.Cells.d6 d6Var, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        this.d = d6Var;
        this.f20561e = messagesStorage;
        this.f20559b = j10;
        this.f20560c = i10;
        this.f20562f = arrayList;
    }
}
