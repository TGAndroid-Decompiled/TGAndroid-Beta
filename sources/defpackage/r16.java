package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r16 implements RequestDelegate {
    public final byte a;
    public final h26 b;

    public r16(h26 h26Var, byte b) {
        this.a = b;
        this.b = h26Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String G;
        byte b = this.a;
        h26 h26Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new kz5(h26Var, tLObject, (byte) 1));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    gl.c3(h26Var.C2);
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
                        h26 h26Var2 = this.b;
                        if (i < min) {
                            TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i);
                            int currentTime = (ConnectionsManager.getInstance(h26Var2.a).getCurrentTime() - tL_messages_inactiveChats.dates.get(i).intValue()) / 86400;
                            if (currentTime < 30) {
                                G = k96.G(currentTime, "Days", new Object[0]);
                            } else if (currentTime < 365) {
                                G = k96.G(currentTime / 30, "Months", new Object[0]);
                            } else {
                                G = k96.G(currentTime / 365, "Years", new Object[0]);
                            }
                            if (hc2.n0(chat)) {
                                arrayList.add(k96.a0("InactiveChatSignature", null, 2131749019, k96.G(chat.participants_count, "Members", new Object[0]), G));
                            } else if (hc2.T(chat)) {
                                arrayList.add(k96.a0("InactiveChannelSignature", null, 2131749020, G));
                            } else {
                                arrayList.add(k96.a0("InactiveChatSignature", null, 2131749019, k96.G(chat.participants_count, "Members", new Object[0]), G));
                            }
                            i++;
                        } else {
                            gl.c3(new tn6(h26Var2, arrayList, min, tL_messages_inactiveChats, (byte) 29));
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
    }
}
