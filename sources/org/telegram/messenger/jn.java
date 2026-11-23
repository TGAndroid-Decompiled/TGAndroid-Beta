package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jn implements Runnable {
    public final int f24853a;
    public final boolean f24854b;
    public final Object f24855c;
    public final Object d;
    public final Object f24856e;
    public final Object f24857f;

    public jn(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i7) {
        this.f24853a = i7;
        this.f24855c = obj;
        this.d = obj2;
        this.f24856e = obj3;
        this.f24854b = z10;
        this.f24857f = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jn.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jn.run():void");
    }

    public jn(c1 c1Var, Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f24853a = i7;
        this.f24855c = c1Var;
        this.d = obj;
        this.f24856e = obj2;
        this.f24857f = obj3;
        this.f24854b = z10;
    }

    public jn(c1 c1Var, TLRPC.Message message, boolean z10, Object obj, Object obj2, int i7) {
        this.f24853a = i7;
        this.f24855c = c1Var;
        this.d = message;
        this.f24854b = z10;
        this.f24856e = obj;
        this.f24857f = obj2;
    }

    public jn(gj gjVar, az azVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.g2 g2Var, boolean z10) {
        this.f24853a = 5;
        this.f24855c = azVar;
        this.d = tL_messages_editMessage;
        this.f24857f = gjVar;
        this.f24856e = g2Var;
        this.f24854b = z10;
    }
}
