package gg;

import ai.p3;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Runnable {
    public final String f9672a;
    public final String f9673b;
    public final MessagesController f9674c;
    public final MessagesStorage d;
    public final k1 e;

    public b1(k1 k1Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.e = k1Var;
        this.f9672a = str;
        this.f9673b = str2;
        this.f9674c = messagesController;
        this.d = messagesStorage;
    }

    @Override
    public final void run() {
        k1 k1Var = this.e;
        if (k1Var.f9842y0 == this) {
            k1Var.f9842y0 = null;
            TLRPC.User user = k1Var.f9838w0;
            if (user == null && !k1Var.f9836v0) {
                String str = this.f9673b;
                k1Var.f9829q0 = str;
                MessagesController messagesController = this.f9674c;
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    k1Var.R((TLRPC.User) userOrChat);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = k1Var.f9829q0;
                k1Var.f9834t0 = ConnectionsManager.getInstance(k1Var.f9817f).sendRequest(tL_contacts_resolveUsername, new p3(this, str, messagesController, this.d, 2));
            } else if (k1Var.f9836v0) {
            } else {
                k1Var.T(true, user, this.f9672a, "");
            }
        }
    }
}
