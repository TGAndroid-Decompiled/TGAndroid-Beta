package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dg implements Runnable {
    public final int f21992a;
    public final int f21993b;
    public final Object f21994c;
    public final Object d;
    public final Object f21995e;

    public dg(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f21992a = i10;
        this.f21994c = obj;
        this.f21993b = i7;
        this.d = obj2;
        this.f21995e = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dg.run():void");
    }

    public dg(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f21992a = i10;
        this.f21994c = obj;
        this.d = obj2;
        this.f21993b = i7;
        this.f21995e = obj3;
    }

    public dg(c1 c1Var, Object obj, Object obj2, int i7, int i10) {
        this.f21992a = i10;
        this.f21994c = c1Var;
        this.d = obj;
        this.f21995e = obj2;
        this.f21993b = i7;
    }

    public dg(qp qpVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f21992a = i10;
        this.f21994c = qpVar;
        this.f21993b = i7;
        this.f21995e = tLObject;
        this.d = tL_error;
    }

    public dg(qp qpVar, TLObject tLObject, int i7, so soVar) {
        this.f21992a = 10;
        this.f21994c = qpVar;
        this.f21995e = tLObject;
        this.f21993b = i7;
        this.d = soVar;
    }
}
