package hg;

import ai.w2;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final String f11790a;
    public final String f11791b;
    public final MessagesController f11792c;
    public final MessagesStorage d;
    public final j1 e;

    public a1(j1 j1Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.e = j1Var;
        this.f11790a = str;
        this.f11791b = str2;
        this.f11792c = messagesController;
        this.d = messagesStorage;
    }

    @Override
    public final void run() {
        j1 j1Var = this.e;
        if (j1Var.f11951y0 == this) {
            j1Var.f11951y0 = null;
            TLRPC.User user = j1Var.f11947w0;
            if (user == null && !j1Var.f11945v0) {
                String str = this.f11791b;
                j1Var.f11938q0 = str;
                MessagesController messagesController = this.f11792c;
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    j1Var.R((TLRPC.User) userOrChat);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = j1Var.f11938q0;
                j1Var.f11943t0 = ConnectionsManager.getInstance(j1Var.f11926f).sendRequest(tL_contacts_resolveUsername, new w2(this, str, messagesController, this.d, 7));
            } else if (j1Var.f11945v0) {
            } else {
                j1Var.T(true, user, this.f11790a, "");
            }
        }
    }
}
