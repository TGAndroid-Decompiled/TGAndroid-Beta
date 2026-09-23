package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fd implements RequestDelegate {
    public final int f16109a = 0;
    public final long f16110b;
    public final int f16111c;
    public final Object d;
    public final Object e;
    public final Object f16112f;

    public fd(MessagesController messagesController, long j3, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f16110b = j3;
        this.e = callback;
        this.f16112f = user;
        this.f16111c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16109a) {
            case 0:
                int i10 = this.f16111c;
                ((MessagesController) this.d).lambda$loadFullUser$72(this.f16110b, (Utilities.Callback) this.e, (TLRPC.User) this.f16112f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ei.p3((org.telegram.ui.Cells.g6) this.d, tLObject, (MessagesStorage) this.e, this.f16110b, this.f16111c, (ArrayList) this.f16112f, 2));
                return;
        }
    }

    public fd(org.telegram.ui.Cells.g6 g6Var, MessagesStorage messagesStorage, long j3, int i10, ArrayList arrayList) {
        this.d = g6Var;
        this.e = messagesStorage;
        this.f16110b = j3;
        this.f16111c = i10;
        this.f16112f = arrayList;
    }
}
