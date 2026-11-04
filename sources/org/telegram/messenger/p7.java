package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class p7 implements Runnable {
    public final int f24707a = 1;
    public final int f24708b;
    public final long f24709c;
    public final int d;
    public final c1 f24710e;
    public final Object f24711f;
    public final Object h;
    public final Object f24712n;
    public final Object f24713r;
    public final Object f24714s;
    public final Object f24715w;
    public final Object f24716x;

    public p7(w7 w7Var, TLRPC.Document document, wv wvVar, e20 e20Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ac acVar, Object obj, String str, long j10, int i3, int i10) {
        this.f24710e = w7Var;
        this.f24711f = document;
        this.h = wvVar;
        this.f24712n = e20Var;
        this.f24713r = tL_fileLocationToBeDeprecated;
        this.f24714s = acVar;
        this.f24715w = obj;
        this.f24716x = str;
        this.f24709c = j10;
        this.f24708b = i3;
        this.d = i10;
    }

    @Override
    public final void run() {
        a0.h hVar;
        int i3 = this.f24707a;
        Object obj = this.f24716x;
        Object obj2 = this.f24714s;
        Object obj3 = this.f24713r;
        Object obj4 = this.f24712n;
        Object obj5 = this.h;
        Object obj6 = this.f24711f;
        c1 c1Var = this.f24710e;
        switch (i3) {
            case 0:
                ((w7) c1Var).Z((TLRPC.Document) obj6, (wv) obj5, (e20) obj4, (TLRPC.TL_fileLocationToBeDeprecated) obj3, (ac) obj2, this.f24715w, (String) obj, this.f24709c, this.f24708b, null, 0L, false, this.d);
                return;
            default:
                li liVar = (li) c1Var;
                a0.h hVar2 = (a0.h) obj6;
                HashMap hashMap = (HashMap) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                a0.h hVar3 = (a0.h) obj3;
                HashMap hashMap2 = (HashMap) obj2;
                a0.h hVar4 = (a0.h) this.f24715w;
                Runnable runnable = (Runnable) obj;
                a0.h hVar5 = liVar.K;
                ConcurrentHashMap concurrentHashMap = liVar.O;
                a0.h hVar6 = liVar.J;
                ArrayList[] arrayListArr = liVar.H;
                int i10 = 0;
                while (true) {
                    int i11 = this.f24708b;
                    Runnable runnable2 = runnable;
                    if (i10 < arrayListArr[i11].size()) {
                        TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) arrayListArr[i11].get(i10)).set;
                        HashMap hashMap3 = hashMap2;
                        hVar6.l(stickerSet.f27028id);
                        concurrentHashMap.remove(stickerSet.short_name);
                        if (i11 != 3 && i11 != 6 && i11 != 4) {
                            hVar5.l(stickerSet.f27028id);
                        }
                        i10++;
                        runnable = runnable2;
                        hashMap2 = hashMap3;
                    } else {
                        HashMap hashMap4 = hashMap2;
                        int i12 = 0;
                        while (i12 < hVar2.m()) {
                            hVar6.k((TLRPC.TL_messages_stickerSet) hVar2.n(i12), hVar2.j(i12));
                            if (i11 != 3 && i11 != 6 && i11 != 4) {
                                hVar = hVar3;
                                hVar5.k((TLRPC.TL_messages_stickerSet) hVar2.n(i12), hVar2.j(i12));
                            } else {
                                hVar = hVar3;
                            }
                            i12++;
                            hVar3 = hVar;
                        }
                        concurrentHashMap.putAll(hashMap);
                        arrayListArr[i11] = arrayList;
                        liVar.Y[i11] = this.f24709c;
                        liVar.Z[i11] = this.d;
                        liVar.I[i11] = hVar3;
                        if (i11 == 0) {
                            liVar.f24020e0 = hashMap4;
                            liVar.f24017d0 = hVar4;
                        } else if (i11 == 3) {
                            liVar.f24023f0 = hashMap4;
                        }
                        liVar.getNotificationCenter().k(60, Integer.valueOf(i11), Boolean.TRUE);
                        if (runnable2 != null) {
                            runnable2.run();
                            return;
                        }
                        return;
                    }
                }
                break;
        }
    }

    public p7(li liVar, int i3, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i10, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.f24710e = liVar;
        this.f24708b = i3;
        this.f24711f = hVar;
        this.h = hashMap;
        this.f24712n = arrayList;
        this.f24709c = j10;
        this.d = i10;
        this.f24713r = hVar2;
        this.f24714s = hashMap2;
        this.f24715w = hVar3;
        this.f24716x = runnable;
    }
}
