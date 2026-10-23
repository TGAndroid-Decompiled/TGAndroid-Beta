package hg;

import ai.k2;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final String f11816a;
    public final String f11817b;
    public final MessagesController f11818c;
    public final MessagesStorage d;
    public final j1 e;

    public a1(j1 j1Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.e = j1Var;
        this.f11816a = str;
        this.f11817b = str2;
        this.f11818c = messagesController;
        this.d = messagesStorage;
    }

    @Override
    public final void run() {
        j1 j1Var = this.e;
        if (j1Var.f11978y0 == this) {
            j1Var.f11978y0 = null;
            TLRPC.User user = j1Var.f11974w0;
            if (user == null && !j1Var.f11972v0) {
                String str = this.f11817b;
                j1Var.f11965q0 = str;
                MessagesController messagesController = this.f11818c;
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    j1Var.R((TLRPC.User) userOrChat);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = j1Var.f11965q0;
                j1Var.f11970t0 = ConnectionsManager.getInstance(j1Var.f11953f).sendRequest(tL_contacts_resolveUsername, new k2(this, str, messagesController, this.d, 7));
            } else if (j1Var.f11972v0) {
            } else {
                j1Var.T(true, user, this.f11816a, "");
            }
        }
    }
}
