package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class in implements Runnable {
    public final int f24816a;
    public final boolean f24817b;
    public final Object f24818c;
    public final Object d;
    public final Object f24819e;
    public final Object f24820f;

    public in(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i7) {
        this.f24816a = i7;
        this.f24818c = obj;
        this.d = obj2;
        this.f24819e = obj3;
        this.f24817b = z10;
        this.f24820f = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.in.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.in.run():void");
    }

    public in(c1 c1Var, Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f24816a = i7;
        this.f24818c = c1Var;
        this.d = obj;
        this.f24819e = obj2;
        this.f24820f = obj3;
        this.f24817b = z10;
    }

    public in(c1 c1Var, TLRPC.Message message, boolean z10, Object obj, Object obj2, int i7) {
        this.f24816a = i7;
        this.f24818c = c1Var;
        this.d = message;
        this.f24817b = z10;
        this.f24819e = obj;
        this.f24820f = obj2;
    }

    public in(fj fjVar, zy zyVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.g2 g2Var, boolean z10) {
        this.f24816a = 5;
        this.f24818c = zyVar;
        this.d = tL_messages_editMessage;
        this.f24820f = fjVar;
        this.f24819e = g2Var;
        this.f24817b = z10;
    }
}
