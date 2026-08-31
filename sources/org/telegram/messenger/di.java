package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class di implements Runnable {
    public final int f18512a;
    public final Object f18513b;
    public final Object f18514c;
    public final long d;
    public final Object f18515e;

    public di(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f18512a = i10;
        this.f18513b = obj;
        this.f18514c = obj2;
        this.d = j10;
        this.f18515e = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.di.run():void");
    }

    public di(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f18512a = i10;
        this.f18513b = obj;
        this.f18514c = obj2;
        this.f18515e = obj3;
        this.d = j10;
    }

    public di(org.telegram.ui.ActionBar.h3 h3Var, long j10, Object obj, Object obj2, int i10) {
        this.f18512a = i10;
        this.f18513b = h3Var;
        this.d = j10;
        this.f18514c = obj;
        this.f18515e = obj2;
    }

    public di(qh.x7 x7Var, TLRPC.Chat chat, MessagesStorage messagesStorage, long j10) {
        this.f18512a = 11;
        this.f18513b = x7Var;
        this.f18515e = chat;
        this.f18514c = messagesStorage;
        this.d = j10;
    }
}
