package gg;

import ai.p3;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Runnable {
    public final String f9676a;
    public final String f9677b;
    public final MessagesController f9678c;
    public final MessagesStorage d;
    public final k1 e;

    public b1(k1 k1Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.e = k1Var;
        this.f9676a = str;
        this.f9677b = str2;
        this.f9678c = messagesController;
        this.d = messagesStorage;
    }

    @Override
    public final void run() {
        k1 k1Var = this.e;
        if (k1Var.f9846y0 == this) {
            k1Var.f9846y0 = null;
            TLRPC.User user = k1Var.f9842w0;
            if (user == null && !k1Var.f9840v0) {
                String str = this.f9677b;
                k1Var.f9833q0 = str;
                MessagesController messagesController = this.f9678c;
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    k1Var.R((TLRPC.User) userOrChat);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = k1Var.f9833q0;
                k1Var.f9838t0 = ConnectionsManager.getInstance(k1Var.f9821f).sendRequest(tL_contacts_resolveUsername, new p3(this, str, messagesController, this.d, 2));
            } else if (k1Var.f9840v0) {
            } else {
                k1Var.T(true, user, this.f9676a, "");
            }
        }
    }
}
