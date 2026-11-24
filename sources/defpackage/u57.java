package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class u57 implements Runnable {
    public final byte a = 1;
    public final na7 b;
    public final long c;
    public final int d;
    public final long e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;

    public u57(na7 na7Var, ArrayList arrayList, long j, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, vf6 vf6Var, int i, long j2) {
        this.b = na7Var;
        this.f = arrayList;
        this.c = j;
        this.h = updates_channeldifference;
        this.n = chat;
        this.r = vf6Var;
        this.d = i;
        this.e = j2;
    }

    @Override
    public final void run() {
        int i = 0;
        switch (this.a) {
            case 0:
                na7 na7Var = this.b;
                boolean[] zArr = (boolean[]) this.f;
                ad7 ad7Var = (ad7) this.h;
                long j = this.c;
                ?? r8 = (Runnable[]) this.n;
                long j2 = this.e;
                int i2 = this.d;
                ca7 ca7Var = (ca7) this.r;
                if (!zArr[0]) {
                    gl.d3(new pe(na7Var, zArr, ad7Var.N(j), r8, j2, i2, ca7Var, (byte) 3));
                    return;
                }
                return;
            default:
                na7 na7Var2 = this.b;
                ArrayList arrayList = (ArrayList) this.f;
                long j3 = this.c;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) this.h;
                TLRPC.Chat chat = (TLRPC.Chat) this.n;
                vf6 vf6Var = (vf6) this.r;
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
                        long[] X1 = na7Var2.getMessagesStorage().X1(tL_updateMessageID.random_id, -j3, null, tL_updateMessageID.id, 0, -1, 0);
                        if (X1 != null) {
                            sparseArray.put(tL_updateMessageID.id, X1);
                        }
                        i = i4;
                        arrayList = arrayList2;
                    }
                    if (sparseArray.size() != 0) {
                        gl.d3(new r67(na7Var2, sparseArray, (byte) 1));
                    }
                }
                Utilities.d.c(new r77(na7Var2, updates_channeldifference, j3, chat, vf6Var, i3, j4));
                return;
        }
    }

    public u57(na7 na7Var, boolean[] zArr, ad7 ad7Var, long j, Runnable[] runnableArr, long j2, int i, ca7 ca7Var) {
        this.b = na7Var;
        this.f = zArr;
        this.h = ad7Var;
        this.c = j;
        this.n = runnableArr;
        this.e = j2;
        this.d = i;
        this.r = ca7Var;
    }
}
