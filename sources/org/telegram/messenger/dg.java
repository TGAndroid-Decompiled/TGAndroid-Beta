package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dg implements Runnable {
    public final int f23515a;
    public final int f23516b;
    public final Object f23517c;
    public final Object d;
    public final Object f23518e;

    public dg(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f23515a = i10;
        this.f23517c = obj;
        this.f23516b = i7;
        this.d = obj2;
        this.f23518e = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dg.run():void");
    }

    public dg(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f23515a = i10;
        this.f23517c = obj;
        this.d = obj2;
        this.f23516b = i7;
        this.f23518e = obj3;
    }

    public dg(c1 c1Var, Object obj, Object obj2, int i7, int i10) {
        this.f23515a = i10;
        this.f23517c = c1Var;
        this.d = obj;
        this.f23518e = obj2;
        this.f23516b = i7;
    }

    public dg(mp mpVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f23515a = i10;
        this.f23517c = mpVar;
        this.f23516b = i7;
        this.f23518e = tLObject;
        this.d = tL_error;
    }

    public dg(mp mpVar, TLObject tLObject, int i7, oo ooVar) {
        this.f23515a = 10;
        this.f23517c = mpVar;
        this.f23518e = tLObject;
        this.f23516b = i7;
        this.d = ooVar;
    }
}
