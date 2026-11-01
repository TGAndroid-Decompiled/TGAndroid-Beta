package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sn implements Runnable {
    public final int f18119a;
    public final boolean f18120b;
    public final Object f18121c;
    public final Object d;
    public final Object e;
    public final Object f18122f;

    public sn(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.f18119a = i10;
        this.f18121c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18120b = z10;
        this.f18122f = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sn.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sn.run():void");
    }

    public sn(f1 f1Var, Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f18119a = i10;
        this.f18121c = f1Var;
        this.d = obj;
        this.e = obj2;
        this.f18122f = obj3;
        this.f18120b = z10;
    }

    public sn(f1 f1Var, TLRPC.Message message, boolean z10, Object obj, Object obj2, int i10) {
        this.f18119a = i10;
        this.f18121c = f1Var;
        this.d = message;
        this.f18120b = z10;
        this.e = obj;
        this.f18122f = obj2;
    }

    public sn(kj kjVar, rz rzVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.k2 k2Var, boolean z10) {
        this.f18119a = 5;
        this.f18121c = rzVar;
        this.d = tL_messages_editMessage;
        this.f18122f = kjVar;
        this.e = k2Var;
        this.f18120b = z10;
    }
}
