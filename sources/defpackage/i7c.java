package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
public final class i7c {
    public static final i7c[] f = new i7c[4];
    public final int a;
    public final LongSparseLongArray b = new LongSparseLongArray();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final h7c e = new h7c(this);

    public i7c(int i) {
        this.a = i;
    }

    public final void a(o39 o39Var) {
        long j;
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.c;
        arrayList.clear();
        for (int i = 0; i < o39Var.getChildCount(); i++) {
            View childAt = o39Var.getChildAt(i);
            if (childAt instanceof ue3) {
                j = ((ue3) childAt).getDialogId();
            } else if (childAt instanceof v6c) {
                j = ((v6c) childAt).getDialogId();
            } else {
                j = 0;
            }
            int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            LongSparseLongArray longSparseLongArray = this.b;
            int i3 = this.a;
            if (i2 > 0) {
                TLRPC.User V1 = na7.q1(i3).V1(Long.valueOf(j));
                if (V1 != null && !V1.bot && !V1.self && !V1.contact && (userStatus = V1.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(j, 0L) > 3600000) {
                    longSparseLongArray.put(j, currentTimeMillis);
                    arrayList.add(Long.valueOf(j));
                }
            } else {
                TLRPC.Chat K0 = na7.q1(i3).K0(Long.valueOf(-j));
                if (hc2.T(K0) && !hc2.p0(K0) && currentTimeMillis - longSparseLongArray.get(j, 0L) > 3600000) {
                    longSparseLongArray.put(j, currentTimeMillis);
                    arrayList.add(Long.valueOf(j));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.d.addAll(arrayList);
            h7c h7cVar = this.e;
            gl.r(h7cVar);
            gl.e3(h7cVar, 300L);
        }
    }
}
