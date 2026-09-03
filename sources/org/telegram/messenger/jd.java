package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jd implements RequestDelegate {
    public final int f19066a = 0;
    public final long f19067b;
    public final int f19068c;
    public final Object d;
    public final Object f19069e;
    public final Object f19070f;

    public jd(MessagesController messagesController, long j10, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f19067b = j10;
        this.f19069e = callback;
        this.f19070f = user;
        this.f19068c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19066a) {
            case 0:
                int i10 = this.f19068c;
                ((MessagesController) this.d).lambda$loadFullUser$72(this.f19067b, (Utilities.Callback) this.f19069e, (TLRPC.User) this.f19070f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new mh.u6((org.telegram.ui.Cells.f6) this.d, tLObject, (MessagesStorage) this.f19069e, this.f19067b, this.f19068c, (ArrayList) this.f19070f));
                return;
        }
    }

    public jd(org.telegram.ui.Cells.f6 f6Var, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        this.d = f6Var;
        this.f19069e = messagesStorage;
        this.f19067b = j10;
        this.f19068c = i10;
        this.f19070f = arrayList;
    }
}
