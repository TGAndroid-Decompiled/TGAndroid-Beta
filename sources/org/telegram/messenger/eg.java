package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class eg implements Runnable {
    public final int f23703a;
    public final int f23704b;
    public final Object f23705c;
    public final Object d;
    public final Object f23706e;

    public eg(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f23703a = i10;
        this.f23705c = obj;
        this.f23704b = i7;
        this.d = obj2;
        this.f23706e = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.eg.run():void");
    }

    public eg(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f23703a = i10;
        this.f23705c = obj;
        this.d = obj2;
        this.f23704b = i7;
        this.f23706e = obj3;
    }

    public eg(c1 c1Var, Object obj, Object obj2, int i7, int i10) {
        this.f23703a = i10;
        this.f23705c = c1Var;
        this.d = obj;
        this.f23706e = obj2;
        this.f23704b = i7;
    }

    public eg(np npVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f23703a = i10;
        this.f23705c = npVar;
        this.f23704b = i7;
        this.f23706e = tLObject;
        this.d = tL_error;
    }

    public eg(np npVar, TLObject tLObject, int i7, po poVar) {
        this.f23703a = 10;
        this.f23705c = npVar;
        this.f23706e = tLObject;
        this.f23704b = i7;
        this.d = poVar;
    }
}
