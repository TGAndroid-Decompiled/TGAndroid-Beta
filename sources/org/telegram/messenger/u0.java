package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class u0 implements Runnable {
    public final int f17658a;
    public final ChatObject.Call f17659b;

    public u0(ChatObject.Call call, int i10) {
        this.f17658a = i10;
        this.f17659b = call;
    }

    @Override
    public final void run() {
        switch (this.f17658a) {
            case 0:
                ChatObject.Call.j(this.f17659b);
                return;
            case 1:
                ChatObject.Call.a(this.f17659b);
                return;
            default:
                ChatObject.Call.c(this.f17659b);
                return;
        }
    }
}
