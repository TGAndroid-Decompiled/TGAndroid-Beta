package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class in implements Runnable {
    public final int f24693a;
    public final boolean f24694b;
    public final Object f24695c;
    public final Object d;
    public final Object f24696e;
    public final Object f24697f;

    public in(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i7) {
        this.f24693a = i7;
        this.f24695c = obj;
        this.d = obj2;
        this.f24696e = obj3;
        this.f24694b = z10;
        this.f24697f = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.in.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.in.run():void");
    }

    public in(c1 c1Var, Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f24693a = i7;
        this.f24695c = c1Var;
        this.d = obj;
        this.f24696e = obj2;
        this.f24697f = obj3;
        this.f24694b = z10;
    }

    public in(c1 c1Var, TLRPC.Message message, boolean z10, Object obj, Object obj2, int i7) {
        this.f24693a = i7;
        this.f24695c = c1Var;
        this.d = message;
        this.f24694b = z10;
        this.f24696e = obj;
        this.f24697f = obj2;
    }

    public in(fj fjVar, zy zyVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.h2 h2Var, boolean z10) {
        this.f24693a = 5;
        this.f24695c = zyVar;
        this.d = tL_messages_editMessage;
        this.f24697f = fjVar;
        this.f24696e = h2Var;
        this.f24694b = z10;
    }
}
