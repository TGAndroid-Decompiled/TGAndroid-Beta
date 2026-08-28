package gh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class t implements RequestDelegate {
    public final int f8893a;
    public final c0 f8894b;

    public t(c0 c0Var, int i9) {
        this.f8893a = i9;
        this.f8894b = c0Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8893a) {
            case 0:
                final c0 c0Var = this.f8894b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                c0 c0Var2 = c0Var;
                                c0Var2.getClass();
                                c0Var2.f7901j = new ArrayList();
                                c0Var2.f7900i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i9 = 0; i9 < vector.objects.size(); i9++) {
                                        c0Var2.f7901j.add((TLRPC.User) vector.objects.get(i9));
                                    }
                                    MessagesController.getInstance(c0Var2.f7894a).putUsers(c0Var2.f7901j, false);
                                    return;
                                }
                                return;
                            default:
                                c0 c0Var3 = c0Var;
                                int i10 = c0Var3.f7894a;
                                c0Var3.f7903l = new ArrayList();
                                c0Var3.f7902k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i10).putChats(messages_chats.chats, false);
                                    c0Var3.f7903l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            default:
                final c0 c0Var2 = this.f8894b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                c0 c0Var22 = c0Var2;
                                c0Var22.getClass();
                                c0Var22.f7901j = new ArrayList();
                                c0Var22.f7900i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i9 = 0; i9 < vector.objects.size(); i9++) {
                                        c0Var22.f7901j.add((TLRPC.User) vector.objects.get(i9));
                                    }
                                    MessagesController.getInstance(c0Var22.f7894a).putUsers(c0Var22.f7901j, false);
                                    return;
                                }
                                return;
                            default:
                                c0 c0Var3 = c0Var2;
                                int i10 = c0Var3.f7894a;
                                c0Var3.f7903l = new ArrayList();
                                c0Var3.f7902k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i10).putChats(messages_chats.chats, false);
                                    c0Var3.f7903l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
