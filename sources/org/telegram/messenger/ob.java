package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ob implements Runnable {
    public final int f17416a;
    public final boolean f17417b;
    public final int f17418c;
    public final Object d;
    public final Object e;

    public ob(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.f17416a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f17417b = z10;
        this.f17418c = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ob.run():void");
    }

    public ob(sb sbVar, int i10, String str, boolean z10) {
        this.f17416a = 0;
        this.d = sbVar;
        this.f17418c = i10;
        this.e = str;
        this.f17417b = z10;
    }

    public ob(vi viVar, int i10, boolean z10, r20 r20Var) {
        this.f17416a = 2;
        this.d = viVar;
        this.f17418c = i10;
        this.f17417b = z10;
        this.e = r20Var;
    }
}
