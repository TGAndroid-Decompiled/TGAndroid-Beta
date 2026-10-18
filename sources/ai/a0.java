package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class a0 implements RequestDelegate {
    public final int f924a;
    public final k0 f925b;

    public a0(k0 k0Var, int i10) {
        this.f924a = i10;
        this.f925b = k0Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f924a) {
            case 0:
                final k0 k0Var = this.f925b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                k0 k0Var2 = k0Var;
                                k0Var2.getClass();
                                k0Var2.f1620j = new ArrayList();
                                k0Var2.f1619i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        k0Var2.f1620j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    MessagesController.getInstance(k0Var2.f1614a).putUsers(k0Var2.f1620j, false);
                                    return;
                                }
                                return;
                            default:
                                k0 k0Var3 = k0Var;
                                int i11 = k0Var3.f1614a;
                                k0Var3.f1622l = new ArrayList();
                                k0Var3.f1621k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i11).putChats(messages_chats.chats, false);
                                    k0Var3.f1622l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            default:
                final k0 k0Var2 = this.f925b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                k0 k0Var22 = k0Var2;
                                k0Var22.getClass();
                                k0Var22.f1620j = new ArrayList();
                                k0Var22.f1619i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        k0Var22.f1620j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    MessagesController.getInstance(k0Var22.f1614a).putUsers(k0Var22.f1620j, false);
                                    return;
                                }
                                return;
                            default:
                                k0 k0Var3 = k0Var2;
                                int i11 = k0Var3.f1614a;
                                k0Var3.f1622l = new ArrayList();
                                k0Var3.f1621k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i11).putChats(messages_chats.chats, false);
                                    k0Var3.f1622l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
