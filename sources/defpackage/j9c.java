package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
public final class j9c {
    public static final j9c[] f = new j9c[4];
    public final int a;
    public final LongSparseLongArray b = new LongSparseLongArray();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final i9c e = new i9c(this);

    public j9c(int i) {
        this.a = i;
    }

    public final void a(r59 r59Var) {
        long j;
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.c;
        arrayList.clear();
        for (int i = 0; i < r59Var.getChildCount(); i++) {
            View childAt = r59Var.getChildAt(i);
            if (childAt instanceof hg3) {
                j = ((hg3) childAt).getDialogId();
            } else if (childAt instanceof w8c) {
                j = ((w8c) childAt).getDialogId();
            } else {
                j = 0;
            }
            int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            LongSparseLongArray longSparseLongArray = this.b;
            int i3 = this.a;
            if (i2 > 0) {
                TLRPC.User W1 = oc7.r1(i3).W1(Long.valueOf(j));
                if (W1 != null && !W1.bot && !W1.self && !W1.contact && (userStatus = W1.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(j, 0L) > 3600000) {
                    longSparseLongArray.put(j, currentTimeMillis);
                    arrayList.add(Long.valueOf(j));
                }
            } else {
                TLRPC.Chat L0 = oc7.r1(i3).L0(Long.valueOf(-j));
                if (sd2.T(L0) && !sd2.p0(L0) && currentTimeMillis - longSparseLongArray.get(j, 0L) > 3600000) {
                    longSparseLongArray.put(j, currentTimeMillis);
                    arrayList.add(Long.valueOf(j));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.d.addAll(arrayList);
            i9c i9cVar = this.e;
            gm.r(i9cVar);
            gm.d3(i9cVar, 300L);
        }
    }
}
