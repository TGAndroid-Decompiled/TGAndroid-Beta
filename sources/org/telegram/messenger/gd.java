package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gd implements RequestDelegate {
    public final int f18460a = 0;
    public final long f18461b;
    public final int f18462c;
    public final Object d;
    public final Object e;
    public final Object f18463f;

    public gd(MessagesController messagesController, long j10, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f18461b = j10;
        this.e = callback;
        this.f18463f = user;
        this.f18462c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18460a) {
            case 0:
                int i10 = this.f18462c;
                ((MessagesController) this.d).lambda$loadFullUser$71(this.f18461b, (Utilities.Callback) this.e, (TLRPC.User) this.f18463f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.e9((org.telegram.ui.Cells.f6) this.d, tLObject, (MessagesStorage) this.e, this.f18461b, this.f18462c, (ArrayList) this.f18463f));
                return;
        }
    }

    public gd(org.telegram.ui.Cells.f6 f6Var, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        this.d = f6Var;
        this.e = messagesStorage;
        this.f18461b = j10;
        this.f18462c = i10;
        this.f18463f = arrayList;
    }
}
