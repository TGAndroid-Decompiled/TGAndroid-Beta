package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kh implements Runnable {
    public final int f25030a = 2;
    public final boolean f25031b;
    public final boolean f25032c;
    public final Object d;
    public final Object f25033e;
    public final Object f25034f;
    public final Object h;
    public final Object f25035n;

    public kh(af afVar, boolean z10, TLRPC.PhotoSize photoSize, fj fjVar, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = afVar;
        this.f25031b = z10;
        this.f25033e = photoSize;
        this.f25034f = fjVar;
        this.h = photo;
        this.f25032c = z11;
        this.f25035n = document;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kh.run():void");
    }

    public kh(ri riVar, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = riVar;
        this.f25033e = num;
        this.f25034f = arrayList;
        this.f25031b = z10;
        this.f25032c = z11;
        this.h = arrayListArr;
        this.f25035n = runnable;
    }

    public kh(mp mpVar, xo xoVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.h2 h2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = mpVar;
        this.f25033e = xoVar;
        this.f25034f = tL_error;
        this.h = h2Var;
        this.f25035n = tLObject;
        this.f25031b = z10;
        this.f25032c = z11;
    }
}
