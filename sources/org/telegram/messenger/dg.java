package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dg implements Runnable {
    public final int f23518a;
    public final int f23519b;
    public final Object f23520c;
    public final Object d;
    public final Object f23521e;

    public dg(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f23518a = i10;
        this.f23520c = obj;
        this.f23519b = i7;
        this.d = obj2;
        this.f23521e = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dg.run():void");
    }

    public dg(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f23518a = i10;
        this.f23520c = obj;
        this.d = obj2;
        this.f23519b = i7;
        this.f23521e = obj3;
    }

    public dg(c1 c1Var, Object obj, Object obj2, int i7, int i10) {
        this.f23518a = i10;
        this.f23520c = c1Var;
        this.d = obj;
        this.f23521e = obj2;
        this.f23519b = i7;
    }

    public dg(mp mpVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f23518a = i10;
        this.f23520c = mpVar;
        this.f23519b = i7;
        this.f23521e = tLObject;
        this.d = tL_error;
    }

    public dg(mp mpVar, TLObject tLObject, int i7, oo ooVar) {
        this.f23518a = 10;
        this.f23520c = mpVar;
        this.f23521e = tLObject;
        this.f23519b = i7;
        this.d = ooVar;
    }
}
