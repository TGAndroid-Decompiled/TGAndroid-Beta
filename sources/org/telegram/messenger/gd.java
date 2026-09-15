package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gd implements RequestDelegate {
    public final int f16228a = 0;
    public final long f16229b;
    public final int f16230c;
    public final Object d;
    public final Object e;
    public final Object f16231f;

    public gd(MessagesController messagesController, long j3, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f16229b = j3;
        this.e = callback;
        this.f16231f = user;
        this.f16230c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16228a) {
            case 0:
                int i10 = this.f16230c;
                ((MessagesController) this.d).lambda$loadFullUser$72(this.f16229b, (Utilities.Callback) this.e, (TLRPC.User) this.f16231f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ei.p3((org.telegram.ui.Cells.f6) this.d, tLObject, (MessagesStorage) this.e, this.f16229b, this.f16230c, (ArrayList) this.f16231f, 2));
                return;
        }
    }

    public gd(org.telegram.ui.Cells.f6 f6Var, MessagesStorage messagesStorage, long j3, int i10, ArrayList arrayList) {
        this.d = f6Var;
        this.e = messagesStorage;
        this.f16229b = j3;
        this.f16230c = i10;
        this.f16231f = arrayList;
    }
}
