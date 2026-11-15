package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jn implements Runnable {
    public final int f24582a;
    public final Object f24583b;
    public final Object f24584c;
    public final Object d;
    public final Object f24585e;
    public final Object f24586f;

    public jn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f24582a = i7;
        this.f24583b = obj;
        this.f24584c = obj2;
        this.d = obj3;
        this.f24585e = obj4;
        this.f24586f = obj5;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jn.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jn.run():void");
    }

    public jn(np npVar, TLRPC.TL_error tL_error, TLObject tLObject, Long l10, z10 z10Var) {
        this.f24582a = 9;
        this.f24583b = npVar;
        this.f24586f = tL_error;
        this.f24584c = tLObject;
        this.d = l10;
        this.f24585e = z10Var;
    }
}
