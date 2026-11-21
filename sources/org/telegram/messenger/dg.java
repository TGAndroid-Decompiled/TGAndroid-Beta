package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dg implements Runnable {
    public final int f23543a;
    public final int f23544b;
    public final Object f23545c;
    public final Object d;
    public final Object f23546e;

    public dg(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f23543a = i10;
        this.f23545c = obj;
        this.f23544b = i7;
        this.d = obj2;
        this.f23546e = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dg.run():void");
    }

    public dg(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f23543a = i10;
        this.f23545c = obj;
        this.d = obj2;
        this.f23544b = i7;
        this.f23546e = obj3;
    }

    public dg(c1 c1Var, Object obj, Object obj2, int i7, int i10) {
        this.f23543a = i10;
        this.f23545c = c1Var;
        this.d = obj;
        this.f23546e = obj2;
        this.f23544b = i7;
    }

    public dg(mp mpVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f23543a = i10;
        this.f23545c = mpVar;
        this.f23544b = i7;
        this.f23546e = tLObject;
        this.d = tL_error;
    }

    public dg(mp mpVar, TLObject tLObject, int i7, oo ooVar) {
        this.f23543a = 10;
        this.f23545c = mpVar;
        this.f23546e = tLObject;
        this.f23544b = i7;
        this.d = ooVar;
    }
}
