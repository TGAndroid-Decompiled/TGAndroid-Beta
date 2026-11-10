package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class qk implements Runnable {
    public final int f24710a = 1;
    public final qp f24711b;
    public final long f24712c;
    public final int d;
    public final long f24713e;
    public final Object f24714f;
    public final Object h;
    public final Object f24715n;
    public final Object f24716r;

    public qk(qp qpVar, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i7, long j10) {
        this.f24711b = qpVar;
        this.f24714f = arrayList;
        this.f24712c = j3;
        this.h = updates_channeldifference;
        this.f24715n = chat;
        this.f24716r = hVar;
        this.d = i7;
        this.f24713e = j10;
    }

    @Override
    public final void run() {
        TLRPC.Chat chat;
        a0.h hVar;
        switch (this.f24710a) {
            case 0:
                qp qpVar = this.f24711b;
                boolean[] zArr = (boolean[]) this.f24714f;
                yr yrVar = (yr) this.h;
                long j3 = this.f24712c;
                Runnable[] runnableArr = (Runnable[]) this.f24715n;
                long j10 = this.f24713e;
                int i7 = this.d;
                ep epVar = (ep) this.f24716r;
                if (!zArr[0]) {
                    g0.h3(new pb(qpVar, zArr, yrVar.O(j3), runnableArr, j10, i7, epVar));
                    return;
                }
                return;
            default:
                qp qpVar2 = this.f24711b;
                ArrayList arrayList = (ArrayList) this.f24714f;
                long j11 = this.f24712c;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) this.h;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f24715n;
                a0.h hVar2 = (a0.h) this.f24716r;
                int i10 = this.d;
                long j12 = this.f24713e;
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
                        long[] a22 = qpVar2.getMessagesStorage().a2(tL_updateMessageID.random_id, -j11, null, tL_updateMessageID.f27218id, 0, -1, 0);
                        if (a22 != null) {
                            sparseArray.put(tL_updateMessageID.f27218id, a22);
                        }
                        chat2 = chat3;
                        hVar2 = hVar3;
                        arrayList = arrayList2;
                    }
                    chat = chat2;
                    hVar = hVar2;
                    if (sparseArray.size() != 0) {
                        g0.h3(new dm(qpVar2, sparseArray, 1));
                    }
                } else {
                    chat = chat2;
                    hVar = hVar2;
                }
                Utilities.d.c(new fm(qpVar2, updates_channeldifference, j11, chat, hVar, i10, j12));
                return;
        }
    }

    public qk(qp qpVar, boolean[] zArr, yr yrVar, long j3, Runnable[] runnableArr, long j10, int i7, ep epVar) {
        this.f24711b = qpVar;
        this.f24714f = zArr;
        this.h = yrVar;
        this.f24712c = j3;
        this.f24715n = runnableArr;
        this.f24713e = j10;
        this.d = i7;
        this.f24716r = epVar;
    }
}
