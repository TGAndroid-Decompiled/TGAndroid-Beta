package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class di implements Runnable {
    public final int f17061a;
    public final Object f17062b;
    public final Object f17063c;
    public final long d;
    public final Object e;

    public di(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f17061a = i10;
        this.f17062b = obj;
        this.f17063c = obj2;
        this.d = j10;
        this.e = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.di.run():void");
    }

    public di(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f17061a = i10;
        this.f17062b = obj;
        this.f17063c = obj2;
        this.e = obj3;
        this.d = j10;
    }

    public di(org.telegram.ui.ActionBar.g3 g3Var, long j10, Object obj, Object obj2, int i10) {
        this.f17061a = i10;
        this.f17062b = g3Var;
        this.d = j10;
        this.f17063c = obj;
        this.e = obj2;
    }

    public di(ph.y7 y7Var, TLRPC.Chat chat, MessagesStorage messagesStorage, long j10) {
        this.f17061a = 11;
        this.f17062b = y7Var;
        this.e = chat;
        this.f17063c = messagesStorage;
        this.d = j10;
    }
}
