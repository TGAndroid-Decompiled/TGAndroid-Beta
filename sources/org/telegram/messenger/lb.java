package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class lb implements Runnable {
    public final int f25353a;
    public final boolean f25354b;
    public final int f25355c;
    public final Object d;
    public final Object f25356e;

    public lb(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
        this.f25353a = i10;
        this.d = obj;
        this.f25356e = tLObject;
        this.f25354b = z10;
        this.f25355c = i7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lb.run():void");
    }

    public lb(ob obVar, int i7, String str, boolean z10) {
        this.f25353a = 0;
        this.d = obVar;
        this.f25355c = i7;
        this.f25356e = str;
        this.f25354b = z10;
    }

    public lb(ri riVar, int i7, boolean z10, x10 x10Var) {
        this.f25353a = 2;
        this.d = riVar;
        this.f25355c = i7;
        this.f25354b = z10;
        this.f25356e = x10Var;
    }
}
