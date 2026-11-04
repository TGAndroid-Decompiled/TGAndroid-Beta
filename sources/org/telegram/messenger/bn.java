package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bn implements Runnable {
    public final int f21857a;
    public final boolean f21858b;
    public final Object f21859c;
    public final Object d;
    public final Object f21860e;
    public final Object f21861f;

    public bn(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i3) {
        this.f21857a = i3;
        this.f21859c = obj;
        this.d = obj2;
        this.f21860e = obj3;
        this.f21858b = z10;
        this.f21861f = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bn.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bn.run():void");
    }

    public bn(c1 c1Var, Object obj, Object obj2, Object obj3, boolean z10, int i3) {
        this.f21857a = i3;
        this.f21859c = c1Var;
        this.d = obj;
        this.f21860e = obj2;
        this.f21861f = obj3;
        this.f21858b = z10;
    }

    public bn(c1 c1Var, TLRPC.Message message, boolean z10, Object obj, Object obj2, int i3) {
        this.f21857a = i3;
        this.f21859c = c1Var;
        this.d = message;
        this.f21858b = z10;
        this.f21860e = obj;
        this.f21861f = obj2;
    }

    public bn(zi ziVar, yy yyVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.d2 d2Var, boolean z10) {
        this.f21857a = 5;
        this.f21859c = yyVar;
        this.d = tL_messages_editMessage;
        this.f21861f = ziVar;
        this.f21860e = d2Var;
        this.f21858b = z10;
    }
}
