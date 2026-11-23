package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class nk implements Runnable {
    public final int f25776a = 1;
    public final np f25777b;
    public final long f25778c;
    public final int d;
    public final long f25779e;
    public final Object f25780f;
    public final Object h;
    public final Object f25781n;
    public final Object f25782r;

    public nk(np npVar, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i7, long j10) {
        this.f25777b = npVar;
        this.f25780f = arrayList;
        this.f25778c = j3;
        this.h = updates_channeldifference;
        this.f25781n = chat;
        this.f25782r = hVar;
        this.d = i7;
        this.f25779e = j10;
    }

    @Override
    public final void run() {
        TLRPC.Chat chat;
        a0.h hVar;
        switch (this.f25776a) {
            case 0:
                np npVar = this.f25777b;
                boolean[] zArr = (boolean[]) this.f25780f;
                ur urVar = (ur) this.h;
                long j3 = this.f25778c;
                Runnable[] runnableArr = (Runnable[]) this.f25781n;
                long j10 = this.f25779e;
                int i7 = this.d;
                bp bpVar = (bp) this.f25782r;
                if (!zArr[0]) {
                    g0.g3(new ob(npVar, zArr, urVar.O(j3), runnableArr, j10, i7, bpVar));
                    return;
                }
                return;
            default:
                np npVar2 = this.f25777b;
                ArrayList arrayList = (ArrayList) this.f25780f;
                long j11 = this.f25778c;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) this.h;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f25781n;
                a0.h hVar2 = (a0.h) this.f25782r;
                int i10 = this.d;
                long j12 = this.f25779e;
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
                        long[] a22 = npVar2.getMessagesStorage().a2(tL_updateMessageID.random_id, -j11, null, tL_updateMessageID.f28692id, 0, -1, 0);
                        if (a22 != null) {
                            sparseArray.put(tL_updateMessageID.f28692id, a22);
                        }
                        chat2 = chat3;
                        hVar2 = hVar3;
                        arrayList = arrayList2;
                    }
                    chat = chat2;
                    hVar = hVar2;
                    if (sparseArray.size() != 0) {
                        g0.g3(new tl(npVar2, sparseArray, 1));
                    }
                } else {
                    chat = chat2;
                    hVar = hVar2;
                }
                Utilities.d.c(new km(npVar2, updates_channeldifference, j11, chat, hVar, i10, j12));
                return;
        }
    }

    public nk(np npVar, boolean[] zArr, ur urVar, long j3, Runnable[] runnableArr, long j10, int i7, bp bpVar) {
        this.f25777b = npVar;
        this.f25780f = zArr;
        this.h = urVar;
        this.f25778c = j3;
        this.f25781n = runnableArr;
        this.f25779e = j10;
        this.d = i7;
        this.f25782r = bpVar;
    }
}
