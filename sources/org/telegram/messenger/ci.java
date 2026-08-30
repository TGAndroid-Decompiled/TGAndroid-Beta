package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ci implements Runnable {
    public final int f17000a;
    public final Object f17001b;
    public final Object f17002c;
    public final long d;
    public final Object e;

    public ci(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f17000a = i10;
        this.f17001b = obj;
        this.f17002c = obj2;
        this.d = j10;
        this.e = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ci.run():void");
    }

    public ci(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f17000a = i10;
        this.f17001b = obj;
        this.f17002c = obj2;
        this.e = obj3;
        this.d = j10;
    }

    public ci(org.telegram.ui.ActionBar.g3 g3Var, long j10, Object obj, Object obj2, int i10) {
        this.f17000a = i10;
        this.f17001b = g3Var;
        this.d = j10;
        this.f17002c = obj;
        this.e = obj2;
    }

    public ci(ph.z7 z7Var, TLRPC.Chat chat, MessagesStorage messagesStorage, long j10) {
        this.f17000a = 11;
        this.f17001b = z7Var;
        this.e = chat;
        this.f17002c = messagesStorage;
        this.d = j10;
    }
}
