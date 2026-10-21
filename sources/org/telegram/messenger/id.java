package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class id implements RequestDelegate {
    public final int f18626a = 0;
    public final long f18627b;
    public final int f18628c;
    public final Object d;
    public final Object e;
    public final Object f18629f;

    public id(MessagesController messagesController, long j10, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f18627b = j10;
        this.e = callback;
        this.f18629f = user;
        this.f18628c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18626a) {
            case 0:
                int i10 = this.f18628c;
                ((MessagesController) this.d).lambda$loadFullUser$71(this.f18627b, (Utilities.Callback) this.e, (TLRPC.User) this.f18629f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.f9((org.telegram.ui.Cells.f6) this.d, tLObject, (MessagesStorage) this.e, this.f18627b, this.f18628c, (ArrayList) this.f18629f));
                return;
        }
    }

    public id(org.telegram.ui.Cells.f6 f6Var, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        this.d = f6Var;
        this.e = messagesStorage;
        this.f18627b = j10;
        this.f18628c = i10;
        this.f18629f = arrayList;
    }
}
