package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class id implements RequestDelegate {
    public final int f18162a = 0;
    public final long f18163b;
    public final int f18164c;
    public final Object d;
    public final Object f18165e;
    public final Object f18166f;

    public id(MessagesController messagesController, long j3, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f18163b = j3;
        this.f18165e = callback;
        this.f18166f = user;
        this.f18164c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18162a) {
            case 0:
                int i10 = this.f18164c;
                ((MessagesController) this.d).lambda$loadFullUser$71(this.f18163b, (Utilities.Callback) this.f18165e, (TLRPC.User) this.f18166f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ei.p3((org.telegram.ui.Cells.g6) this.d, tLObject, (MessagesStorage) this.f18165e, this.f18163b, this.f18164c, (ArrayList) this.f18166f, 2));
                return;
        }
    }

    public id(org.telegram.ui.Cells.g6 g6Var, MessagesStorage messagesStorage, long j3, int i10, ArrayList arrayList) {
        this.d = g6Var;
        this.f18165e = messagesStorage;
        this.f18163b = j3;
        this.f18164c = i10;
        this.f18166f = arrayList;
    }
}
