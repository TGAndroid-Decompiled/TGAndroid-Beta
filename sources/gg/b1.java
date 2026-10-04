package gg;

import ai.p3;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Runnable {
    public final String f10515a;
    public final String f10516b;
    public final MessagesController f10517c;
    public final MessagesStorage d;
    public final k1 f10518e;

    public b1(k1 k1Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.f10518e = k1Var;
        this.f10515a = str;
        this.f10516b = str2;
        this.f10517c = messagesController;
        this.d = messagesStorage;
    }

    @Override
    public final void run() {
        k1 k1Var = this.f10518e;
        if (k1Var.f10700y0 == this) {
            k1Var.f10700y0 = null;
            TLRPC.User user = k1Var.f10696w0;
            if (user == null && !k1Var.f10694v0) {
                String str = this.f10516b;
                k1Var.f10687q0 = str;
                MessagesController messagesController = this.f10517c;
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    k1Var.R((TLRPC.User) userOrChat);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = k1Var.f10687q0;
                k1Var.f10692t0 = ConnectionsManager.getInstance(k1Var.f10675f).sendRequest(tL_contacts_resolveUsername, new p3(this, str, messagesController, this.d, 2));
            } else if (k1Var.f10694v0) {
            } else {
                k1Var.T(true, user, this.f10515a, "");
            }
        }
    }
}
