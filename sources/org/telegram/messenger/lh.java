package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lh implements Runnable {
    public final int f25185a = 2;
    public final boolean f25186b;
    public final boolean f25187c;
    public final Object d;
    public final Object f25188e;
    public final Object f25189f;
    public final Object h;
    public final Object f25190n;

    public lh(bf bfVar, boolean z10, TLRPC.PhotoSize photoSize, gj gjVar, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = bfVar;
        this.f25186b = z10;
        this.f25188e = photoSize;
        this.f25189f = gjVar;
        this.h = photo;
        this.f25187c = z11;
        this.f25190n = document;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lh.run():void");
    }

    public lh(si siVar, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = siVar;
        this.f25188e = num;
        this.f25189f = arrayList;
        this.f25186b = z10;
        this.f25187c = z11;
        this.h = arrayListArr;
        this.f25190n = runnable;
    }

    public lh(np npVar, yo yoVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.g2 g2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = npVar;
        this.f25188e = yoVar;
        this.f25189f = tL_error;
        this.h = g2Var;
        this.f25190n = tLObject;
        this.f25186b = z10;
        this.f25187c = z11;
    }
}
