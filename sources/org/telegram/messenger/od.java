package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f15967a = 0;
    public final long f15968b;
    public final int f15969c;
    public final Object d;
    public final Object e;
    public final Object f15970f;

    public od(MessagesController messagesController, long j3, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.f15968b = j3;
        this.e = callback;
        this.f15970f = user;
        this.f15969c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15967a) {
            case 0:
                int i10 = this.f15969c;
                ((MessagesController) this.d).lambda$loadFullUser$72(this.f15968b, (Utilities.Callback) this.e, (TLRPC.User) this.f15970f, i10, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new di.s3((org.telegram.ui.Cells.h6) this.d, tLObject, (MessagesStorage) this.e, this.f15968b, this.f15969c, (ArrayList) this.f15970f, 2));
                return;
        }
    }

    public od(org.telegram.ui.Cells.h6 h6Var, MessagesStorage messagesStorage, long j3, int i10, ArrayList arrayList) {
        this.d = h6Var;
        this.e = messagesStorage;
        this.f15968b = j3;
        this.f15969c = i10;
        this.f15970f = arrayList;
    }
}
