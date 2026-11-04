package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dh implements Runnable {
    public final int f22184a = 1;
    public final boolean f22185b;
    public final boolean f22186c;
    public final Object d;
    public final Object f22187e;
    public final Object f22188f;
    public final Object h;
    public final Object f22189n;

    public dh(ve veVar, boolean z10, TLRPC.PhotoSize photoSize, zi ziVar, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = veVar;
        this.f22185b = z10;
        this.f22187e = photoSize;
        this.f22188f = ziVar;
        this.h = photo;
        this.f22186c = z11;
        this.f22189n = document;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dh.run():void");
    }

    public dh(li liVar, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = liVar;
        this.f22187e = num;
        this.f22188f = arrayList;
        this.f22185b = z10;
        this.f22186c = z11;
        this.h = arrayListArr;
        this.f22189n = runnable;
    }

    public dh(hp hpVar, so soVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = hpVar;
        this.f22187e = soVar;
        this.f22188f = tL_error;
        this.h = d2Var;
        this.f22189n = tLObject;
        this.f22185b = z10;
        this.f22186c = z11;
    }
}
