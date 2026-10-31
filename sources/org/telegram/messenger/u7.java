package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class u7 implements Runnable {
    public final int f18257a = 0;
    public final int f18258b;
    public final long f18259c;
    public final int d;
    public final f1 e;
    public final Object f18260f;
    public final Object h;
    public final Object f18261n;
    public final Object f18262r;
    public final Object f18263s;
    public final Object f18264w;
    public final Object f18265x;

    public u7(b8 b8Var, TLRPC.Document document, pw pwVar, b30 b30Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ic icVar, Object obj, String str, long j10, int i10, int i11) {
        this.e = b8Var;
        this.f18260f = document;
        this.h = pwVar;
        this.f18261n = b30Var;
        this.f18262r = tL_fileLocationToBeDeprecated;
        this.f18263s = icVar;
        this.f18264w = obj;
        this.f18265x = str;
        this.f18259c = j10;
        this.f18258b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        a0.h hVar;
        int i10 = this.f18257a;
        Object obj = this.f18265x;
        Object obj2 = this.f18263s;
        Object obj3 = this.f18262r;
        Object obj4 = this.f18261n;
        Object obj5 = this.h;
        Object obj6 = this.f18260f;
        f1 f1Var = this.e;
        switch (i10) {
            case 0:
                ((b8) f1Var).Z((TLRPC.Document) obj6, (pw) obj5, (b30) obj4, (TLRPC.TL_fileLocationToBeDeprecated) obj3, (ic) obj2, this.f18264w, (String) obj, this.f18259c, this.f18258b, null, 0L, false, this.d);
                return;
            default:
                ui uiVar = (ui) f1Var;
                a0.h hVar2 = (a0.h) obj6;
                HashMap hashMap = (HashMap) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                a0.h hVar3 = (a0.h) obj3;
                HashMap hashMap2 = (HashMap) obj2;
                a0.h hVar4 = (a0.h) this.f18264w;
                Runnable runnable = (Runnable) obj;
                a0.h hVar5 = uiVar.J;
                ConcurrentHashMap concurrentHashMap = uiVar.N;
                a0.h hVar6 = uiVar.I;
                ArrayList[] arrayListArr = uiVar.G;
                int i11 = 0;
                while (true) {
                    int i12 = this.f18258b;
                    Runnable runnable2 = runnable;
                    if (i11 < arrayListArr[i12].size()) {
                        TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) arrayListArr[i12].get(i11)).set;
                        HashMap hashMap3 = hashMap2;
                        hVar6.l(stickerSet.f19820id);
                        concurrentHashMap.remove(stickerSet.short_name);
                        if (i12 != 3 && i12 != 6 && i12 != 4) {
                            hVar5.l(stickerSet.f19820id);
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
                        uiVar.X[i12] = this.f18259c;
                        uiVar.Y[i12] = this.d;
                        uiVar.H[i12] = hVar3;
                        if (i12 == 0) {
                            uiVar.f18313d0 = hashMap4;
                            uiVar.f18311c0 = hVar4;
                        } else if (i12 == 3) {
                            uiVar.f18315e0 = hashMap4;
                        }
                        uiVar.getNotificationCenter().k(60, Integer.valueOf(i12), Boolean.TRUE);
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

    public u7(ui uiVar, int i10, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.e = uiVar;
        this.f18258b = i10;
        this.f18260f = hVar;
        this.h = hashMap;
        this.f18261n = arrayList;
        this.f18259c = j10;
        this.d = i11;
        this.f18262r = hVar2;
        this.f18263s = hashMap2;
        this.f18264w = hVar3;
        this.f18265x = runnable;
    }
}
