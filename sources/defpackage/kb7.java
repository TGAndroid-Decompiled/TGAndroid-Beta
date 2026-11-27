package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kb7 implements RequestDelegate {
    public final byte a = 1;
    public final long b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;

    public kb7(uc7 uc7Var, TLRPC.User user, long j, pcc pccVar, int i) {
        this.d = uc7Var;
        this.e = user;
        this.b = j;
        this.f = pccVar;
        this.c = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                uc7 uc7Var = (uc7) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                pcc pccVar = (pcc) obj;
                ConcurrentHashMap concurrentHashMap = uc7Var.j1;
                if (tL_error == null) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
                    TLRPC.UserFull userFull = tL_users_userFull.full_user;
                    int size = tL_users_userFull.users.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            TLRPC.User user2 = tL_users_userFull.users.get(i);
                            if (user2 != null) {
                                long j = user2.id;
                                if (j == user.id && user2.bot && !user2.min) {
                                    Integer num = (Integer) concurrentHashMap.get(Long.valueOf(j));
                                    if (num == null || user2.bot_info_version > num.intValue()) {
                                        concurrentHashMap.put(Long.valueOf(user2.id), Integer.valueOf(user2.bot_info_version));
                                    }
                                }
                            }
                            i++;
                        }
                    }
                    uc7Var.j4(tL_users_userFull.users, false);
                    uc7Var.c4(tL_users_userFull.chats, false);
                    TLRPC.UserFull userFull2 = tL_users_userFull.full_user;
                    userFull2.user = uc7Var.X1(Long.valueOf(userFull2.id));
                    uc7Var.getMessagesStorage().g2(userFull, false);
                    uc7Var.O1().p0(this.b, userFull.stories);
                    af2 e = af2.e(uc7Var.currentAccount);
                    TLRPC.UserFull userFull3 = tL_users_userFull.full_user;
                    e.p(userFull3.id, userFull3.wallpaper);
                    if (pccVar != null) {
                        pccVar.a(userFull);
                    }
                    hl.c3(new gp6(uc7Var, userFull, user, this.c, (byte) 1));
                    return;
                }
                hl.c3(new f77(uc7Var, user, (byte) 1));
                return;
            default:
                ts8 ts8Var = (ts8) obj3;
                ts8Var.getClass();
                hl.c3(new he(ts8Var, tLObject, (jf7) obj2, this.b, this.c, (ArrayList) obj));
                return;
        }
    }

    public kb7(ts8 ts8Var, jf7 jf7Var, long j, int i, ArrayList arrayList) {
        this.d = ts8Var;
        this.e = jf7Var;
        this.b = j;
        this.c = i;
        this.f = arrayList;
    }
}
