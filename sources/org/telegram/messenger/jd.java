package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jd implements RequestDelegate {
    public final int f20425a = 0;
    public final long f20426b;
    public final int f20427c;
    public final Object d;
    public final Object e;
    public final Object f20428f;

    public jd(MessagesController messagesController, long j10, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f20426b = j10;
        this.e = callback;
        this.f20428f = user;
        this.f20427c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20425a) {
            case 0:
                int i10 = this.f20427c;
                ((MessagesController) this.d).lambda$loadFullUser$71(this.f20426b, (Utilities.Callback) this.e, (TLRPC.User) this.f20428f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new bi.a9((org.telegram.ui.Cells.k6) this.d, tLObject, (MessagesStorage) this.e, this.f20426b, this.f20427c, (ArrayList) this.f20428f));
                return;
        }
    }

    public jd(org.telegram.ui.Cells.k6 k6Var, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        this.d = k6Var;
        this.e = messagesStorage;
        this.f20426b = j10;
        this.f20427c = i10;
        this.f20428f = arrayList;
    }
}
