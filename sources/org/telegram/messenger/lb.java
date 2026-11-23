package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class lb implements Runnable {
    public final int f25470a;
    public final boolean f25471b;
    public final int f25472c;
    public final Object d;
    public final Object f25473e;

    public lb(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
        this.f25470a = i10;
        this.d = obj;
        this.f25473e = tLObject;
        this.f25471b = z10;
        this.f25472c = i7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lb.run():void");
    }

    public lb(ob obVar, int i7, String str, boolean z10) {
        this.f25470a = 0;
        this.d = obVar;
        this.f25472c = i7;
        this.f25473e = str;
        this.f25471b = z10;
    }

    public lb(ri riVar, int i7, boolean z10, w10 w10Var) {
        this.f25470a = 2;
        this.d = riVar;
        this.f25472c = i7;
        this.f25471b = z10;
        this.f25473e = w10Var;
    }
}
