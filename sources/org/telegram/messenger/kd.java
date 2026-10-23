package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kd implements RequestDelegate {
    public final int f18862a = 0;
    public final long f18863b;
    public final int f18864c;
    public final Object d;
    public final Object e;
    public final Object f18865f;

    public kd(MessagesController messagesController, long j10, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f18863b = j10;
        this.e = callback;
        this.f18865f = user;
        this.f18864c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18862a) {
            case 0:
                int i10 = this.f18864c;
                ((MessagesController) this.d).lambda$loadFullUser$71(this.f18863b, (Utilities.Callback) this.e, (TLRPC.User) this.f18865f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.f9((org.telegram.ui.Cells.g6) this.d, tLObject, (MessagesStorage) this.e, this.f18863b, this.f18864c, (ArrayList) this.f18865f));
                return;
        }
    }

    public kd(org.telegram.ui.Cells.g6 g6Var, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        this.d = g6Var;
        this.e = messagesStorage;
        this.f18863b = j10;
        this.f18864c = i10;
        this.f18865f = arrayList;
    }
}
