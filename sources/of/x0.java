package of;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x0 implements Runnable {
    public final String f19544a;
    public final String f19545b;
    public final MessagesController f19546c;
    public final MessagesStorage d;
    public final f1 f19547e;

    public x0(f1 f1Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.f19547e = f1Var;
        this.f19544a = str;
        this.f19545b = str2;
        this.f19546c = messagesController;
        this.d = messagesStorage;
    }

    @Override
    public final void run() {
        f1 f1Var = this.f19547e;
        if (f1Var.f19345u0 == this) {
            f1Var.f19345u0 = null;
            TLRPC.User user = f1Var.f19343s0;
            if (user == null && !f1Var.f19341r0) {
                String str = this.f19545b;
                f1Var.m0 = str;
                MessagesController messagesController = this.f19546c;
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    f1Var.R((TLRPC.User) userOrChat);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = f1Var.m0;
                f1Var.f19338p0 = ConnectionsManager.getInstance(f1Var.f19327f).sendRequest(tL_contacts_resolveUsername, new fh.h1(this, str, messagesController, this.d, 8));
            } else if (f1Var.f19341r0) {
            } else {
                f1Var.T(true, user, this.f19544a, "");
            }
        }
    }
}
