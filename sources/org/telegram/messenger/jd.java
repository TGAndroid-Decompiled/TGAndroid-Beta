package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jd implements RequestDelegate {
    public final int f19064a = 0;
    public final long f19065b;
    public final int f19066c;
    public final Object d;
    public final Object f19067e;
    public final Object f19068f;

    public jd(MessagesController messagesController, long j10, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f19065b = j10;
        this.f19067e = callback;
        this.f19068f = user;
        this.f19066c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19064a) {
            case 0:
                int i10 = this.f19066c;
                ((MessagesController) this.d).lambda$loadFullUser$72(this.f19065b, (Utilities.Callback) this.f19067e, (TLRPC.User) this.f19068f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new mh.u6((org.telegram.ui.Cells.f6) this.d, tLObject, (MessagesStorage) this.f19067e, this.f19065b, this.f19066c, (ArrayList) this.f19068f));
                return;
        }
    }

    public jd(org.telegram.ui.Cells.f6 f6Var, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        this.d = f6Var;
        this.f19067e = messagesStorage;
        this.f19065b = j10;
        this.f19066c = i10;
        this.f19068f = arrayList;
    }
}
