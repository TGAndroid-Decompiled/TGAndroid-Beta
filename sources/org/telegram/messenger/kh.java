package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kh implements Runnable {
    public final int f25126a = 2;
    public final boolean f25127b;
    public final boolean f25128c;
    public final Object d;
    public final Object f25129e;
    public final Object f25130f;
    public final Object h;
    public final Object f25131n;

    public kh(af afVar, boolean z10, TLRPC.PhotoSize photoSize, fj fjVar, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = afVar;
        this.f25127b = z10;
        this.f25129e = photoSize;
        this.f25130f = fjVar;
        this.h = photo;
        this.f25128c = z11;
        this.f25131n = document;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kh.run():void");
    }

    public kh(ri riVar, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = riVar;
        this.f25129e = num;
        this.f25130f = arrayList;
        this.f25127b = z10;
        this.f25128c = z11;
        this.h = arrayListArr;
        this.f25131n = runnable;
    }

    public kh(mp mpVar, xo xoVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.g2 g2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = mpVar;
        this.f25129e = xoVar;
        this.f25130f = tL_error;
        this.h = g2Var;
        this.f25131n = tLObject;
        this.f25127b = z10;
        this.f25128c = z11;
    }
}
