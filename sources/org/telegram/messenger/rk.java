package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class rk implements Runnable {
    public final int f25297a = 1;
    public final qp f25298b;
    public final long f25299c;
    public final int d;
    public final long f25300e;
    public final Object f25301f;
    public final Object h;
    public final Object f25302n;
    public final Object f25303r;

    public rk(qp qpVar, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i7, long j10) {
        this.f25298b = qpVar;
        this.f25301f = arrayList;
        this.f25299c = j3;
        this.h = updates_channeldifference;
        this.f25302n = chat;
        this.f25303r = hVar;
        this.d = i7;
        this.f25300e = j10;
    }

    @Override
    public final void run() {
        TLRPC.Chat chat;
        a0.h hVar;
        switch (this.f25297a) {
            case 0:
                qp qpVar = this.f25298b;
                boolean[] zArr = (boolean[]) this.f25301f;
                yr yrVar = (yr) this.h;
                long j3 = this.f25299c;
                Runnable[] runnableArr = (Runnable[]) this.f25302n;
                long j10 = this.f25300e;
                int i7 = this.d;
                ep epVar = (ep) this.f25303r;
                if (!zArr[0]) {
                    g0.h3(new pb(qpVar, zArr, yrVar.O(j3), runnableArr, j10, i7, epVar));
                    return;
                }
                return;
            default:
                qp qpVar2 = this.f25298b;
                ArrayList arrayList = (ArrayList) this.f25301f;
                long j11 = this.f25299c;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) this.h;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f25302n;
                a0.h hVar2 = (a0.h) this.f25303r;
                int i10 = this.d;
                long j12 = this.f25300e;
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
                        long[] a22 = qpVar2.getMessagesStorage().a2(tL_updateMessageID.random_id, -j11, null, tL_updateMessageID.f27211id, 0, -1, 0);
                        if (a22 != null) {
                            sparseArray.put(tL_updateMessageID.f27211id, a22);
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

    public rk(qp qpVar, boolean[] zArr, yr yrVar, long j3, Runnable[] runnableArr, long j10, int i7, ep epVar) {
        this.f25298b = qpVar;
        this.f25301f = zArr;
        this.h = yrVar;
        this.f25299c = j3;
        this.f25302n = runnableArr;
        this.f25300e = j10;
        this.d = i7;
        this.f25303r = epVar;
    }
}
