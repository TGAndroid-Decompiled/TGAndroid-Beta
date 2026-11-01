package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lh implements Runnable {
    public final int f16939a = 2;
    public final boolean f16940b;
    public final boolean f16941c;
    public final Object d;
    public final Object e;
    public final Object f16942f;
    public final Object h;
    public final Object f16943n;

    public lh(df dfVar, boolean z10, TLRPC.PhotoSize photoSize, kj kjVar, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = dfVar;
        this.f16940b = z10;
        this.e = photoSize;
        this.f16942f = kjVar;
        this.h = photo;
        this.f16941c = z11;
        this.f16943n = document;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lh.run():void");
    }

    public lh(vi viVar, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = viVar;
        this.e = num;
        this.f16942f = arrayList;
        this.f16940b = z10;
        this.f16941c = z11;
        this.h = arrayListArr;
        this.f16943n = runnable;
    }

    public lh(wp wpVar, hp hpVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.k2 k2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = wpVar;
        this.e = hpVar;
        this.f16942f = tL_error;
        this.h = k2Var;
        this.f16943n = tLObject;
        this.f16940b = z10;
        this.f16941c = z11;
    }
}
