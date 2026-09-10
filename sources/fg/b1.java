package fg;

import bi.l9;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Runnable {
    public final String f7956a;
    public final String f7957b;
    public final MessagesController f7958c;
    public final MessagesStorage d;
    public final l1 e;

    public b1(l1 l1Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.e = l1Var;
        this.f7956a = str;
        this.f7957b = str2;
        this.f7958c = messagesController;
        this.d = messagesStorage;
    }

    @Override
    public final void run() {
        l1 l1Var = this.e;
        if (l1Var.f8133y0 == this) {
            l1Var.f8133y0 = null;
            TLRPC.User user = l1Var.f8129w0;
            if (user == null && !l1Var.f8127v0) {
                String str = this.f7957b;
                l1Var.f8120q0 = str;
                MessagesController messagesController = this.f7958c;
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    l1Var.R((TLRPC.User) userOrChat);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = l1Var.f8120q0;
                l1Var.f8125t0 = ConnectionsManager.getInstance(l1Var.f8108f).sendRequest(tL_contacts_resolveUsername, new l9(this, str, messagesController, this.d, 1));
            } else if (l1Var.f8127v0) {
            } else {
                l1Var.T(true, user, this.f7956a, "");
            }
        }
    }
}
