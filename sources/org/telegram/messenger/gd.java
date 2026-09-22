package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gd implements RequestDelegate {
    public final int f16463a = 0;
    public final long f16464b;
    public final int f16465c;
    public final Object d;
    public final Object e;
    public final Object f16466f;

    public gd(MessagesController messagesController, long j3, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f16464b = j3;
        this.e = callback;
        this.f16466f = user;
        this.f16465c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16463a) {
            case 0:
                int i10 = this.f16465c;
                ((MessagesController) this.d).lambda$loadFullUser$72(this.f16464b, (Utilities.Callback) this.e, (TLRPC.User) this.f16466f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ei.p3((org.telegram.ui.Cells.h6) this.d, tLObject, (MessagesStorage) this.e, this.f16464b, this.f16465c, (ArrayList) this.f16466f, 2));
                return;
        }
    }

    public gd(org.telegram.ui.Cells.h6 h6Var, MessagesStorage messagesStorage, long j3, int i10, ArrayList arrayList) {
        this.d = h6Var;
        this.e = messagesStorage;
        this.f16464b = j3;
        this.f16465c = i10;
        this.f16466f = arrayList;
    }
}
