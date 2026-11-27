package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class w77 implements Runnable {
    public final byte a = 1;
    public final uc7 b;
    public final long c;
    public final int d;
    public final long e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;

    public w77(uc7 uc7Var, ArrayList arrayList, long j, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, zh6 zh6Var, int i, long j2) {
        this.b = uc7Var;
        this.f = arrayList;
        this.c = j;
        this.h = updates_channeldifference;
        this.n = chat;
        this.r = zh6Var;
        this.d = i;
        this.e = j2;
    }

    @Override
    public final void run() {
        int i = 0;
        switch (this.a) {
            case 0:
                uc7 uc7Var = this.b;
                boolean[] zArr = (boolean[]) this.f;
                kf7 kf7Var = (kf7) this.h;
                long j = this.c;
                ?? r8 = (Runnable[]) this.n;
                long j2 = this.e;
                int i2 = this.d;
                jc7 jc7Var = (jc7) this.r;
                if (!zArr[0]) {
                    hl.c3(new qe(uc7Var, zArr, kf7Var.P(j), r8, j2, i2, jc7Var, (byte) 3));
                    return;
                }
                return;
            default:
                uc7 uc7Var2 = this.b;
                ArrayList arrayList = (ArrayList) this.f;
                long j3 = this.c;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) this.h;
                TLRPC.Chat chat = (TLRPC.Chat) this.n;
                zh6 zh6Var = (zh6) this.r;
                int i3 = this.d;
                long j4 = this.e;
                if (!arrayList.isEmpty()) {
                    SparseArray sparseArray = new SparseArray();
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        int i4 = i + 1;
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                        ArrayList arrayList2 = arrayList;
                        long[] c2 = uc7Var2.getMessagesStorage().c2(tL_updateMessageID.random_id, -j3, null, tL_updateMessageID.id, 0, -1, 0);
                        if (c2 != null) {
                            sparseArray.put(tL_updateMessageID.id, c2);
                        }
                        i = i4;
                        arrayList = arrayList2;
                    }
                    if (sparseArray.size() != 0) {
                        hl.c3(new n97(uc7Var2, sparseArray, (byte) 1));
                    }
                }
                Utilities.d.c(new ga7(uc7Var2, updates_channeldifference, j3, chat, zh6Var, i3, j4));
                return;
        }
    }

    public w77(uc7 uc7Var, boolean[] zArr, kf7 kf7Var, long j, Runnable[] runnableArr, long j2, int i, jc7 jc7Var) {
        this.b = uc7Var;
        this.f = zArr;
        this.h = kf7Var;
        this.c = j;
        this.n = runnableArr;
        this.e = j2;
        this.d = i;
        this.r = jc7Var;
    }
}
