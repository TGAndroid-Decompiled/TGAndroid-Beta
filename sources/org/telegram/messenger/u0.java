package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class u0 implements Runnable {
    public final int f17407a;
    public final ChatObject.Call f17408b;

    public u0(ChatObject.Call call, int i10) {
        this.f17407a = i10;
        this.f17408b = call;
    }

    @Override
    public final void run() {
        switch (this.f17407a) {
            case 0:
                ChatObject.Call.j(this.f17408b);
                return;
            case 1:
                ChatObject.Call.a(this.f17408b);
                return;
            default:
                ChatObject.Call.c(this.f17408b);
                return;
        }
    }
}
