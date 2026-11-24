package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class db7 implements RequestDelegate {
    public final byte a = 1;
    public final long b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;

    public db7(oc7 oc7Var, TLRPC.User user, long j, qac qacVar, int i) {
        this.d = oc7Var;
        this.e = user;
        this.b = j;
        this.f = qacVar;
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
                oc7 oc7Var = (oc7) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                qac qacVar = (qac) obj;
                ConcurrentHashMap concurrentHashMap = oc7Var.j1;
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
                    oc7Var.d4(tL_users_userFull.users, false);
                    oc7Var.X3(tL_users_userFull.chats, false);
                    TLRPC.UserFull userFull2 = tL_users_userFull.full_user;
                    userFull2.user = oc7Var.W1(Long.valueOf(userFull2.id));
                    oc7Var.getMessagesStorage().g2(userFull, false);
                    oc7Var.N1().p0(this.b, userFull.stories);
                    uf2 e = uf2.e(oc7Var.currentAccount);
                    TLRPC.UserFull userFull3 = tL_users_userFull.full_user;
                    e.p(userFull3.id, userFull3.wallpaper);
                    if (qacVar != null) {
                        qacVar.a(userFull);
                    }
                    gm.c3(new up6(oc7Var, userFull, user, this.c, (byte) 1));
                    return;
                }
                gm.c3(new c77(oc7Var, user, (byte) 1));
                return;
            default:
                ir8 ir8Var = (ir8) obj3;
                ir8Var.getClass();
                gm.c3(new vf(ir8Var, tLObject, (cf7) obj2, this.b, this.c, (ArrayList) obj));
                return;
        }
    }

    public db7(ir8 ir8Var, cf7 cf7Var, long j, int i, ArrayList arrayList) {
        this.d = ir8Var;
        this.e = cf7Var;
        this.b = j;
        this.c = i;
        this.f = arrayList;
    }
}
