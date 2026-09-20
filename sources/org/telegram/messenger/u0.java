package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class u0 implements Runnable {
    public final int f17643a;
    public final ChatObject.Call f17644b;

    public u0(ChatObject.Call call, int i10) {
        this.f17643a = i10;
        this.f17644b = call;
    }

    @Override
    public final void run() {
        switch (this.f17643a) {
            case 0:
                ChatObject.Call.j(this.f17644b);
                return;
            case 1:
                ChatObject.Call.a(this.f17644b);
                return;
            default:
                ChatObject.Call.c(this.f17644b);
                return;
        }
    }
}
