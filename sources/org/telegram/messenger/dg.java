package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dg implements Runnable {
    public final int f21999a;
    public final int f22000b;
    public final Object f22001c;
    public final Object d;
    public final Object f22002e;

    public dg(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f21999a = i10;
        this.f22001c = obj;
        this.f22000b = i7;
        this.d = obj2;
        this.f22002e = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dg.run():void");
    }

    public dg(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f21999a = i10;
        this.f22001c = obj;
        this.d = obj2;
        this.f22000b = i7;
        this.f22002e = obj3;
    }

    public dg(c1 c1Var, Object obj, Object obj2, int i7, int i10) {
        this.f21999a = i10;
        this.f22001c = c1Var;
        this.d = obj;
        this.f22002e = obj2;
        this.f22000b = i7;
    }

    public dg(qp qpVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f21999a = i10;
        this.f22001c = qpVar;
        this.f22000b = i7;
        this.f22002e = tLObject;
        this.d = tL_error;
    }

    public dg(qp qpVar, TLObject tLObject, int i7, so soVar) {
        this.f21999a = 10;
        this.f22001c = qpVar;
        this.f22002e = tLObject;
        this.f22000b = i7;
        this.d = soVar;
    }
}
