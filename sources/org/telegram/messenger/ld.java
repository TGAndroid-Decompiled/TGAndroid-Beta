package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ld implements RequestDelegate {
    public final int f18948a = 0;
    public final long f18949b;
    public final int f18950c;
    public final Object d;
    public final Object e;
    public final Object f18951f;

    public ld(MessagesController messagesController, long j10, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f18949b = j10;
        this.e = callback;
        this.f18951f = user;
        this.f18950c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18948a) {
            case 0:
                int i10 = this.f18950c;
                ((MessagesController) this.d).lambda$loadFullUser$71(this.f18949b, (Utilities.Callback) this.e, (TLRPC.User) this.f18951f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.f9((org.telegram.ui.Cells.g6) this.d, tLObject, (MessagesStorage) this.e, this.f18949b, this.f18950c, (ArrayList) this.f18951f));
                return;
        }
    }

    public ld(org.telegram.ui.Cells.g6 g6Var, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        this.d = g6Var;
        this.e = messagesStorage;
        this.f18949b = j10;
        this.f18950c = i10;
        this.f18951f = arrayList;
    }
}
