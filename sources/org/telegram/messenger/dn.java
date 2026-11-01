package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dn implements Runnable {
    public final int f15411a;
    public final Object f15412b;
    public final Object f15413c;
    public final Object d;
    public final Object e;
    public final Object f15414f;

    public dn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f15411a = i10;
        this.f15412b = obj;
        this.f15413c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f15414f = obj5;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dn.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dn.run():void");
    }

    public dn(wp wpVar, TLRPC.TL_error tL_error, TLObject tLObject, Long l4, r20 r20Var) {
        this.f15411a = 8;
        this.f15412b = wpVar;
        this.f15414f = tL_error;
        this.f15413c = tLObject;
        this.d = l4;
        this.e = r20Var;
    }
}
