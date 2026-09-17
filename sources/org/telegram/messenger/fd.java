package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fd implements RequestDelegate {
    public final int f17680a = 0;
    public final long f17681b;
    public final int f17682c;
    public final Object d;
    public final Object f17683e;
    public final Object f17684f;

    public fd(MessagesController messagesController, long j3, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f17681b = j3;
        this.f17683e = callback;
        this.f17684f = user;
        this.f17682c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17680a) {
            case 0:
                int i10 = this.f17682c;
                ((MessagesController) this.d).lambda$loadFullUser$72(this.f17681b, (Utilities.Callback) this.f17683e, (TLRPC.User) this.f17684f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new fi.p3((org.telegram.ui.Cells.f6) this.d, tLObject, (MessagesStorage) this.f17683e, this.f17681b, this.f17682c, (ArrayList) this.f17684f, 2));
                return;
        }
    }

    public fd(org.telegram.ui.Cells.f6 f6Var, MessagesStorage messagesStorage, long j3, int i10, ArrayList arrayList) {
        this.d = f6Var;
        this.f17683e = messagesStorage;
        this.f17681b = j3;
        this.f17682c = i10;
        this.f17684f = arrayList;
    }
}
