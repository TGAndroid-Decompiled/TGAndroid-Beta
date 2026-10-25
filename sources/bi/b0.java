package bi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class b0 implements RequestDelegate {
    public final int f4303a;
    public final m0 f4304b;

    public b0(m0 m0Var, int i10) {
        this.f4303a = i10;
        this.f4304b = m0Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4303a) {
            case 0:
                final m0 m0Var = this.f4304b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                m0 m0Var2 = m0Var;
                                m0Var2.getClass();
                                m0Var2.f5068j = new ArrayList();
                                m0Var2.f5067i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        m0Var2.f5068j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    MessagesController.getInstance(m0Var2.f5062a).putUsers(m0Var2.f5068j, false);
                                    return;
                                }
                                return;
                            default:
                                m0 m0Var3 = m0Var;
                                int i11 = m0Var3.f5062a;
                                m0Var3.f5070l = new ArrayList();
                                m0Var3.f5069k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i11).putChats(messages_chats.chats, false);
                                    m0Var3.f5070l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            default:
                final m0 m0Var2 = this.f4304b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                m0 m0Var22 = m0Var2;
                                m0Var22.getClass();
                                m0Var22.f5068j = new ArrayList();
                                m0Var22.f5067i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        m0Var22.f5068j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    MessagesController.getInstance(m0Var22.f5062a).putUsers(m0Var22.f5068j, false);
                                    return;
                                }
                                return;
                            default:
                                m0 m0Var3 = m0Var2;
                                int i11 = m0Var3.f5062a;
                                m0Var3.f5070l = new ArrayList();
                                m0Var3.f5069k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i11).putChats(messages_chats.chats, false);
                                    m0Var3.f5070l.addAll(messages_chats.chats);
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
