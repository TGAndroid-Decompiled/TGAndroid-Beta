package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gd implements RequestDelegate {
    public final int f17794a = 0;
    public final long f17795b;
    public final int f17796c;
    public final Object d;
    public final Object f17797e;
    public final Object f17798f;

    public gd(MessagesController messagesController, long j3, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f17795b = j3;
        this.f17797e = callback;
        this.f17798f = user;
        this.f17796c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17794a) {
            case 0:
                int i10 = this.f17796c;
                ((MessagesController) this.d).lambda$loadFullUser$72(this.f17795b, (Utilities.Callback) this.f17797e, (TLRPC.User) this.f17798f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new fi.p3((org.telegram.ui.Cells.f6) this.d, tLObject, (MessagesStorage) this.f17797e, this.f17795b, this.f17796c, (ArrayList) this.f17798f, 2));
                return;
        }
    }

    public gd(org.telegram.ui.Cells.f6 f6Var, MessagesStorage messagesStorage, long j3, int i10, ArrayList arrayList) {
        this.d = f6Var;
        this.f17797e = messagesStorage;
        this.f17795b = j3;
        this.f17796c = i10;
        this.f17798f = arrayList;
    }
}
