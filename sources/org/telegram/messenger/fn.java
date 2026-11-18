package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fn implements Runnable {
    public final int f24040a;
    public final Object f24041b;
    public final Object f24042c;
    public final Object d;
    public final Object f24043e;
    public final Object f24044f;

    public fn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f24040a = i7;
        this.f24041b = obj;
        this.f24042c = obj2;
        this.d = obj3;
        this.f24043e = obj4;
        this.f24044f = obj5;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fn.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fn.run():void");
    }

    public fn(mp mpVar, TLRPC.TL_error tL_error, TLObject tLObject, Long l10, x10 x10Var) {
        this.f24040a = 9;
        this.f24041b = mpVar;
        this.f24044f = tL_error;
        this.f24042c = tLObject;
        this.d = l10;
        this.f24043e = x10Var;
    }
}
