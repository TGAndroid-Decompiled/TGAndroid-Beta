package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c97 implements RequestDelegate {
    public final byte a = 1;
    public final long b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;

    public c97(na7 na7Var, TLRPC.User user, long j, p8c p8cVar, int i) {
        this.d = na7Var;
        this.e = user;
        this.b = j;
        this.f = p8cVar;
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
                na7 na7Var = (na7) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                p8c p8cVar = (p8c) obj;
                ConcurrentHashMap concurrentHashMap = na7Var.j1;
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
                    na7Var.b4(tL_users_userFull.users, false);
                    na7Var.V3(tL_users_userFull.chats, false);
                    TLRPC.UserFull userFull2 = tL_users_userFull.full_user;
                    userFull2.user = na7Var.V1(Long.valueOf(userFull2.id));
                    na7Var.getMessagesStorage().g2(userFull, false);
                    na7Var.M1().p0(this.b, userFull.stories);
                    je2 e = je2.e(na7Var.currentAccount);
                    TLRPC.UserFull userFull3 = tL_users_userFull.full_user;
                    e.p(userFull3.id, userFull3.wallpaper);
                    if (p8cVar != null) {
                        p8cVar.a(userFull);
                    }
                    gl.c3(new tn6(na7Var, userFull, user, this.c, (byte) 1));
                    return;
                }
                gl.c3(new c57(na7Var, user, (byte) 1));
                return;
            default:
                hp8 hp8Var = (hp8) obj3;
                hp8Var.getClass();
                gl.c3(new ue(hp8Var, tLObject, (ad7) obj2, this.b, this.c, (ArrayList) obj));
                return;
        }
    }

    public c97(hp8 hp8Var, ad7 ad7Var, long j, int i, ArrayList arrayList) {
        this.d = hp8Var;
        this.e = ad7Var;
        this.b = j;
        this.c = i;
        this.f = arrayList;
    }
}
