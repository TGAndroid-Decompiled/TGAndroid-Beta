package gg;

import ai.p3;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Runnable {
    public final String f10514a;
    public final String f10515b;
    public final MessagesController f10516c;
    public final MessagesStorage d;
    public final k1 f10517e;

    public b1(k1 k1Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.f10517e = k1Var;
        this.f10514a = str;
        this.f10515b = str2;
        this.f10516c = messagesController;
        this.d = messagesStorage;
    }

    @Override
    public final void run() {
        k1 k1Var = this.f10517e;
        if (k1Var.f10699y0 == this) {
            k1Var.f10699y0 = null;
            TLRPC.User user = k1Var.f10695w0;
            if (user == null && !k1Var.f10693v0) {
                String str = this.f10515b;
                k1Var.f10686q0 = str;
                MessagesController messagesController = this.f10516c;
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    k1Var.R((TLRPC.User) userOrChat);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = k1Var.f10686q0;
                k1Var.f10691t0 = ConnectionsManager.getInstance(k1Var.f10674f).sendRequest(tL_contacts_resolveUsername, new p3(this, str, messagesController, this.d, 2));
            } else if (k1Var.f10693v0) {
            } else {
                k1Var.T(true, user, this.f10514a, "");
            }
        }
    }
}
