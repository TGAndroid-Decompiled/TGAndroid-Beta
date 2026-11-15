package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class ok implements Runnable {
    public final int f25769a = 1;
    public final np f25770b;
    public final long f25771c;
    public final int d;
    public final long f25772e;
    public final Object f25773f;
    public final Object h;
    public final Object f25774n;
    public final Object f25775r;

    public ok(np npVar, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i7, long j10) {
        this.f25770b = npVar;
        this.f25773f = arrayList;
        this.f25771c = j3;
        this.h = updates_channeldifference;
        this.f25774n = chat;
        this.f25775r = hVar;
        this.d = i7;
        this.f25772e = j10;
    }

    @Override
    public final void run() {
        TLRPC.Chat chat;
        a0.h hVar;
        switch (this.f25769a) {
            case 0:
                np npVar = this.f25770b;
                boolean[] zArr = (boolean[]) this.f25773f;
                vr vrVar = (vr) this.h;
                long j3 = this.f25771c;
                Runnable[] runnableArr = (Runnable[]) this.f25774n;
                long j10 = this.f25772e;
                int i7 = this.d;
                bp bpVar = (bp) this.f25775r;
                if (!zArr[0]) {
                    g0.h3(new ob(npVar, zArr, vrVar.O(j3), runnableArr, j10, i7, bpVar));
                    return;
                }
                return;
            default:
                np npVar2 = this.f25770b;
                ArrayList arrayList = (ArrayList) this.f25773f;
                long j11 = this.f25771c;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) this.h;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f25774n;
                a0.h hVar2 = (a0.h) this.f25775r;
                int i10 = this.d;
                long j12 = this.f25772e;
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
                        long[] a22 = npVar2.getMessagesStorage().a2(tL_updateMessageID.random_id, -j11, null, tL_updateMessageID.f28309id, 0, -1, 0);
                        if (a22 != null) {
                            sparseArray.put(tL_updateMessageID.f28309id, a22);
                        }
                        chat2 = chat3;
                        hVar2 = hVar3;
                        arrayList = arrayList2;
                    }
                    chat = chat2;
                    hVar = hVar2;
                    if (sparseArray.size() != 0) {
                        g0.h3(new am(npVar2, sparseArray, 1));
                    }
                } else {
                    chat = chat2;
                    hVar = hVar2;
                }
                Utilities.d.c(new cm(npVar2, updates_channeldifference, j11, chat, hVar, i10, j12));
                return;
        }
    }

    public ok(np npVar, boolean[] zArr, vr vrVar, long j3, Runnable[] runnableArr, long j10, int i7, bp bpVar) {
        this.f25770b = npVar;
        this.f25773f = zArr;
        this.h = vrVar;
        this.f25771c = j3;
        this.f25774n = runnableArr;
        this.f25772e = j10;
        this.d = i7;
        this.f25775r = bpVar;
    }
}
