package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class al implements Runnable {
    public final int f14640a = 1;
    public final wp f14641b;
    public final long f14642c;
    public final int d;
    public final long e;
    public final Object f14643f;
    public final Object h;
    public final Object f14644n;
    public final Object f14645r;

    public al(wp wpVar, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f14641b = wpVar;
        this.f14643f = arrayList;
        this.f14642c = j10;
        this.h = updates_channeldifference;
        this.f14644n = chat;
        this.f14645r = hVar;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        TLRPC.Chat chat;
        a0.h hVar;
        switch (this.f14640a) {
            case 0:
                wp wpVar = this.f14641b;
                boolean[] zArr = (boolean[]) this.f14643f;
                is isVar = (is) this.h;
                long j10 = this.f14642c;
                Runnable[] runnableArr = (Runnable[]) this.f14644n;
                long j11 = this.e;
                int i10 = this.d;
                kp kpVar = (kp) this.f14645r;
                if (!zArr[0]) {
                    i0.g3(new rb(wpVar, zArr, isVar.O(j10), runnableArr, j11, i10, kpVar));
                    return;
                }
                return;
            default:
                wp wpVar2 = this.f14641b;
                ArrayList arrayList = (ArrayList) this.f14643f;
                long j12 = this.f14642c;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) this.h;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f14644n;
                a0.h hVar2 = (a0.h) this.f14645r;
                int i11 = this.d;
                long j13 = this.e;
                if (!arrayList.isEmpty()) {
                    SparseArray sparseArray = new SparseArray();
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                        TLRPC.Chat chat3 = chat2;
                        a0.h hVar3 = hVar2;
                        ArrayList arrayList2 = arrayList;
                        long[] a2 = wpVar2.getMessagesStorage().a2(tL_updateMessageID.random_id, -j12, null, tL_updateMessageID.f20051id, 0, -1, 0);
                        if (a2 != null) {
                            sparseArray.put(tL_updateMessageID.f20051id, a2);
                        }
                        chat2 = chat3;
                        hVar2 = hVar3;
                        arrayList = arrayList2;
                    }
                    chat = chat2;
                    hVar = hVar2;
                    if (sparseArray.size() != 0) {
                        i0.g3(new ul(wpVar2, sparseArray, 1));
                    }
                } else {
                    chat = chat2;
                    hVar = hVar2;
                }
                Utilities.d.c(new an(wpVar2, updates_channeldifference, j12, chat, hVar, i11, j13));
                return;
        }
    }

    public al(wp wpVar, boolean[] zArr, is isVar, long j10, Runnable[] runnableArr, long j11, int i10, kp kpVar) {
        this.f14641b = wpVar;
        this.f14643f = zArr;
        this.h = isVar;
        this.f14642c = j10;
        this.f14644n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.f14645r = kpVar;
    }
}
