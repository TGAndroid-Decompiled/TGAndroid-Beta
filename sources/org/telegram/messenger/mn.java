package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mn implements Runnable {
    public final int f24051a;
    public final Object f24052b;
    public final Object f24053c;
    public final Object d;
    public final Object f24054e;
    public final Object f24055f;

    public mn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f24051a = i7;
        this.f24052b = obj;
        this.f24053c = obj2;
        this.d = obj3;
        this.f24054e = obj4;
        this.f24055f = obj5;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mn.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mn.run():void");
    }

    public mn(qp qpVar, TLRPC.TL_error tL_error, TLObject tLObject, Long l10, c20 c20Var) {
        this.f24051a = 9;
        this.f24052b = qpVar;
        this.f24055f = tL_error;
        this.f24053c = tLObject;
        this.d = l10;
        this.f24054e = c20Var;
    }
}
