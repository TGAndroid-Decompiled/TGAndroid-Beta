package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class u7 implements Runnable {
    public final int f18390a = 0;
    public final int f18391b;
    public final long f18392c;
    public final int d;
    public final f1 e;
    public final Object f18393f;
    public final Object h;
    public final Object f18394n;
    public final Object f18395r;
    public final Object f18396s;
    public final Object f18397w;
    public final Object f18398x;

    public u7(b8 b8Var, TLRPC.Document document, qw qwVar, c30 c30Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, jc jcVar, Object obj, String str, long j10, int i10, int i11) {
        this.e = b8Var;
        this.f18393f = document;
        this.h = qwVar;
        this.f18394n = c30Var;
        this.f18395r = tL_fileLocationToBeDeprecated;
        this.f18396s = jcVar;
        this.f18397w = obj;
        this.f18398x = str;
        this.f18392c = j10;
        this.f18391b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        a0.h hVar;
        int i10 = this.f18390a;
        Object obj = this.f18398x;
        Object obj2 = this.f18396s;
        Object obj3 = this.f18395r;
        Object obj4 = this.f18394n;
        Object obj5 = this.h;
        Object obj6 = this.f18393f;
        f1 f1Var = this.e;
        switch (i10) {
            case 0:
                ((b8) f1Var).Z((TLRPC.Document) obj6, (qw) obj5, (c30) obj4, (TLRPC.TL_fileLocationToBeDeprecated) obj3, (jc) obj2, this.f18397w, (String) obj, this.f18392c, this.f18391b, null, 0L, false, this.d);
                return;
            default:
                vi viVar = (vi) f1Var;
                a0.h hVar2 = (a0.h) obj6;
                HashMap hashMap = (HashMap) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                a0.h hVar3 = (a0.h) obj3;
                HashMap hashMap2 = (HashMap) obj2;
                a0.h hVar4 = (a0.h) this.f18397w;
                Runnable runnable = (Runnable) obj;
                a0.h hVar5 = viVar.J;
                ConcurrentHashMap concurrentHashMap = viVar.N;
                a0.h hVar6 = viVar.I;
                ArrayList[] arrayListArr = viVar.G;
                int i11 = 0;
                while (true) {
                    int i12 = this.f18391b;
                    Runnable runnable2 = runnable;
                    if (i11 < arrayListArr[i12].size()) {
                        TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) arrayListArr[i12].get(i11)).set;
                        HashMap hashMap3 = hashMap2;
                        hVar6.l(stickerSet.f19821id);
                        concurrentHashMap.remove(stickerSet.short_name);
                        if (i12 != 3 && i12 != 6 && i12 != 4) {
                            hVar5.l(stickerSet.f19821id);
                        }
                        i11++;
                        runnable = runnable2;
                        hashMap2 = hashMap3;
                    } else {
                        HashMap hashMap4 = hashMap2;
                        int i13 = 0;
                        while (i13 < hVar2.m()) {
                            hVar6.k((TLRPC.TL_messages_stickerSet) hVar2.n(i13), hVar2.j(i13));
                            if (i12 != 3 && i12 != 6 && i12 != 4) {
                                hVar = hVar3;
                                hVar5.k((TLRPC.TL_messages_stickerSet) hVar2.n(i13), hVar2.j(i13));
                            } else {
                                hVar = hVar3;
                            }
                            i13++;
                            hVar3 = hVar;
                        }
                        concurrentHashMap.putAll(hashMap);
                        arrayListArr[i12] = arrayList;
                        viVar.X[i12] = this.f18392c;
                        viVar.Y[i12] = this.d;
                        viVar.H[i12] = hVar3;
                        if (i12 == 0) {
                            viVar.f18642d0 = hashMap4;
                            viVar.f18640c0 = hVar4;
                        } else if (i12 == 3) {
                            viVar.f18644e0 = hashMap4;
                        }
                        viVar.getNotificationCenter().k(60, Integer.valueOf(i12), Boolean.TRUE);
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

    public u7(vi viVar, int i10, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.e = viVar;
        this.f18391b = i10;
        this.f18393f = hVar;
        this.h = hashMap;
        this.f18394n = arrayList;
        this.f18392c = j10;
        this.d = i11;
        this.f18395r = hVar2;
        this.f18396s = hashMap2;
        this.f18397w = hVar3;
        this.f18398x = runnable;
    }
}
