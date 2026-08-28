package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class u0 implements Runnable {
    public final int f21613a;
    public final ChatObject.Call f21614b;

    public u0(ChatObject.Call call, int i9) {
        this.f21613a = i9;
        this.f21614b = call;
    }

    @Override
    public final void run() {
        switch (this.f21613a) {
            case 0:
                ChatObject.Call.j(this.f21614b);
                return;
            case 1:
                ChatObject.Call.a(this.f21614b);
                return;
            default:
                ChatObject.Call.c(this.f21614b);
                return;
        }
    }
}
