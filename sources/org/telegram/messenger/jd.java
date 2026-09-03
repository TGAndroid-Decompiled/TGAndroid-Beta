package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jd implements RequestDelegate {
    public final int f17558a = 0;
    public final long f17559b;
    public final int f17560c;
    public final Object d;
    public final Object e;
    public final Object f17561f;

    public jd(MessagesController messagesController, long j10, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f17559b = j10;
        this.e = callback;
        this.f17561f = user;
        this.f17560c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17558a) {
            case 0:
                int i10 = this.f17560c;
                ((MessagesController) this.d).lambda$loadFullUser$72(this.f17559b, (Utilities.Callback) this.e, (TLRPC.User) this.f17561f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new lh.u6((org.telegram.ui.Cells.e6) this.d, tLObject, (MessagesStorage) this.e, this.f17559b, this.f17560c, (ArrayList) this.f17561f));
                return;
        }
    }

    public jd(org.telegram.ui.Cells.e6 e6Var, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        this.d = e6Var;
        this.e = messagesStorage;
        this.f17559b = j10;
        this.f17560c = i10;
        this.f17561f = arrayList;
    }
}
