package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v36 implements RequestDelegate {
    public final byte a;
    public final l46 b;

    public v36(l46 l46Var, byte b) {
        this.a = b;
        this.b = l46Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String G;
        byte b = this.a;
        l46 l46Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new tg5(l46Var, tLObject, (byte) 28));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    hl.c3(l46Var.C2);
                    return;
                }
                return;
            default:
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
                    ArrayList arrayList = new ArrayList();
                    int min = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
                    int i = 0;
                    while (true) {
                        l46 l46Var2 = this.b;
                        if (i < min) {
                            TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i);
                            int currentTime = (ConnectionsManager.getInstance(l46Var2.a).getCurrentTime() - tL_messages_inactiveChats.dates.get(i).intValue()) / 86400;
                            if (currentTime < 30) {
                                G = ob6.G(currentTime, "Days", new Object[0]);
                            } else if (currentTime < 365) {
                                G = ob6.G(currentTime / 30, "Months", new Object[0]);
                            } else {
                                G = ob6.G(currentTime / 365, "Years", new Object[0]);
                            }
                            if (xc2.n0(chat)) {
                                arrayList.add(ob6.a0("InactiveChatSignature", null, 2131748965, ob6.G(chat.participants_count, "Members", new Object[0]), G));
                            } else if (xc2.T(chat)) {
                                arrayList.add(ob6.a0("InactiveChannelSignature", null, 2131748966, G));
                            } else {
                                arrayList.add(ob6.a0("InactiveChatSignature", null, 2131748965, ob6.G(chat.participants_count, "Members", new Object[0]), G));
                            }
                            i++;
                        } else {
                            hl.c3(new y36(l46Var2, arrayList, min, tL_messages_inactiveChats, (byte) 0));
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
    }
}
