package hg;

import ai.y2;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final String f11792a;
    public final String f11793b;
    public final MessagesController f11794c;
    public final MessagesStorage d;
    public final j1 e;

    public a1(j1 j1Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.e = j1Var;
        this.f11792a = str;
        this.f11793b = str2;
        this.f11794c = messagesController;
        this.d = messagesStorage;
    }

    @Override
    public final void run() {
        j1 j1Var = this.e;
        if (j1Var.f11953y0 == this) {
            j1Var.f11953y0 = null;
            TLRPC.User user = j1Var.f11949w0;
            if (user == null && !j1Var.f11947v0) {
                String str = this.f11793b;
                j1Var.f11940q0 = str;
                MessagesController messagesController = this.f11794c;
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    j1Var.R((TLRPC.User) userOrChat);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = j1Var.f11940q0;
                j1Var.f11945t0 = ConnectionsManager.getInstance(j1Var.f11928f).sendRequest(tL_contacts_resolveUsername, new y2(this, str, messagesController, this.d, 7));
            } else if (j1Var.f11947v0) {
            } else {
                j1Var.T(true, user, this.f11792a, "");
            }
        }
    }
}
