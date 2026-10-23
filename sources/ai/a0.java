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
    public final int f923a;
    public final k0 f924b;

    public a0(k0 k0Var, int i10) {
        this.f923a = i10;
        this.f924b = k0Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f923a) {
            case 0:
                final k0 k0Var = this.f924b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                k0 k0Var2 = k0Var;
                                k0Var2.getClass();
                                k0Var2.f1604j = new ArrayList();
                                k0Var2.f1603i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        k0Var2.f1604j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    MessagesController.getInstance(k0Var2.f1598a).putUsers(k0Var2.f1604j, false);
                                    return;
                                }
                                return;
                            default:
                                k0 k0Var3 = k0Var;
                                int i11 = k0Var3.f1598a;
                                k0Var3.f1606l = new ArrayList();
                                k0Var3.f1605k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i11).putChats(messages_chats.chats, false);
                                    k0Var3.f1606l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            default:
                final k0 k0Var2 = this.f924b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                k0 k0Var22 = k0Var2;
                                k0Var22.getClass();
                                k0Var22.f1604j = new ArrayList();
                                k0Var22.f1603i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        k0Var22.f1604j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    MessagesController.getInstance(k0Var22.f1598a).putUsers(k0Var22.f1604j, false);
                                    return;
                                }
                                return;
                            default:
                                k0 k0Var3 = k0Var2;
                                int i11 = k0Var3.f1598a;
                                k0Var3.f1606l = new ArrayList();
                                k0Var3.f1605k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i11).putChats(messages_chats.chats, false);
                                    k0Var3.f1606l.addAll(messages_chats.chats);
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
