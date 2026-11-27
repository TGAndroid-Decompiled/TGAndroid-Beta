package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class c97 implements pcc {
    public final byte a = 1;
    public final uc7 b;
    public final int c;
    public final Object d;
    public final Object e;
    public final TLObject f;
    public final Runnable g;

    public c97(uc7 uc7Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i, TLRPC.Chat chat, sa8 sa8Var) {
        this.b = uc7Var;
        this.d = tL_messages_invitedUsers;
        this.e = iArr;
        this.c = i;
        this.f = chat;
        this.g = sa8Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        Runnable runnable = this.g;
        TLObject tLObject = this.f;
        int i = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                boolean[] zArr = (boolean[]) obj3;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) obj2;
                TLRPC.User user = (TLRPC.User) tLObject;
                b97 b97Var = (b97) runnable;
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) obj;
                if (!zArr[0]) {
                    botInfoArr[0] = botInfo;
                    if (botInfo == null) {
                        TLRPC.UserFull Y1 = uc7Var.Y1(user.id);
                        if (Y1 == null) {
                            if (!zArr[0]) {
                                uc7Var.f3(user, i, true, new gt(zArr, botInfoArr, b97Var, (byte) 28));
                                return;
                            }
                            return;
                        }
                        botInfoArr[0] = Y1.bot_info;
                        b97Var.run();
                        return;
                    }
                    b97Var.run();
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                sa8 sa8Var = (sa8) runnable;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                uc7Var.getClass();
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i2 = iArr[0] + 1;
                iArr[0] = i2;
                if (i2 >= i) {
                    if (!tL_messages_invitedUsers.missing_invitees.isEmpty()) {
                        hl.c3(new es6((Object) uc7Var, (Object) chat, (Object) tL_messages_invitedUsers, (byte) 2));
                    }
                    if (sa8Var != null) {
                        sa8Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public c97(uc7 uc7Var, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i, b97 b97Var) {
        this.b = uc7Var;
        this.d = zArr;
        this.e = botInfoArr;
        this.f = user;
        this.c = i;
        this.g = b97Var;
    }
}
