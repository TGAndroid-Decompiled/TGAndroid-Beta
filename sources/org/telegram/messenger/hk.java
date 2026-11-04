package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class hk implements Runnable {
    public final int f22936a = 1;
    public final hp f22937b;
    public final long f22938c;
    public final int d;
    public final long f22939e;
    public final Object f22940f;
    public final Object h;
    public final Object f22941n;
    public final Object f22942r;

    public hk(hp hpVar, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i3, long j11) {
        this.f22937b = hpVar;
        this.f22940f = arrayList;
        this.f22938c = j10;
        this.h = updates_channeldifference;
        this.f22941n = chat;
        this.f22942r = hVar;
        this.d = i3;
        this.f22939e = j11;
    }

    @Override
    public final void run() {
        TLRPC.Chat chat;
        a0.h hVar;
        switch (this.f22936a) {
            case 0:
                hp hpVar = this.f22937b;
                boolean[] zArr = (boolean[]) this.f22940f;
                qr qrVar = (qr) this.h;
                long j10 = this.f22938c;
                Runnable[] runnableArr = (Runnable[]) this.f22941n;
                long j11 = this.f22939e;
                int i3 = this.d;
                vo voVar = (vo) this.f22942r;
                if (!zArr[0]) {
                    g0.h3(new ib(hpVar, zArr, qrVar.O(j10), runnableArr, j11, i3, voVar));
                    return;
                }
                return;
            default:
                hp hpVar2 = this.f22937b;
                ArrayList arrayList = (ArrayList) this.f22940f;
                long j12 = this.f22938c;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) this.h;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f22941n;
                a0.h hVar2 = (a0.h) this.f22942r;
                int i10 = this.d;
                long j13 = this.f22939e;
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
                        long[] a22 = hpVar2.getMessagesStorage().a2(tL_updateMessageID.random_id, -j12, null, tL_updateMessageID.f27259id, 0, -1, 0);
                        if (a22 != null) {
                            sparseArray.put(tL_updateMessageID.f27259id, a22);
                        }
                        chat2 = chat3;
                        hVar2 = hVar3;
                        arrayList = arrayList2;
                    }
                    chat = chat2;
                    hVar = hVar2;
                    if (sparseArray.size() != 0) {
                        g0.h3(new tl(hpVar2, sparseArray, 1));
                    }
                } else {
                    chat = chat2;
                    hVar = hVar2;
                }
                Utilities.d.c(new vl(hpVar2, updates_channeldifference, j12, chat, hVar, i10, j13));
                return;
        }
    }

    public hk(hp hpVar, boolean[] zArr, qr qrVar, long j10, Runnable[] runnableArr, long j11, int i3, vo voVar) {
        this.f22937b = hpVar;
        this.f22940f = zArr;
        this.h = qrVar;
        this.f22938c = j10;
        this.f22941n = runnableArr;
        this.f22939e = j11;
        this.d = i3;
        this.f22942r = voVar;
    }
}
