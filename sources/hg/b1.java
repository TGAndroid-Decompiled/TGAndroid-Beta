package hg;

import bi.c3;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Runnable {
    public final String f11001a;
    public final String f11002b;
    public final MessagesController f11003c;
    public final MessagesStorage d;
    public final k1 f11004e;

    public b1(k1 k1Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.f11004e = k1Var;
        this.f11001a = str;
        this.f11002b = str2;
        this.f11003c = messagesController;
        this.d = messagesStorage;
    }

    @Override
    public final void run() {
        k1 k1Var = this.f11004e;
        if (k1Var.f11186y0 == this) {
            k1Var.f11186y0 = null;
            TLRPC.User user = k1Var.f11182w0;
            if (user == null && !k1Var.f11180v0) {
                String str = this.f11002b;
                k1Var.f11173q0 = str;
                MessagesController messagesController = this.f11003c;
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    k1Var.R((TLRPC.User) userOrChat);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = k1Var.f11173q0;
                k1Var.f11178t0 = ConnectionsManager.getInstance(k1Var.f11161f).sendRequest(tL_contacts_resolveUsername, new c3(this, str, messagesController, this.d, 2));
            } else if (k1Var.f11180v0) {
            } else {
                k1Var.T(true, user, this.f11001a, "");
            }
        }
    }
}
