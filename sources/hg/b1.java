package hg;

import bi.c3;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Runnable {
    public final String f10975a;
    public final String f10976b;
    public final MessagesController f10977c;
    public final MessagesStorage d;
    public final k1 f10978e;

    public b1(k1 k1Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.f10978e = k1Var;
        this.f10975a = str;
        this.f10976b = str2;
        this.f10977c = messagesController;
        this.d = messagesStorage;
    }

    @Override
    public final void run() {
        k1 k1Var = this.f10978e;
        if (k1Var.f11160y0 == this) {
            k1Var.f11160y0 = null;
            TLRPC.User user = k1Var.f11156w0;
            if (user == null && !k1Var.f11154v0) {
                String str = this.f10976b;
                k1Var.f11147q0 = str;
                MessagesController messagesController = this.f10977c;
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    k1Var.R((TLRPC.User) userOrChat);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = k1Var.f11147q0;
                k1Var.f11152t0 = ConnectionsManager.getInstance(k1Var.f11135f).sendRequest(tL_contacts_resolveUsername, new c3(this, str, messagesController, this.d, 2));
            } else if (k1Var.f11154v0) {
            } else {
                k1Var.T(true, user, this.f10975a, "");
            }
        }
    }
}
