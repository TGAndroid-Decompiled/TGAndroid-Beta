package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gd implements RequestDelegate {
    public final int f17767a = 0;
    public final long f17768b;
    public final int f17769c;
    public final Object d;
    public final Object f17770e;
    public final Object f17771f;

    public gd(MessagesController messagesController, long j3, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f17768b = j3;
        this.f17770e = callback;
        this.f17771f = user;
        this.f17769c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17767a) {
            case 0:
                int i10 = this.f17769c;
                ((MessagesController) this.d).lambda$loadFullUser$72(this.f17768b, (Utilities.Callback) this.f17770e, (TLRPC.User) this.f17771f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new fi.p3((org.telegram.ui.Cells.f6) this.d, tLObject, (MessagesStorage) this.f17770e, this.f17768b, this.f17769c, (ArrayList) this.f17771f, 2));
                return;
        }
    }

    public gd(org.telegram.ui.Cells.f6 f6Var, MessagesStorage messagesStorage, long j3, int i10, ArrayList arrayList) {
        this.d = f6Var;
        this.f17770e = messagesStorage;
        this.f17768b = j3;
        this.f17769c = i10;
        this.f17771f = arrayList;
    }
}
