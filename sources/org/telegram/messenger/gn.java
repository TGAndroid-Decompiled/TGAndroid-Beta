package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gn implements Runnable {
    public final int f24285a;
    public final Object f24286b;
    public final Object f24287c;
    public final Object d;
    public final Object f24288e;
    public final Object f24289f;

    public gn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f24285a = i7;
        this.f24286b = obj;
        this.f24287c = obj2;
        this.d = obj3;
        this.f24288e = obj4;
        this.f24289f = obj5;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gn.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gn.run():void");
    }

    public gn(np npVar, TLRPC.TL_error tL_error, TLObject tLObject, Long l10, y10 y10Var) {
        this.f24285a = 9;
        this.f24286b = npVar;
        this.f24289f = tL_error;
        this.f24287c = tLObject;
        this.d = l10;
        this.f24288e = y10Var;
    }
}
