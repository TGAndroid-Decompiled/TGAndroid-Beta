package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class e77 implements p8c {
    public final byte a = 1;
    public final na7 b;
    public final int c;
    public final Object d;
    public final Object e;
    public final TLObject f;
    public final Runnable g;

    public e77(na7 na7Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i, TLRPC.Chat chat, pc7 pc7Var) {
        this.b = na7Var;
        this.d = tL_messages_invitedUsers;
        this.e = iArr;
        this.c = i;
        this.f = chat;
        this.g = pc7Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        Runnable runnable = this.g;
        TLObject tLObject = this.f;
        int i = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                boolean[] zArr = (boolean[]) obj3;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) obj2;
                TLRPC.User user = (TLRPC.User) tLObject;
                d77 d77Var = (d77) runnable;
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) obj;
                if (!zArr[0]) {
                    botInfoArr[0] = botInfo;
                    if (botInfo == null) {
                        TLRPC.UserFull W1 = na7Var.W1(user.id);
                        if (W1 == null) {
                            if (!zArr[0]) {
                                na7Var.Y2(user, i, true, new ht(zArr, botInfoArr, d77Var, (byte) 28));
                                return;
                            }
                            return;
                        }
                        botInfoArr[0] = W1.bot_info;
                        d77Var.run();
                        return;
                    }
                    d77Var.run();
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                pc7 pc7Var = (pc7) runnable;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                na7Var.getClass();
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i2 = iArr[0] + 1;
                iArr[0] = i2;
                if (i2 >= i) {
                    if (!tL_messages_invitedUsers.missing_invitees.isEmpty()) {
                        gl.d3(new nn6(na7Var, chat, tL_messages_invitedUsers, (byte) 2));
                    }
                    if (pc7Var != null) {
                        pc7Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public e77(na7 na7Var, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i, d77 d77Var) {
        this.b = na7Var;
        this.d = zArr;
        this.e = botInfoArr;
        this.f = user;
        this.c = i;
        this.g = d77Var;
    }
}
