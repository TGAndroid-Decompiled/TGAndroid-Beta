package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class id implements RequestDelegate {
    public final int f18161a = 0;
    public final long f18162b;
    public final int f18163c;
    public final Object d;
    public final Object f18164e;
    public final Object f18165f;

    public id(MessagesController messagesController, long j3, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f18162b = j3;
        this.f18164e = callback;
        this.f18165f = user;
        this.f18163c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18161a) {
            case 0:
                int i10 = this.f18163c;
                ((MessagesController) this.d).lambda$loadFullUser$71(this.f18162b, (Utilities.Callback) this.f18164e, (TLRPC.User) this.f18165f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ei.p3((org.telegram.ui.Cells.g6) this.d, tLObject, (MessagesStorage) this.f18164e, this.f18162b, this.f18163c, (ArrayList) this.f18165f, 2));
                return;
        }
    }

    public id(org.telegram.ui.Cells.g6 g6Var, MessagesStorage messagesStorage, long j3, int i10, ArrayList arrayList) {
        this.d = g6Var;
        this.f18164e = messagesStorage;
        this.f18162b = j3;
        this.f18163c = i10;
        this.f18165f = arrayList;
    }
}
