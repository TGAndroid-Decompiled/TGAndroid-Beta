package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r36 implements RequestDelegate {
    public final byte a;
    public final i46 b;

    public r36(i46 i46Var, byte b) {
        this.a = b;
        this.b = i46Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String G;
        byte b = this.a;
        i46 i46Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new k16(i46Var, tLObject, (byte) 2));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    gm.c3(i46Var.C2);
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
                        i46 i46Var2 = this.b;
                        if (i < min) {
                            TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i);
                            int currentTime = (ConnectionsManager.getInstance(i46Var2.a).getCurrentTime() - tL_messages_inactiveChats.dates.get(i).intValue()) / 86400;
                            if (currentTime < 30) {
                                G = jb6.G(currentTime, "Days", new Object[0]);
                            } else if (currentTime < 365) {
                                G = jb6.G(currentTime / 30, "Months", new Object[0]);
                            } else {
                                G = jb6.G(currentTime / 365, "Years", new Object[0]);
                            }
                            if (sd2.n0(chat)) {
                                arrayList.add(jb6.a0("InactiveChatSignature", null, 2131748968, jb6.G(chat.participants_count, "Members", new Object[0]), G));
                            } else if (sd2.T(chat)) {
                                arrayList.add(jb6.a0("InactiveChannelSignature", null, 2131748969, G));
                            } else {
                                arrayList.add(jb6.a0("InactiveChatSignature", null, 2131748968, jb6.G(chat.participants_count, "Members", new Object[0]), G));
                            }
                            i++;
                        } else {
                            gm.c3(new v36(i46Var2, arrayList, min, tL_messages_inactiveChats, (byte) 0));
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
    }
}
