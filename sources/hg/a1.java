package hg;

import bi.f3;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final String f10485a;
    public final String f10486b;
    public final MessagesController f10487c;
    public final MessagesStorage d;
    public final j1 e;

    public a1(j1 j1Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.e = j1Var;
        this.f10485a = str;
        this.f10486b = str2;
        this.f10487c = messagesController;
        this.d = messagesStorage;
    }

    @Override
    public final void run() {
        j1 j1Var = this.e;
        if (j1Var.f10646y0 == this) {
            j1Var.f10646y0 = null;
            TLRPC.User user = j1Var.f10642w0;
            if (user == null && !j1Var.f10640v0) {
                String str = this.f10486b;
                j1Var.f10633q0 = str;
                MessagesController messagesController = this.f10487c;
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    j1Var.R((TLRPC.User) userOrChat);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = j1Var.f10633q0;
                j1Var.f10638t0 = ConnectionsManager.getInstance(j1Var.f10621f).sendRequest(tL_contacts_resolveUsername, new f3(this, str, messagesController, this.d, 2));
            } else if (j1Var.f10640v0) {
            } else {
                j1Var.T(true, user, this.f10485a, "");
            }
        }
    }
}
