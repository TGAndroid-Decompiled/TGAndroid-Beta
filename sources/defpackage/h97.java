package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class h97 implements qac {
    public final byte a = 1;
    public final oc7 b;
    public final int c;
    public final Object d;
    public final Object e;
    public final TLObject f;
    public final Runnable g;

    public h97(oc7 oc7Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i, TLRPC.Chat chat, ak8 ak8Var) {
        this.b = oc7Var;
        this.d = tL_messages_invitedUsers;
        this.e = iArr;
        this.c = i;
        this.f = chat;
        this.g = ak8Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        Runnable runnable = this.g;
        TLObject tLObject = this.f;
        int i = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                boolean[] zArr = (boolean[]) obj3;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) obj2;
                TLRPC.User user = (TLRPC.User) tLObject;
                g97 g97Var = (g97) runnable;
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) obj;
                if (!zArr[0]) {
                    botInfoArr[0] = botInfo;
                    if (botInfo == null) {
                        TLRPC.UserFull X1 = oc7Var.X1(user.id);
                        if (X1 == null) {
                            if (!zArr[0]) {
                                oc7Var.b3(user, i, true, new iu(zArr, botInfoArr, g97Var, (byte) 28));
                                return;
                            }
                            return;
                        }
                        botInfoArr[0] = X1.bot_info;
                        g97Var.run();
                        return;
                    }
                    g97Var.run();
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                ak8 ak8Var = (ak8) runnable;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                oc7Var.getClass();
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i2 = iArr[0] + 1;
                iArr[0] = i2;
                if (i2 >= i) {
                    if (!tL_messages_invitedUsers.missing_invitees.isEmpty()) {
                        gm.c3(new op6((Object) oc7Var, (Object) chat, (Object) tL_messages_invitedUsers, (byte) 2));
                    }
                    if (ak8Var != null) {
                        ak8Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public h97(oc7 oc7Var, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i, g97 g97Var) {
        this.b = oc7Var;
        this.d = zArr;
        this.e = botInfoArr;
        this.f = user;
        this.c = i;
        this.g = g97Var;
    }
}
