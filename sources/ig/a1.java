package ig;

import bi.i2;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final String f13984a;
    public final String f13985b;
    public final MessagesController f13986c;
    public final MessagesStorage d;
    public final j1 e;

    public a1(j1 j1Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.e = j1Var;
        this.f13984a = str;
        this.f13985b = str2;
        this.f13986c = messagesController;
        this.d = messagesStorage;
    }

    @Override
    public final void run() {
        j1 j1Var = this.e;
        if (j1Var.f14140y0 == this) {
            j1Var.f14140y0 = null;
            TLRPC.User user = j1Var.f14136w0;
            if (user == null && !j1Var.f14134v0) {
                String str = this.f13985b;
                j1Var.f14127q0 = str;
                MessagesController messagesController = this.f13986c;
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    j1Var.R((TLRPC.User) userOrChat);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = j1Var.f14127q0;
                j1Var.f14132t0 = ConnectionsManager.getInstance(j1Var.f14115f).sendRequest(tL_contacts_resolveUsername, new i2(this, str, messagesController, this.d, 7));
            } else if (j1Var.f14134v0) {
            } else {
                j1Var.T(true, user, this.f13984a, "");
            }
        }
    }
}
