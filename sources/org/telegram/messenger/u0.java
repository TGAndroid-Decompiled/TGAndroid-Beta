package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class u0 implements Runnable {
    public final int f17606a;
    public final ChatObject.Call f17607b;

    public u0(ChatObject.Call call, int i10) {
        this.f17606a = i10;
        this.f17607b = call;
    }

    @Override
    public final void run() {
        switch (this.f17606a) {
            case 0:
                ChatObject.Call.j(this.f17607b);
                return;
            case 1:
                ChatObject.Call.a(this.f17607b);
                return;
            default:
                ChatObject.Call.c(this.f17607b);
                return;
        }
    }
}
