package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bd implements RequestDelegate {
    public final int f19842a = 0;
    public final long f19843b;
    public final int f19844c;
    public final Object d;
    public final Object f19845e;
    public final Object f19846f;

    public bd(MessagesController messagesController, long j10, Utilities.Callback callback, TLRPC.User user, int i9) {
        this.d = messagesController;
        this.f19843b = j10;
        this.f19845e = callback;
        this.f19846f = user;
        this.f19844c = i9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19842a) {
            case 0:
                int i9 = this.f19844c;
                ((MessagesController) this.d).lambda$loadFullUser$72(this.f19843b, (Utilities.Callback) this.f19845e, (TLRPC.User) this.f19846f, i9, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new gh.w6((org.telegram.ui.Cells.f6) this.d, tLObject, (MessagesStorage) this.f19845e, this.f19843b, this.f19844c, (ArrayList) this.f19846f));
                return;
        }
    }

    public bd(org.telegram.ui.Cells.f6 f6Var, MessagesStorage messagesStorage, long j10, int i9, ArrayList arrayList) {
        this.d = f6Var;
        this.f19845e = messagesStorage;
        this.f19843b = j10;
        this.f19844c = i9;
        this.f19846f = arrayList;
    }
}
