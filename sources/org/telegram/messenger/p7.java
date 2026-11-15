package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class p7 implements Runnable {
    public final int f25902a = 1;
    public final int f25903b;
    public final long f25904c;
    public final int d;
    public final c1 f25905e;
    public final Object f25906f;
    public final Object h;
    public final Object f25907n;
    public final Object f25908r;
    public final Object f25909s;
    public final Object f25910w;
    public final Object f25911x;

    public p7(w7 w7Var, TLRPC.Document document, cw cwVar, k20 k20Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, gc gcVar, Object obj, String str, long j3, int i7, int i10) {
        this.f25905e = w7Var;
        this.f25906f = document;
        this.h = cwVar;
        this.f25907n = k20Var;
        this.f25908r = tL_fileLocationToBeDeprecated;
        this.f25909s = gcVar;
        this.f25910w = obj;
        this.f25911x = str;
        this.f25904c = j3;
        this.f25903b = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        a0.h hVar;
        int i7 = this.f25902a;
        Object obj = this.f25911x;
        Object obj2 = this.f25909s;
        Object obj3 = this.f25908r;
        Object obj4 = this.f25907n;
        Object obj5 = this.h;
        Object obj6 = this.f25906f;
        c1 c1Var = this.f25905e;
        switch (i7) {
            case 0:
                ((w7) c1Var).Y((TLRPC.Document) obj6, (cw) obj5, (k20) obj4, (TLRPC.TL_fileLocationToBeDeprecated) obj3, (gc) obj2, this.f25910w, (String) obj, this.f25904c, this.f25903b, null, 0L, false, this.d);
                return;
            default:
                si siVar = (si) c1Var;
                a0.h hVar2 = (a0.h) obj6;
                HashMap hashMap = (HashMap) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                a0.h hVar3 = (a0.h) obj3;
                HashMap hashMap2 = (HashMap) obj2;
                a0.h hVar4 = (a0.h) this.f25910w;
                Runnable runnable = (Runnable) obj;
                a0.h hVar5 = siVar.K;
                ConcurrentHashMap concurrentHashMap = siVar.O;
                a0.h hVar6 = siVar.J;
                ArrayList[] arrayListArr = siVar.H;
                int i10 = 0;
                while (true) {
                    int i11 = this.f25903b;
                    Runnable runnable2 = runnable;
                    if (i10 < arrayListArr[i11].size()) {
                        TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) arrayListArr[i11].get(i10)).set;
                        HashMap hashMap3 = hashMap2;
                        hVar6.l(stickerSet.f28078id);
                        concurrentHashMap.remove(stickerSet.short_name);
                        if (i11 != 3 && i11 != 6 && i11 != 4) {
                            hVar5.l(stickerSet.f28078id);
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
                        siVar.Y[i11] = this.f25904c;
                        siVar.Z[i11] = this.d;
                        siVar.I[i11] = hVar3;
                        if (i11 == 0) {
                            siVar.f26470e0 = hashMap4;
                            siVar.f26467d0 = hVar4;
                        } else if (i11 == 3) {
                            siVar.f26473f0 = hashMap4;
                        }
                        siVar.getNotificationCenter().k(60, Integer.valueOf(i11), Boolean.TRUE);
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

    public p7(si siVar, int i7, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j3, int i10, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.f25905e = siVar;
        this.f25903b = i7;
        this.f25906f = hVar;
        this.h = hashMap;
        this.f25907n = arrayList;
        this.f25904c = j3;
        this.d = i10;
        this.f25908r = hVar2;
        this.f25909s = hashMap2;
        this.f25910w = hVar3;
        this.f25911x = runnable;
    }
}
