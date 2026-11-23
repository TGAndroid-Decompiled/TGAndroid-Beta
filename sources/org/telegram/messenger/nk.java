package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class nk implements Runnable {
    public final int f25740a = 1;
    public final np f25741b;
    public final long f25742c;
    public final int d;
    public final long f25743e;
    public final Object f25744f;
    public final Object h;
    public final Object f25745n;
    public final Object f25746r;

    public nk(np npVar, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i7, long j10) {
        this.f25741b = npVar;
        this.f25744f = arrayList;
        this.f25742c = j3;
        this.h = updates_channeldifference;
        this.f25745n = chat;
        this.f25746r = hVar;
        this.d = i7;
        this.f25743e = j10;
    }

    @Override
    public final void run() {
        TLRPC.Chat chat;
        a0.h hVar;
        switch (this.f25740a) {
            case 0:
                np npVar = this.f25741b;
                boolean[] zArr = (boolean[]) this.f25744f;
                ur urVar = (ur) this.h;
                long j3 = this.f25742c;
                Runnable[] runnableArr = (Runnable[]) this.f25745n;
                long j10 = this.f25743e;
                int i7 = this.d;
                bp bpVar = (bp) this.f25746r;
                if (!zArr[0]) {
                    g0.g3(new ob(npVar, zArr, urVar.O(j3), runnableArr, j10, i7, bpVar));
                    return;
                }
                return;
            default:
                np npVar2 = this.f25741b;
                ArrayList arrayList = (ArrayList) this.f25744f;
                long j11 = this.f25742c;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) this.h;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f25745n;
                a0.h hVar2 = (a0.h) this.f25746r;
                int i10 = this.d;
                long j12 = this.f25743e;
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
                        long[] a22 = npVar2.getMessagesStorage().a2(tL_updateMessageID.random_id, -j11, null, tL_updateMessageID.f28656id, 0, -1, 0);
                        if (a22 != null) {
                            sparseArray.put(tL_updateMessageID.f28656id, a22);
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
        this.f25741b = npVar;
        this.f25744f = zArr;
        this.h = urVar;
        this.f25742c = j3;
        this.f25745n = runnableArr;
        this.f25743e = j10;
        this.d = i7;
        this.f25746r = bpVar;
    }
}
