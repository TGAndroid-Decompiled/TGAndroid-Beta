package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fd implements RequestDelegate {
    public final int f17850a = 0;
    public final long f17851b;
    public final int f17852c;
    public final Object d;
    public final Object f17853e;
    public final Object f17854f;

    public fd(MessagesController messagesController, long j3, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f17851b = j3;
        this.f17853e = callback;
        this.f17854f = user;
        this.f17852c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17850a) {
            case 0:
                int i10 = this.f17852c;
                ((MessagesController) this.d).lambda$loadFullUser$72(this.f17851b, (Utilities.Callback) this.f17853e, (TLRPC.User) this.f17854f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ei.q3((org.telegram.ui.Cells.g6) this.d, tLObject, (MessagesStorage) this.f17853e, this.f17851b, this.f17852c, (ArrayList) this.f17854f, 2));
                return;
        }
    }

    public fd(org.telegram.ui.Cells.g6 g6Var, MessagesStorage messagesStorage, long j3, int i10, ArrayList arrayList) {
        this.d = g6Var;
        this.f17853e = messagesStorage;
        this.f17851b = j3;
        this.f17852c = i10;
        this.f17854f = arrayList;
    }
}
