package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gn implements Runnable {
    public final int f24249a;
    public final Object f24250b;
    public final Object f24251c;
    public final Object d;
    public final Object f24252e;
    public final Object f24253f;

    public gn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f24249a = i7;
        this.f24250b = obj;
        this.f24251c = obj2;
        this.d = obj3;
        this.f24252e = obj4;
        this.f24253f = obj5;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gn.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gn.run():void");
    }

    public gn(np npVar, TLRPC.TL_error tL_error, TLObject tLObject, Long l10, y10 y10Var) {
        this.f24249a = 9;
        this.f24250b = npVar;
        this.f24253f = tL_error;
        this.f24251c = tLObject;
        this.d = l10;
        this.f24252e = y10Var;
    }
}
