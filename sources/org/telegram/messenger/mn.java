package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mn implements Runnable {
    public final int f24063a;
    public final Object f24064b;
    public final Object f24065c;
    public final Object d;
    public final Object f24066e;
    public final Object f24067f;

    public mn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f24063a = i7;
        this.f24064b = obj;
        this.f24065c = obj2;
        this.d = obj3;
        this.f24066e = obj4;
        this.f24067f = obj5;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mn.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mn.run():void");
    }

    public mn(qp qpVar, TLRPC.TL_error tL_error, TLObject tLObject, Long l10, c20 c20Var) {
        this.f24063a = 9;
        this.f24064b = qpVar;
        this.f24067f = tL_error;
        this.f24065c = tLObject;
        this.d = l10;
        this.f24066e = c20Var;
    }
}
