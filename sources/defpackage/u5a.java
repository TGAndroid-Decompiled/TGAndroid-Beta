package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u5a implements Runnable {
    public final byte a;
    public final rf0 b;
    public final ArrayList c;
    public final boolean d;
    public final int e;
    public final TLObject f;
    public final boolean h;
    public final TLObject n;
    public final Object r;
    public final int s;

    public u5a(uc7 uc7Var, TLRPC.User user, int i, boolean z, TLRPC.UserFull userFull, ArrayList arrayList, HashMap hashMap, int i2, boolean z2) {
        this.a = (byte) 2;
        this.b = uc7Var;
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
        rf0 rf0Var = this.b;
        switch (b) {
            case 0:
                r7a r7aVar = (r7a) rf0Var;
                to3 to3Var = r7aVar.getMessagesStorage().a;
                ArrayList arrayList = this.c;
                boolean z = this.d;
                int i2 = this.e;
                boolean z2 = this.h;
                to3Var.c(new u5a(r7aVar, arrayList, z ? 1 : 0, i2, (TLRPC.Message) tLObject2, z2 ? 1 : 0, (TLRPC.Message) tLObject, (r47) obj, this.s, (byte) 1));
                return;
            case 1:
                r7a r7aVar2 = (r7a) rf0Var;
                jf7 messagesStorage = r7aVar2.getMessagesStorage();
                ArrayList arrayList2 = this.c;
                boolean z3 = this.d;
                messagesStorage.g1(arrayList2, true, false, false, 0, false, z3 ? 1 : 0, 0L);
                int i3 = this.e;
                boolean z4 = this.h;
                int i4 = this.s;
                hl.c3(new b6a(r7aVar2, i3, (TLRPC.Message) tLObject2, z4 ? 1 : 0, z3 ? 1 : 0, (TLRPC.Message) tLObject, (r47) obj, i4));
                return;
            default:
                uc7 uc7Var = (uc7) rf0Var;
                TLRPC.User user = (TLRPC.User) tLObject2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) tLObject;
                HashMap hashMap = (HashMap) obj;
                zh6 zh6Var = uc7Var.b1;
                LongSparseIntArray longSparseIntArray = uc7Var.x0;
                long currentTimeMillis = System.currentTimeMillis() - uc7Var.i1.get(user.id, 0L);
                if (user.bot) {
                    i = 5000;
                } else {
                    i = 60000;
                }
                if (currentTimeMillis > i) {
                    uc7Var.f3(user, this.e, this.d, null);
                }
                if (userFull != null) {
                    if (zh6Var.f(user.id) == null) {
                        zh6Var.k(user.id, userFull);
                        uc7Var.i4.M(user.id);
                        jxa.v(uc7Var.currentAccount, false).N(userFull);
                        int indexOfKey = longSparseIntArray.indexOfKey(user.id);
                        if (userFull.blocked) {
                            if (indexOfKey < 0) {
                                longSparseIntArray.put(user.id, 1);
                                uc7Var.getNotificationCenter().k(44, new Object[0]);
                            }
                        } else if (indexOfKey >= 0) {
                            longSparseIntArray.removeAt(indexOfKey);
                            uc7Var.getNotificationCenter().k(44, new Object[0]);
                        }
                    }
                    uc7Var.getNotificationCenter().k(68, Long.valueOf(user.id), userFull);
                }
                uc7Var.getNotificationCenter().k(69, Long.valueOf(user.id), this.c, hashMap, Integer.valueOf(this.s), Boolean.valueOf(this.h));
                return;
        }
    }

    public u5a(r7a r7aVar, ArrayList arrayList, int i, int i2, TLRPC.Message message, int i3, TLRPC.Message message2, r47 r47Var, int i4, byte b) {
        this.a = b;
        this.b = r7aVar;
        this.c = arrayList;
        this.d = i;
        this.e = i2;
        this.f = message;
        this.h = i3;
        this.n = message2;
        this.r = r47Var;
        this.s = i4;
    }
}
