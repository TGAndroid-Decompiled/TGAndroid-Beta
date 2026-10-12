package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ld implements RequestDelegate {
    public final int f18184a = 0;
    public final long f18185b;
    public final int f18186c;
    public final Object d;
    public final Object f18187e;
    public final Object f18188f;

    public ld(MessagesController messagesController, long j3, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f18185b = j3;
        this.f18187e = callback;
        this.f18188f = user;
        this.f18186c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18184a) {
            case 0:
                int i10 = this.f18186c;
                ((MessagesController) this.d).lambda$loadFullUser$71(this.f18185b, (Utilities.Callback) this.f18187e, (TLRPC.User) this.f18188f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ei.p3((org.telegram.ui.Cells.g6) this.d, tLObject, (MessagesStorage) this.f18187e, this.f18185b, this.f18186c, (ArrayList) this.f18188f, 2));
                return;
        }
    }

    public ld(org.telegram.ui.Cells.g6 g6Var, MessagesStorage messagesStorage, long j3, int i10, ArrayList arrayList) {
        this.d = g6Var;
        this.f18187e = messagesStorage;
        this.f18185b = j3;
        this.f18186c = i10;
        this.f18188f = arrayList;
    }
}
