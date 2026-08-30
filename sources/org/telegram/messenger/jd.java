package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jd implements RequestDelegate {
    public final int f17577a = 0;
    public final long f17578b;
    public final int f17579c;
    public final Object d;
    public final Object e;
    public final Object f17580f;

    public jd(MessagesController messagesController, long j10, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f17578b = j10;
        this.e = callback;
        this.f17580f = user;
        this.f17579c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17577a) {
            case 0:
                int i10 = this.f17579c;
                ((MessagesController) this.d).lambda$loadFullUser$72(this.f17578b, (Utilities.Callback) this.e, (TLRPC.User) this.f17580f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new lh.u6((org.telegram.ui.Cells.f6) this.d, tLObject, (MessagesStorage) this.e, this.f17578b, this.f17579c, (ArrayList) this.f17580f));
                return;
        }
    }

    public jd(org.telegram.ui.Cells.f6 f6Var, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        this.d = f6Var;
        this.e = messagesStorage;
        this.f17578b = j10;
        this.f17579c = i10;
        this.f17580f = arrayList;
    }
}
