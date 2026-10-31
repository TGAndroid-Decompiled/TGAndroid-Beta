package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rn implements Runnable {
    public final int f17755a;
    public final boolean f17756b;
    public final Object f17757c;
    public final Object d;
    public final Object e;
    public final Object f17758f;

    public rn(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.f17755a = i10;
        this.f17757c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f17756b = z10;
        this.f17758f = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rn.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rn.run():void");
    }

    public rn(f1 f1Var, Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f17755a = i10;
        this.f17757c = f1Var;
        this.d = obj;
        this.e = obj2;
        this.f17758f = obj3;
        this.f17756b = z10;
    }

    public rn(f1 f1Var, TLRPC.Message message, boolean z10, Object obj, Object obj2, int i10) {
        this.f17755a = i10;
        this.f17757c = f1Var;
        this.d = message;
        this.f17756b = z10;
        this.e = obj;
        this.f17758f = obj2;
    }

    public rn(jj jjVar, qz qzVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.k2 k2Var, boolean z10) {
        this.f17755a = 5;
        this.f17757c = qzVar;
        this.d = tL_messages_editMessage;
        this.f17758f = jjVar;
        this.e = k2Var;
        this.f17756b = z10;
    }
}
