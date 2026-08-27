package hh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

public final class t implements RequestDelegate {

    public final int f10035a;

    public final c0 f10036b;

    public t(c0 c0Var, int i10) {
        this.f10035a = i10;
        this.f10036b = c0Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10035a) {
            case 0:
                final int i10 = 0;
                final c0 c0Var = this.f10036b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                c0 c0Var2 = c0Var;
                                c0Var2.getClass();
                                c0Var2.f9056j = new ArrayList();
                                c0Var2.f9055i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                                        c0Var2.f9056j.add((TLRPC.User) vector.objects.get(i11));
                                    }
                                    MessagesController.getInstance(c0Var2.f9049a).putUsers(c0Var2.f9056j, false);
                                }
                                break;
                            default:
                                c0 c0Var3 = c0Var;
                                int i12 = c0Var3.f9049a;
                                c0Var3.f9058l = new ArrayList();
                                c0Var3.f9057k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i12).putChats(messages_chats.chats, false);
                                    c0Var3.f9058l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final c0 c0Var2 = this.f10036b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                c0 c0Var3 = c0Var2;
                                c0Var3.getClass();
                                c0Var3.f9056j = new ArrayList();
                                c0Var3.f9055i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i12 = 0; i12 < vector.objects.size(); i12++) {
                                        c0Var3.f9056j.add((TLRPC.User) vector.objects.get(i12));
                                    }
                                    MessagesController.getInstance(c0Var3.f9049a).putUsers(c0Var3.f9056j, false);
                                }
                                break;
                            default:
                                c0 c0Var4 = c0Var2;
                                int i13 = c0Var4.f9049a;
                                c0Var4.f9058l = new ArrayList();
                                c0Var4.f9057k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i13).putChats(messages_chats.chats, false);
                                    c0Var4.f9058l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
