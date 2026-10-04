package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fd implements RequestDelegate {
    public final int f17844a = 0;
    public final long f17845b;
    public final int f17846c;
    public final Object d;
    public final Object f17847e;
    public final Object f17848f;

    public fd(MessagesController messagesController, long j3, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f17845b = j3;
        this.f17847e = callback;
        this.f17848f = user;
        this.f17846c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17844a) {
            case 0:
                int i10 = this.f17846c;
                ((MessagesController) this.d).lambda$loadFullUser$72(this.f17845b, (Utilities.Callback) this.f17847e, (TLRPC.User) this.f17848f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ei.q3((org.telegram.ui.Cells.g6) this.d, tLObject, (MessagesStorage) this.f17847e, this.f17845b, this.f17846c, (ArrayList) this.f17848f, 2));
                return;
        }
    }

    public fd(org.telegram.ui.Cells.g6 g6Var, MessagesStorage messagesStorage, long j3, int i10, ArrayList arrayList) {
        this.d = g6Var;
        this.f17847e = messagesStorage;
        this.f17845b = j3;
        this.f17846c = i10;
        this.f17848f = arrayList;
    }
}
