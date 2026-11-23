package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class mk implements Runnable {
    public final int f25672a = 1;
    public final mp f25673b;
    public final long f25674c;
    public final int d;
    public final long f25675e;
    public final Object f25676f;
    public final Object h;
    public final Object f25677n;
    public final Object f25678r;

    public mk(mp mpVar, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i7, long j10) {
        this.f25673b = mpVar;
        this.f25676f = arrayList;
        this.f25674c = j3;
        this.h = updates_channeldifference;
        this.f25677n = chat;
        this.f25678r = hVar;
        this.d = i7;
        this.f25675e = j10;
    }

    @Override
    public final void run() {
        TLRPC.Chat chat;
        a0.h hVar;
        switch (this.f25672a) {
            case 0:
                mp mpVar = this.f25673b;
                boolean[] zArr = (boolean[]) this.f25676f;
                tr trVar = (tr) this.h;
                long j3 = this.f25674c;
                Runnable[] runnableArr = (Runnable[]) this.f25677n;
                long j10 = this.f25675e;
                int i7 = this.d;
                ap apVar = (ap) this.f25678r;
                if (!zArr[0]) {
                    g0.g3(new nb(mpVar, zArr, trVar.O(j3), runnableArr, j10, i7, apVar));
                    return;
                }
                return;
            default:
                mp mpVar2 = this.f25673b;
                ArrayList arrayList = (ArrayList) this.f25676f;
                long j11 = this.f25674c;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) this.h;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f25677n;
                a0.h hVar2 = (a0.h) this.f25678r;
                int i10 = this.d;
                long j12 = this.f25675e;
                if (!arrayList.isEmpty()) {
                    SparseArray sparseArray = new SparseArray();
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                        TLRPC.Chat chat3 = chat2;
                        a0.h hVar3 = hVar2;
                        ArrayList arrayList2 = arrayList;
                        long[] a22 = mpVar2.getMessagesStorage().a2(tL_updateMessageID.random_id, -j11, null, tL_updateMessageID.f28750id, 0, -1, 0);
                        if (a22 != null) {
                            sparseArray.put(tL_updateMessageID.f28750id, a22);
                        }
                        chat2 = chat3;
                        hVar2 = hVar3;
                        arrayList = arrayList2;
                    }
                    chat = chat2;
                    hVar = hVar2;
                    if (sparseArray.size() != 0) {
                        g0.g3(new sl(mpVar2, sparseArray, 1));
                    }
                } else {
                    chat = chat2;
                    hVar = hVar2;
                }
                Utilities.d.c(new jm(mpVar2, updates_channeldifference, j11, chat, hVar, i10, j12));
                return;
        }
    }

    public mk(mp mpVar, boolean[] zArr, tr trVar, long j3, Runnable[] runnableArr, long j10, int i7, ap apVar) {
        this.f25673b = mpVar;
        this.f25676f = zArr;
        this.h = trVar;
        this.f25674c = j3;
        this.f25677n = runnableArr;
        this.f25675e = j10;
        this.d = i7;
        this.f25678r = apVar;
    }
}
