package gg;

import ai.p3;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Runnable {
    public final String f9663a;
    public final String f9664b;
    public final MessagesController f9665c;
    public final MessagesStorage d;
    public final k1 e;

    public b1(k1 k1Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.e = k1Var;
        this.f9663a = str;
        this.f9664b = str2;
        this.f9665c = messagesController;
        this.d = messagesStorage;
    }

    @Override
    public final void run() {
        k1 k1Var = this.e;
        if (k1Var.f9833y0 == this) {
            k1Var.f9833y0 = null;
            TLRPC.User user = k1Var.f9829w0;
            if (user == null && !k1Var.f9827v0) {
                String str = this.f9664b;
                k1Var.f9820q0 = str;
                MessagesController messagesController = this.f9665c;
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    k1Var.R((TLRPC.User) userOrChat);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = k1Var.f9820q0;
                k1Var.f9825t0 = ConnectionsManager.getInstance(k1Var.f9808f).sendRequest(tL_contacts_resolveUsername, new p3(this, str, messagesController, this.d, 2));
            } else if (k1Var.f9827v0) {
            } else {
                k1Var.T(true, user, this.f9663a, "");
            }
        }
    }
}
