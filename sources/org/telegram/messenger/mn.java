package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mn implements Runnable {
    public final int f24058a;
    public final Object f24059b;
    public final Object f24060c;
    public final Object d;
    public final Object f24061e;
    public final Object f24062f;

    public mn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f24058a = i7;
        this.f24059b = obj;
        this.f24060c = obj2;
        this.d = obj3;
        this.f24061e = obj4;
        this.f24062f = obj5;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mn.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mn.run():void");
    }

    public mn(qp qpVar, TLRPC.TL_error tL_error, TLObject tLObject, Long l10, c20 c20Var) {
        this.f24058a = 9;
        this.f24059b = qpVar;
        this.f24062f = tL_error;
        this.f24060c = tLObject;
        this.d = l10;
        this.f24061e = c20Var;
    }
}
