package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class p7 implements Runnable {
    public final int f26292a = 1;
    public final int f26293b;
    public final long f26294c;
    public final int d;
    public final c1 f26295e;
    public final Object f26296f;
    public final Object h;
    public final Object f26297n;
    public final Object f26298r;
    public final Object f26299s;
    public final Object f26300w;
    public final Object f26301x;

    public p7(w7 w7Var, TLRPC.Document document, yv yvVar, g20 g20Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, fc fcVar, Object obj, String str, long j3, int i7, int i10) {
        this.f26295e = w7Var;
        this.f26296f = document;
        this.h = yvVar;
        this.f26297n = g20Var;
        this.f26298r = tL_fileLocationToBeDeprecated;
        this.f26299s = fcVar;
        this.f26300w = obj;
        this.f26301x = str;
        this.f26294c = j3;
        this.f26293b = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        a0.h hVar;
        int i7 = this.f26292a;
        Object obj = this.f26301x;
        Object obj2 = this.f26299s;
        Object obj3 = this.f26298r;
        Object obj4 = this.f26297n;
        Object obj5 = this.h;
        Object obj6 = this.f26296f;
        c1 c1Var = this.f26295e;
        switch (i7) {
            case 0:
                ((w7) c1Var).Y((TLRPC.Document) obj6, (yv) obj5, (g20) obj4, (TLRPC.TL_fileLocationToBeDeprecated) obj3, (fc) obj2, this.f26300w, (String) obj, this.f26294c, this.f26293b, null, 0L, false, this.d);
                return;
            default:
                ri riVar = (ri) c1Var;
                a0.h hVar2 = (a0.h) obj6;
                HashMap hashMap = (HashMap) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                a0.h hVar3 = (a0.h) obj3;
                HashMap hashMap2 = (HashMap) obj2;
                a0.h hVar4 = (a0.h) this.f26300w;
                Runnable runnable = (Runnable) obj;
                a0.h hVar5 = riVar.K;
                ConcurrentHashMap concurrentHashMap = riVar.O;
                a0.h hVar6 = riVar.J;
                ArrayList[] arrayListArr = riVar.H;
                int i10 = 0;
                while (true) {
                    int i11 = this.f26293b;
                    Runnable runnable2 = runnable;
                    if (i10 < arrayListArr[i11].size()) {
                        TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) arrayListArr[i11].get(i10)).set;
                        HashMap hashMap3 = hashMap2;
                        hVar6.l(stickerSet.f28519id);
                        concurrentHashMap.remove(stickerSet.short_name);
                        if (i11 != 3 && i11 != 6 && i11 != 4) {
                            hVar5.l(stickerSet.f28519id);
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
                        riVar.Y[i11] = this.f26294c;
                        riVar.Z[i11] = this.d;
                        riVar.I[i11] = hVar3;
                        if (i11 == 0) {
                            riVar.f26709e0 = hashMap4;
                            riVar.f26706d0 = hVar4;
                        } else if (i11 == 3) {
                            riVar.f26712f0 = hashMap4;
                        }
                        riVar.getNotificationCenter().k(60, Integer.valueOf(i11), Boolean.TRUE);
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

    public p7(ri riVar, int i7, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j3, int i10, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.f26295e = riVar;
        this.f26293b = i7;
        this.f26296f = hVar;
        this.h = hashMap;
        this.f26297n = arrayList;
        this.f26294c = j3;
        this.d = i10;
        this.f26298r = hVar2;
        this.f26299s = hashMap2;
        this.f26300w = hVar3;
        this.f26301x = runnable;
    }
}
