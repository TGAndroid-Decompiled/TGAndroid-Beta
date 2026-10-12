package hg;

import bi.f3;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final String f10481a;
    public final String f10482b;
    public final MessagesController f10483c;
    public final MessagesStorage d;
    public final j1 e;

    public a1(j1 j1Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.e = j1Var;
        this.f10481a = str;
        this.f10482b = str2;
        this.f10483c = messagesController;
        this.d = messagesStorage;
    }

    @Override
    public final void run() {
        j1 j1Var = this.e;
        if (j1Var.f10642y0 == this) {
            j1Var.f10642y0 = null;
            TLRPC.User user = j1Var.f10638w0;
            if (user == null && !j1Var.f10636v0) {
                String str = this.f10482b;
                j1Var.f10629q0 = str;
                MessagesController messagesController = this.f10483c;
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    j1Var.R((TLRPC.User) userOrChat);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = j1Var.f10629q0;
                j1Var.f10634t0 = ConnectionsManager.getInstance(j1Var.f10617f).sendRequest(tL_contacts_resolveUsername, new f3(this, str, messagesController, this.d, 2));
            } else if (j1Var.f10636v0) {
            } else {
                j1Var.T(true, user, this.f10481a, "");
            }
        }
    }
}
