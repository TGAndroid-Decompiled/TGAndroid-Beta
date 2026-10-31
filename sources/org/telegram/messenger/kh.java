package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kh implements Runnable {
    public final int f16574a = 2;
    public final boolean f16575b;
    public final boolean f16576c;
    public final Object d;
    public final Object e;
    public final Object f16577f;
    public final Object h;
    public final Object f16578n;

    public kh(cf cfVar, boolean z10, TLRPC.PhotoSize photoSize, jj jjVar, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = cfVar;
        this.f16575b = z10;
        this.e = photoSize;
        this.f16577f = jjVar;
        this.h = photo;
        this.f16576c = z11;
        this.f16578n = document;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kh.run():void");
    }

    public kh(ui uiVar, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = uiVar;
        this.e = num;
        this.f16577f = arrayList;
        this.f16575b = z10;
        this.f16576c = z11;
        this.h = arrayListArr;
        this.f16578n = runnable;
    }

    public kh(vp vpVar, gp gpVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.k2 k2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = vpVar;
        this.e = gpVar;
        this.f16577f = tL_error;
        this.h = k2Var;
        this.f16578n = tLObject;
        this.f16575b = z10;
        this.f16576c = z11;
    }
}
