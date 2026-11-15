package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class in implements Runnable {
    public final int f24419a;
    public final boolean f24420b;
    public final Object f24421c;
    public final Object d;
    public final Object f24422e;
    public final Object f24423f;

    public in(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i7) {
        this.f24419a = i7;
        this.f24421c = obj;
        this.d = obj2;
        this.f24422e = obj3;
        this.f24420b = z10;
        this.f24423f = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.in.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.in.run():void");
    }

    public in(c1 c1Var, Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f24419a = i7;
        this.f24421c = c1Var;
        this.d = obj;
        this.f24422e = obj2;
        this.f24423f = obj3;
        this.f24420b = z10;
    }

    public in(c1 c1Var, TLRPC.Message message, boolean z10, Object obj, Object obj2, int i7) {
        this.f24419a = i7;
        this.f24421c = c1Var;
        this.d = message;
        this.f24420b = z10;
        this.f24422e = obj;
        this.f24423f = obj2;
    }

    public in(gj gjVar, ez ezVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.e2 e2Var, boolean z10) {
        this.f24419a = 5;
        this.f24421c = ezVar;
        this.d = tL_messages_editMessage;
        this.f24423f = gjVar;
        this.f24422e = e2Var;
        this.f24420b = z10;
    }
}
