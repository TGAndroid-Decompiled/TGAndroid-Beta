package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class in implements Runnable {
    public final int f24690a;
    public final boolean f24691b;
    public final Object f24692c;
    public final Object d;
    public final Object f24693e;
    public final Object f24694f;

    public in(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i7) {
        this.f24690a = i7;
        this.f24692c = obj;
        this.d = obj2;
        this.f24693e = obj3;
        this.f24691b = z10;
        this.f24694f = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.in.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.in.run():void");
    }

    public in(c1 c1Var, Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f24690a = i7;
        this.f24692c = c1Var;
        this.d = obj;
        this.f24693e = obj2;
        this.f24694f = obj3;
        this.f24691b = z10;
    }

    public in(c1 c1Var, TLRPC.Message message, boolean z10, Object obj, Object obj2, int i7) {
        this.f24690a = i7;
        this.f24692c = c1Var;
        this.d = message;
        this.f24691b = z10;
        this.f24693e = obj;
        this.f24694f = obj2;
    }

    public in(fj fjVar, zy zyVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.h2 h2Var, boolean z10) {
        this.f24690a = 5;
        this.f24692c = zyVar;
        this.d = tL_messages_editMessage;
        this.f24694f = fjVar;
        this.f24693e = h2Var;
        this.f24691b = z10;
    }
}
