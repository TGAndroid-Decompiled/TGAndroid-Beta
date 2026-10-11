package gg;

import ai.q3;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final String f10522a;
    public final String f10523b;
    public final MessagesController f10524c;
    public final MessagesStorage d;
    public final j1 f10525e;

    public a1(j1 j1Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.f10525e = j1Var;
        this.f10522a = str;
        this.f10523b = str2;
        this.f10524c = messagesController;
        this.d = messagesStorage;
    }

    @Override
    public final void run() {
        j1 j1Var = this.f10525e;
        if (j1Var.f10697y0 == this) {
            j1Var.f10697y0 = null;
            TLRPC.User user = j1Var.f10693w0;
            if (user == null && !j1Var.f10691v0) {
                String str = this.f10523b;
                j1Var.f10684q0 = str;
                MessagesController messagesController = this.f10524c;
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    j1Var.R((TLRPC.User) userOrChat);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = j1Var.f10684q0;
                j1Var.f10689t0 = ConnectionsManager.getInstance(j1Var.f10672f).sendRequest(tL_contacts_resolveUsername, new q3(this, str, messagesController, this.d, 2));
            } else if (j1Var.f10691v0) {
            } else {
                j1Var.T(true, user, this.f10522a, "");
            }
        }
    }
}
