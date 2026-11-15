package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jn implements Runnable {
    public final int f24577a;
    public final Object f24578b;
    public final Object f24579c;
    public final Object d;
    public final Object f24580e;
    public final Object f24581f;

    public jn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f24577a = i7;
        this.f24578b = obj;
        this.f24579c = obj2;
        this.d = obj3;
        this.f24580e = obj4;
        this.f24581f = obj5;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jn.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jn.run():void");
    }

    public jn(np npVar, TLRPC.TL_error tL_error, TLObject tLObject, Long l10, z10 z10Var) {
        this.f24577a = 9;
        this.f24578b = npVar;
        this.f24581f = tL_error;
        this.f24579c = tLObject;
        this.d = l10;
        this.f24580e = z10Var;
    }
}
