package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class p7 implements Runnable {
    public final int f24523a = 1;
    public final int f24524b;
    public final long f24525c;
    public final int d;
    public final c1 f24526e;
    public final Object f24527f;
    public final Object h;
    public final Object f24528n;
    public final Object f24529r;
    public final Object f24530s;
    public final Object f24531w;
    public final Object f24532x;

    public p7(w7 w7Var, TLRPC.Document document, ew ewVar, m20 m20Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, hc hcVar, Object obj, String str, long j3, int i7, int i10) {
        this.f24526e = w7Var;
        this.f24527f = document;
        this.h = ewVar;
        this.f24528n = m20Var;
        this.f24529r = tL_fileLocationToBeDeprecated;
        this.f24530s = hcVar;
        this.f24531w = obj;
        this.f24532x = str;
        this.f24525c = j3;
        this.f24524b = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        a0.h hVar;
        int i7 = this.f24523a;
        Object obj = this.f24532x;
        Object obj2 = this.f24530s;
        Object obj3 = this.f24529r;
        Object obj4 = this.f24528n;
        Object obj5 = this.h;
        Object obj6 = this.f24527f;
        c1 c1Var = this.f24526e;
        switch (i7) {
            case 0:
                ((w7) c1Var).Y((TLRPC.Document) obj6, (ew) obj5, (m20) obj4, (TLRPC.TL_fileLocationToBeDeprecated) obj3, (hc) obj2, this.f24531w, (String) obj, this.f24525c, this.f24524b, null, 0L, false, this.d);
                return;
            default:
                ui uiVar = (ui) c1Var;
                a0.h hVar2 = (a0.h) obj6;
                HashMap hashMap = (HashMap) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                a0.h hVar3 = (a0.h) obj3;
                HashMap hashMap2 = (HashMap) obj2;
                a0.h hVar4 = (a0.h) this.f24531w;
                Runnable runnable = (Runnable) obj;
                a0.h hVar5 = uiVar.J;
                ConcurrentHashMap concurrentHashMap = uiVar.N;
                a0.h hVar6 = uiVar.I;
                ArrayList[] arrayListArr = uiVar.G;
                int i10 = 0;
                while (true) {
                    int i11 = this.f24524b;
                    Runnable runnable2 = runnable;
                    if (i10 < arrayListArr[i11].size()) {
                        TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) arrayListArr[i11].get(i10)).set;
                        HashMap hashMap3 = hashMap2;
                        hVar6.l(stickerSet.f26983id);
                        concurrentHashMap.remove(stickerSet.short_name);
                        if (i11 != 3 && i11 != 6 && i11 != 4) {
                            hVar5.l(stickerSet.f26983id);
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
                        uiVar.X[i11] = this.f24525c;
                        uiVar.Y[i11] = this.d;
                        uiVar.H[i11] = hVar3;
                        if (i11 == 0) {
                            uiVar.f25808d0 = hashMap4;
                            uiVar.f25806c0 = hVar4;
                        } else if (i11 == 3) {
                            uiVar.f25811e0 = hashMap4;
                        }
                        uiVar.getNotificationCenter().k(60, Integer.valueOf(i11), Boolean.TRUE);
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

    public p7(ui uiVar, int i7, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j3, int i10, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.f24526e = uiVar;
        this.f24524b = i7;
        this.f24527f = hVar;
        this.h = hashMap;
        this.f24528n = arrayList;
        this.f24525c = j3;
        this.d = i10;
        this.f24529r = hVar2;
        this.f24530s = hashMap2;
        this.f24531w = hVar3;
        this.f24532x = runnable;
    }
}
