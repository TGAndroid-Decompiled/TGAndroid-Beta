package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kh implements Runnable {
    public final int f25027a = 2;
    public final boolean f25028b;
    public final boolean f25029c;
    public final Object d;
    public final Object f25030e;
    public final Object f25031f;
    public final Object h;
    public final Object f25032n;

    public kh(af afVar, boolean z10, TLRPC.PhotoSize photoSize, fj fjVar, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = afVar;
        this.f25028b = z10;
        this.f25030e = photoSize;
        this.f25031f = fjVar;
        this.h = photo;
        this.f25029c = z11;
        this.f25032n = document;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kh.run():void");
    }

    public kh(ri riVar, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = riVar;
        this.f25030e = num;
        this.f25031f = arrayList;
        this.f25028b = z10;
        this.f25029c = z11;
        this.h = arrayListArr;
        this.f25032n = runnable;
    }

    public kh(mp mpVar, xo xoVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.h2 h2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = mpVar;
        this.f25030e = xoVar;
        this.f25031f = tL_error;
        this.h = h2Var;
        this.f25032n = tLObject;
        this.f25028b = z10;
        this.f25029c = z11;
    }
}
