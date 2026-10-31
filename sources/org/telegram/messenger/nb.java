package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class nb implements Runnable {
    public final int f17079a;
    public final boolean f17080b;
    public final int f17081c;
    public final Object d;
    public final Object e;

    public nb(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.f17079a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f17080b = z10;
        this.f17081c = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.nb.run():void");
    }

    public nb(rb rbVar, int i10, String str, boolean z10) {
        this.f17079a = 0;
        this.d = rbVar;
        this.f17081c = i10;
        this.e = str;
        this.f17080b = z10;
    }

    public nb(ui uiVar, int i10, boolean z10, q20 q20Var) {
        this.f17079a = 2;
        this.d = uiVar;
        this.f17081c = i10;
        this.f17080b = z10;
        this.e = q20Var;
    }
}
