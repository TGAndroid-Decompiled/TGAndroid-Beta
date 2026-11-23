package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jn implements Runnable {
    public final int f24889a;
    public final boolean f24890b;
    public final Object f24891c;
    public final Object d;
    public final Object f24892e;
    public final Object f24893f;

    public jn(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i7) {
        this.f24889a = i7;
        this.f24891c = obj;
        this.d = obj2;
        this.f24892e = obj3;
        this.f24890b = z10;
        this.f24893f = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jn.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jn.run():void");
    }

    public jn(c1 c1Var, Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f24889a = i7;
        this.f24891c = c1Var;
        this.d = obj;
        this.f24892e = obj2;
        this.f24893f = obj3;
        this.f24890b = z10;
    }

    public jn(c1 c1Var, TLRPC.Message message, boolean z10, Object obj, Object obj2, int i7) {
        this.f24889a = i7;
        this.f24891c = c1Var;
        this.d = message;
        this.f24890b = z10;
        this.f24892e = obj;
        this.f24893f = obj2;
    }

    public jn(gj gjVar, az azVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.g2 g2Var, boolean z10) {
        this.f24889a = 5;
        this.f24891c = azVar;
        this.d = tL_messages_editMessage;
        this.f24893f = gjVar;
        this.f24892e = g2Var;
        this.f24890b = z10;
    }
}
