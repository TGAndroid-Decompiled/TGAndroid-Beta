package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class fd implements RequestDelegate {

    public final int f20258a = 0;

    public final long f20259b;

    public final int f20260c;
    public final Object d;

    public final Object f20261e;

    public final Object f20262f;

    public fd(MessagesController messagesController, long j10, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f20259b = j10;
        this.f20261e = callback;
        this.f20262f = user;
        this.f20260c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20258a) {
            case 0:
                ((MessagesController) this.d).lambda$loadFullUser$72(this.f20259b, (Utilities.Callback) this.f20261e, (TLRPC.User) this.f20262f, this.f20260c, tLObject, tL_error);
                break;
            default:
                AndroidUtilities.runOnUIThread(new hh.v6((org.telegram.ui.Cells.c6) this.d, tLObject, (MessagesStorage) this.f20261e, this.f20259b, this.f20260c, (ArrayList) this.f20262f));
                break;
        }
    }

    public fd(org.telegram.ui.Cells.c6 c6Var, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        this.d = c6Var;
        this.f20261e = messagesStorage;
        this.f20259b = j10;
        this.f20260c = i10;
        this.f20262f = arrayList;
    }
}
