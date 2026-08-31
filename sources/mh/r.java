package mh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class r implements RequestDelegate {
    public final int f14651a;
    public final a0 f14652b;

    public r(a0 a0Var, int i10) {
        this.f14651a = i10;
        this.f14652b = a0Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14651a) {
            case 0:
                final a0 a0Var = this.f14652b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                a0 a0Var2 = a0Var;
                                a0Var2.getClass();
                                a0Var2.f13674j = new ArrayList();
                                a0Var2.f13673i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        a0Var2.f13674j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    MessagesController.getInstance(a0Var2.f13667a).putUsers(a0Var2.f13674j, false);
                                    return;
                                }
                                return;
                            default:
                                a0 a0Var3 = a0Var;
                                int i11 = a0Var3.f13667a;
                                a0Var3.f13676l = new ArrayList();
                                a0Var3.f13675k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i11).putChats(messages_chats.chats, false);
                                    a0Var3.f13676l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            default:
                final a0 a0Var2 = this.f14652b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                a0 a0Var22 = a0Var2;
                                a0Var22.getClass();
                                a0Var22.f13674j = new ArrayList();
                                a0Var22.f13673i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        a0Var22.f13674j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    MessagesController.getInstance(a0Var22.f13667a).putUsers(a0Var22.f13674j, false);
                                    return;
                                }
                                return;
                            default:
                                a0 a0Var3 = a0Var2;
                                int i11 = a0Var3.f13667a;
                                a0Var3.f13676l = new ArrayList();
                                a0Var3.f13675k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i11).putChats(messages_chats.chats, false);
                                    a0Var3.f13676l.addAll(messages_chats.chats);
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
