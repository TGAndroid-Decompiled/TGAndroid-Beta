package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class di implements Runnable {
    public final int f18514a;
    public final Object f18515b;
    public final Object f18516c;
    public final long d;
    public final Object f18517e;

    public di(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f18514a = i10;
        this.f18515b = obj;
        this.f18516c = obj2;
        this.d = j10;
        this.f18517e = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.di.run():void");
    }

    public di(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f18514a = i10;
        this.f18515b = obj;
        this.f18516c = obj2;
        this.f18517e = obj3;
        this.d = j10;
    }

    public di(org.telegram.ui.ActionBar.h3 h3Var, long j10, Object obj, Object obj2, int i10) {
        this.f18514a = i10;
        this.f18515b = h3Var;
        this.d = j10;
        this.f18516c = obj;
        this.f18517e = obj2;
    }

    public di(qh.w7 w7Var, TLRPC.Chat chat, MessagesStorage messagesStorage, long j10) {
        this.f18514a = 11;
        this.f18515b = w7Var;
        this.f18517e = chat;
        this.f18516c = messagesStorage;
        this.d = j10;
    }
}
