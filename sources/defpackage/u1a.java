package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u1a implements Runnable {
    public final byte a;
    public final pf0 b;
    public final ArrayList c;
    public final boolean d;
    public final int e;
    public final TLObject f;
    public final boolean h;
    public final TLObject n;
    public final Object r;
    public final int s;

    public u1a(na7 na7Var, TLRPC.User user, int i, boolean z, TLRPC.UserFull userFull, ArrayList arrayList, HashMap hashMap, int i2, boolean z2) {
        this.a = (byte) 2;
        this.b = na7Var;
        this.f = user;
        this.e = i;
        this.d = z;
        this.n = userFull;
        this.c = arrayList;
        this.r = hashMap;
        this.s = i2;
        this.h = z2;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        Object obj = this.r;
        TLObject tLObject = this.n;
        TLObject tLObject2 = this.f;
        pf0 pf0Var = this.b;
        switch (b) {
            case 0:
                z3a z3aVar = (z3a) pf0Var;
                co3 co3Var = z3aVar.getMessagesStorage().a;
                ArrayList arrayList = this.c;
                boolean z = this.d;
                int i2 = this.e;
                boolean z2 = this.h;
                co3Var.c(new u1a(z3aVar, arrayList, z ? 1 : 0, i2, (TLRPC.Message) tLObject2, z2 ? 1 : 0, (TLRPC.Message) tLObject, (k27) obj, this.s, (byte) 1));
                return;
            case 1:
                z3a z3aVar2 = (z3a) pf0Var;
                ad7 messagesStorage = z3aVar2.getMessagesStorage();
                ArrayList arrayList2 = this.c;
                boolean z3 = this.d;
                messagesStorage.g1(arrayList2, true, false, false, 0, false, z3 ? 1 : 0, 0L);
                int i3 = this.e;
                boolean z4 = this.h;
                int i4 = this.s;
                gl.c3(new g2a(z3aVar2, i3, (TLRPC.Message) tLObject2, z4 ? 1 : 0, z3 ? 1 : 0, (TLRPC.Message) tLObject, (k27) obj, i4));
                return;
            default:
                na7 na7Var = (na7) pf0Var;
                TLRPC.User user = (TLRPC.User) tLObject2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) tLObject;
                HashMap hashMap = (HashMap) obj;
                vf6 vf6Var = na7Var.b1;
                LongSparseIntArray longSparseIntArray = na7Var.x0;
                long currentTimeMillis = System.currentTimeMillis() - na7Var.i1.get(user.id, 0L);
                if (user.bot) {
                    i = 5000;
                } else {
                    i = 60000;
                }
                if (currentTimeMillis > i) {
                    na7Var.Z2(user, this.e, this.d, null);
                }
                if (userFull != null) {
                    if (vf6Var.f(user.id) == null) {
                        vf6Var.k(userFull, user.id);
                        na7Var.i4.M(user.id);
                        gta.v(na7Var.currentAccount, false).N(userFull);
                        int indexOfKey = longSparseIntArray.indexOfKey(user.id);
                        if (userFull.blocked) {
                            if (indexOfKey < 0) {
                                longSparseIntArray.put(user.id, 1);
                                na7Var.getNotificationCenter().k(43, new Object[0]);
                            }
                        } else if (indexOfKey >= 0) {
                            longSparseIntArray.removeAt(indexOfKey);
                            na7Var.getNotificationCenter().k(43, new Object[0]);
                        }
                    }
                    na7Var.getNotificationCenter().k(67, Long.valueOf(user.id), userFull);
                }
                na7Var.getNotificationCenter().k(68, Long.valueOf(user.id), this.c, hashMap, Integer.valueOf(this.s), Boolean.valueOf(this.h));
                return;
        }
    }

    public u1a(z3a z3aVar, ArrayList arrayList, int i, int i2, TLRPC.Message message, int i3, TLRPC.Message message2, k27 k27Var, int i4, byte b) {
        this.a = b;
        this.b = z3aVar;
        this.c = arrayList;
        this.d = i;
        this.e = i2;
        this.f = message;
        this.h = i3;
        this.n = message2;
        this.r = k27Var;
        this.s = i4;
    }
}
