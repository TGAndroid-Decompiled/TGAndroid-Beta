package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fd implements RequestDelegate {
    public final int f17707a = 0;
    public final long f17708b;
    public final int f17709c;
    public final Object d;
    public final Object f17710e;
    public final Object f17711f;

    public fd(MessagesController messagesController, long j3, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f17708b = j3;
        this.f17710e = callback;
        this.f17711f = user;
        this.f17709c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17707a) {
            case 0:
                int i10 = this.f17709c;
                ((MessagesController) this.d).lambda$loadFullUser$72(this.f17708b, (Utilities.Callback) this.f17710e, (TLRPC.User) this.f17711f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new fi.p3((org.telegram.ui.Cells.f6) this.d, tLObject, (MessagesStorage) this.f17710e, this.f17708b, this.f17709c, (ArrayList) this.f17711f, 2));
                return;
        }
    }

    public fd(org.telegram.ui.Cells.f6 f6Var, MessagesStorage messagesStorage, long j3, int i10, ArrayList arrayList) {
        this.d = f6Var;
        this.f17710e = messagesStorage;
        this.f17708b = j3;
        this.f17709c = i10;
        this.f17711f = arrayList;
    }
}
