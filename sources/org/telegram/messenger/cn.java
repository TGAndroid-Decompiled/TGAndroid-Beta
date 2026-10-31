package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cn implements Runnable {
    public final int f15050a;
    public final Object f15051b;
    public final Object f15052c;
    public final Object d;
    public final Object e;
    public final Object f15053f;

    public cn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f15050a = i10;
        this.f15051b = obj;
        this.f15052c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f15053f = obj5;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cn.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cn.run():void");
    }

    public cn(vp vpVar, TLRPC.TL_error tL_error, TLObject tLObject, Long l4, q20 q20Var) {
        this.f15050a = 8;
        this.f15051b = vpVar;
        this.f15053f = tL_error;
        this.f15052c = tLObject;
        this.d = l4;
        this.e = q20Var;
    }
}
