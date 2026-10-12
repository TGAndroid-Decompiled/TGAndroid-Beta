package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ld implements RequestDelegate {
    public final int f18185a = 0;
    public final long f18186b;
    public final int f18187c;
    public final Object d;
    public final Object f18188e;
    public final Object f18189f;

    public ld(MessagesController messagesController, long j3, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f18186b = j3;
        this.f18188e = callback;
        this.f18189f = user;
        this.f18187c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18185a) {
            case 0:
                int i10 = this.f18187c;
                ((MessagesController) this.d).lambda$loadFullUser$71(this.f18186b, (Utilities.Callback) this.f18188e, (TLRPC.User) this.f18189f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ei.p3((org.telegram.ui.Cells.g6) this.d, tLObject, (MessagesStorage) this.f18188e, this.f18186b, this.f18187c, (ArrayList) this.f18189f, 2));
                return;
        }
    }

    public ld(org.telegram.ui.Cells.g6 g6Var, MessagesStorage messagesStorage, long j3, int i10, ArrayList arrayList) {
        this.d = g6Var;
        this.f18188e = messagesStorage;
        this.f18186b = j3;
        this.f18187c = i10;
        this.f18189f = arrayList;
    }
}
