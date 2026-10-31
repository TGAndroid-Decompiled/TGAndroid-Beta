package kg;

import ag.g3;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.w3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f11347a;
    public final q0 f11348b;

    public z(q0 q0Var, int i10) {
        this.f11347a = i10;
        this.f11348b = q0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String G;
        int i10 = this.f11347a;
        q0 q0Var = this.f11348b;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.g3(new k2.u(4, q0Var, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.i0.g3(q0Var.f11249z2);
                    return;
                } else {
                    q0Var.getClass();
                    return;
                }
            default:
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
                    ArrayList arrayList = new ArrayList();
                    int min = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
                    int i11 = 0;
                    while (true) {
                        q0 q0Var2 = this.f11348b;
                        if (i11 < min) {
                            TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i11);
                            int currentTime = (ConnectionsManager.getInstance(q0Var2.f21583a).getCurrentTime() - tL_messages_inactiveChats.dates.get(i11).intValue()) / 86400;
                            if (currentTime < 30) {
                                G = cd.G(currentTime, "Days", new Object[0]);
                            } else if (currentTime < 365) {
                                G = cd.G(currentTime / 30, "Months", new Object[0]);
                            } else {
                                G = cd.G(currentTime / 365, "Years", new Object[0]);
                            }
                            if (w3.n0(chat)) {
                                arrayList.add(cd.a0("InactiveChatSignature", null, 2131749220, cd.G(chat.participants_count, "Members", new Object[0]), G));
                            } else if (w3.T(chat)) {
                                arrayList.add(cd.a0("InactiveChannelSignature", null, 2131749221, G));
                            } else {
                                arrayList.add(cd.a0("InactiveChatSignature", null, 2131749220, cd.G(chat.participants_count, "Members", new Object[0]), G));
                            }
                            i11++;
                        } else {
                            org.telegram.messenger.i0.g3(new g3(q0Var2, arrayList, min, tL_messages_inactiveChats, 3));
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
    }
}
