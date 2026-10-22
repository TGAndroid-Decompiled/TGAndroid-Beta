package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ld implements RequestDelegate {
    public final int f18880a = 0;
    public final long f18881b;
    public final int f18882c;
    public final Object d;
    public final Object e;
    public final Object f18883f;

    public ld(MessagesController messagesController, long j10, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f18881b = j10;
        this.e = callback;
        this.f18883f = user;
        this.f18882c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18880a) {
            case 0:
                int i10 = this.f18882c;
                ((MessagesController) this.d).lambda$loadFullUser$71(this.f18881b, (Utilities.Callback) this.e, (TLRPC.User) this.f18883f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.f9((org.telegram.ui.Cells.f6) this.d, tLObject, (MessagesStorage) this.e, this.f18881b, this.f18882c, (ArrayList) this.f18883f));
                return;
        }
    }

    public ld(org.telegram.ui.Cells.f6 f6Var, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        this.d = f6Var;
        this.e = messagesStorage;
        this.f18881b = j10;
        this.f18882c = i10;
        this.f18883f = arrayList;
    }
}
