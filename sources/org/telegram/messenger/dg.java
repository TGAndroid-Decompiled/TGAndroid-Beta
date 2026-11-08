package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dg implements Runnable {
    public final int f22024a;
    public final int f22025b;
    public final Object f22026c;
    public final Object d;
    public final Object f22027e;

    public dg(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f22024a = i10;
        this.f22026c = obj;
        this.f22025b = i7;
        this.d = obj2;
        this.f22027e = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dg.run():void");
    }

    public dg(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f22024a = i10;
        this.f22026c = obj;
        this.d = obj2;
        this.f22025b = i7;
        this.f22027e = obj3;
    }

    public dg(c1 c1Var, Object obj, Object obj2, int i7, int i10) {
        this.f22024a = i10;
        this.f22026c = c1Var;
        this.d = obj;
        this.f22027e = obj2;
        this.f22025b = i7;
    }

    public dg(qp qpVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f22024a = i10;
        this.f22026c = qpVar;
        this.f22025b = i7;
        this.f22027e = tLObject;
        this.d = tL_error;
    }

    public dg(qp qpVar, TLObject tLObject, int i7, so soVar) {
        this.f22024a = 10;
        this.f22026c = qpVar;
        this.f22027e = tLObject;
        this.f22025b = i7;
        this.d = soVar;
    }
}
