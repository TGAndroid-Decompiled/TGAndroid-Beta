package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kh implements Runnable {
    public final int f25055a = 2;
    public final boolean f25056b;
    public final boolean f25057c;
    public final Object d;
    public final Object f25058e;
    public final Object f25059f;
    public final Object h;
    public final Object f25060n;

    public kh(af afVar, boolean z10, TLRPC.PhotoSize photoSize, fj fjVar, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = afVar;
        this.f25056b = z10;
        this.f25058e = photoSize;
        this.f25059f = fjVar;
        this.h = photo;
        this.f25057c = z11;
        this.f25060n = document;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kh.run():void");
    }

    public kh(ri riVar, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = riVar;
        this.f25058e = num;
        this.f25059f = arrayList;
        this.f25056b = z10;
        this.f25057c = z11;
        this.h = arrayListArr;
        this.f25060n = runnable;
    }

    public kh(mp mpVar, xo xoVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.g2 g2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = mpVar;
        this.f25058e = xoVar;
        this.f25059f = tL_error;
        this.h = g2Var;
        this.f25060n = tLObject;
        this.f25056b = z10;
        this.f25057c = z11;
    }
}
