package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mn implements Runnable {
    public final int f24067a;
    public final Object f24068b;
    public final Object f24069c;
    public final Object d;
    public final Object f24070e;
    public final Object f24071f;

    public mn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f24067a = i7;
        this.f24068b = obj;
        this.f24069c = obj2;
        this.d = obj3;
        this.f24070e = obj4;
        this.f24071f = obj5;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mn.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mn.run():void");
    }

    public mn(qp qpVar, TLRPC.TL_error tL_error, TLObject tLObject, Long l10, c20 c20Var) {
        this.f24067a = 9;
        this.f24068b = qpVar;
        this.f24071f = tL_error;
        this.f24069c = tLObject;
        this.d = l10;
        this.f24070e = c20Var;
    }
}
