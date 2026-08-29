package jh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class s implements RequestDelegate {
    public final int f12740a;
    public final b0 f12741b;

    public s(b0 b0Var, int i10) {
        this.f12740a = i10;
        this.f12741b = b0Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12740a) {
            case 0:
                final b0 b0Var = this.f12741b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                b0 b0Var2 = b0Var;
                                b0Var2.getClass();
                                b0Var2.f11781j = new ArrayList();
                                b0Var2.f11780i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        b0Var2.f11781j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    MessagesController.getInstance(b0Var2.f11774a).putUsers(b0Var2.f11781j, false);
                                    return;
                                }
                                return;
                            default:
                                b0 b0Var3 = b0Var;
                                int i11 = b0Var3.f11774a;
                                b0Var3.f11783l = new ArrayList();
                                b0Var3.f11782k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i11).putChats(messages_chats.chats, false);
                                    b0Var3.f11783l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            default:
                final b0 b0Var2 = this.f12741b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                b0 b0Var22 = b0Var2;
                                b0Var22.getClass();
                                b0Var22.f11781j = new ArrayList();
                                b0Var22.f11780i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        b0Var22.f11781j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    MessagesController.getInstance(b0Var22.f11774a).putUsers(b0Var22.f11781j, false);
                                    return;
                                }
                                return;
                            default:
                                b0 b0Var3 = b0Var2;
                                int i11 = b0Var3.f11774a;
                                b0Var3.f11783l = new ArrayList();
                                b0Var3.f11782k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i11).putChats(messages_chats.chats, false);
                                    b0Var3.f11783l.addAll(messages_chats.chats);
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
