package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ld implements RequestDelegate {
    public final int f17488a = 0;
    public final long f17489b;
    public final int f17490c;
    public final Object d;
    public final Object e;
    public final Object f17491f;

    public ld(MessagesController messagesController, long j10, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f17489b = j10;
        this.e = callback;
        this.f17491f = user;
        this.f17490c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17488a) {
            case 0:
                int i10 = this.f17490c;
                ((MessagesController) this.d).lambda$loadFullUser$71(this.f17489b, (Utilities.Callback) this.e, (TLRPC.User) this.f17491f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new fi.p3((org.telegram.ui.Cells.g6) this.d, tLObject, (MessagesStorage) this.e, this.f17489b, this.f17490c, (ArrayList) this.f17491f, 2));
                return;
        }
    }

    public ld(org.telegram.ui.Cells.g6 g6Var, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        this.d = g6Var;
        this.e = messagesStorage;
        this.f17489b = j10;
        this.f17490c = i10;
        this.f17491f = arrayList;
    }
}
