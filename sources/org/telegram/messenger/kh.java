package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kh implements Runnable {
    public final int f24690a = 2;
    public final boolean f24691b;
    public final boolean f24692c;
    public final Object d;
    public final Object f24693e;
    public final Object f24694f;
    public final Object h;
    public final Object f24695n;

    public kh(bf bfVar, boolean z10, TLRPC.PhotoSize photoSize, gj gjVar, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = bfVar;
        this.f24691b = z10;
        this.f24693e = photoSize;
        this.f24694f = gjVar;
        this.h = photo;
        this.f24692c = z11;
        this.f24695n = document;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kh.run():void");
    }

    public kh(si siVar, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = siVar;
        this.f24693e = num;
        this.f24694f = arrayList;
        this.f24691b = z10;
        this.f24692c = z11;
        this.h = arrayListArr;
        this.f24695n = runnable;
    }

    public kh(np npVar, yo yoVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = npVar;
        this.f24693e = yoVar;
        this.f24694f = tL_error;
        this.h = e2Var;
        this.f24695n = tLObject;
        this.f24691b = z10;
        this.f24692c = z11;
    }
}
