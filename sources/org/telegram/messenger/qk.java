package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class qk implements Runnable {
    public final int f24706a = 1;
    public final qp f24707b;
    public final long f24708c;
    public final int d;
    public final long f24709e;
    public final Object f24710f;
    public final Object h;
    public final Object f24711n;
    public final Object f24712r;

    public qk(qp qpVar, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i7, long j10) {
        this.f24707b = qpVar;
        this.f24710f = arrayList;
        this.f24708c = j3;
        this.h = updates_channeldifference;
        this.f24711n = chat;
        this.f24712r = hVar;
        this.d = i7;
        this.f24709e = j10;
    }

    @Override
    public final void run() {
        TLRPC.Chat chat;
        a0.h hVar;
        switch (this.f24706a) {
            case 0:
                qp qpVar = this.f24707b;
                boolean[] zArr = (boolean[]) this.f24710f;
                yr yrVar = (yr) this.h;
                long j3 = this.f24708c;
                Runnable[] runnableArr = (Runnable[]) this.f24711n;
                long j10 = this.f24709e;
                int i7 = this.d;
                ep epVar = (ep) this.f24712r;
                if (!zArr[0]) {
                    g0.h3(new pb(qpVar, zArr, yrVar.O(j3), runnableArr, j10, i7, epVar));
                    return;
                }
                return;
            default:
                qp qpVar2 = this.f24707b;
                ArrayList arrayList = (ArrayList) this.f24710f;
                long j11 = this.f24708c;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) this.h;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f24711n;
                a0.h hVar2 = (a0.h) this.f24712r;
                int i10 = this.d;
                long j12 = this.f24709e;
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
                        long[] a22 = qpVar2.getMessagesStorage().a2(tL_updateMessageID.random_id, -j11, null, tL_updateMessageID.f27214id, 0, -1, 0);
                        if (a22 != null) {
                            sparseArray.put(tL_updateMessageID.f27214id, a22);
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
        this.f24707b = qpVar;
        this.f24710f = zArr;
        this.h = yrVar;
        this.f24708c = j3;
        this.f24711n = runnableArr;
        this.f24709e = j10;
        this.d = i7;
        this.f24712r = epVar;
    }
}
